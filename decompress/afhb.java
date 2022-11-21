import java.util.Iterator;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afhb extends affx
{
    public afjp a;
    public boolean b;
    public boolean c;
    
    public afhb() {
        this(4);
    }
    
    public afhb(final int n) {
        this.b = false;
        this.c = false;
        this.a = new afjp(n);
    }
    
    public final afhe a() {
        final afjp a = this.a;
        a.getClass();
        if (a.c == 0) {
            return (afhe)afkf.a;
        }
        if (this.c) {
            this.a = new afjp(a);
            this.c = false;
        }
        this.b = true;
        return (afhe)new afkf(this.a);
    }
    
    public final void b(final Iterable iterable) {
        final afjp a = this.a;
        a.getClass();
        if (iterable instanceof afjh) {
            afjp b;
            if (iterable instanceof afkf) {
                b = ((afkf)iterable).b;
            }
            else {
                b = null;
            }
            if (b != null) {
                a.i(Math.max(a.c, b.c));
                for (int i = b.a(); i >= 0; i = b.e(i)) {
                    this.d(b.h(i), b.c(i));
                }
            }
            else {
                final Set j = ((afjh)iterable).j();
                final afjp a2 = this.a;
                a2.i(Math.max(a2.c, j.size()));
                for (final afji afji : ((afjh)iterable).j()) {
                    this.d(afji.a, afji.a());
                }
            }
            return;
        }
        super.e(iterable);
    }
    
    @Override
    public final /* bridge */ void c(final Object o) {
        this.g(o);
    }
    
    public final void d(final Object o, final int n) {
        final afjp a = this.a;
        a.getClass();
        if (n == 0) {
            return;
        }
        if (this.b) {
            this.a = new afjp(a);
            this.c = false;
        }
        this.b = false;
        o.getClass();
        final afjp a2 = this.a;
        a2.o(o, n + a2.b(o));
    }
    
    public final void g(final Object o) {
        this.d(o, 1);
    }
}
