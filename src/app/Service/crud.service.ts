import { Injectable } from '@angular/core';
import { Admin } from '../Model/Admin.model';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Category } from '../Model/Categorie.model';
import { Cour } from '../Model/Cour.model';

@Injectable({
  providedIn: 'root'
})
export class CrudService {
  apiURL="http://localhost:8081/api"

  constructor(private http:HttpClient) {}
  addadmin(admin:Admin){
    return this.http.post<any>(this.apiURL+"/Admin",admin)
  }
  getAdmin():Observable<Admin[]>{
    return this.http.get<Admin[]>(this.apiURL+"/Admin")
  }
  suppAdmin(id:number){
    const url=`${this.apiURL+"/Admin"}/${id}`
    return this.http.delete(url)
  }
  // -----------------------
  addcategory(category:Category){
    return this.http.post<any>(this.apiURL+"/Category",category)
  }
  getCategory():Observable<Category[]>{
    return this.http.get<Category[]>(this.apiURL+"/Category")
  }
  suppCategory(id:number){
    const url=`${this.apiURL+"/Category"}/${id}`
    return this.http.delete(url)
  }
  //------------------------
  getCour():Observable<Cour[]>{
    return this.http.get<Cour[]>(this.apiURL+"/Cour")
  }
  suppCour(id:number){
    const url=`${this.apiURL+"/Cour"}/${id}`
    return this.http.delete(url)
  }
}
