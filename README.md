<h2 align="center">✩░▒▓▆▅▃▂▁📚Student Management System📚▁▂▃▅▆▓▒░✩</h2>
<h2>Project Summary 📚 :</h2>
<p align="justify">A CRUD student management system is an application that allows users to Create, Read, Update, and Delete student data. Spring Boot is a popular Java framework that allows developers to easily create web applications.

In a Spring Boot CRUD student management system, the application would typically include a user interface for managing student data, such as adding new students, viewing existing students, updating student information, and deleting students from the system.

The system would store student data in a database, such as MySQL or PostgreSQL, and use Spring Boot's built-in ORM framework, such as Hibernate, to manage the database interactions.

The application would also include features such as user authentication and authorization to ensure that only authorized users can access and modify the student data.

Overall, a CRUD student management system built with Spring Boot provides a robust and efficient way to manage student data in educational institutions. It simplifies the process of adding, updating, and deleting student data while maintaining the security and integrity of the data. With the help of Spring Boot's powerful features and ease of use, developers can build a highly functional student management system that meets the needs of any educational institution.


<h3>Student Module :</h3>
<li>The system will allow admin to manage their student database by creating, updating, get and deleting student data.</li>


<hr>

<table align="center">
<tbody>
<tr align="top">
<td width="20%" align="center">

<h3>Software Requirements</h3>
  
| Command | Description |
| --- | --- |
| Operating System | Windows 10, Linux |
| Programming Language | Java. |
| IDE Used | Intellij |
| Database  | MySQL 8.0 |
| Framework  | SpringBoot,Maven |
| Architecture  | CRUD, MVC |
  
</td>
<td width="20%" align="center">
<h3>Languages and Tools:</h3>
<table align="center">
<tbody>
<tr valign="top">
<td width="15%" align="center">
<p dir="auto"><span>𝗦𝗽𝗿𝗶𝗻𝗴 𝗧𝗼𝗼𝗹 𝗦𝘂𝗶𝘁</span><br><br></p>
<a><img src="https://user-images.githubusercontent.com/103574856/220043688-f6ef29ce-d1db-42c6-9851-383075f93a29.png" height="40"></a>
<td width="15%" align="center">
<p dir="auto"><span>𝗜𝗻𝘁𝗲𝗹𝗹𝗶𝗝 𝗜𝗗𝗘𝗔</span><br><br></p>
<a><img src="https://upload.wikimedia.org/wikipedia/commons/9/9c/IntelliJ_IDEA_Icon.svg" height = "40"></a>
</td>
<td width="15%" align="center">
<p dir="auto"><span>𝗝𝗮𝘃𝗮</span><br><br></p>
<a><img src="https://cdn.jsdelivr.net/npm/programming-languages-logos/src/java/java.png" height="40"></a>
</td>
<td width="15%" align="center">
<p dir="auto"><span>𝐌𝐲𝐒𝐐𝐋</span><br><br></p>
<a><img src="https://user-images.githubusercontent.com/103574856/208289464-84fa15f0-e608-48f1-82bd-565e0f776243.png" height="40"></a>
</td>
</tr>

<tr valign="top">
<td width="15%" align="center">
<p dir="auto"><span>𝗦𝗽𝗿𝗶𝗻𝗴 𝗕𝗼𝗼𝘁</span><br><br></p>
<a><img src="https://user-images.githubusercontent.com/103574856/220042941-fba009d3-2daa-4529-b89b-420056924a17.png" height="40"></a>
</td>
<td width="15%" align="center">
<p dir="auto"><span>𝐌𝐚𝐯𝐞𝐧</span><br><br></p>
<a><img src="https://user-images.githubusercontent.com/103574856/208289206-2e81be61-cdf4-4667-ac8f-2bacdadefb25.png" height="40"></a>
</td>
<td width="15%" align="center">
<p dir="auto"><span>𝐇𝐢𝐛𝐞𝐫𝐧𝐚𝐭𝐞</span><br><br></p>
<a><img src="https://user-images.githubusercontent.com/103574856/208289363-3db3173b-fdb9-4306-94fa-05290df04561.PNG" height="40"></a>
</td>
</tr>

</td>
</tr>
</tbody>
</table>

</table>

<hr>

<h2>Project Structure </h2>
<p align="center" >
<img src="https://user-images.githubusercontent.com/103574856/230464659-5ff851d0-ff8c-4ced-8f5e-c695b732e309.png">
</p>

<hr>

<h2 align="center" >Swagger UI & Student Schema</h2>

<p align="center"><img src="https://user-images.githubusercontent.com/103574856/230465182-c12172fa-aefb-40ad-a6dc-9cada77366ac.png"></p>

<hr>


 <h3 id="installation-run">Installation &amp; Run</h3>
    <ul>
        <li>Before running the API server, you should update the database config inside the <a href="https://github.com/gopalkrushnas063/Student_CRUD_App/blob/master/src/main/resources/application.properties">application.properties</a>
            file.</li>
        <li>Update the port number, username and password as per your local database config.</li>
    </ul>
    <pre>
        <code>
            server.port=<span class="hljs-number">8080</span>
            <br>
            #database specific properties
            spring<span>.datasource</span><span>.url</span>=jdbc:mysql:<span>//localhost:3306/student;</span>
            spring<span>.datasource</span><span>.driver-class-name</span>=com<span>.mysql</span><span>.cj</span><span>.jdbc</span><span>.Driver</span>
            spring<span>.datasource</span><span>.username</span>=root
            spring<span>.datasource</span><span>.password</span>=root
            <br>
            #ORM s/w specific properties
            spring<span>.jpa</span><span>.hibernate</span><span>.ddl-auto</span>=create<span>/update</span> <span>/create-drop</span>
            spring<span>.jpa</span><span>.show-sql</span>=true
        </code>
    </pre>
    




    

