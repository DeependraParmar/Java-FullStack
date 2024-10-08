import React, { useRef, useState } from 'react';
import { studentsData } from "../data.js"

const Students = () => {
    const [students, setStudents] = useState(studentsData);

    const roll = useRef();
    const name = useRef();
    const age = useRef();
    const branch = useRef();
    const maths = useRef();
    const english = useRef();
    const science = useRef();

    const addStudent = (event) => {
        event.preventDefault();

        const newStudent = {
            roll: roll.current.value,
            name: name.current.value,
            age: age.current.value,
            branch: branch.current.value,
            marks: {
                maths: Number(maths.current.value),
                english: Number(english.current.value),
                science: Number(science.current.value)
            }
        }

        console.log(newStudent);

        setStudents([...students, newStudent]);
        alert('Student Added Successfully');
        event.target.reset();
    }

    const branches = ['CS', 'IT', 'CSIT', 'ME', 'CE']

    const deleteStudent = (roll) => {
        const status = window.confirm("Do you want to delete?");
        status ? setStudents(students.filter(student => student.roll != roll)) : null;
    }

    return (
        <>
            <form onSubmit={e => addStudent(e)}>
                <h1 className="m-4 bg-success text-light py-2 text-center">Student Records</h1>
                <div className='row mx-4 my-4 gap-0'>
                    <div className="col-xl-4 col-lg-4">
                        <input ref={roll} type="text" className='form-control' title='Roll Number' placeholder='Roll No' required />
                    </div>
                    <div className="col-xl-4 col-lg-4">
                        <input ref={name} type="text" className='form-control' title='Name' placeholder='Name' required />
                    </div>
                    <div className="col-xl-4 col-lg-4">
                        <input ref={age} type="text" className='form-control' title='Age' placeholder='Age' required />
                    </div>
                    <div className="col-xl-4 col-lg-4">
                        <select ref={branch} title='Select your branch' className='form-control' required>
                            <option value="">Select Branch</option>
                            {
                                branches.map((branch, index) => {
                                    return <option key={index} value={branch}>{branch}</option>
                                })
                            }
                        </select>
                    </div>
                    <div className="col-xl-4 col-lg-4">
                        <input ref={maths} type="number" title='Mathematics Marks' min='0' max='100' className='form-control' placeholder='Maths' required />
                    </div>
                    <div className="col-xl-4 col-lg-4">
                        <input ref={english} type="number" title='English Marks' min='0' max='100' className='form-control' placeholder='English' required />
                    </div>
                    <div className="col-xl-4 col-lg-4">
                        <input ref={science} type="number" title='Science Marks' min='0' max='100' className='form-control' placeholder='Science' required />
                    </div>
                    <div className="col-xl-4 col-lg-4">
                        <button type="submit" min='0' max='100' className='btn btn-success'>Add Student</button>
                    </div>

                </div>
            </form>
            <br />
            <hr />
            <br />

            <table className='table mt-4 text-center'>
                <thead>
                    <tr>
                        <th>Roll</th>
                        <th>Name</th>
                        <th>Age</th>
                        <th>Branch</th>
                        <th>Maths</th>
                        <th>English</th>
                        <th>Science</th>
                        <th>Result</th>
                        <th>Operation</th>
                    </tr>
                </thead>
                <tbody>
                    {
                        students.map((student, index) => (
                            <tr key={index}>
                                <td>{student.roll}</td>
                                <td>{student.name}</td>
                                <td>{student.age}</td>
                                <td>{student.branch}</td>
                                <td>{student.marks.maths}</td>
                                <td>{student.marks.english}</td>
                                <td>{student.marks.science}</td>
                                <td>{student.marks.maths + student.marks.english + student.marks.science} / 300</td>
                                <td><button onClick={() => deleteStudent(student.roll)} className="btn btn-danger">Delete</button></td>
                            </tr>
                        ))
                    }
                </tbody>
            </table>
        </>
    )
}

export default Students;