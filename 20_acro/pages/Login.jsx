import { Button, Heading, Input, InputGroup, VStack } from '@chakra-ui/react'
import React, { useRef } from 'react'
import ApiCall, { urls } from '../services/ApiCall';
import toast from 'react-hot-toast';
import { useNavigate } from 'react-router-dom';

const Login = () => {
  const email = useRef();
  const password = useRef();
  const navigate = useNavigate();

  const onSubmitHandler = (event) => {
    event.preventDefault();

    const data = {
      email: email.current.value,
      password: password.current.value
    }

    ApiCall.postCall(urls.LOGIN, data).then(response => {
      console.log(response)
      if (response.status) {
        event.target.reset();
        toast.success(response.message);
        navigate(`/${response.data.role}/home`)
      }
      else {
        toast.error(response.message);
      }
    });
  }

  return (
    <>
      <VStack py={6}  alignItems={'center'} justifyContent={'center'} spacing={4} width={'90%'} margin={'auto'}>
        <Heading>Login Form</Heading>
        <form onSubmit={e => onSubmitHandler(e)} style={{width: '100%'}} >
          <VStack gap={4} margin={'auto'} alignItems={'center'} justifyContent={'center'}  width={'40%'}>
            <InputGroup>
              <Input ref={email} type='email' fontSize={'sm'} required placeholder='hey@gmail.com' />
            </InputGroup>
            <InputGroup>
              <Input ref={password} type='password' fontSize={'sm'} required placeholder='**********' />
            </InputGroup>
            <InputGroup textAlign={'center'}>
              <input style={{accentColor: 'red'}} type="checkbox" name="" id="showpassword" />
              <label style={{marginLeft: '10px', fontSize: '0.9rem'}} htmlFor="showpassword">Show Password</label>
            </InputGroup>
            <Button colorScheme='red' width={'full'}>Login</Button>
          </VStack>
        </form>
      </VStack>
    </>
  )
}

export default Login
