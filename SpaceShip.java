package com.ocajexam.craft_simulator;

public class SpaceShip extends Ship implements Dockable {
  
  //Membros de dados
  public enum ShipType {
    FRIGATE, BATTLESHIP, MINELAYER, ESCORT, DEFENSE
  }
  ShipType shipType = ShipType.BATTLESHIP;
  
  //Construtores
  public SpaceShip() {
    System.out.println("\nSpaceShip created with default ship type.");
  }
  
  public SpaceShip(ShipType shipType) {
    System.out.println("\nSpaceShip created with specified ship type.");
    this.shipType = shipType;
  }
  
  //Métodos
  @Override
  public void dockShip() {
    // A concluir
  }
  
  @Override
  public String toString() {
    String shipTypeRefined = this.shipType.name().toLowerCase();
    return "The pirate ship is a " + shipTypeRefined + " ship.";
  }
}
