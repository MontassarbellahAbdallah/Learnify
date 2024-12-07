import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AjouterAdminComponent } from './ajouter-admin/ajouter-admin.component';
import { DashbordComponent } from './dashbord/dashbord.component';
import { ListAdminComponent } from './list-admin/list-admin.component';

const routes: Routes = [
  {path:'aa',component:AjouterAdminComponent},
  {path:'',component:DashbordComponent},
  {path:'la',component:ListAdminComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
