import './App.css'
import FooterComponent from './components/FooterComponent'
import AddEmployeeComponent from './components/AddEmployeeComponent'
import HeaderComponent from './components/HeaderComponent'
import ListEmployeeComponent from './components/ListEmployeeComponent'
import UpdateEmployeeComponent from './components/UpdateEmployeeComponent'
import {BrowserRouter, Route, Routes} from 'react-router-dom'

function App() {

  return (
    <>
      <BrowserRouter>
        <HeaderComponent/>
        <Routes>
          <Route path='/' element={<ListEmployeeComponent/>}/>
          <Route path='/employees' element={<ListEmployeeComponent/>}/>
          <Route path='/add-Employee' element={<AddEmployeeComponent/>} />
          <Route path='/edit-employee/:id' element={<UpdateEmployeeComponent/>}/>
          
        </Routes>
        <FooterComponent/>
      </BrowserRouter>
    </>
  )
}

export default App
