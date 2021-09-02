package render

import java.awt.Color
import java.awt.image.BufferedImage

object Render {
  def render(img: BufferedImage): Unit = { //        img.setRGB(500, 300, new Color(255, 0, 200).getRGB());
    for (i <- 0 until img.getWidth) {
      for (j <- 0 until img.getHeight) {
        img.setRGB(i, j, new Color(i * j % 256, (i + j) % 256, (i * i + j * j) % 256).getRGB)
      }
    }
  }
  //Стоит начать с этого
  def renderLine(img: BufferedImage, x1: Int, y1: Int, x2: Int, y2: Int, color: Int): Unit = {
    
  }
}
