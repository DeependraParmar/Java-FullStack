import { Button, Drawer, DrawerBody, DrawerCloseButton, DrawerContent, DrawerHeader, DrawerOverlay, HStack, Image, Menu, MenuDivider, MenuGroup, MenuItem, useDisclosure } from '@chakra-ui/react';
import React from 'react';
import { IoBookOutline, IoHomeOutline, IoMenu } from 'react-icons/io5';
import { Link } from 'react-router-dom';

const Header = () => {
  const { isOpen, onOpen, onClose } = useDisclosure();

  return (
    <>
      <HStack alignItems={'center'} justifyContent={'space-between'} px={4} py={2} boxShadow={'md'}>
        <Image w={'48'} src='https://aiper.ac.in/wp-content/uploads/2023/03/AITR-logo.jpg' />
        <Button onClick={() => onOpen()} size={'sm'}><IoMenu size={18} /> </Button>
      </HStack>

      <Drawer placement={'left'} isOpen={isOpen} onClose={onClose}>
        <DrawerOverlay />
        <DrawerContent>
          <DrawerHeader>
            <Image w={'48'} src='https://aiper.ac.in/wp-content/uploads/2023/03/AITR-logo.jpg' />
            <DrawerCloseButton />

          </DrawerHeader>
          <DrawerBody>
            <Menu>
              <MenuGroup>
                <MenuItem fontSize={'sm'} onClick={onClose} _hover={{ bg: "#e2f2ff" }} gap={'2'}><Link className='width-full' to={'/'}> Home</Link></MenuItem>
                <MenuItem fontSize={'sm'} onClick={onClose} _hover={{ bg: "#e2f2ff" }} gap={'2'}><Link className='width-full' to={'/about'}>About</Link></MenuItem>
                <MenuItem fontSize={'sm'} onClick={onClose} _hover={{ bg: "#e2f2ff" }} gap={'2'}><Link className='width-full' to={'/contact'}>Contact</Link></MenuItem>
                <MenuDivider />
              </MenuGroup>
            </Menu>
            <HStack>
              <Button colorScheme={'blue'} size={'sm'}>Login</Button>
            </HStack>
          </DrawerBody>
        </DrawerContent>
      </Drawer>
    </>
  )
}

export default Header
