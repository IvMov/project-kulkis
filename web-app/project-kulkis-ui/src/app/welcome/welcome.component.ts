import { Component } from '@angular/core';
import { Collapse, initTE, Dropdown } from "tw-elements";

@Component({
  selector: 'app-welcome',
  templateUrl: './welcome.component.html',
  styleUrls: ['./welcome.component.css']
})
export class WelcomeComponent {
  ngOnInit() {
    initTE({ Collapse, Dropdown});
  }
}
