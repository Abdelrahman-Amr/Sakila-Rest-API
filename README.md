# Sakila Rest API
A java restful api using JAX-RS for a DVD rental store website(Sakila).

# API Documentation
[Sakila restful API](https://documenter.getpostman.com/view/17477268/2s93Y2T2qm)


# Features
### Actors
* Find all actors
* Find actors by page
* Find actor by id
* Find actor by name
* Add a new actor
* Edit actor
* delete actor by id 

### Films
* Find all films
* Find films by page
* Find film by id
* Find film by name
* Find films of an actor
* Add a new film
* Edit film
* delete film by id 
* 
### Languages
* Find all languages
* Find languages by page
* Find language by id
* Add a new language
* Edit language
* delete language by id 

### Categories
* Find all categories
* Find categories by page
* Find category by id
* Add a new category
* Edit category
* delete category by id 

 ### Countries
* Find all countries
* Find countries by page
* Find country by id
* Add a new country
* Edit country
* delete country by id 


 ### Cities
* Find all cities
* Find cities by page
* Find city by id
* Add a new city
* Edit city
* delete city by id 



 ### Addresses
* Find all addresses
* Find addresses by page
* Find address by id
* Add a new address
* Edit address
* delete address by id 

 ### Staffs
* Find all staffs
* Find staffs by page
* Find staff by id
* Find staff by name
* Find staff's picture
* Add a new staff
* Edit staff
* Edit staff's picture
* delete staff by id 

 ### Stores
* Find all stores
* Find stores by page
* Find store by id
* Add a new store
* Edit store
* delete store by id 

 ### Inventory
* Find all inventories
* Find inventories by page
* Find inventory by id
* Add a new inventory
* Edit inventory
* delete inventory by id 

 ### Customers
* Find all customers
* Find customers by page
* Find customer by id
* Find customers by name
* Add a new customer
* Edit customer
* delete customer by id 

 ### Payments
* Find all payments
* Find payments by page
* Find payment by id
* Add a new payment
* delete payment by id 

 ### Rentals
* Find all rentals
* Find rentals by page
* Find rental by id
* Add a new rental
* Edit rental
* delete rental by id 

# Technologies Used
* Java 17
* Maven
* Tomcat 10
* JAX-RS (Jersey)
* Java Persistence API (Hibernate)
* MapStruct
* PostMan
* MySql

# Installation
## Make sure that you have installed the follwoing:
* java 17 (add JAVA_HOME environment variable)
* tomcat 10 (add CATALINA_HOME environment variable)
* maven
* mysql
* git
### Clone the project
```git
git clone https://github.com/Abdelrahman-Amr/Sakila-Soap-API.git
```
### Run the project
```maven 
catalina start
mvn install tomcat7:redeploy
```

