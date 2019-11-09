import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-mobile-component',
  templateUrl: './mobile-component.component.html',
  styleUrls: ['./mobile-component.component.css']
})
export class MobileCOmponentComponent implements OnInit {

  constructor() { }
  ip: string="hello,";

  ngOnInit() {
  }

}
