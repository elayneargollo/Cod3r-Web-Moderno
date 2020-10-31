import { Component, OnInit } from '@angular/core';
import { from } from 'rxjs';
import { map } from 'rxjs/operators';

@Component({
  selector: 'app-rxjs',
  templateUrl: './rxjs.component.html',
  styleUrls: ['./rxjs.component.css']
})
export class RxjsComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {

    const source = from([10, 25, 13, 44, 59]);
    const exemplo = source.pipe(map( valor => valor + 10));
    const sub = exemplo.subscribe(valor => console.log(valor))

    const data = from([
      { name: 'Joe', age: 30 },
      { name: 'Frank', age: 20 },
      { name: 'Ryan', age: 50 }
    ]);

    const ex = data.pipe(map(val => val.name));
    const text = ex.subscribe(val => console.log(val));

  }

}
