import { Component } from '@angular/core';
import { Category } from '../Model/Categorie.model';
import { Router } from '@angular/router';
import { CrudService } from '../Service/crud.service';

@Component({
  selector: 'app-list-categorie',
  templateUrl: './list-categorie.component.html',
  styleUrls: ['./list-categorie.component.css']
})
export class ListCategorieComponent {
  listCateg:Category[]
  constructor(private service:CrudService, private router:Router){}
  ngOnInit():void{
    this.service.getCategory().subscribe(category=>{this.listCateg=category})
  }
  deleteCategory(category:Category){
    if(confirm("voulez vous supprimer ce admin ???")){
      this.service.suppAdmin(category.id).subscribe(()=>{
        this.router.navigate(["/la"]).then(()=>{
          window.location.reload()
        })
      })
    }
  }

}
