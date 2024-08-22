import React, { useState } from 'react'

const Students = () => {
    const [students, setStudents] = useState([
        {
            roll: 101,
            name: "Vikas",
            age: 20,
            branch: "CSIT",
            marks: {
                maths: 90,
                english: 80,
                science: 70
            }
        },
        {
            roll: 102,
            name: "Rahul",
            age: 21,
            branch: "CS",
            marks: {
                maths: 70,
                english: 80,
                science: 90,
            },
        },
        {
            roll: 103,
            name: "Rohit",
            age: 22,
            branch: "IT",
            marks: {
                maths: 80,
                english: 70,
                science: 60
            }
        }
    ]);

    const addStudent = (event) => {
        event.preventDefault();
        const roll = document.querySelector('input[placeholder="Roll No"]').value;
        const name = document.querySelector('input[placeholder="Name"]').value;
        const age = document.querySelector('input[placeholder="Age"]').value;
        const branch = document.querySelector('select').value;
        const maths = document.querySelector('input[placeholder="Maths"]').value;
        const english = document.querySelector('input[placeholder="English"]').value;
        const science = document.querySelector('input[placeholder="Science"]').value;

        const newStudent = {
            roll: roll,
            name: name,
            age: age,
            branch: branch,
            marks: {
                maths: Number(maths),
                english: Number(english),
                science: Number(science)
            }
        }

        setStudents([...students, newStudent]);
        alert('Student Added Successfully');
    }

    const branches = ['CS', 'IT', 'CSIT', 'ME', 'CE']

    return (
        <>
            <form onSubmit={e => addStudent(e)}>
                <div className='row mx-4 my-4'>
                    <div className="col-xl-4 col-lg-4">
                        <input type="text" className='form-control' title='Roll Number' placeholder='Roll No' required />
                    </div>
                    <div className="col-xl-4 col-lg-4">
                        <input type="text" className='form-control' title='Name' placeholder='Name' required />
                    </div>
                    <div className="col-xl-4 col-lg-4">
                        <input type="text" className='form-control' title='Age' placeholder='Age' required />
                    </div>
                    <div className="col-xl-4 col-lg-4">
                        <select title='Select your branch' className='form-control' required>
                            <option value="">Select Branch</option>
                            {
                                branches.map(branch => {
                                    return <option value={branch}>{branch}</option>
                                })
                            }
                        </select>
                    </div>
                    <div className="col-xl-4 col-lg-4">
                        <input type="number" title='Mathematics Marks' min='0' max='100' className='form-control' placeholder='Maths' required />
                    </div>
                    <div className="col-xl-4 col-lg-4">
                        <input type="number" title='English Marks' min='0' max='100' className='form-control' placeholder='English' required />
                    </div>
                    <div className="col-xl-4 col-lg-4">
                        <input type="number" title='Science Marks' min='0' max='100' className='form-control' placeholder='Science' required />
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
                            </tr>
                        ))
                    }
                </tbody>
            </table>
        </>
    )
}

export default Students
