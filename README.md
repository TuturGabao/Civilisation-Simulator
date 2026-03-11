# Ceasumbrax
## Situation

You escaped The Eclipse Imperium, the greatest empire that has ever existed. It controls the entire west of the world. It is ruled by Lord Umbrax, emperor since the age of 15. He once sentenced an entire kingdom to death because its ruler was vegetarian. His words were simple: "All of these people are cursed by the belief of their leader."\
\
So why did you escape? All hope seemed lost. But you chose to leave the empire rather than live the rest of your life as a slave, like so many others forced to serve under Umbrax.\
\
With you is a handful of people who believe in your choice. They will stay loyal and serve you, no matter what happens.
Everyone knows you escaped the empire. This brings both hope and danger: some will believe in you and join your cause, while others will hunt you down to capture or kill you for the insult you have brought upon Umbrax.


## Quick description

- When starting a new game you will start as a new kingdom with some Humans. They will have a basic schedule defined at the start of the game but you will be able to modify it.
  - You can assign more people to the woodcutting job, stonecutting etc..
  - You can select specific areas for the workers to go do their job : select a specific part of the forest for the woodcutters to do their job.
- You gain Humans by:
  - Waiting for people to join your kingdom (the easiest way at the start of the game)
  - Conquer a new kingdom, make prisoners and convert them to your ideology or just enslave them.
  - Reproduction (for late game because reproduction will take some time.
- How to travel ?
  - You can send humans to certain area but if you want to go further you will have to create an expedition.
  - The travel time will depend on the size of the expedition, the distance and the equipment (animals that will carry everything of if you have a lot of things)
- The win condition:
  - Defeat The Eclipse Imperium, you will earn respect from every single empire, by that, your goal as a world class leader will end.
> [!NOTE]
> Win condition can change over time (and most surely will), this is just for me to entertain the project.


## Tiles

### A tile can have multiple states:
	
- - [ ] Part of a kingdom -> its color depends on the kingdom.
	
		If it is at the edge of the kingdom there will be a small wall around it.
	    Can be the siege of the kingdom -> A big castle at the center of the tile (its size depends on the size of the kingdom).
	    Work tile -> Conatins the workshop or any industry used in the tile. It will be used to make some ressources for the kingdom.
	    Farm/defense tiles -> to harvest crops or train the army or stock its weapons.
	    Road tile -> can be built even if outside the kingdom.
  
- - [ ] Not part of a kingdom -> Depends on the biome the tile belong to.
    
		Texture changes depending on the biome (Desert, plains, ocean, forest, hills).
	    Caracteristics is rnd generated -> Does it contains rocks/trees/ressources/fishes etc..

### Attribute:
- - [ ] Movement:

> [!NOTE]
> Its difficulty to move across it will depends on multiple factors:
   
	-Biome.
	-Caracteristics of the tile.
	-Weather.
	-Road built or not.
	  
- - [ ] Agriculture:

> [!NOTE]
> You can build farms outside your kingdom but must be inside your influence area.\
> This area expends further depending on the size of your kingdom

	- Its fertile factor imporving the yields of the farm that will be placed there,
  		same for fishes with the reproduction factor (of aqua tiles).

	- Same goes for wood for forests, berries with bushes, wild animals etc.
      
- - [ ] Capture factor:
> [!NOTE]
> To capture a tile the kingdom will need an army and must use energy to conquer the tile. However some tiles are not as easy to conquer than others:

	-Its proximity to the siege of the kingdom and its connection to the ressources 
		of the kingdom.
			
	-Its visibilty factor (if the tile is in a big plain, it will be hard to conquer 
		because you need to defend it a lot because it is visible by everyone).
			
	-Its movement factor (attribute said earlier)
		  
	-If it belongs to a kingdom a defense factor will be given to the tile as well as 
		an offensive factor for bowman to shoot enemies.
> [!IMPORTANT] 
> The kingom will use energy and ressources as well, to build the barricades for example.

### Upgrades:
> [!NOTE]
> You can only upgrade a tile if your kingdom owns it.
> 
	  -Any tile can be upgraded, to improve its defense factor and offensive factor for exemple. 
	  	Any upgrade will need ressources, workman and time whereas this tile will not be protected 
	  	by anything (except by an army if they wish to).
		
	  -Buildings can be upgraded to improve the yield of the industry. 
	  
	  -For the farms, that's the same, you can make them bigger or use machinery to improve the 
	  	yield of the farm for exemple.
  
