import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abbb implements abaz, abnq, tec
{
    private static final aphk[] c;
    public final abno a;
    public PlayerResponseModel b;
    private final abba d;
    
    static {
        c = new aphk[0];
    }
    
    public abbb(final abno a, final abba d) {
        a.getClass();
        this.a = a;
        d.getClass();
        this.d = d;
        ((ise)d).a.a((abaz)this);
    }
    
    private final void d() {
        this.d.d(false);
        this.d.c(abbb.c, -1);
    }
    
    public final void a(final aakh aakh) {
        this.c(aakh.c());
    }
    
    public final void b(final aaly aaly) {
        final abim c = aaly.c();
        this.b = aaly.b();
        if (c.h()) {
            this.d();
        }
        if (c == abim.i) {
            this.c(aakh.d(aaly.b()));
            final abba d = this.d;
            aphl aphl;
            if ((aphl = aaly.b().m().c.s) == null) {
                aphl = aphl.a;
            }
            ((ise)d).b = aphl.d;
        }
    }
    
    public final void c(final aphk[] array) {
        final Object a = this.a.u.a;
        int i = 0;
        final boolean b = a != null && ((abta)a).am().a();
        this.d.d(b);
        if (b) {
            while (true) {
                while (i < array.length) {
                    final int n = i;
                    if (Float.compare(array[i].d, this.a.h()) == 0) {
                        this.d.c(array, n);
                        return;
                    }
                    ++i;
                }
                final int n = -1;
                continue;
            }
        }
        this.d();
    }
    
    public final asic[] lX(final abns abns) {
        return new asic[] { ((asgt)abns.q().a).j(aajj.t(abns.bN(), 131072L)).j(aajj.r(1)).am((asix)new abat(this, 7), (asix)aaze.k), abns.I((aexg)aajm.o, (aexg)aajm.p).j(aajj.t(abns.bN(), 131072L)).j(aajj.r(1)).am((asix)new abat(this, 8), (asix)aaze.k) };
    }
    
    public final Class[] ms(final Class clazz, final Object o, final int n) {
        Class[] array;
        if (n != -1) {
            array = null;
            if (n != 0) {
                if (n != 1) {
                    final StringBuilder sb = new StringBuilder("unsupported op code: ");
                    sb.append(n);
                    throw new IllegalStateException(sb.toString());
                }
                this.b((aaly)o);
            }
            else {
                this.a((aakh)o);
            }
        }
        else {
            array = new Class[] { aakh.class, aaly.class };
        }
        return array;
    }
}
