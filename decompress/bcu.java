import org.chromium.net.UrlRequest$StatusListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class bcu extends UrlRequest$StatusListener
{
    final int[] a;
    final gpo b;
    
    public bcu(final int[] a, final gpo b, final byte[] array) {
        this.a = a;
        this.b = b;
    }
    
    public final void onStatus(final int n) {
        this.a[0] = n;
        this.b.e();
    }
}
