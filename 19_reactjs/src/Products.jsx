import React, { useEffect, useState } from 'react'
import "./Products.css"

const Products = () => {
    const [products, setProducts] = useState([]);

    useEffect(() => {
        const url = "https://dummyjson.com/products";
        fetch(url)
            .then(response => response.json())
            .then(data => setProducts(data.products))
            .catch(error => console.log(error));

        console.log(products);
    }, []);

    return (
        <div className='container-fluid Products'>
            <h1 className="m-4 bg-success text-light py-2 text-center">Product List</h1>
            <div className="row mt-3 m-auto">
                {
                    products && products.map((product, index) => {
                        return (
                            <div style={{border: "1px solid black"}} key={index} className="col-xl-2 col-lg-2 m-4">
                                <img src={product.thumbnail} className='pimg' /> <br />
                                <b className="text-danger">{product.title}</b> <br />
                                <b>₹ {product.price} /-</b>
                            </div>
                        )
                    })
                }
            </div>


        </div>
    )
}

export default Products
