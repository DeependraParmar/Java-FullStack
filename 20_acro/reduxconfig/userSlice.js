import { createSlice } from "@reduxjs/toolkit"

const slice = createSlice({
    name: 'usr',
    initialState: {
        value: {
            isLogin: false,
            name: undefined,
            token: undefined,
            role: undefined
        }
    },
    reducers: {
        setUserData : (state, action) => {
            state.value = {...action.payload, isLogin: true}
        },
        deleteUserData: (state, action) => {
            state.value = {
                isLogin: false,
                name: undefined,
                token: undefined,
                role: undefined
            }
        }
    }
});

export default slice.reducer;

export const { setUserData, deleteUserData } = slice.actions;