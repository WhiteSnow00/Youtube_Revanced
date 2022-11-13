import com.google.vr.cardboard.ExternalSurfaceManager;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arcc
{
    final long a;
    
    public arcc(final long a) {
        this.a = a;
    }
    
    public final void a(final int n, final int n2, final long n3, final float[] array) {
        ExternalSurfaceManager.nativeUpdateSurface(this.a, n, n2, n3, array);
    }
}
