import { Component, OnInit } from '@angular/core';
import { Student } from 'Student';
import { StudentService } from '../student.service';

@Component({
  selector: 'app-create-student',
  templateUrl: './create-student.component.html',
  styleUrls: ['./create-student.component.css']
})
export class CreateStudentComponent implements OnInit {

  student:Student= new Student();

  constructor(private studentService:StudentService) { }

  ngOnInit(): void {
  }

  saveStudent(){
    this.studentService.createStudent(this.student).subscribe(data=>{
      alert("Student created!!" + data);
    })
  }

  onSubmit() {
    alert(this.student);
    this.saveStudent();
  }
}
