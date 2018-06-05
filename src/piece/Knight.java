package piece;

import java.awt.image.BufferedImage;
import java.util.ArrayList;


/**
 * A class to make Knight
 * 
 * @see GamePiece
 * @see BufferedImage
 * @see ArrayList
 * @author SongJeongWoo
 * @since 2018-05-26
 */

public class Knight extends GamePiece {
  Knight(BufferedImage img, Color color, Position position, boolean alive) {
    super(img, color, PieceType.KNIGHT, position, alive);
  }
  /**
   * returns current Knight can move position
   * 
   * @return ArrayList<Position> KnightWay
   */
  @Override
  public Position[] getCanMoves() {
    PieceWay way = new PieceWay(getPosition());
    Position[] KnightWay = way.waysKnightPos(color);
    return KnightWay;
  }
  @Override
  public Position[] getCanMovesForKing() {
    PieceWay way = new PieceWay(getPosition());
    Position[] KnightWay = way.waysKnightPosForKing(color);
    return KnightWay;
  }
}
