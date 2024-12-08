import { Component } from '@angular/core';
import { FormBuilder, FormControl, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { Admin } from '../Model/Admin.model';
import { CrudService } from '../Service/crud.service';
import { Category } from '../Model/Categorie.model';

@Component({
  selector: 'app-ajouter-categorie',
  templateUrl: './ajouter-categorie.component.html',
  styleUrls: ['./ajouter-categorie.component.css']
})
export class AjouterCategorieComponent {
  messageCommande=""
  CategoryForm:FormGroup
  
  newCateg=new Category()
  constructor(private services : CrudService , private router : Router, private fb:FormBuilder) {
    let formControls = {
      titre: new FormControl('',[
        Validators.required,]),
    
        description: new FormControl('',[
        Validators.required,]),

        img: new FormControl('',[
        Validators.required,])
      }
     this.CategoryForm = this.fb.group(formControls)
   }
   get titre() {return this.CategoryForm.get('titre');} 
   get description() {return this.CategoryForm.get('description');} 
  get img() { return this.CategoryForm.get('img');}
  
   addnewCateg() {
    let data = this.CategoryForm.value;
    console.log(data);
    let category = new Category(
     undefined, data.titre,data.description,data.img);
    console.log(category);
    
    if (
      data.titre == 0 ||
      data.description == 0 ||
      data.img == 0||
      data.mdp == 0 ||
      data.role == 0
    ) {
      this.messageCommande=`<div class="alert alert-danger" role="alert">
      remplir votre champ 
    </div>`
    
    } else {
    this.services.addcategory(category).subscribe(
      res=>{
        console.log(res);
        this.messageCommande=`<div class="alert alert-success" role="alert">
        avec success
      </div>`
        
        this.router.navigate(['/lcg'])
        ;
      },
       err=>{
        this.messageCommande=`<div class="alert alert-warning" role="alert">
        email EXISTE deja!!!! 
      </div>`
  
      })
      setTimeout(() => {
        this.messageCommande=""
      }, 30000);
    
    }
  }

}
