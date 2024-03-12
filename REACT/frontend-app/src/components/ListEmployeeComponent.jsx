import React, { useEffect, useState } from 'react'
import { deleteEmployee, listEmployee } from '../services/EmployeeService';
import { Link } from 'react-router-dom';

const ListEmployeeComponent = () => {

    const [employees, setEmployees] = useState([]);

    useEffect(()=>{
        getAllEmployee();
    } , []);

    const getAllEmployee = () => {
        listEmployee().then((Response) => {
            setEmployees(Response.data);
        }).catch(error => {
            console.error(error);
        })
    }

    const removeEmployee = (id) => {
        deleteEmployee(id).then((Response) => {
            getAllEmployee();
            console.log(Response.data + 'Deleted Employee');
        }).catch(error => {
            console.error(error);
        })
    }

  return (
    <div className='container'>
        <h1 className='text-center'>Employee List</h1>
        <div className="d-grid"><Link className='btn btn-primary my-md-2' to={"/add-Employee"} type='button'>Add Employee</Link></div>
        <table className='table table-striped table-bordered'>
            <thead>
                <tr>
                    <th>eId</th>
                    <th>First Name</th>
                    <th>Last Name</th>
                    <th>Email Address</th>
                    <th>Action</th>
                </tr>
            </thead>
            <tbody>
                {employees.map(employee => 
                    <tr key={employee.id}>
                        <td>{(employee.id)}</td>
                        <td>{(employee.firstName)}</td>
                        <td>{(employee.lastName)}</td>
                        <td>{(employee.email)}</td>
                        <td>
                            <Link to={`/edit-employee/${employee.id}`} className='btn btn-secondary '>Update</Link>
                            <button className='btn btn-danger' onClick={()=>removeEmployee(employee.id)}>Delete</button>
                        </td>
                    </tr>
                )}
            </tbody>
        </table>
      
    </div>
  )
}

export default ListEmployeeComponent
