import { Component } from '@angular/core';
import { UserCreate } from '../models/user-create';
import { UserService } from '../user.service';
import { UserOutLite } from '../models/user-out-lite';

@Component({
  selector: 'app-user-registration',
  templateUrl: './user-registration.component.html',
  styleUrls: ['./user-registration.component.css']
})
export class UserRegistrationComponent {

constructor(private userService: UserService){}

  newUser: UserCreate = {
    login: "anIdiot",
    email: "",
    password: ""
  };
  result?: UserOutLite;

  createNewUser() {
    //validate user

    this.userService.createUser(this.newUser)
    .subscribe(user => this.result = user);

    console.log(this.newUser.password);
    console.log(this.result);
  }
}
