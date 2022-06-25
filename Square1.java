public class Square1 extends Square {

  public Square1 (int pozX, int pozY, int newSize, int newWidth, String newColor) {

    super();
    moveHorizontal(pozX -50);
    moveVertical(pozY -15);
    makeVisible();
    changeColor(newColor);
    changeSize(newSize, newWidth);
  }
}