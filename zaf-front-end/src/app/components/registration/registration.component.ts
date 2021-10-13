
import { Component, OnInit } from '@angular/core';
import { StatesService } from 'src/app/services/states/states.service';


@Component({
  selector: 'app-registration',
  templateUrl: './registration.component.html',
  styleUrls: ['./registration.component.css']
})
export class RegistrationComponent implements OnInit {

  constructor(private stateService: StatesService) { }

  ngOnInit(): void {
    console.log(this.stateService.getUSAStates())
  }

}
