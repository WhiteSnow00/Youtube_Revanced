import java.util.Collection;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

final class ahal extends aham
{
    public ahal() {
    }
    
    static agzy a(final Object o, final long n) {
        return (agzy)ahcj.i(o, n);
    }
    
    public final List b(final Object o, final long n) {
        agzy agzy2;
        final agzy agzy = agzy2 = a(o, n);
        if (!agzy.c()) {
            final int size = agzy.size();
            int n2;
            if (size == 0) {
                n2 = 10;
            }
            else {
                n2 = size + size;
            }
            agzy2 = agzy.e(n2);
            ahcj.v(o, n, (Object)agzy2);
        }
        return (List)agzy2;
    }
    
    public final void c(final Object o, final long n) {
        a(o, n).b();
    }
    
    public final void d(final Object o, final Object o2, final long n) {
        final agzy a = a(o, n);
        final agzy a2 = a(o2, n);
        final int size = a.size();
        final int size2 = a2.size();
        agzy e = a;
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
        ahcj.v(o, n, (Object)e);
    }
}
