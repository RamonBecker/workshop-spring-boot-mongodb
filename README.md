# Workshop Spring-boot MongoDB
 
## :information_source: Information 

The project was developed during the Java programming course by instructor Nélio Alves. A post creation system was implemented. Where the user can create their posts and comment on other users' posts. It was developed only as part of the system's backend and to be able to carry out the tests it will be necessary to install the programs: postman or insomnia. But you can choose which one pleases you the most. In order to view, insert and delete data in the mongoDB database, install or mongoDBCompass for greater convenience. Next, the class diagram that was followed for the development of the system is presented.
The MVC standard and the DTO standard were followed to develop this system.
## ⚠️ Prerequisite
[![Java Badge](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)](https://www.oracle.com/br/java/technologies/javase-downloads.html) >= 8 

![Spring Badge](https://img.shields.io/badge/Spring-6DB33F?style=for-the-badge&logo=spring&logoColor=white)

![JSON Badge](https://img.shields.io/badge/json-5E5C5C?style=for-the-badge&logo=json&logoColor=white)

![mongodb](https://img.shields.io/badge/MongoDB-4EA94B?style=for-the-badge&logo=mongodb&logoColor=white)

![mongodbcompass](https://img.shields.io/badge/MongoDB-white?style=for-the-badge&logo=mongodb&logoColor=4EA94B)

![JPA-hibernate (1)](https://user-images.githubusercontent.com/44611131/136869865-0e3d7476-5128-4471-8817-8df40315b970.jpg)

![Postman Badge](https://img.shields.io/badge/Postman-FF6C37?style=for-the-badge&logo=Postman&logoColor=white) OR ![Insomnia Badge](https://img.shields.io/badge/Insomnia-5849be?style=for-the-badge&logo=Insomnia&logoColor=white)

## 📌 Class Diagram

![diagrama de classe](https://user-images.githubusercontent.com/44611131/138970582-dc5db291-04c0-476d-9416-ec9bd512768e.PNG)


##  🔧 Install 


![](https://img.shields.io/badge/Linux-FCC624?style=for-the-badge&logo=linux&logoColor=black)


```
https://github.com/RamonBecker/workshop-spring-boot-mongodb.git
```

![](https://img.shields.io/badge/Windows-0078D6?style=for-the-badge&logo=windows&logoColor=white)
```
git clone https://github.com/RamonBecker/workshop-spring-boot-mongodb.git
or install github https://desktop.github.com/ 
```

## ⚙️ Testing the project


To test the project you will need to clone the repository on your machine. You can choose both tools: postman or insomnia.
```
To download postman go to the following link: https://www.postman.com/downloads/
```
```
To download insomnia rentre from the following link: https://insomnia.rest/download
```
To test some system functionality in postman or insomnia. Type the following urls in the url as shown below:

To test a full search:
```
http://localhost:8080/posts/fullsearch?text=enjoy&minDate=2021-10-24&maxDate=2021-10-25
```
To search a user search by id
```
http://localhost:8080/users/enter id as per the database
```
To search posts by user id
```
http://localhost:8080/users/posts/enter id as per the database
```

To search for posts with common titles
```
http://localhost:8080/posts/titlesearch?text=Good%20Morning
```
according to the image below, to perform, for example, the GET operation, to search for all users in the database.


The following HTPP methods were implemented: PUT, DELETE, GET and POST.

The example was performed using Postman.

![teste](https://user-images.githubusercontent.com/44611131/138975155-d70f3658-75e4-42e7-b014-594ccaa5e818.PNG)



## Install database MongoDB


Download MongoDB through the website:
```
https://www.mongodb.com/try/download/community
```
Download MongoDBCompass through the website.
```
https://www.mongodb.com/try/download/compass
```

Choose your preferred operating system.


If there are any doubts about installing mongoDB, consult the official documentation through the website:
```
https://docs.mongodb.com/manual/installation/


```



## :zap: Technologies	

- Java
- JPA
- Spring Boot
- MongoDB
- MongoDBCompass

## :memo: Developed features

- [x] CRUD User
- [x] CRUD Post
- [x] CRUD Comments on posts



## :technologist:	 Author

By Ramon Becker 👋🏽 Get in touch!



[<img src='https://cdn.jsdelivr.net/npm/simple-icons@3.0.1/icons/github.svg' alt='github' height='40'>](https://github.com/RamonBecker)  [<img src='https://cdn.jsdelivr.net/npm/simple-icons@3.0.1/icons/linkedin.svg' alt='linkedin' height='40'>](https://www.linkedin.com/in/https://www.linkedin.com/in/ramon-becker-da-silva-96b81b141//)
![Gmail Badge](https://img.shields.io/badge/-ramonbecker68@gmail.com-c14438?style=flat-square&logo=Gmail&logoColor=white&link=mailto:ramonbecker68@gmail.com)
