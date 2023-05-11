import { Injectable } from '@angular/core';
import { Student } from 'Student';
import { Observable } from 'rxjs'; 
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class StudentService {
  private url = "http://localhost:3000/students";

  constructor(private http_ser:HttpClient) { }

  getAllStudents(): Observable<Student[]>{
    return this.http_ser.get<Student[]>(this.url);
  }

  deleteStudentById(id:number): Observable<Object>{ // Single object return
    return this.http_ser.delete(this.url + '/' + id);
  }

  createStudent(student:Student): Observable<Object> {
    return this.http_ser.post(this.url, student);
  }
}
