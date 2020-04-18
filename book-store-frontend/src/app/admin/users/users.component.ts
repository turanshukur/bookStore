import { Component, OnInit } from "@angular/core";
import { User } from "src/app/model/User";
import { HttpClientService } from "src/app/service/http-client.service";

@Component({
  selector: "app-users",
  templateUrl: "./users.component.html",
  styleUrls: ["./users.component.css"],
})
export class UsersComponent implements OnInit {
  users: Array<User>;

  constructor(private httpClientService: HttpClientService) {}

  ngOnInit() {
    this.users = new Array<User>();

    this.httpClientService
      .getUsers()
      .subscribe((response) => this.handleSuccesResponse(response));
  }

  handleSuccesResponse(response) {
    this.users = response;
  }
}
