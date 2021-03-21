# Elon Musk Chat Bot
## Purpose
- The purpose of this project was for COSC 310 "Software Engineering".
- We created a chatbot that can answer some questions about Elon Musk.
- We did not use any NLP libraries but we used a chain of if else statements that when a word is recognized from a sentence it will get the appropriate response from a 2D array.

---------------------------------------

## Compile And Run
- To compile and run this code clone the repository than you will have a jar file that you can run to open up our application. 

---------------------------------------

## Contributors
- Emiel van der Poel
- Nathan Pelmore
- Garrett Cook
- Benjamin Keeley
- Taylor Regier

---------------------------------------
---------------------------------------
## Code Documentation
![image4](https://user-images.githubusercontent.com/75397522/111886188-a06db000-8989-11eb-8a34-b567d3314c41.png)

***Figure 1:*** Main class:

The only purpose of the main class is to instantiate a new Window, which is our chatbot and its functionality.

![image8](https://user-images.githubusercontent.com/75397522/111886198-acf20880-8989-11eb-9156-c3cea4bb7f9c.png)

***Figure 2:*** Importing required packages and creating a graphical user interface (gui):

The purpose of this section of code is to import the required packages to make our gui and its desired settings.

![image3](https://user-images.githubusercontent.com/75397522/111886200-b3808000-8989-11eb-873b-617e488297ee.png)


***Figure 3:*** 2d array of responses:

The purpose of this code is to have a 2d array that acts as a cache to our responses. We will access the specific element in this array by looking at the words sent by the user. 

![image2](https://user-images.githubusercontent.com/75397522/111886205-b7140700-8989-11eb-9d4b-ed6a54d3ca63.png)


***Figure 4:*** Constructor for our Window class:

The purpose of this constructor is to set all parameters of our graphical user interface(gui). We sat its name, size, how it closes, an icon image, set a gif in the gui, set background color, set font, and set desired areas of our gui to function as text areas.

![image6](https://user-images.githubusercontent.com/75397522/111886211-bc715180-8989-11eb-8abe-d2d2f358cfe2.png)


***Figure 5:*** keyPressed method:

The purpose of this method is to look for keys being entered by the user. If the user presses the enter key to submit their question the input text area will deactivate so the user cannot enter any more information. It will then take the input message and send that message to the addText function, which will add it to the main text area where the conversation will occur. We will that detect if the message contained a ‘?’, which then will set a question boolean value to true. If the message sent contains any punctuation the code will replace the punctuation with a space. We then trim the message from the whitespaces at the end and at the beginning. We then make the message lowercase so the case does not affect the outcome. Then send our message and our question boolean to the response method.

![image5](https://user-images.githubusercontent.com/75397522/111886214-c09d6f00-8989-11eb-9692-b70878ea5f9e.png)


***Figure 6:*** keyReleased method:

The purpose of this method is to make the input text area editable again once the enter key was released.

![image7](https://user-images.githubusercontent.com/75397522/111886216-c4c98c80-8989-11eb-8357-26c604e4ceb1.png)


***Figure 7:*** addText method:

The purpose of this method is to take a string and add it to the main conversation text area.

![image1](https://user-images.githubusercontent.com/75397522/111886224-cabf6d80-8989-11eb-9f32-232f33ab6317.png)


***Figure 8:*** response method:

The main purpose of this method is to split the message string into an array of its individual words. It will then check the words contained in this array to grab the correct bot response from the response 2d array shown above. Then we check if the question boolean value was true and we generate a random number to check if it equals a specified number and if both cases are true our bot will tell the user that their question was a good question. If the user sent ‘q’ we sent a message saying that the chat has ended.

---------------------------------------
# Implementations
---------------------------------------

## Named Entity Recognition (*Stanford toolkit*)
---------------------------------------

![namedEntities](https://user-images.githubusercontent.com/75397522/111888896-03694200-899e-11eb-9e77-4725305d9f89.PNG)


***Figure 9: Named Entities Example:

If you introduce yourself with your name and your name is a recognized entity. Elon will say you have a nice name. Grimes response is now triggered if the entity grimes is detected along with others ie Tesla. On the right recognized entities are listed

![places](https://user-images.githubusercontent.com/75397522/111888928-37dcfe00-899e-11eb-9ecc-5623d7bed507.PNG)

***Figure 10:*** Places Visited Example:

You can ask elon where he has been, listing places. Elon will randomly select a recognized entity and then give a general response about it.

---------------------------------------

## Phrasel (*Stanford toolkit*)
---------------------------------------


---------------------------------------

## Sentiment analysis tools (*Stanford toolkit*)
---------------------------------------
