import java.io.Serializable;
import java.util.Comparator;

// 
// Decompiled by Procyon v0.6.0
// 

enum ahfa implements Comparator, Serializable
{
    a;
    
    private static final ahfa[] b;
    
    public final int a(final ahdy ahdy, final ahdy ahdy2) {
        ahfb.g(ahdy);
        ahfb.g(ahdy2);
        final long b = ahdy.b;
        final long b2 = ahdy2.b;
        if (b == b2) {
            final int c = ahdy.c;
            final int c2 = ahdy2.c;
            int n;
            if (c == c2) {
                n = 0;
            }
            else {
                if (c < c2) {
                    return -1;
                }
                n = 1;
            }
            return n;
        }
        return lcmp(b, b2);
    }
    
    @Override
    public final /* bridge */ int compare(final Object o, final Object o2) {
        return this.a((ahdy)o, (ahdy)o2);
    }
}
