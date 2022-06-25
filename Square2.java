public class Square2 extends Square {

  public Square2 (int pozX, int pozY, int newSize, int newWidth, String newColor) {

    super();
    moveHorizontal(pozX -50);
    moveVertical(pozY -15);
    makeVisible();
    changeColor(newColor);
    changeSize(newSize, newWidth);
  }
}