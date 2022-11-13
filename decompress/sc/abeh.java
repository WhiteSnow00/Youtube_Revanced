import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import com.google.android.libraries.youtube.innertube.model.media.VideoQuality;
import android.content.res.Resources;

// 
// Decompiled by Procyon v0.6.0
// 

public class abeh implements abef, abps, tgg
{
    protected final abeg a;
    private final Resources b;
    private final abpq c;
    
    public abeh(final Resources b, final abpq c, final abeg a) {
        b.getClass();
        this.b = b;
        this.c = c;
        a.getClass();
        (this.a = a).rk((abef)this);
    }
    
    public void j(final ypj ypj) {
        if (ypj.f() == null) {
            return;
        }
        this.a.m(ypj.j());
        if (ypj.j()) {
            final VideoQuality[] l = ypj.l();
            final int length = l.length;
            final int n = length + 1;
            final VideoQuality[] array = new VideoQuality[n];
            final String string = this.b.getString(2132019308);
            boolean b = false;
            array[0] = new VideoQuality(-2, string, false);
            System.arraycopy(l, 0, array, 1, length);
            final FormatStreamModel f = ypj.f();
            final int n2 = -1;
            int f2;
            if (f != null) {
                f2 = ypj.f().f();
            }
            else {
                f2 = -1;
            }
            int n3 = 0;
            int n4;
            while (true) {
                n4 = n2;
                if (n3 >= n) {
                    break;
                }
                if (array[n3].a == f2) {
                    n4 = n3;
                    break;
                }
                ++n3;
            }
            if (ypj.g() == null || !ypj.g().f()) {
                b = true;
            }
            this.a.o(array, n4, b);
        }
    }
    
    public final asir[] lX(final abpu abpu) {
        return new asir[] { ((ashi)abpu.p().m).j(aale.s(abpu.bM(), 4194304L)).j(aale.q(0)).an((asjm)new abdd(this, 7), abba.p) };
    }
    
    public Class[] ms(final Class clazz, final Object o, final int n) {
        return aakt.h(this, o, n);
    }
    
    public final void x(final int n) {
        this.c.N(n);
    }
    
    public final void y(final apoc apoc) {
        final Object a = this.c.u.a;
        if (a == null) {
            return;
        }
        ((abvb)a).O(apoc);
    }
}
