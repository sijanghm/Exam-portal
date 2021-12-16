import { ThrowStmt } from '@angular/compiler';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.css']
})
export class SignupComponent implements OnInit {

  constructor() { }

  public user ={
    username:'',
    password:'',
    firstName:'',
    lastName:'',
    email:'',
    phone:''
  };

  ngOnInit(): void {
  }

  formSubmit(){
    console.log(this.user);
    if(this.user.email == ''|| this.user.email == null){
      alert("Fields cannot be empty");
      return;
    }
  }

}
