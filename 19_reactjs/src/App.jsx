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
        <Route path="/" element={
          <div className="text-center">
            <h2>Welcome to Acropolis.</h2>
            <h3>Feel free to use the above functionalities.</h3>
          </div>
        } />
        <Route path="/students" element={<Students />} />
        <Route path="/products" element={<Products />} />
      </Routes>
    </Router>
  </>
}
export default App;