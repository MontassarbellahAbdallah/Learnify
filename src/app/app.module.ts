import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AjouterAdminComponent } from './ajouter-admin/ajouter-admin.component';
import { HeaderComponent } from './header/header.component';
import { FooterComponent } from './footer/footer.component';
import { DashbordComponent } from './dashbord/dashbord.component';
import { MenuComponent } from './menu/menu.component';
import { ListAdminComponent } from './list-admin/list-admin.component';
import { ModifierAdminComponent } from './modifier-admin/modifier-admin.component';
import { ListCategorieComponent } from './list-categorie/list-categorie.component';
import { AjouterCategorieComponent } from './ajouter-categorie/ajouter-categorie.component';
import { ModifierCategorieComponent } from './modifier-categorie/modifier-categorie.component';
import { ListCourComponent } from './list-cour/list-cour.component';
import { AjouterCourComponent } from './ajouter-cour/ajouter-cour.component';
import { ModifierCourComponent } from './modifier-cour/modifier-cour.component';
import { ListFormateurComponent } from './list-formateur/list-formateur.component';
import { AjouterFormateurComponent } from './ajouter-formateur/ajouter-formateur.component';
import { ListParticipantComponent } from './list-participant/list-participant.component';
import { AjouterParticipantComponent } from './ajouter-participant/ajouter-participant.component';
import { ContactComponent } from './contact/contact.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import {HttpClientModule} from '@angular/common/http';

@NgModule({
  declarations: [
    AppComponent,
    AjouterAdminComponent,
    HeaderComponent,
    FooterComponent,
    DashbordComponent,
    MenuComponent,
    ListAdminComponent,
    ModifierAdminComponent,
    ListCategorieComponent,
    AjouterCategorieComponent,
    ModifierCategorieComponent,
    ListCourComponent,
    AjouterCourComponent,
    ModifierCourComponent,
    ListFormateurComponent,
    AjouterFormateurComponent,
    ListParticipantComponent,
    AjouterParticipantComponent,
    ContactComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
