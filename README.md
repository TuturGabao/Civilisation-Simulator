# Civilisation-Simulator
This will be a simulation of civilisations in the form of hexagonal tiles.

## Tiles

### A tile can have multiple states:
	
-Part of a kingdom -> its color depends on the kingdom.
	
		If it is at the edge of the kingdom there will be a small wall around it.
	    Can be the siege of the kingdom -> A big castle at the center of the tile (its size depends on the size of the kingdom).
	    Work tile -> Conatins the workshop or any industry used in the tile. It will be used to make some ressources for the kingdom.
	    Farm/defense tiles -> to harvest crops or train the army or stock its weapons.
	    Road tile -> can be built even if outside the kingdom.
  
  -Not part of a kingdom -> Depends on the biome the tile belong to.
    
		Texture changes depending on the biome (Desert, plains, ocean, forest, hills).
	    Caracteristics is rnd generated -> Does it contains rocks/trees/ressources/fishes etc..

### Attribute:
  -Movement:
    
	Its difficulty to move across it will depends on multiple factors:
      
	  -Biome.
      -Caracteristics of the tile.
      -Weather.
      -Road built or not.
  -Agriculture.
    
	-Its fertile factor imporving the yields of the farm that will be placed there, 
	same for fishes with the reproduction factor (of aqua tiles)
    -Same goes for wood for forests, berries with bushes, wild animals etc..
      
  -Capture factor.
    
	To capture a tile the kingdom will need an army and must use energy to conquer the tile. However some tiles are not as easy to conquer than others:
      -Its proximity to the siege of the kingdom and its connection to the ressources of the kingdom.
      -Its visibilty factor (if the tile is in a big plain, it will be hard to conquer because you need to defend it a lot because it is visible by everyone).
      -Its movement factor (attribute said earlier)
      -If it belongs to a kingdom a defense factor will be given to the tile as well as an offensive factor for bowman to shoot enemies.
    The kingom will use energy and ressources as well, to build the barricades for example.

### Upgrades:
	  -Any tile can be upgraded, to improve its defense factor and offensive factor for exemple. Any upgrade will need ressources, 
	  workman and time whereas this tile will not be protected by anything (except by an army if they wish to).
	  -Buildings can be upgraded to improve the yield of the industry. 
	  -For the farms, that's the same, you can make them bigger or use machinery to improve the yield of the farm for exemple.
  
