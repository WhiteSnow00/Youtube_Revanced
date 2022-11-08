import android.net.Uri;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ofb
{
    public final int a;
    public final int b;
    public final boolean c;
    public final int d;
    public final Object e;
    
    public ofb(final int a, final Integer e, final int b, final boolean c, final int d) {
        this.a = a;
        this.e = e;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Deprecated
    public ofb(final Uri e, final int a, final int b, final boolean c, final int d) {
        aff.k((Object)e);
        this.e = e;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
}
