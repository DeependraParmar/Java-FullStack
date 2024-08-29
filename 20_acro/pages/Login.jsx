import { Button, Heading, Input, InputGroup, VStack } from '@chakra-ui/react'
import React from 'react'

const Login = () => {
  return (
    <>
      <VStack py={6}  alignItems={'center'} justifyContent={'center'} spacing={4} width={'90%'} margin={'auto'}>
        <Heading>Login Form</Heading>
        <form style={{width: '100%'}} >
          <VStack gap={4} margin={'auto'} alignItems={'center'} justifyContent={'center'}  width={'40%'}>
            <InputGroup>
              <Input type='email' fontSize={'sm'} required placeholder='hey@gmail.com' />
            </InputGroup>
            <InputGroup>
              <Input type='password' fontSize={'sm'} required placeholder='**********' />
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
