import { Route, BrowserRouter as Router, Routes } from "react-router-dom";
import Header from "../components/Header";
import Products from "./Products";
import Students from "./Students";
import "./index.css";

function App(){
  return <>
    <Router>
      <Header />
      <Routes>
        <Route path="/" element={<Students />} />
        <Route path="/products" element={<Products />} />
      </Routes>
    </Router>
  </>
}
export default App;