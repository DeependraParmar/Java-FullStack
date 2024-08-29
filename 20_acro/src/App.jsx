import React, { Suspense } from 'react';
import { Route, BrowserRouter as Router, Routes } from "react-router-dom";
import Header from '../components/Header';
import Loading from '../components/Loading';
import ErrorBoundary from './ErrorBoundary';
import { Toaster } from 'react-hot-toast';

const Home = React.lazy(() => import('../pages/Home'));
const Login = React.lazy(() => import('../pages/Login'));
const Register = React.lazy(() => import('../pages/Register'));
const StudentHome = React.lazy(() => import('../pages/StudentHome'));
const FacultyHome = React.lazy(() => import('../pages/FacultyHome'));

const App = () => {
  return (
    <>
      <ErrorBoundary>
        <Router>
          <Suspense fallback={<Loading />}>
            <Header />
            <Routes>
              <Route path="/" element={<Home />} />
              <Route path="/login" element={<Login />} />
              <Route path="/register" element={<Register />} />
              <Route path="/student/home" element={<StudentHome />}  />
              <Route path="/faculty/home" element={<FacultyHome />}  />
            </Routes>
            <Toaster
              position="top-right"
              reverseOrder={false}
            />
          </Suspense>
        </Router>
      </ErrorBoundary>
    </>
  )
}

export default App
