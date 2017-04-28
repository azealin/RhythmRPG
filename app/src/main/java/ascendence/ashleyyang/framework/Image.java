package ascendence.ashleyyang.framework;


import ascendence.ashleyyang.framework.Graphics.ImageFormat;

/**
 * Created by ashleyyang on 4/28/17.
 */

public interface Image {

    public int getWidth();
    public int getHeight();
    public ImageFormat getFormat();
    public void dispose();
}
