import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AjouterAdminComponent } from './ajouter-admin/ajouter-admin.component';
import { DashbordComponent } from './dashbord/dashbord.component';
import { ListAdminComponent } from './list-admin/list-admin.component';
import { ModifierAdminComponent } from './modifier-admin/modifier-admin.component';
import { ListCategorieComponent } from './list-categorie/list-categorie.component';
import { ModifierCategorieComponent } from './modifier-categorie/modifier-categorie.component';
import { AjouterCategorieComponent } from './ajouter-categorie/ajouter-categorie.component';
import { ListCourComponent } from './list-cour/list-cour.component';
import { ModifierCourComponent } from './modifier-cour/modifier-cour.component';
import { AjouterCourComponent } from './ajouter-cour/ajouter-cour.component';
import { ListFormateurComponent } from './list-formateur/list-formateur.component';
import { AjouterFormateurComponent } from './ajouter-formateur/ajouter-formateur.component';
import { ListParticipantComponent } from './list-participant/list-participant.component';
import { AjouterParticipantComponent } from './ajouter-participant/ajouter-participant.component';
import { ContactComponent } from './contact/contact.component';

const routes: Routes = [
  {path:'aa',component:AjouterAdminComponent},
  {path:'',component:DashbordComponent},
  {path:'la',component:ListAdminComponent},
  {path:'ma',component:ModifierAdminComponent},
  {path:'lcg',component:ListCategorieComponent},
  {path:'mcg',component:ModifierCategorieComponent},
  {path:'acg',component:AjouterCategorieComponent},
  {path:'lc',component:ListCourComponent},
  {path:'mc',component:ModifierCourComponent},
  {path:'ac',component:AjouterCourComponent},
  {path:'lf',component:ListFormateurComponent},
  {path:'af',component:AjouterFormateurComponent},
  {path:'lp',component:ListParticipantComponent},
  {path:'ap',component:AjouterParticipantComponent},
  {path:'lcon',component:ContactComponent}
  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
