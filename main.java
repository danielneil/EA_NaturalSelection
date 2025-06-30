# A computational method inspired by the process of natural selection, 
# where certain prey species with a particular color are favored by a predator, is being simulated.

# Randomly generate the initial population of individuals, the first generation.
# Evaluate the fitness of each individual in the population.
# Check, if the goal is reached and the algorithm can be terminated.
# Select individuals as parents, preferably of higher fitness.
# Produce offspring with optional crossover (mimicking reproduction).
# Apply mutation operations on the offspring.
# Select individuals preferably of lower fitness for replacement with new individuals (mimicking natural selection).
# Return to 2

# https://en.wikipedia.org/wiki/Evolutionary_algorithm
# https://en.wikipedia.org/wiki/Evolutionary_programming

# "Natural selection is a key mechanism of evolution, first proposed by Charles Darwin. It's a process where organisms 
# with traits that better enable them to adapt to their environment tend to survive and produce more offspring. 
# Over generations, these advantageous traits become more common within a population, while disadvantageous ones become less so. 
# This gradual change in heritable traits over time leads to the diversity of life we see today."

# With the above in mind, we'll have a predator class which favours "frogs" of a specific color, and a frog class which
# it decendents evolve to be of a certain colour, unless that colour is favoured by predators. 
# A toggle is provided that can be used to adjust the colour that the predator favours, which will show
# the population of frog's colour be influenced by who gets eaten by the predator. 
