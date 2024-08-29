import {
    Box,
    Center,
    Text
} from '@chakra-ui/react';
import { HashLoader } from 'react-spinners';


function Loading({ message = "Loading.." }) {

    return (
        <Box as="section" w="100vw" h="100vh" position={'fixed'} top={0} zIndex={'1000'} display="flex" alignItems="center" background={'rgba(0, 0, 0, 0.75)'} justifyContent="center" transition={'all 0.5s ease-in-out'}>
            <Center position={'relative'} py={6} px={8} background={'white'} rounded="md" shadow="md" display={'flex'} flexDir={'column'} gap={3}>
                <HashLoader size={40} color='red' />
                <Text fontSize={'sm'} fontWeight={'semibold'}>{message}</Text>
            </Center>
        </Box>
    );
}

export default Loading;