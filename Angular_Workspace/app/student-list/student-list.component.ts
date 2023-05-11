import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Student } from 'Student';
import { StudentService } from '../student.service';

@Component({
  selector: 'app-student-list',
  templateUrl: './student-list.component.html',
  styleUrls: ['./student-list.component.css']
})
export class StudentListComponent implements OnInit {

  students!:Student[];
  triggerUpdateStudent = false;
  constructor(private studentService:StudentService, private router:Router) { }

  ngOnInit(): void {
    this.getStudentList();
  }

  private getStudentList(){
    this.studentService.getAllStudents().subscribe(data=>{
      this.students=data;
    });
  }

  deleteStudent(id:number){
    this.studentService.deleteStudentById(id).subscribe(
      data=>{
        alert("Student removed!!");
        this.getStudent();

      }
    )
  }
  updateStudent(id:number){
    this.triggerUpdateStudent = true;
  }

  private getStudent(){
    this.studentService.getAllStudents().subscribe(data=>{
      this.students=data;
    });
  }
}

