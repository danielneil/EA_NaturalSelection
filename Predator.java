class Predator
{
  private BitSet foodColourPreference;
  
  public Predator()
  {
    colourPreference = new BitSet(1024);
  }

  public BitSet getFoodColourPreference()
  {
    return foodColourPreference;
  }

  public void setFoodColourPreference(BitSet _preference)
  {
    foodColourPreference = _preference;
  }
}
