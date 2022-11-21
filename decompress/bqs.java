import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class bqs implements Spatializer$OnSpatializerStateChangedListener
{
    final bqy a;
    
    public bqs(final bqy a) {
        this.a = a;
    }
    
    public final void onSpatializerAvailableChanged(final Spatializer spatializer, final boolean b) {
        this.a.f();
    }
    
    public final void onSpatializerEnabledChanged(final Spatializer spatializer, final boolean b) {
        this.a.f();
    }
}
