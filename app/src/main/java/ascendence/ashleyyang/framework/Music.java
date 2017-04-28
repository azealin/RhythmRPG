package ascendence.ashleyyang.framework;

/**
 * Created by ashleyyang on 4/28/17.
 */

public interface Music {

    public void play();

    public void stop();

    public void pause();

    public void setLooping(boolean looping);

    public void setVolume(float volume);

    public boolean isPlaying();

    public boolean isStopped();

    public boolean isLooping();

    public void dispose();

    void seekBegin();
}
