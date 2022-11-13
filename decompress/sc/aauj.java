import android.content.Context;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aauj
{
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;
    public Object j;
    private Object k;
    
    public aauj() {
    }
    
    public aauj(final byte[] array) {
        this.k = aeyo.a;
    }
    
    public final void a(final aauh aauh) {
        float n;
        if ((n = aauh.d) <= 0.0f) {
            n = aauh.c;
        }
        final aauk aauk = new aauk(aauh.f, aauh.g, n, aauh.e, aauh.h, aauh.i);
        final int a = aauh.a;
        this.k = new adet(1024, new aaug(aauk, aauh));
    }
    
    public final byte[] b() {
        return (byte[])((adet)this.k).a;
    }
    
    public final pxt c() {
        if (!this.e().h()) {
            this.g(Executors.newCachedThreadPool(nnv.C()));
        }
        final ExecutorService executorService = (ExecutorService)this.e().c();
        this.d();
        final pwa a = new pwa();
        this.a = a;
        this.d();
        this.i = new pxv(a);
        this.d();
        this.d().a.getClass();
        this.d = new pvb((Context)this.e, executorService, this.d().c, this.d().a, (byte[])null, (byte[])null);
        final Object h = this.h;
        Object o;
        if (h == null) {
            o = aeyo.a;
        }
        else {
            o = aezp.k(h);
        }
        if (!((aezp)o).h()) {
            this.d();
            this.h = new pyh((Context)this.e);
        }
        final Object c = this.c;
        if (c != null) {
            if (!(c instanceof pdg)) {
                this.d();
                this.i((pyy)new pza((pvx)a, (pdh)c));
            }
            final Object i = this.i;
            if (i != null) {
                final Object a2 = this.a;
                if (a2 != null) {
                    final Object g = this.g;
                    if (g != null) {
                        final Object d = this.d;
                        if (d != null) {
                            final Object j = this.j;
                            if (j != null) {
                                final Object h2 = this.h;
                                if (h2 != null) {
                                    final Object c2 = this.c;
                                    if (c2 != null) {
                                        final Object f = this.f;
                                        if (f != null) {
                                            final Object b = this.b;
                                            if (b != null) {
                                                return new pxt((pxv)i, (pwa)a2, (ExecutorService)g, (puv)d, (Class)j, (pyj)h2, (pdh)c2, (pyy)f, (pwu)b, (aezp)this.k);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            final StringBuilder sb = new StringBuilder();
            if (this.i == null) {
                sb.append(" limitedAvailableAccountsModel");
            }
            if (this.a == null) {
                sb.append(" internalAccountsModel");
            }
            if (this.g == null) {
                sb.append(" backgroundExecutor");
            }
            if (this.d == null) {
                sb.append(" avatarImageLoader");
            }
            if (this.j == null) {
                sb.append(" accountClass");
            }
            if (this.h == null) {
                sb.append(" oneGoogleEventLogger");
            }
            if (this.c == null) {
                sb.append(" vePrimitives");
            }
            if (this.f == null) {
                sb.append(" visualElements");
            }
            if (this.b == null) {
                sb.append(" accountLayer");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        throw new IllegalStateException("Property \"vePrimitives\" has not been set");
    }
    
    public final pwu d() {
        final Object b = this.b;
        if (b != null) {
            return (pwu)b;
        }
        throw new IllegalStateException("Property \"accountLayer\" has not been set");
    }
    
    public final aezp e() {
        final Object g = this.g;
        if (g == null) {
            return (aezp)aeyo.a;
        }
        return aezp.k(g);
    }
    
    public final void f(final pwu b) {
        if (b != null) {
            this.b = b;
            return;
        }
        throw new NullPointerException("Null accountLayer");
    }
    
    public final void g(final ExecutorService g) {
        if (g != null) {
            this.g = g;
            return;
        }
        throw new NullPointerException("Null backgroundExecutor");
    }
    
    public final void h(final pdh c) {
        if (c != null) {
            this.c = c;
            return;
        }
        throw new NullPointerException("Null vePrimitives");
    }
    
    public final void i(final pyy f) {
        if (f != null) {
            this.f = f;
            return;
        }
        throw new NullPointerException("Null visualElements");
    }
}
