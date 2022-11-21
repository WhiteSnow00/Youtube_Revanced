import java.util.Collection;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

final class ahec extends ahed
{
    public ahec() {
    }
    
    static ahdp a(final Object o, final long n) {
        return (ahdp)ahfz.i(o, n);
    }
    
    public final List b(final Object o, final long n) {
        ahdp ahdp2;
        final ahdp ahdp = ahdp2 = a(o, n);
        if (!ahdp.c()) {
            final int size = ahdp.size();
            int n2;
            if (size == 0) {
                n2 = 10;
            }
            else {
                n2 = size + size;
            }
            ahdp2 = ahdp.e(n2);
            ahfz.v(o, n, (Object)ahdp2);
        }
        return (List)ahdp2;
    }
    
    public final void c(final Object o, final long n) {
        a(o, n).b();
    }
    
    public final void d(final Object o, final Object o2, final long n) {
        final ahdp a = a(o, n);
        final ahdp a2 = a(o2, n);
        final int size = a.size();
        final int size2 = a2.size();
        ahdp e = a;
        if (size > 0) {
            e = a;
            if (size2 > 0) {
                e = a;
                if (!a.c()) {
                    e = a.e(size2 + size);
                }
                e.addAll((Collection)a2);
            }
        }
        if (size <= 0) {
            e = a2;
        }
        ahfz.v(o, n, (Object)e);
    }
}
