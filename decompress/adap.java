import android.os.Message;
import com.google.android.libraries.youtube.search.voice.BitmapSoundLevelsView;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adap extends Handler
{
    public volatile boolean a;
    private final BitmapSoundLevelsView b;
    
    public adap(final BitmapSoundLevelsView b) {
        this.b = b;
    }
    
    public final void handleMessage(final Message message) {
        if (this.a) {
            this.b.invalidate();
            this.sendMessageDelayed(this.obtainMessage(0), 10L);
        }
    }
}
