import { Injectable } from "@angular/core";
import { HttpClient } from "@angular/common/http";
import { User } from "../model/User";
import { Book } from "../Model/Book";

@Injectable({
  providedIn: "root",
})
export class HttpClientService {
  constructor(private httpClient: HttpClient) {}

  getUsers() {
    console.log("test call");
    return this.httpClient.get<User[]>("http://localhost:8080/users/get");
  }

  addUser(newUser: User) {
    return this.httpClient.post<User>(
      "http://localhost:8080/users/add",
      newUser
    );
  }

  deleteUser(id) {
    return this.httpClient.delete<User>("http://localhost:8080/users/" + id);
  }

  getBooks() {
    return this.httpClient.get<Book[]>("http://localhost:8080/book/get/all");
  }

  addBook(newBook: Book) {
    return this.httpClient.post<Book>(
      "http://localhost:8080/book/add",
      newBook
    );
  }
}
