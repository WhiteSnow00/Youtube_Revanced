import android.media.VolumeProvider;

// 
// Decompiled by Procyon v0.6.0
// 

final class axh extends VolumeProvider
{
    final axk a;
    
    public axh(final axk a, final int n, final int n2, final int n3, final String s) {
        this.a = a;
        super(n, n2, n3, s);
    }
    
    public final void onAdjustVolume(final int n) {
        this.a.b(n);
    }
    
    public final void onSetVolumeTo(final int n) {
        this.a.c(n);
    }
}
