import android.media.Spatializer$OnSpatializerStateChangedListener;
import android.os.Handler;
import android.media.Spatializer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bqt
{
    public final Spatializer a;
    public final boolean b;
    public Handler c;
    public Spatializer$OnSpatializerStateChangedListener d;
    
    public bqt(final Spatializer a) {
        this.a = a;
        this.b = (a.getImmersiveAudioLevel() != 0);
    }
}
