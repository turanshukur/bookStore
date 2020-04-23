import { Component, OnInit, Input } from "@angular/core";
import { Book } from "src/app/Model/Book";

@Component({
  selector: "app-viewbook",
  templateUrl: "./viewbook.component.html",
  styleUrls: ["./viewbook.component.css"],
})
export class ViewbookComponent implements OnInit {
  @Input()
  book: Book;

  constructor() {}

  ngOnInit() {}
}
