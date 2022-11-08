import java.util.concurrent.TimeUnit;
import android.support.v7.widget.RecyclerView;
import com.google.android.libraries.youtube.rendering.ui.widget.loadingframe.LoadingFrameLayout;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iod implements acol, tec
{
    public final mrm A;
    private final oas B;
    private final alm C;
    public final tdz a;
    public final iko b;
    public final imo c;
    public final fmd d;
    public final ida e;
    public final vbq f;
    public final Executor g;
    public final Executor h;
    public final ioa i;
    public final ilu j;
    public final ijh k;
    public final CharSequence l;
    public final boolean m;
    public final iob n;
    public final zki o;
    public LoadingFrameLayout p;
    public RecyclerView q;
    public ioq r;
    public acpi s;
    public asic t;
    public acjb u;
    public fzo v;
    public boolean w;
    public final uyf x;
    public final uyi y;
    public final lfy z;
    
    public iod(final lfy z, final tdz a, final iko b, final imo c, final fmd d, final ida e, final vbq f, final Executor g, final Executor h, final ioa i, final ilu j, final mrm a2, final uyf x, final alm c2, final oas b2, final zki o, final uyi y, final acpi acpi, final ijh k, final CharSequence l, final boolean m, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        this.z = z;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
        this.m = m;
        this.n = new iob(this);
        this.f = f;
        this.A = a2;
        this.x = x;
        this.C = c2;
        this.B = b2;
        this.o = o;
        this.y = y;
        if (acpi instanceof ioc) {
            final ioc ioc = (ioc)acpi;
            this.w = ioc.b;
            this.s = ioc.a;
        }
    }
    
    public final void a() {
        final ioq r = this.r;
        final LoadingFrameLayout p = this.p;
        if (r != null) {
            if (p != null) {
                final ioa i = this.i;
                if (!i.d) {
                    final wyn c = i.c;
                    c.getClass();
                    c.c("br_r");
                }
                ((aclp)r).d();
                p.a();
                tcp.j(((tku)this.C.a).b((aexg)new fmp(TimeUnit.MILLISECONDS.toSeconds(this.B.c()), 1)), (Executor)afsl.a, (tcn)idu.p);
                final ioa j = this.i;
                if (!j.d) {
                    final wyn c2 = j.c;
                    c2.getClass();
                    c2.c("ol");
                    j.d = true;
                }
                this.w = true;
            }
        }
    }
    
    public final void d(final boolean b) {
        if (this.m) {
            final acjb u = this.u;
            if (u != null) {
                final fzo v = this.v;
                if (v != null) {
                    if (!b) {
                        u.remove((Object)v);
                        return;
                    }
                    if (!((tdv)u).contains((Object)v)) {
                        ((tdv)this.u).add(0, (Object)this.v);
                    }
                }
            }
        }
    }
    
    public final Class[] ms(final Class clazz, final Object o, final int n) {
        Class[] array;
        if (n != -1) {
            if (n != 0) {
                final StringBuilder sb = new StringBuilder("unsupported op code: ");
                sb.append(n);
                throw new IllegalStateException(sb.toString());
            }
            final zvw zvw = (zvw)o;
            final ioq r = this.r;
            array = null;
            if (r != null) {
                ((aclp)r).om();
                return null;
            }
        }
        else {
            array = new Class[] { zvw.class };
        }
        return array;
    }
    
    @Override
    public final acpi qv() {
        throw null;
    }
}
