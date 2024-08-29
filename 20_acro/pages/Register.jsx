import { Button, HStack, Heading, Input, InputGroup, Select, VStack } from '@chakra-ui/react'
import React, { useState } from 'react'

const Register = () => {
    const [type, setType] = useState("student");
    return (
        <>
            <VStack py={6} alignItems={'center'} justifyContent={'center'} spacing={4} width={'90%'} margin={'auto'}>
                <Heading>
                    {
                        type === 'faculty' ? "Faculty Registration Form" : "Student Registration Form"
                    }
                </Heading>
                <HStack justifyContent={'center'} width={'40%'}>
                    <input style={{accentColor: 'red'}} type='radio' id='student' name='type' value={'student'} onClick={e => setType(e.target.value)} />
                    <label htmlFor="student">Student</label>

                    <input style={{accentColor: 'red'}} type='radio' id='faculty' name='type' value={'faculty'} onClick={e => setType(e.target.value)} />
                    <label htmlFor="faculty">Faculty</label>
                </HStack>

                {
                    type === 'student' ? <StudentRegister /> : <FacultyRegister />
                }
            </VStack>
        </>
    )
}

const StudentRegister = () => {
    return <>
        <form style={{ width: '100%' }} >
            <VStack gap={4} margin={'auto'} alignItems={'center'} justifyContent={'center'} width={'40%'}>
                <InputGroup>
                    <Input type='text' fontSize={'sm'} required placeholder='Student Name' />
                </InputGroup>
                <InputGroup>
                    <Select fontSize={'sm'}>
                        <option value="">Choose branch</option>
                        <option value="CS">CS</option>
                        <option value="IT">IT</option>
                        <option value="CSIT">CSIT</option>
                        <option value="ME">ME</option>
                    </Select>
                </InputGroup>
                <InputGroup>
                    <Input type='text' fontSize={'sm'} required placeholder="Enrollment Number" />
                </InputGroup>
                <InputGroup>
                    <Select fontSize={'sm'}>
                        <option value="">Choose semster</option>
                        <option value="1">1</option>
                        <option value="2">2</option>
                        <option value="3">3</option>
                        <option value="4">4</option>
                        <option value="5">5</option>
                        <option value="6">6</option>
                        <option value="7">7</option>
                        <option value="8">8</option>
                    </Select>
                </InputGroup>
                <InputGroup>
                    <Input type='email' fontSize={'sm'} required placeholder="Student Email" />
                </InputGroup>
                <InputGroup>
                    <Input type='password' fontSize={'sm'} required placeholder='**********' />
                </InputGroup>
                <InputGroup textAlign={'center'}>
                    <input style={{ accentColor: 'red' }} type="checkbox" name="" id="showpassword" />
                    <label style={{ marginLeft: '10px', fontSize: '0.9rem' }} htmlFor="showpassword">Show Password</label>
                </InputGroup>
                <Button colorScheme='red' width={'full'}>Register</Button>
            </VStack>
        </form>
    </>
}
const FacultyRegister = () => {
    return <>
        <form style={{ width: '100%' }} >
            <VStack gap={4} margin={'auto'} alignItems={'center'} justifyContent={'center'} width={'40%'}>
                <InputGroup>
                    <Input type='text' fontSize={'sm'} required placeholder='Faculty Name' />
                </InputGroup>
                <InputGroup>
                    <Input type='text' fontSize={'sm'} required placeholder='Faculty ID' />
                </InputGroup>
                <InputGroup>
                    <Input type='number' minLength={10} maxLength={10} fontSize={'sm'} required placeholder="Phone Number" />
                </InputGroup>
                <InputGroup>
                    <Input type='email' fontSize={'sm'} required placeholder="Student Email" />
                </InputGroup>
                <InputGroup>
                    <Input type='password' fontSize={'sm'} required placeholder='**********' />
                </InputGroup>
                <InputGroup textAlign={'center'}>
                    <input style={{ accentColor: 'red' }} type="checkbox" name="" id="showpassword" />
                    <label style={{ marginLeft: '10px', fontSize: '0.9rem' }} htmlFor="showpassword">Show Password</label>
                </InputGroup>
                <Button colorScheme='red' width={'full'}>Register</Button>
            </VStack>

        </form>
    </>
}

export default Register;
