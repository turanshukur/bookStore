import { Component, OnInit, Input } from "@angular/core";
import { User } from "src/app/model/User";

@Component({
  selector: "app-adduser",
  templateUrl: "./adduser.component.html",
  styleUrls: ["./adduser.component.css"],
})
export class AdduserComponent implements OnInit {
  @Input()
  user: User;

  constructor() {}

  ngOnInit() {}
}
