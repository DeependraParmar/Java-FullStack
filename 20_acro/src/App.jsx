import React, { Suspense } from 'react';
import { Route, BrowserRouter as Router, Routes } from "react-router-dom";
import Header from '../components/Header';
import Loading from '../components/Loading';
import ErrorBoundary from './ErrorBoundary';

const Home = React.lazy(() => import('../pages/Home'));
const About = React.lazy(() => import('../pages/About'));
const Contact = React.lazy(() => import('../pages/Contact'));

const App = () => {
  return (
    <>
      <ErrorBoundary>
        <Router>
          <Suspense fallback={<Loading />}>
            <Header />
            <Routes>
              <Route path="/" element={<Home />} />
              <Route path="/about" element={<About />} />
              <Route path="/contact" element={<Contact />} />
            </Routes>
          </Suspense>
        </Router>
      </ErrorBoundary>
    </>
  )
}

export default App
