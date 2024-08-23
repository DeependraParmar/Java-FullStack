import React from 'react'
import { Link } from 'react-router-dom'

const Header = () => {
    return (
        <div className="bg-primary text-light p-4 text-center">
            <h1 className="">AITR, Indore</h1>
            <p>
                <Link className='text-light mx-2' to={'/'}>Students</Link>
                <Link className='text-light mx-2' to={'/products'}>Products</Link>
            </p>
        </div>
    )
}

export default Header
