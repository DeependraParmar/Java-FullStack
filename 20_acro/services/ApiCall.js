class ApiCall{
    postCall(URL, data){
        return fetch(URL, {
            method: "POST",
            headers: {
                'Content-Type' : 'application/json'
            },
            body: JSON.stringify(data)
        }).then(data => data.json())
    }
}

export default new ApiCall();

const baseurl = "http://localhost:8080"

export const urls = {
    STUDENT_REG :  `${baseurl}/public/register/student`,
    FACULTY_REG :  `${baseurl}/public/register/faculty`,
    LOGIN : `${baseurl}/public/login`,
}