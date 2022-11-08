import java.io.Serializable;
import java.util.Comparator;

// 
// Decompiled by Procyon v0.6.0
// 

enum ahdc implements Comparator, Serializable
{
    a;
    
    public final int a(final ahca ahca, final ahca ahca2) {
        ahdd.g(ahca);
        ahdd.g(ahca2);
        final long b = ahca.b;
        final long b2 = ahca2.b;
        if (b == b2) {
            final int c = ahca.c;
            final int c2 = ahca2.c;
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
}
