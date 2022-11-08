import org.chromium.net.UrlRequest$StatusListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class bcr extends UrlRequest$StatusListener
{
    final /* synthetic */ int[] a;
    final /* synthetic */ gpd b;
    
    public bcr(final int[] a, final gpd b, final byte[] array) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void onStatus(final int n) {
        this.a[0] = n;
        this.b.e();
    }
}
