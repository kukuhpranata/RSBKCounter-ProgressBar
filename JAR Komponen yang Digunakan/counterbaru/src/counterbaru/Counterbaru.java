/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package counterbaru;

/**
 *
 * @author Kukuh
 */

import java.awt.*;

/**
 *
 * @author Kukuh
 */
public class Counterbaru extends Panel {
 private long count=0;
 private Label label;
 private long maxValue=20;
 public void setMaxValue(long max) {
 maxValue = max;
 }
 public long getMaxValue() {
return maxValue;
 }
 public Counterbaru() {
 setBackground(Color.blue);
 setForeground(Color.white);
 label = new Label(""+count);
 add(label);
 }
 public String getvalue(){
     String nilai = label.getText();
     return nilai;
 }
 
 public void increment () {
 if (count < maxValue) {
 count++;
 label.setText(count+"");
 }
 else label.setText("!!");
 }
}
