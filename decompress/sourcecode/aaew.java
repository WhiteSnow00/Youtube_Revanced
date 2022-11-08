import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.io.IOException;
import android.os.Process;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aaew implements aads
{
    protected final aadr a;
    protected final zzo b;
    protected final String c;
    protected final String d;
    protected final String e;
    protected final byte[] f;
    protected final aafi g;
    protected final aack h;
    protected final acga i;
    private final aaex j;
    private ydr k;
    private final aafg l;
    private final aafk m;
    private final int n;
    private volatile boolean o;
    private final int p;
    
    public aaew(final aadr a, final oas oas, final avt avt, final zzo b, final aaex j, final aafi g, final aack h, final acga i, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        this.a = a;
        this.b = b;
        this.j = j;
        this.g = g;
        this.h = h;
        this.i = i;
        this.n = aadj.d(b.f);
        this.p = aadj.aj(b.f);
        this.c = b.a;
        this.d = avt.Z();
        this.e = aadj.u(b.f);
        this.f = aadj.af(b.f);
        this.m = new aafk();
        this.l = new aafg(oas, h.d(), (aaff)new aafb(this, 1));
    }
    
    private final zyq d() {
        final zyq g = this.b.g;
        aadj.z(g, this.m.a());
        aadj.N(g, this.m.b());
        return g;
    }
    
    private static final boolean e(final zzd zzd, final boolean b) {
        boolean b2 = true;
        if (!b) {
            if (zzd != null) {
                if (zzd.i()) {
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
    
    public final void a(final int n) {
        boolean b = true;
        this.o = true;
        if ((n & 0x180) != 0x0) {
            b = false;
        }
        final ydr k = this.k;
        if (k != null) {
            k.a(b);
        }
    }
    
    protected final void b(final aadt aadt, final zyq zyq) {
        if (aadt.a) {
            final Throwable cause = aadt.getCause();
            if (cause != null) {
                final String c = this.c;
                final String message = aadt.getMessage();
                final StringBuilder sb = new StringBuilder("[Offline] offline ad task[");
                sb.append(c);
                sb.append("] failed: ");
                sb.append(message);
                trn.d(sb.toString(), cause);
            }
            else {
                final String c2 = this.c;
                final String message2 = aadt.getMessage();
                final StringBuilder sb2 = new StringBuilder("[Offline] offline ad task[");
                sb2.append(c2);
                sb2.append("] failed, unknown cause: ");
                sb2.append(message2);
                trn.d(sb2.toString(), (Throwable)new IllegalArgumentException());
            }
            final ztu b = this.h.B();
            if (b != null) {
                b.F(this.e, aadt.b);
            }
        }
        else {
            final String c3 = this.c;
            final String message3 = aadt.getMessage();
            final StringBuilder sb3 = new StringBuilder("[Offline] offline ad task[");
            sb3.append(c3);
            sb3.append("]: ");
            sb3.append(message3);
            trn.l(sb3.toString());
        }
        this.a.d(this.c, aadt, zyq);
    }
    
    protected final void c(final long n, final double n2, final boolean b) {
        final ztu b2 = this.h.B();
        if (b2 != null) {
            b2.F(this.e, zyw.c);
            this.a.b(this.c, n, n2, b);
        }
    }
    
    public final void run() {
        Process.setThreadPriority(10);
        try {
            try {
                final PlayerResponseModel h = this.g.h(this.e, this.f, this.b, 2);
                aafi.i(this.c, h);
                final zze g = this.g.g(this.n, this.p, (String)null, this.e, h.n(), h.m(), this.h.d());
                final long c = g.c;
                final long d = g.d;
                final boolean b = d > c;
                this.l.c = d;
                this.a.c(this.c, d);
                this.c(c, 0.0, b);
                final aafg l = this.l;
                l.a = this.e;
                l.b = 0L;
                final zrx c2 = this.h.c();
                String a = null;
                if (c2 != null) {
                    final zys c3 = c2.c();
                    if (c3 != null) {
                        a = c3.a;
                    }
                }
                ydr k;
                if ((k = this.k) == null) {
                    k = this.j.a();
                    k.b = (ydq)this.l;
                    this.k = k;
                }
                final zzd b2 = g.b;
                final boolean e = e(b2, b);
                if (b2 != null) {
                    final String e2 = this.e;
                    final String c4 = this.c;
                    final String d2 = this.d;
                    final long b3 = b2.b();
                    final zul d3 = this.h.d();
                    final aafk m = this.m;
                    aafi.o(e2, c4, d2, k, b2, b3, d3, a, m.d, m.b, this.i);
                    this.l.b = b2.b();
                }
                if (!this.o) {
                    final zzd a2 = g.a;
                    final boolean e3 = e(a2, e);
                    if (a2 != null) {
                        final String e4 = this.e;
                        final String c5 = this.c;
                        final String d4 = this.d;
                        final long b4 = a2.b();
                        final zul d5 = this.h.d();
                        final aafk i = this.m;
                        aafi.o(e4, c5, d4, k, a2, b4, d5, a, i.c, i.a, this.i);
                    }
                    if (!this.o) {
                        this.c(d, 0.0, e3);
                        final zyq d6 = this.d();
                        final ztu b5 = this.h.B();
                        if (b5 != null) {
                            b5.F(this.e, zyw.b);
                            this.a.a(this.c, d6);
                            return;
                        }
                        this.b(aadt.a("Null dbHelper", (Exception)new NullPointerException(), zyw.d, amtj.a), d6);
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
            trn.d(sb.toString(), (Throwable)ex2);
            this.b(aadt.b("Error encountered while downloading the video", (Exception)ex2, zyw.d, amtj.w), this.d());
            return;
        }
        catch (final IOException ex3) {
            this.b(this.g.a(ex3), this.d());
            return;
        }
        catch (final aadt aadt) {
            this.b(aadt, this.d());
            return;
        }
        final String c7 = this.c;
        final StringBuilder sb2 = new StringBuilder("[Offline] pudl task[");
        sb2.append(c7);
        sb2.append("] error while pinning video");
        final Exception ex;
        trn.d(sb2.toString(), (Throwable)ex);
        zjp.c(zjo.b, zjn.B, "Abstract pin exception: ".concat(String.valueOf(ex.getMessage())), (Throwable)ex);
        this.b(aadt.b("Error encountered while pinning the video", ex, zyw.d, amtj.a), this.d());
    }
}
