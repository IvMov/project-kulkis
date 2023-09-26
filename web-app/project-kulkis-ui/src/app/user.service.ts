import { Injectable } from '@angular/core';
import { Observable, of } from 'rxjs';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { UserOutLite } from './models/user-out-lite';
import { UserCreate } from './models/user-create';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  private userServiceUrl: string = "http://localhost:8701/users"

  constructor(private http: HttpClient) { }

  createUser(user: UserCreate): Observable<UserOutLite> {
    return this.http.post<UserOutLite>(this.userServiceUrl, user);
  }
}
