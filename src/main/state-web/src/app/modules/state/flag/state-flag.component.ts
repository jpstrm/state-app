import { Component, Input, OnDestroy, OnInit } from '@angular/core';
import { Observable, Subscription } from 'rxjs';
import { StateDto } from '../../../api/state';
import { skip, take } from 'rxjs/operators';

@Component({
  selector: 'app-state-flag',
  templateUrl: './state-flag.component.html',
  styleUrls: ['./state-flag.component.scss']
})
export class StateFlagComponent implements OnInit, OnDestroy {

  @Input('states') states$: Observable<StateDto[]>;
  states: StateDto[] = [];
  selectedState: StateDto = {};

  private subscription = new Subscription();

  constructor() { }

  ngOnInit(): void {
    this.subscription = this.states$.pipe(skip(1), take(1))
      .subscribe(states => {
        this.states = states;
        const state = states.filter(s => s.code === 'SC') as StateDto[];
        if (state.length) {
          this.selectedState = state[0];
        }
      });
  }

  ngOnDestroy(): void {
    this.subscription.unsubscribe();
  }

}
