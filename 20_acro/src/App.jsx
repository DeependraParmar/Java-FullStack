import React, { Suspense } from 'react';
import { Route, BrowserRouter as Router, Routes } from "react-router-dom";
import Header from '../components/Header';
import Loading from '../components/Loading';
import ErrorBoundary from './ErrorBoundary';

const Home = React.lazy(() => import('../pages/Home'));
const Login = React.lazy(() => import('../pages/Login'));
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
              <Route path="/student/home" element={<StudentHome />}  />
              <Route path="/faculty/home" element={<FacultyHome />}  />
            </Routes>
          </Suspense>
        </Router>
      </ErrorBoundary>
    </>
  )
}

export default App
