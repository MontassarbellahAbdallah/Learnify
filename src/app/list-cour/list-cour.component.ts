import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { CrudService } from '../Service/crud.service';
import { Cour } from '../Model/Cour.model';

@Component({
  selector: 'app-list-cour',
  templateUrl: './list-cour.component.html',
  styleUrls: ['./list-cour.component.css']
})
export class ListCourComponent {
  listCour1:Cour[]
  constructor(private service:CrudService, private router:Router){}
  ngOnInit():void{
    this.service.getCour().subscribe(cour=>{this.listCour1=cour})
  }
  deleteCour(cour:Cour){
    if(confirm("voulez vous supprimer ce cour ???")){
      this.service.suppCour(cour.id).subscribe(()=>{
        this.router.navigate(["/lc"]).then(()=>{
          window.location.reload()
        })
      })
    }
  }


}
