import java.util.*;
class Main {
  public static void main(String[] args) {
    String[] story = {"\"Today is the day,\" reminding myself for the one hundreth time today. You arrive at your house after a long work day. You grab your backpacking backpack, throw it into your car and drive south. You have paid a person, Pablo, to smuggle you by car from U.S to Honduras. You meet up and in exchange for the trip you give him your 2011 Honda Accord and an extra $1500. He instructs you to hide in a compartment in the trunk of his car until we reach Mexico. It is very uncomfortable and cramped in the compartment. We reach the border. My smuggler is talking to the border guards. All I hear is mumbling and can’t make any words out. I hear the trunk door open for a search. They do not find me. The trunk is closed and we are on our way. He stops around 30 miles from the border to let me out and sit in the front seat.\n\nPablo and I engage in many conversations about or lives and philosophy to keep this melancholic and long drive entertaining. It takes us around three days to arrive in Tegucigalpa, Honduras. This is as far as Pablo will go. Pablo recommends me to take a boat to Colombia. I also can get another ride to Colombia but that is more risky.\n\nChoice 1: Get Boat ride to Colombia.\nChoice 2: Get ride to Colombia.", "You tell pablo you want to give a boat ride to Colombia. He gives you the phone number of a friend who can take you there. You say your goodbyes to Pablo. After that, you go to a nearby phone booth to call his friend. He introduces himself as Angel. He explains that it will be around $1000 to take you to Colombia. You have that money but he also explains he can drive you to Colombia but is very dangerous, it costs $500.\n\nChoice 1: Spend $1000 and go on a boat to Colombia\nChoice 2: Spend $500 and he will drive you to Colombia but it will be dangerous.", "You walk around town asking people if they can give you a ride to Colombia. You find someone who is willing to drive you down to Colombia for $750. His name is Angel. You tell him you will think about it and wander the city more. You cannot find anyone else willing to drive you to Colombia. You have to decide to hitchhike to Colombia or pay Angel $750.\n\nChoice 1: Pay Angel $750.\nChoice 2: Hitchhike.", "You hide in the cargo of Angel’s ship. There is no one else with you while you wait until you arrive in Colombia. You become more lonely and anxious. You feel like you just want to quit. You remind yourself to keep moving forward. You keep yourself occupied by fantasizing what you are going to do when you reach the Amazon.\nOne day you wake up and hear what sounds like a military boat wanting to search the boat you are in. You are sure you will get caught. You know there is a lifeboat you can sneak too and deploy into the water without anyone noticing.\n\nChoice 1: Take the lifeboat.\nChoice 2: Wait it out.", "Angel departs to Colombia. You make small talk with him on the long drive. You hear a new rattle coming from his car. You look over at him and ask him about it. Angel informs you that his car makes noise all of the time and has never broken down. You are worried because the rattling is getting worse.\n\nChoice 1: Get Angel to check the rattling.\nChoice 2: Do nothing.", "You walk down the road outside of the city and wait for someone to give you a ride. Someone on the way to Colombia gives you a ride after two hours of waiting. A few hours in the drive you need to go to the bathroom BAD. You ask him to pull over but he advises that pulling over you may be jumped because it is a bad part of town.\n\nChoice 1: Get him to pull over.\nChoice 2: Stay quiet.", "You sneak onto the deck and deploy the lifeboat. You sneakily row away from Angel’s boat. A whole week passes being dragged by the current. You do not see any boats or planes during this time. You run out of water and eventually succumb to dehydration. END.", "You finally arrive in Columbia! The last country you have to go through to reach the Amazon. You get a ride across Columbia for $200. You are so close to the wild you can taste it! The person lets you out as far he can go. Once you take your first step out of the car it feels like a heavy weight has been lifted off your shoulder. You quickly run to a tree and mark it with, \"I now walk into the wild -PLAYER_NAME\". You walk into the forest you think about going south or south east.\n\nChoice 1: Go south.\nChoice 2: Go south east.", "You get out of the car hand hear a bang. You feel a sharp pain at the back of your thorax. You fall down face first. The driver drives off as fast as he can. You see a bunch of people running towards you. When they get to you they start going through your pockets and taking belongings. You succumb to your injuries. END.", "You walk for around 7 miles before you reach a river. You sit down to rest by the riven and drink some water. The river is around 20 feet wide so you can probably cross it. Also, you can walk up the river.\n\nChoice 1: Walk up the river.\nChoice 2: Cross the river.", "You walk south west for 10 miles. It is turning dark so you pitch your tent and create a campfire and spend your first night In the wild.\nA month has passed since your first night. Some days it is fun wandering around the rainforest collecting food and water from a nearby river. Your diet consists of edible fruits, berries and fish. Some days, you get in your feelings and feel alone and sad. You notice that food supply is declining and you have to travel further and further each day to collect food. You contemplate whether to leave or not regarding this information of shortened food supply.\n\nChoice 1: Leave\nChoice 2: Stay.", "You walk up the river. You look to the left and meet eyes with a Jaguar. You turn around and run as fast as you can but It is not enough. You are tackled by the Jaguar tackles you and you become its dinner. END.", "You attempt to cross the river. About half way through the river you feel something wrap around your right leg followed by a sharp pain. You are pulled under water to never be seen again. END.", "Before you walk away from your camp you carve \"PLAYER_NAME June 2020\" on a tree near your camp. You are walking the way you remember coming from. You notice a bunch of people in the distance. You look closer and it look like a hunting party. You contemplate shouting at them to get their attention or you can ignore them and move on.\n\nChoice 1: Get the hunters attention.\nChoice 2: Ignore them.", "You decide to stay and stick it out. The next coming weeks the food becomes more and more scarce. You are laying down in your text one day and you hear a group of people passing near your camp.\n\nChoice 1: Get their attention.\nChoice 2:Do not get their attention.", "You ignore the hunters and keep moving forward. You are very weak so you move very slow. You hear a crack in the distance. You feel a sharp pain in your stomach. You look down, blood. You must have been mistaken for an animal. You fall over and succumb to your wound. END.", "You call out to the hunters. They walk over to you. You speak for a bit of why you look in terrible condition. One of the hunters notices your face looks similar to a person online who went missing and there is a reward for information to find him. They forcefully take you and return you to your parents for a big sum of money. END.", "You decide to leave your chance of escape up. You keep living on the land and you eventually move and camp at a different place. You last around a year until you succumb to the elements. End."};

    int storyIndex = 0;
    String name;
    
    //Start of Script
    clearScreen();
    Scanner input = new Scanner(System.in);
    System.out.println("Hello, this game is based off of the book: \"Into the Wild\" by John Krakauer. Through out this game you will be presented with a passage with two options. The first option will have a \"(1)\" at the end of the sentece. The same format for option two but it will have a 2 instead of a 1. Consider the options based on previous text and the current one and choose the best option. Good Luck because you are going to need it!");
    System.out.println("When you are ready input your name.");
    name = input.nextLine();
    do{
      clearScreen();
      storyIndex = pickChoice(story, storyIndex, name, input);
    }while(storyIndex != -1);


  }
  public static void clearScreen() {  
    System.out.print("\033[H\033[2J");  
    System.out.flush();  
  }

  public static int pickChoice(String[] story, int storyIndex, String name, Scanner input){
    System.out.println(insertNameInStory(story, storyIndex, name));
    if(storyIndex == 6 || storyIndex == 8 || storyIndex == 11 || storyIndex == 12 || storyIndex == 15 ||storyIndex == 16 || storyIndex == 17) System.exit(0);
    System.out.println("------------------------");
    boolean error = false;
    String choice;

    //Handles user input
    do{
      System.out.print("Choice: ");
      choice = input.next();
      if(choice.equals("1") || choice.equals("2")){
        error = true;
      } else {
        System.out.println("Choice needs to be either 1 or 2.");
      }


    }while(!error);

    //Flow chart - 1

    //Act 1
    if(storyIndex == 0){//First
      if(choice.equals("1")) storyIndex = 1;
      if(choice.equals("2")) storyIndex = 2;
    } else if(storyIndex == 1){//2
      if(choice.equals("1")) storyIndex = 3;
      if(choice.equals("2")) storyIndex = 4;
    } else if(storyIndex == 2){//3
      if(choice.equals("1")) storyIndex = 4;
      if(choice.equals("2")) storyIndex = 5;
    } else if(storyIndex == 3){//4
      if(choice.equals("1")) storyIndex = 6;
      if(choice.equals("2")) storyIndex = 7;
    } else if(storyIndex == 4){//5
      if(choice.equals("1")) storyIndex = 8;
      if(choice.equals("2")) storyIndex = 7;
    } else if(storyIndex == 5){//6
      if(choice.equals("1")) storyIndex = 8;
      if(choice.equals("2")) storyIndex = 7;
    }else if(storyIndex == 6){//7
      storyIndex = -1;
    }else if(storyIndex == 7){ //Act 2 //8
      if(choice.equals("1")) storyIndex = 9;
      if(choice.equals("2")) storyIndex = 10;
    } else if(storyIndex == 8){//9
      storyIndex = -1;
    } else if(storyIndex == 9){//10
      if(choice.equals("1")) storyIndex = 11;
      if(choice.equals("2")) storyIndex = 12;
    }else if(storyIndex == 10){//11
      if(choice.equals("1")) storyIndex = 13;//14
      if(choice.equals("2")) storyIndex = 14;//15
    }else if(storyIndex == 11){//12
      storyIndex = -1;
    }else if(storyIndex == 12){//13
      storyIndex = -1;
    } else if(storyIndex == 13){//14
      if(choice.equals("1")) storyIndex = 16;
      if(choice.equals("2")) storyIndex = 15;
    }else if(storyIndex == 14){//15
      if(choice.equals("1")) storyIndex = 15;
      if(choice.equals("2")) storyIndex = 17;
    }

    return storyIndex;
    
  }
  public static String insertNameInStory(String[] story, int storyIndex, String name){
    String storyChunk = story[storyIndex];
    if(storyChunk.indexOf("PLAYER_NAME") != -1){
      String inserted = storyChunk.substring(0, storyChunk.indexOf("PLAYER_NAME")) + name + storyChunk.substring(storyChunk.indexOf("PLAYER_NAME") + 11 , storyChunk.length());
      return inserted;

    } else {
      return storyChunk;
    }
  }
}
