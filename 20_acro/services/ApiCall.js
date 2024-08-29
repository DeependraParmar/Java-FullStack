class ApiCall{
    postCall(URL, data){
        fetch(URL, {
            method: "POST",
            headers: {
                type: ""
            }
        })
    }
}

export default new ApiCall();
const baseurl = "http://localhost:8080"

export const urls = {
    STUDENT_REG :  `${baseurl}/public/register/student`,
    FACULTY_REG :  `${baseurl}/public/register/faculty`,
}