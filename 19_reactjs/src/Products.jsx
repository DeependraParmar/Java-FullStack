import React, { useEffect, useState } from 'react'
import "./Products.css"

const Products = () => {
    const [products, setProducts] = useState([]);
    const [category, setCategory] = useState([]);

    useEffect(() => {
        const url = "https://dummyjson.com/products?limit=194";
        fetch(url)
            .then(response => response.json())
            .then(data => {
                setProducts(data.products)
                const cate = new Set(data.products.map(product => product.category));
                setCategory([...cate]);
            })
            .catch(error => console.log(error));

    }, []);

    return (
        <div className='container-fluid Products'>
            <h1 className="m-4 bg-success text-light py-2 text-center">Product List</h1>
            <div className="row mt-3">
                <div className="col-xl-2 col-lg-2">
                    <h4>Categories</h4>
                    <ul className="list-group">
                        {
                            category && category.map((cat, index) => {
                                return (
                                    <>
                                        <li key={index} className="list-group-item">
                                            <input type="checkbox" name="" id="" />
                                            {cat}
                                        </li>
                                    </>
                                )
                            })
                        }
                    </ul>
                </div>
                <div className="col-xl-10 col-lg-10">
                    <div className="row">
                        {
                            products.length !== 0 ? products.map((product, index) => {
                                return (
                                    <div key={index} className="col-xl-2 col-lg-2 m-4 text-center">
                                        <img src={product.thumbnail} className='pimg' /> <br />
                                        <b className="text-danger">{product.title}</b> <br />
                                        <b>₹ {product.price} /-</b>
                                    </div>
                                )
                            }) :
                                <div className="text-center">
                                    <h2 className='text-dark'>Loading...</h2>
                                </div>
                        }
                    </div>
                </div>
            </div>


        </div>
    )
}

export default Products
