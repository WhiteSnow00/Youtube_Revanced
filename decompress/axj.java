import android.view.View;
import android.media.VolumeProvider;

// 
// Decompiled by Procyon v0.6.0
// 

public final class axj
{
    public static void a(final VolumeProvider volumeProvider, final int currentVolume) {
        volumeProvider.setCurrentVolume(currentVolume);
    }
    
    public static void b(final View view, final avw avw) {
        view.setTag(2131432377, (Object)avw);
    }
}
