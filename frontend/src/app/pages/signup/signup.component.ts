import { ThrowStmt } from '@angular/compiler';
import { Component, OnInit } from '@angular/core';
import { MatSnackBar } from '@angular/material/snack-bar';
import { UserService } from 'src/app/services/user.service';

@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.css']
})
export class SignupComponent implements OnInit {

  constructor(private userService:UserService,private _snackBar: MatSnackBar) { }

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
      this._snackBar.open("Email is required",'',{
        duration:2500,
        verticalPosition:'top'
      });
      return;
    }

    if(this.user.firstName == ''|| this.user.firstName == null){
      this._snackBar.open("First Name is required",'',{
        duration:2500,
        verticalPosition:'top'
      });
      return;
    }

    if(this.user.lastName == ''|| this.user.lastName == null){
      this._snackBar.open("Last  Name is required",'',{
        duration:2500,
        verticalPosition:'top'
      });
      return;
    }

    if(this.user.username == ''|| this.user.username == null){
      this._snackBar.open("Username is required",'',{
        duration:2500,
        verticalPosition:'top'
      });
      return;
    }
    
    this.userService.addUser(this.user).subscribe(
      (data)=>{
        console.log(data);
        this._snackBar.open("User Inserted Successfully","ok",{
          verticalPosition:"top",
          duration:2500

        })

      },
      (error)=>{
        this._snackBar.open("something went woring","ok",{
          verticalPosition:'top'
        })
      }
    );
  }

}