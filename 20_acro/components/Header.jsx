import { Button, Drawer, DrawerBody, DrawerCloseButton, DrawerContent, DrawerHeader, DrawerOverlay, HStack, Image, Menu, MenuDivider, MenuGroup, MenuItem, Tooltip, useDisclosure } from '@chakra-ui/react';
import React from 'react';
import { IoMenu, IoPersonAdd } from 'react-icons/io5';
import { MdLogin } from "react-icons/md";
import { Link } from 'react-router-dom';

const Header = () => {
  const { isOpen, onOpen, onClose } = useDisclosure();

  return (
    <>
      <HStack alignItems={'center'} justifyContent={'space-between'} px={4} py={2} boxShadow={'md'}>
        <Image w={'48'} src='https://aiper.ac.in/wp-content/uploads/2023/03/AITR-logo.jpg' />
        <Tooltip label="Menu">
          <Button colorScheme='red' rounded={'full'} onClick={onOpen}><IoMenu size={18} /> </Button>

        </Tooltip>
      </HStack>

      <Drawer placement={'left'} isOpen={isOpen} onClose={onClose}>
        <DrawerOverlay backdropFilter={'blur(5px)'} />
        <DrawerContent>
          <DrawerHeader>
            <Image w={'48'} src='https://aiper.ac.in/wp-content/uploads/2023/03/AITR-logo.jpg' />
            <DrawerCloseButton />

          </DrawerHeader>
          <DrawerBody>
            <Menu>
              <MenuGroup>
                <MenuItem fontSize={'sm'} onClick={() => onClose()} _hover={{ bg: "#e2f2ff" }} gap={'2'}><Link className='width-full' to={'/'}> Home</Link></MenuItem>
                <MenuItem fontSize={'sm'} onClick={() => onClose()} _hover={{ bg: "#e2f2ff" }} gap={'2'}><Link className='width-full' to={'/about'}>About</Link></MenuItem>
                <MenuItem fontSize={'sm'} onClick={() => onClose()} _hover={{ bg: "#e2f2ff" }} gap={'2'}><Link className='width-full' to={'/contact'}>Contact</Link></MenuItem>
                <MenuDivider />
              </MenuGroup>
            </Menu>
            <HStack>
              <Link onClick={() => onClose()} to={'/register'}><Button colorScheme={'red'} size={'sm'} gap={1}>Register <IoPersonAdd size={12} /> </Button></Link>
              <Link onClick={() => onClose()} to={'/login'}><Button variant={'outline'} colorScheme={'red'} size={'sm'} gap={1}>Login <MdLogin /></Button></Link>
            </HStack>
          </DrawerBody>
        </DrawerContent>
      </Drawer>
    </>
  )
}

export default Header
