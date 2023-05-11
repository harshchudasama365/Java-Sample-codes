import { Component, OnInit } from '@angular/core';
import { Student } from 'Student';

@Component({
  selector: 'app-update-student',
  templateUrl: './update-student.component.html',
  styleUrls: ['./update-student.component.css']
})
export class UpdateStudentComponent implements OnInit {

  student:Student= new Student();
  
  constructor() { }

  ngOnInit(): void {
  }

  updateStudent(id:number){
    
  }

}
