import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CreateStudentComponent } from './create-student/create-student.component';
import { UpdateStudentComponent } from './update-student/update-student.component';

const routes: Routes = [
  {path : 'create-student', component:CreateStudentComponent},
  {path : 'student-list', component:CreateStudentComponent},
  {path : 'update-student', component:UpdateStudentComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
