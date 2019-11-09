import { Component } from '@angular/core';

import { identifierModuleUrl } from '@angular/compiler';

import { isPending } from 'q';


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'my-world';


}

