import android.os.Handler;
import com.google.android.apps.youtube.app.extensions.reel.common.audio.SfvAudioItemPlaybackController;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gvg extends abvy
{
    final SfvAudioItemPlaybackController a;
    
    public gvg(final SfvAudioItemPlaybackController a, final long n, final long n2) {
        this.a = a;
        super(n, n2, 1, 1, (String)null);
    }
    
    protected final void a() {
        new Handler().post((Runnable)new gsb(this.a, 5));
    }
}
