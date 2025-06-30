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
# Source https://en.wikipedia.org/wiki/Evolutionary_algorithm


# "Natural selection is a key mechanism of evolution, first proposed by Charles Darwin. It's a process where organisms 
# with traits that better enable them to adapt to their environment tend to survive and produce more offspring. 
# Over generations, these advantageous traits become more common within a population, while disadvantageous ones become less so. 
# This gradual change in heritable traits over time leads to the diversity of life we see today."

# Considering this framework, we'll establish a predator class that exhibits a preference for "frogs" of a certain color. 
# The frog class, in turn, will have descendants that evolve to display a specific color, unless that color is favored by the predators. 
# A UI switch is included to modify the color that the predator favors, thereby demonstrating how the frog population's color distribution is influenced by predation.
