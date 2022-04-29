import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AttributeDirecrictiveComponent } from './attribute-direcrictive.component';

describe('AttributeDirecrictiveComponent', () => {
  let component: AttributeDirecrictiveComponent;
  let fixture: ComponentFixture<AttributeDirecrictiveComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AttributeDirecrictiveComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(AttributeDirecrictiveComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
