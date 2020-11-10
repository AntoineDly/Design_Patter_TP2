package fr.mds.java.design_pattern.tp1.Facade;

import fr.mds.java.design_pattern.tp1.shape.Shapemaker;

/**
*
* @author tactfactory
*
* - Sans modifier le point d'entrée de l'application créer les classes nécessaire pour que le programme
*     affiche en sortie :
*         Circle::draw()
*         Rectangle::draw()
*         Square::draw()
*         Circle::draw()
*         Circle::draw()
* - Vous devez résoudre cet exercice à l'aide du design pattern "Facade"
* - Vous devez créer les classes Rectangle, Square et Circle comme étant des Shape
*/
public class FacadeTp1 {
  public static void main(String[] args) {
    Shapemaker shapeMaker = new Shapemaker();

    shapeMaker.drawCircle();
    shapeMaker.drawRectangle();
    shapeMaker.drawSquare();

    //Derive from facade use
    //ShapeMaker maker = new ShapeMaker(ShapeMaker.CIRCLE);
    //maker.draw();

    //Derive from facade use
    //ShapeMaker maker1 = new ShapeMaker();
    //maker1.draw(ShapeMaker.CIRCLE);
  }
}
