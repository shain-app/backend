# End To End Architecture

## 1. What is a computer?

A computer is just a fancy box that takes stuff (input), does some magic (processes), 
and spits stuff out (output). It’s like a brainless but super-fast employee. You tell it what to do, 
and it follows instructions exactly without questioning.

## 2. What are processes?

Processes are the specific tasks or jobs that a computer is told to do. It’s like having a bunch of 
minions running around doing different jobs at the same time. For example, one process is running 
your Spotify app to play music, and another process is running your web browser to watch YouTube 
at the same time. Each task (process) has its own space and doesn’t interfere with others... unless 
something goes wrong!

## 3. How are these processes run?

Your computer’s operating system (like Windows, macOS, Linux) is the boss here. It tells the computer 
how to manage all these different processes. When you open an app, the operating system gives it a 
special spot in the computer’s memory (RAM) and allows it to use the CPU (the computer’s brain) to 
do its work. Each process is like a worker at a factory assembly line, taking turns using the CPU 
to get stuff done.

## 4. What are ports?

Think of ports as doors or channels on your computer. Imagine your computer as a giant apartment building, 
and each port is like an apartment door. When two apps (like a frontend and a backend) want to talk, 
they each have their own door (port) through which they send and receive messages. So, if you have 
multiple apps running, each can have its own door/port to avoid confusion.


## 5. How can a frontend Angular app and a backend Java app run on the same computer and talk to each other?

- Frontend Angular App: This is like the face of the application, the one users interact with. It’s all the buttons, 
forms, and displays you see in your web browser. Usually, the frontend runs on a specific port (say http://localhost:4200), 
which is like its own door.


- Backend Java App: This is the muscle behind the scenes. It processes data, handles requests, talks to the database, etc.
It also runs on a different port (like http://localhost:8080).


- Making Them Talk: The frontend and backend talk to each other using HTTP requests. It’s like the Angular frontend goes, 
"Hey Java backend, can you give me the data for this user?" The Java backend replies, "Sure! Here’s the data you requested." 
This happens through their ports. The Angular app sends requests to the backend’s port (e.g., http://localhost:8080/item/2), 
and the backend responds.

### Here’s a quick comparison:

- Angular App (Frontend): Runs on port 4200 (usually)


- Java App (Backend): Runs on port 8080 (usually)


- The two communicate using HTTP (like sending text messages over the network).

## 6. What is HTTP?

HTTP (HyperText Transfer Protocol) is how computers talk over the internet. It's like a set of 
rules or a language that lets your browser (the client) and a website's server communicate.

### How it Works

- Client (Browser): "Hey server, give me this webpage!"
- Server: "Here’s the page or data you asked for."

This back-and-forth happens every time you visit a website.

### Requests and Responses

1. Request: Your browser asks for something (e.g., a webpage).
- GET: “Give me this page.”
- POST: “Here’s some data for you.”
2. Response: The server sends back what was requested.
- 200 OK: Everything's good.
- 404 Not Found: Page doesn’t exist.

### Angular and Backend

Your Angular app sends HTTP requests to the Java backend (e.g., "Give me product data"), and the 
backend responds with the data, like a little chat using HTTP.

## Flowchart
![Alt text](../../src/main/resources/flowcharts/application%20structure%20flow.png)