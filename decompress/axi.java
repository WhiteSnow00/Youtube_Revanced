import android.media.VolumeProvider;

// 
// Decompiled by Procyon v0.6.0
// 

final class axi extends VolumeProvider
{
    final axk a;
    
    public axi(final axk a, final int n, final int n2, final int n3) {
        this.a = a;
        super(n, n2, n3);
    }
    
    public final void onAdjustVolume(final int n) {
        this.a.b(n);
    }
    
    public final void onSetVolumeTo(final int n) {
        this.a.c(n);
    }
}
