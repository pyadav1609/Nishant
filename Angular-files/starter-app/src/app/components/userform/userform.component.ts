import { Component, OnInit } from '@angular/core';
import Student from 'src/app/Entity/Student';
import { StudentsService } from 'src/app/Services/students.service';

@Component({
  selector: 'app-userform',
  templateUrl: './userform.component.html',
  styleUrls: ['./userform.component.css']
})
export class UserformComponent implements OnInit {

  student: Student = new Student();

  constructor( public studentService: StudentsService) { }

  ngOnInit(): void {
  }

}
