# time api
This api is made for project Cluster & SmartMirror, it is designed to run on a raspberry pi in a docker container. 
the application uses a tomcat server in order to work, the default port is 8080. 
make sure to setup a tomcat server if you havent already. 
this is a RESTfull api which will return the current time in JSON format including the hour,minute, second, day, day_of_month, month and year.

# setup tomcat server
https://www.jetbrains.com/help/idea/2017.1/creating-and-running-your-first-web-application.html

# Examples

connect to the application(should start when you run the application): <br>
{ip_cluster}:{port_api}/<br>
http://localhost:8080/<br>

to get the default time<br>
{ip_cluster}:{poort_api}/time<br> 
http://localhost:8080/time<br>

to get the time of a specific time zone<br>
{ip_cluster}:{port_api}/time/{Continent}/{Area}<br> 
http://localhost:8080/<strong>time/Asia/Seoul</strong><br>

OR<br>

http://localhost:8080/<strong>time/Etc/GMT+5</strong><br>

a list of all supported time zones: https://en.wikipedia.org/wiki/List_of_tz_database_time_zones<br>

<b>JSON feed example</b>
<code>{<br>
"dateTime":[<br>
{<br>
"hour":"21",<br>
"minute":"37",<br>
"second":"36",<br>
"day":"WEDNESDAY",<br>
"day_of_month":"24",<br>
"month":"5",<br>
"year":"2017"}<br>
]<br>
}<br>
