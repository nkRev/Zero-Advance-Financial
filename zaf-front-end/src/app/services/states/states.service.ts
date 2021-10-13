import { Injectable } from '@angular/core';
import { Country, State, City } from 'country-state-city';
import { ICountry, IState, ICity } from 'country-state-city/dist/lib/interface';
import { getStatesOfCountry } from 'country-state-city/dist/lib/state';

@Injectable({
  providedIn: 'root',
})
export class StatesService {
  constructor() {}

  getUSAStates() {
    const getStates = State.getStatesOfCountry('us');
    
  }
}
