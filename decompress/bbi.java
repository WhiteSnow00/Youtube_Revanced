import android.net.Uri;
import j$.net.URLDecoder;
import android.util.Base64;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bbi extends bbd
{
    private bbp a;
    private byte[] b;
    private int c;
    private int d;
    
    public bbi() {
        super(false);
    }
    
    public final int a(final byte[] array, final int n, int min) {
        if (min == 0) {
            return 0;
        }
        final int d = this.d;
        if (d == 0) {
            return -1;
        }
        min = Math.min(min, d);
        System.arraycopy(bax.L((Object)this.b), this.c, array, n, min);
        this.c += min;
        this.d -= min;
        this.g(min);
        return min;
    }
    
    public final long b(final bbp a) {
        this.i(a);
        this.a = a;
        final Uri a2 = a.a;
        final String scheme = a2.getScheme();
        dk.g("data".equals(scheme), (Object)"Unsupported scheme: ".concat(String.valueOf(scheme)));
        final String[] ap = bax.ap(a2.getSchemeSpecificPart(), ",");
        if (ap.length != 2) {
            throw aza.b("Unexpected URI format: ".concat(String.valueOf(String.valueOf(a2))), (Throwable)null);
        }
        final String s = ap[1];
        Label_0127: {
            if (ap[0].contains(";base64")) {
                try {
                    this.b = Base64.decode(s, 0);
                    break Label_0127;
                }
                catch (final IllegalArgumentException ex) {
                    throw aza.b("Error while parsing Base64 encoded string: ".concat(String.valueOf(s)), (Throwable)ex);
                }
            }
            this.b = bax.aj(URLDecoder.decode(s, aeza.a.name()));
        }
        final long g = a.g;
        final int length = this.b.length;
        if (g > length) {
            this.b = null;
            throw new bbm(2008);
        }
        final int c = (int)g;
        this.c = c;
        final int d = length - c;
        this.d = d;
        final long h = a.h;
        if (h != -1L) {
            this.d = (int)Math.min(d, h);
        }
        this.j(a);
        final long h2 = a.h;
        if (h2 != -1L) {
            return h2;
        }
        return this.d;
    }
    
    public final Uri c() {
        final bbp a = this.a;
        if (a != null) {
            return a.a;
        }
        return null;
    }
    
    public final void f() {
        if (this.b != null) {
            this.b = null;
            this.h();
        }
        this.a = null;
    }
}
