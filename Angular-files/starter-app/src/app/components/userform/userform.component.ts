import { Component, OnInit } from '@angular/core';
import Student from 'src/app/Entity/Student';

@Component({
  selector: 'app-userform',
  templateUrl: './userform.component.html',
  styleUrls: ['./userform.component.css']
})
export class UserformComponent implements OnInit {

  student: Student = new Student();

  constructor() { }

  ngOnInit(): void {
  }

}
