import React, { useEffect, useState } from 'react'
import { useNavigate, useParams } from 'react-router-dom'
import {getEmployee, updateEmployee } from '../services/EmployeeService';

const UpdateEmployeeComponent = () => {
    const navigate = useNavigate();
    const [firstName, setFirstName] = useState('')
    const [lastName, setLastName] = useState('')
    const  [email, setEmail] = useState('')
    const {id} = useParams()

    const [errors, setErrors] = useState({
      firstName: '',
      lastName: '',
      email: ''
    })

    useEffect(() => {
        getEmployee(id).then((Response) => {
            setFirstName(Response.data.firstName);
            setLastName(Response.data.lastName);
            setEmail(Response.data.email);
        }).catch(error =>{
            console.log(error);
        })
    },[id])

    const updateForm = (e) => {
      e.preventDefault();
      if(validateForm()){
        const employee = {firstName,lastName,email};
        console.log(employee);
        updateEmployee(id, employee).then((response)=>{
            console.log(response.data);
            navigate('/employees');
        }).catch(error =>{
            console.error(error);
        })
      }
      
    }
    
    function validateForm(){
      let valid = true;
      const errorCopy = {... errors}

      if(firstName.trim()){
        errorCopy.firstName = '';
      }else{
        errorCopy.firstName = 'First Name Is Required !';
        valid = false;
      }

      if(lastName.trim()){
        errorCopy.lastName = '';
      }else{
        errorCopy.lastName = 'last Name Is Required !';
        valid = false;
      }

      if(email.trim()){
        errorCopy.email = '';
      }else{
        errorCopy.email = 'Email Address Is Required !';
        valid = false;
      }

      setErrors(errorCopy);

      return valid;
    }

  return (
    <div className='container mt-3'>
        
        <div className="row">
          <div className="card col-md-6 offset-md-3 offset-md-3">
            <h2 className='text-center'>Update Employee</h2>
            <div className="card-body">
              <form>
                <div className="form-group mb-2">
                  <label className='form-label'>First Name:</label>
                  <input
                    type="text"
                    placeholder='Enter first name'
                    name='firstName'
                    value={firstName}
                    className={`form-control ${errors.firstName ? "is-invalid": ""}`}
                    onChange={(e) => setFirstName(e.target.value)}
                    
                  />
                  {errors.firstName && <div className='invalid-feedback'>{errors.firstName}</div>}
                </div>
                <div className="form-group mb-2">
                  <label className='form-label'>Last Name:</label>
                  <input
                    type="text"
                    placeholder='Enter last name'
                    name='lastName'
                    value={lastName}
                    className={`form-control ${errors.lastName ? "is-invalid": ""}`}
                    onChange={(e) => setLastName(e.target.value)}
                  />
                  {errors.lastName && <div className='invalid-feedback'>{errors.lastName}</div>}
                </div>
                <div className="form-group mb-2">
                  <label className='form-label'>Email:</label>
                  <input
                    type="text"
                    placeholder='Enter email address'
                    name='email'
                    value={email}
                    className={`form-control ${errors.email ? "is-invalid": ""}`}
                    onChange={(e) => setEmail(e.target.value)}
                  />
                  {errors.email && <div className='invalid-feedback'>{errors.email}</div>}
                </div>
                <div className="form-group mt-3  d-flex justify-content-end">
                  <button className='btn btn-success col-3 mx-4'  onClick={updateForm}>Update</button>
                  <button className='btn btn-danger col-3'  onClick={() => navigate("/employees")}>Cancel</button>
                </div>
              </form>
            </div>
          </div>
        </div>
      
    </div>
  )
}

export default UpdateEmployeeComponent
