import java.io.IOException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dfn implements Runnable
{
    public final Object a;
    private final int b;
    private final Object c;
    
    public dfn(final dfq a, final dnr c, final int b) {
        this.b = b;
        this.a = a;
        this.c = c;
    }
    
    public dfn(final jih a, final acyn c, final int b) {
        this.b = b;
        this.a = a;
        this.c = c;
    }
    
    public dfn(final pgs a, final Runnable c, final int b) {
        this.b = b;
        this.a = a;
        this.c = c;
    }
    
    private final void a() {
        ((jih)this.a).at.runOnUiThread((Runnable)new jfu(this, 5, (byte[])null));
    }
    
    @Override
    public final void run() {
        final int b = this.b;
        if (b != 0) {
            if (b != 1) {
                if (b != 2) {
                    try {
                        ((Runnable)this.c).run();
                        return;
                    }
                    finally {
                        ((pgs)this.a).a();
                    }
                }
                try {
                    final Object a = this.a;
                    final acyy q = ((jih)a).aZ.q(((jih)a).aI.a);
                    final Object c = this.c;
                    c.getClass();
                    if (((acyn)c).b()) {
                        final acys acys = new acys();
                        acys.e = ((acyn)c).e;
                        acys.d(q.e(), q.g());
                        final acvg l = q.l;
                        if (q.b.d(acys)) {
                            return;
                        }
                    }
                    this.a();
                    return;
                }
                catch (final IOException ex) {
                    final jih jih = (jih)this.a;
                    final bx bd = jih.bd;
                    final adia aj = jih.aj;
                    if (bd.T() && aj != null) {
                        aj.f("IOException", "DeleteSuggestion");
                    }
                    ((jih)this.a).bd.S("Error deleting search suggestions", (Throwable)ex);
                    ttr.n("Error deleting search suggestions", (Throwable)ex);
                    this.a();
                    return;
                }
            }
            synchronized (((dnr)this.c).a()) {
                synchronized (this.a) {
                    if (((dfq)this.a).a.d((dnr)this.c)) {
                        final Object a2 = this.a;
                        final Object c2 = this.c;
                        try {
                            ((dnr)c2).d(((dfq)a2).f);
                        }
                        finally {
                            final Throwable t;
                            throw new dew(t);
                        }
                    }
                    ((dfq)this.a).c();
                    return;
                }
            }
        }
        synchronized (((dnr)this.c).a()) {
            synchronized (this.a) {
                if (((dfq)this.a).a.d((dnr)this.c)) {
                    ((dfq)this.a).h.d();
                    final Object a3 = this.a;
                    final Object c3 = this.c;
                    try {
                        ((dnr)c3).e((dfy)((dfq)a3).h, ((dfq)a3).j);
                        ((dfq)this.a).g((dnr)this.c);
                    }
                    finally {
                        final Throwable t2;
                        throw new dew(t2);
                    }
                }
                ((dfq)this.a).c();
            }
        }
    }
}
