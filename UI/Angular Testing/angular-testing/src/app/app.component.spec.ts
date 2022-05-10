import { TestBed } from '@angular/core/testing';
import { AppComponent } from './app.component';

describe('AppComponent', () => {
  
  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [
        AppComponent
      ],
    }).compileComponents();
  });


  it('should create the app', () => {
    const fixture = TestBed.createComponent(AppComponent);  // got the identity of component   
    const app = fixture.componentInstance;                  // app is refernce of AppComponent 
    expect(app).toBeTruthy();         // component created or not. 
  });

  it(`should have as title 'angular-testing'`, () => {
    const fixture = TestBed.createComponent(AppComponent);
    const app = fixture.componentInstance;
    expect(app.title).toEqual('angular-testing');   // checking the value of title variable. 
  });

  it('should render title', () => {
    const fixture = TestBed.createComponent(AppComponent);
    fixture.detectChanges();    // load the dom or html page 
    const compiled = fixture.nativeElement as HTMLElement;
   // expect(compiled.querySelector('.content span')?.textContent).toContain('angular-testing app is running!');
   expect(compiled.getElementsByTagName('h1')[0].textContent).toEqual('Welcome to Angular Testing');
  });

  it("propety and function testing ",()=> {
    let obj = TestBed.createComponent(AppComponent).componentInstance;
    expect(obj.id).toEqual(100);
    expect(obj.name).toEqual("Raj Deep");
    let result = obj.sayHello("Ajay");
    expect(result).toContain("Ajay");
  });
  
});

