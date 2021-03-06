import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';
import { AppComponent } from './app.component';
import { StructureDirectiveComponent } from './structure-directive/structure-directive.component';
import { AttributeDirecrictiveComponent } from './attribute-direcrictive/attribute-direcrictive.component';

@NgModule({
  declarations: [
    AppComponent,
    StructureDirectiveComponent,
    AttributeDirecrictiveComponent
  ],
  imports: [
    BrowserModule,FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
