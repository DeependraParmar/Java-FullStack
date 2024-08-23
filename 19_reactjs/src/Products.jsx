import React from 'react'
import "./Products.css"

const Products = () => {
  return (
    <div className='container-fluid Products'>
          <h1 className="m-4 bg-success text-light py-2 text-center">Product List</h1>
          <div className="row mt-3">
            <div className="col-xl-3 col-lg-3 text-center m-4">
                <img src='' className='pimg' /> <br />
                <b className="text-danger">Name of Product</b> <br />
                <i>₹ Price of Product</i>
            </div>
          </div>

      
    </div>
  )
}

export default Products
