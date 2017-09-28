# CHUTES & LADDERS: GENERATIONS  
We are going to take the old, classic, game of chutes and ladders and bring it into the 21st century, with a multiplayer, multi-device desktop application. The GUI will feature theme options in which the user can select a preferred aesthetic as well as a randomly generated selection of chutes and ladders for a unique game experience every time. Each theme will not only have a varied game board, but also appropriate humorous explanations to explain a player’s progress forwards or backwards. A stats board will use multi-threading to update in real-time during the game with each player’s current position as well as total number of ladders climbed, slides descented, squares gained, and squares lost. At the termination of the game, participation awards will be given for each of these stats.

There will be multiple users playing on the same randomly-generated game board, using networking to allow friends to play together on different devices. The database on the server will allow for complete login functionality (authentication) for users and limited interactions for guests. Guests cannot change the randomization/size of their boards, which will be 5x5 by default. Guests will also not be able to select from the different theme options, which is an option that authenticated users will have. Authenticated users will have their cumulative gameplay stats saved on the database, and can view their prior stats and achievements.

Team “Oh Chute” Members:  
Arfan Rehab rehab@usc.edu  
Nicholas Thompson nmthomps@usc.edu  
Jiachang (Ernest) Xu jiachanx@usc.edu  
David Garry dgarry@usc.edu  
Derek Cheng derekwch@usc.edu  

To deploy this application within Eclipse, import the ChutesAndLaddersGenerations.zip file into Eclipse. This should generate a project called ChutesAndLaddersGenerations with src and resources directories. The src directory contains the gameserver, gameclient, and packages. The gameserver directory contains the java files pertaining to the server side. The gameclient directory contains the java files pertaining to the client side.
    
To execute the Game Server, run gameserver.GameServer.   
To execute the Game Client, run gameclient.GameClient.
