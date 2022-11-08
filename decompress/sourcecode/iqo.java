import java.util.Map;
import com.google.common.util.concurrent.ListenableFuture;
import android.app.Activity;
import java.util.concurrent.TimeUnit;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iqo extends abll implements tec
{
    public iqh a;
    private final zki e;
    private final atjj f;
    private final oas g;
    private final boolean h;
    private boolean i;
    private final arud j;
    private final aeby k;
    
    public iqo(final Context context, final abhq abhq, final zki e, final atjj f, final aeby k, final oas g, final uyf uyf, final arud j, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        super(context, abhq);
        this.e = e;
        this.f = f;
        this.k = k;
        this.g = g;
        this.j = j;
        alvl alvl;
        if ((alvl = uyf.b().e) == null) {
            alvl = alvl.a;
        }
        final boolean aj = alvl.aj;
        this.h = aj;
        this.i = false;
        this.g();
        if (!aj) {
            this.n(0L);
        }
    }
    
    private final long m() {
        return TimeUnit.MILLISECONDS.toSeconds(this.g.c());
    }
    
    private final void n(final long n) {
        if (this.e.t()) {
            tcp.m(((tku)this.k.a).b((aexg)new fmo(aeby.as(this.e.c(), "playability_adult_confirmation_time_stamp"), n, 10)), (tcn)zqg.o);
        }
    }
    
    protected final void b(final akuv akuv, final szx szx, final String s) {
        final abln j = this.j();
        if (j != null && j.a() != null) {
            ((zkw)this.f.a()).b(j.a(), (byte[])null, (zku)new iqn(this, akuv, szx, s));
            return;
        }
        ablm.a(szx, h(akuv, s));
    }
    
    protected final void c(final akuv akuv, final szx szx, final String s) {
        final aiva j = aaja.j(akuv);
        final iqh a = this.a;
        if (a != null && j != null) {
            a.e = aaja.j(akuv);
            final iqm iqm = new iqm(this, akuv, szx, s);
            if (a.e != null) {
                final wwv n = a.d.n();
                final aiva e = a.e;
                e.getClass();
                n.D((wxz)new wws(e.o));
                final Activity a2 = a.a;
                final aiva e2 = a.e;
                e2.getClass();
                a.f = abyv.n((Context)a2, e2, a.c, a.d.n(), a.h, false, false, (abyu)new aczo(a, iqm, 1), (Object)null, a.g);
            }
            this.l((abln)a);
            return;
        }
        super.c(akuv, szx, s);
    }
    
    protected final void d() {
        this.i = false;
    }
    
    protected final void f() {
        if (this.e.t()) {
            this.k.av(this.e.c(), true);
        }
        if (this.h) {
            this.n(this.m());
            this.i = true;
        }
    }
    
    public final void g() {
        ListenableFuture b;
        if (this.e.t()) {
            b = this.k.ar(this.e.c());
        }
        else {
            b = afva.m(false);
        }
        this.b = b;
        this.c = false;
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
                this.g();
            }
            else {
                final zkv zkv = (zkv)o;
                this.g();
            }
        }
        else {
            array = new Class[] { zkv.class, zkx.class };
        }
        return array;
    }
    
    public final void sA(final abkg abkg) {
        Label_0205: {
            if (this.h && !this.i) {
                final long m = this.m();
                alvs alvs;
                if ((alvs = this.j.f().e) == null) {
                    alvs = alvs.a;
                }
                final int o = alvs.O;
                long longValue = 0L;
                Label_0139: {
                    if (this.e.t()) {
                        final aeby k = this.k;
                        final String as = aeby.as(this.e.c(), "playability_adult_confirmation_time_stamp");
                        final ahas e = ((aqox)((tku)k.a).c()).e;
                        if (((Map)e).containsKey(as)) {
                            longValue = (long)((Map)e).get(as);
                            break Label_0139;
                        }
                    }
                    longValue = 0L;
                }
                if (o >= 0) {
                    if (m - longValue < o) {
                        break Label_0205;
                    }
                }
                else if (longValue != 0L) {
                    break Label_0205;
                }
                if (this.e.t()) {
                    this.k.av(this.e.c(), false);
                }
                this.b = afva.m(false);
            }
        }
        super.sA(abkg);
    }
}
