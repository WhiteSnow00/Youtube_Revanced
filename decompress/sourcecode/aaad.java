import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.Executor;
import j$.util.Objects;
import android.os.Bundle;
import java.util.List;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ExecutorService;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aaad implements tec
{
    static final long a;
    static final long b;
    static final afcr c;
    public final atjj d;
    public final atjj e;
    public final oas f;
    public final atjj g;
    public final zki h;
    public final ExecutorService i;
    public final tdz j;
    public final aaha k;
    asic l;
    public final avt m;
    private final tal n;
    private final atjj o;
    
    static {
        a = TimeUnit.MINUTES.toSeconds(15L);
        b = TimeUnit.HOURS.toSeconds(6L);
        c = afcr.v((Object)15, (Object)60, (Object)300, (Object)900, (Object)1800);
    }
    
    public aaad(final atjj d, final atjj e, final oas f, final atjj g, final tal n, final zki h, final ExecutorService i, final tdz j, final atjj o, final avt m, final aaha k, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.n = n;
        this.h = h;
        this.i = i;
        this.j = j;
        this.o = o;
        this.m = m;
        this.k = k;
    }
    
    private final long g(final vce vce, final long n) {
        final aaal aaal = (aaal)this.e.a();
        final ArrayList list = new ArrayList();
        vem.ai(zvj.c, 5, Long.valueOf(n), aaal, (List)list);
        final vcl c = zvj.c;
        aaal.x(c);
        list.add(new vci(c));
        list.add(new vcj());
        final afcr afcr = (afcr)vce.l(vem.an(aaal, (List)list)).ab();
        if (afcr != null) {
            if (!afcr.isEmpty()) {
                final anrz anrz = (anrz)vce.f((String)afcr.get(0)).j((Class)anrz.class).af();
                if (anrz != null) {
                    return anrz.getRefreshTime();
                }
            }
        }
        return 0L;
    }
    
    public final long a() {
        if (this.h.c().z()) {
            return 0L;
        }
        final vce a = ((vcf)this.d.a()).a(this.h.c());
        final long seconds = TimeUnit.MILLISECONDS.toSeconds(this.f.c());
        final long g = this.g(a, seconds);
        final long n = g - seconds;
        final long h = this.k.c.h(45369957L);
        if (h > 0L && (g == 0L || n > h)) {
            final long g2 = this.g(a, 0L);
            long n2 = g;
            if (g2 > 0L) {
                n2 = g;
                if (g2 < seconds) {
                    n2 = seconds + h;
                }
            }
            if (n2 > 0L) {
                return Math.max(n2 - seconds, aaad.a);
            }
            return 0L;
        }
        else {
            if (g > 0L) {
                return Math.max(n, aaad.a);
            }
            if (this.g(a, 0L) > 0L) {
                return aaad.b;
            }
            return 0L;
        }
    }
    
    public final void b() {
        if (this.h.c().z()) {
            return;
        }
        final long e = ((aqor)((tku)((aamd)this.o.a()).b).c()).e;
        final long seconds = TimeUnit.MILLISECONDS.toSeconds(this.f.c());
        final long n = e - seconds;
        if (n > 0L && n < aaad.a) {
            return;
        }
        final long a = this.a();
        if (a == 0L) {
            return;
        }
        if (e != 0L && seconds <= e && seconds + a + aaad.a >= e) {
            return;
        }
        this.c(a);
    }
    
    public final void c(final long n) {
        if (n > 0L && this.n.d("offline_auto_refresh_wakeup", n, true, 1, false, (Bundle)null, (ynj)null, false)) {
            ((tku)((aamd)this.o.a()).b).b((aexg)new fmp(TimeUnit.MILLISECONDS.toSeconds(this.f.c()) + n, 16));
        }
    }
    
    public final void d() {
        final zkh c = this.h.c();
        if (c.z()) {
            return;
        }
        if (Objects.equals((Object)null, (Object)c)) {
            return;
        }
        this.f();
        this.l = ((vcf)this.d.a()).a(c).g((Class)anrz.class).aa(atio.b((Executor)this.i)).aC((asix)new zsv(this, 8), (asix)uwh.n);
    }
    
    public final void f() {
        final asic l = this.l;
        if (l != null) {
            asjg.b((AtomicReference)l);
            this.l = null;
        }
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
                final zkx zkx = (zkx)o;
                this.f();
            }
            else {
                final zkv zkv = (zkv)o;
                this.d();
            }
        }
        else {
            array = new Class[] { zkv.class, zkx.class };
        }
        return array;
    }
}
