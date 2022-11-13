import java.util.Map;
import com.google.common.util.concurrent.ListenableFuture;
import android.app.Activity;
import java.util.concurrent.TimeUnit;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iro extends abnl implements tgg
{
    public irh a;
    private final zmf e;
    private final atke f;
    private final oby g;
    private final boolean h;
    private boolean i;
    private final arwh j;
    private final aeea k;
    
    public iro(final Context context, final abjj abjj, final zmf e, final atke f, final aeea k, final oby g, final vaf vaf, final arwh j, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        super(context, abjj);
        this.e = e;
        this.f = f;
        this.k = k;
        this.g = g;
        this.j = j;
        alxp alxp;
        if ((alxp = vaf.b().e) == null) {
            alxp = alxp.a;
        }
        final boolean aj = alxp.aj;
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
            teu.m(((tmx)this.k.a).b((aezf)new fmu(aeea.ay(this.e.c(), "playability_adult_confirmation_time_stamp"), n, 10)), (tes)zsa.o);
        }
    }
    
    protected final void b(final akwz akwz, final tcc tcc, final String s) {
        final abnn j = this.j();
        if (j != null && j.a() != null) {
            ((zmt)this.f.a()).b(j.a(), (byte[])null, (zmr)new irn(this, akwz, tcc, s));
            return;
        }
        abnm.a(tcc, h(akwz, s));
    }
    
    protected final void c(final akwz akwz, final tcc tcc, final String s) {
        final aixf j = aakv.j(akwz);
        final irh a = this.a;
        if (a != null && j != null) {
            a.e = aakv.j(akwz);
            final irm irm = new irm(this, akwz, tcc, s);
            if (a.e != null) {
                final wyw pf = a.d.pF();
                final aixf e = a.e;
                e.getClass();
                pf.D((wzz)new wyt(e.o));
                final Activity a2 = a.a;
                final aixf e2 = a.e;
                e2.getClass();
                a.f = acax.n((Context)a2, e2, a.c, a.d.pF(), a.h, false, false, (acaw)new adbr(a, irm, 1), (Object)null, a.g);
            }
            this.l((abnn)a);
            return;
        }
        super.c(akwz, tcc, s);
    }
    
    protected final void d() {
        this.i = false;
    }
    
    protected final void f() {
        if (this.e.t()) {
            this.k.aB(this.e.c(), true);
        }
        if (this.h) {
            this.n(this.m());
            this.i = true;
        }
    }
    
    public final void g() {
        ListenableFuture b;
        if (this.e.t()) {
            b = this.k.ax(this.e.c());
        }
        else {
            b = afwm.m((Object)false);
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
                final zmu zmu = (zmu)o;
                this.g();
            }
            else {
                final zms zms = (zms)o;
                this.g();
            }
        }
        else {
            array = new Class[] { zms.class, zmu.class };
        }
        return array;
    }
    
    public final void sG(final abmi abmi) {
        Label_0200: {
            if (this.h && !this.i) {
                final long m = this.m();
                alxw alxw;
                if ((alxw = this.j.f().e) == null) {
                    alxw = alxw.a;
                }
                final int o = alxw.O;
                long longValue = 0L;
                Label_0137: {
                    if (this.e.t()) {
                        final aeea k = this.k;
                        final String ay = aeea.ay(this.e.c(), "playability_adult_confirmation_time_stamp");
                        final ahcr e = ((aqrj)((tmx)k.a).c()).e;
                        if (((Map)e).containsKey(ay)) {
                            longValue = (long)((Map)e).get(ay);
                            break Label_0137;
                        }
                    }
                    longValue = 0L;
                }
                if (o >= 0) {
                    if (m - longValue < o) {
                        break Label_0200;
                    }
                }
                else if (longValue != 0L) {
                    break Label_0200;
                }
                if (this.e.t()) {
                    this.k.aB(this.e.c(), false);
                }
                this.b = afwm.m((Object)false);
            }
        }
        super.sG(abmi);
    }
}
