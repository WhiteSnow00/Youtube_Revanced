import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.io.IOException;
import android.os.Process;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aaip implements aahl
{
    protected final aahk a;
    protected final aadf b;
    protected final String c;
    protected final String d;
    protected final String e;
    protected final byte[] f;
    protected final aajb g;
    protected final aage h;
    protected final acjq i;
    private final aaiq j;
    private yhm k;
    private final aaiz l;
    private final aajd m;
    private final int n;
    private volatile boolean o;
    private final int p;
    
    public aaip(final aahk a, final oco oco, final aefs aefs, final aadf b, final aaiq j, final aajb g, final aage h, final acjq i, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6, final byte[] array7, final byte[] array8) {
        this.a = a;
        this.b = b;
        this.j = j;
        this.g = g;
        this.h = h;
        this.i = i;
        this.n = aahc.d(b.f);
        this.p = aahc.aj(b.f);
        this.c = b.a;
        this.d = aefs.cw();
        this.e = aahc.u(b.f);
        this.f = aahc.af(b.f);
        this.m = new aajd();
        this.l = new aaiz(oco, h.d(), new aaiu(this, 1));
    }
    
    private final aach d() {
        final aach g = this.b.g;
        aahc.z(g, this.m.a());
        aahc.N(g, this.m.b());
        return g;
    }
    
    private static final boolean e(final aacu aacu, final boolean b) {
        boolean b2 = true;
        if (!b) {
            if (aacu != null) {
                if (aacu.i()) {
                    return false;
                }
                b2 = b2;
            }
            else {
                b2 = false;
            }
        }
        return b2;
    }
    
    @Override
    public final void a(final int n) {
        boolean b = true;
        this.o = true;
        final yhm k = this.k;
        if (k != null) {
            if ((n & 0x180) != 0x0) {
                b = false;
            }
            k.a(b);
        }
    }
    
    protected final void b(final aahm aahm, final aach aach) {
        if (aahm.a) {
            final Throwable cause = aahm.getCause();
            if (cause != null) {
                final String c = this.c;
                final String message = aahm.getMessage();
                final StringBuilder sb = new StringBuilder("[Offline] offline ad task[");
                sb.append(c);
                sb.append("] failed: ");
                sb.append(message);
                tut.d(sb.toString(), cause);
            }
            else {
                final String c2 = this.c;
                final String message2 = aahm.getMessage();
                final StringBuilder sb2 = new StringBuilder("[Offline] offline ad task[");
                sb2.append(c2);
                sb2.append("] failed, unknown cause: ");
                sb2.append(message2);
                tut.d(sb2.toString(), (Throwable)new IllegalArgumentException());
            }
            final zxm b = this.h.B();
            if (b != null) {
                b.F(this.e, aahm.b);
            }
        }
        else {
            final String c3 = this.c;
            final String message3 = aahm.getMessage();
            final StringBuilder sb3 = new StringBuilder("[Offline] offline ad task[");
            sb3.append(c3);
            sb3.append("]: ");
            sb3.append(message3);
            tut.l(sb3.toString());
        }
        this.a.d(this.c, aahm, aach);
    }
    
    protected final void c(final long n, final double n2, final boolean b) {
        final zxm b2 = this.h.B();
        if (b2 != null) {
            b2.F(this.e, aacn.c);
            this.a.b(this.c, n, n2, b);
        }
    }
    
    @Override
    public final void run() {
        Process.setThreadPriority(10);
        try {
            try {
                final PlayerResponseModel h = this.g.h(this.e, this.f, this.b, 2);
                aajb.i(this.c, h);
                final aacv g = this.g.g(this.n, this.p, null, this.e, h.n(), h.m(), this.h.d());
                final long c = g.c;
                final long d = g.d;
                final boolean b = d > c;
                this.l.c = d;
                this.a.c(this.c, d);
                this.c(c, 0.0, b);
                final aaiz l = this.l;
                l.a = this.e;
                l.b = 0L;
                final zvm c2 = this.h.c();
                String a = null;
                if (c2 != null) {
                    final aacj c3 = c2.c();
                    if (c3 != null) {
                        a = c3.a;
                    }
                }
                yhm k;
                if ((k = this.k) == null) {
                    k = this.j.a();
                    k.b = (yhl)this.l;
                    this.k = k;
                }
                final aacu b2 = g.b;
                final boolean e = e(b2, b);
                if (b2 != null) {
                    final String e2 = this.e;
                    final String c4 = this.c;
                    final String d2 = this.d;
                    final long b3 = b2.b();
                    final zyd d3 = this.h.d();
                    final aajd m = this.m;
                    aajb.o(e2, c4, d2, k, b2, b3, d3, a, m.d, m.b, this.i);
                    this.l.b = b2.b();
                }
                if (!this.o) {
                    final aacu a2 = g.a;
                    final boolean e3 = e(a2, e);
                    if (a2 != null) {
                        final String e4 = this.e;
                        final String c5 = this.c;
                        final String d4 = this.d;
                        final long b4 = a2.b();
                        final zyd d5 = this.h.d();
                        final aajd i = this.m;
                        aajb.o(e4, c5, d4, k, a2, b4, d5, a, i.c, i.a, this.i);
                    }
                    if (!this.o) {
                        this.c(d, 0.0, e3);
                        final aach d6 = this.d();
                        final zxm b5 = this.h.B();
                        if (b5 != null) {
                            b5.F(this.e, aacn.b);
                            this.a.a(this.c, d6);
                            return;
                        }
                        this.b(aahm.a("Null dbHelper", new NullPointerException(), aacn.d, amxs.a), d6);
                    }
                }
                return;
            }
            catch (final Exception ex) {}
        }
        catch (final InterruptedException ex2) {
            final String c6 = this.c;
            final StringBuilder sb = new StringBuilder("[Offline] pudl task[");
            sb.append(c6);
            sb.append("] error while downloading video");
            tut.d(sb.toString(), (Throwable)ex2);
            this.b(aahm.b("Error encountered while downloading the video", ex2, aacn.d, amxs.w), this.d());
            return;
        }
        catch (final IOException ex3) {
            this.b(this.g.a(ex3), this.d());
            return;
        }
        catch (final aahm aahm) {
            this.b(aahm, this.d());
            return;
        }
        final String c7 = this.c;
        final StringBuilder sb2 = new StringBuilder("[Offline] pudl task[");
        sb2.append(c7);
        sb2.append("] error while pinning video");
        final Exception ex;
        tut.d(sb2.toString(), (Throwable)ex);
        znh.c(zng.b, znf.B, "Abstract pin exception: ".concat(String.valueOf(ex.getMessage())), (Throwable)ex);
        this.b(aahm.b("Error encountered while pinning the video", ex, aacn.d, amxs.a), this.d());
    }
}
