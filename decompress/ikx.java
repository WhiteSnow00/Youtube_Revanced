import java.util.Iterator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Function;
import java.util.concurrent.Callable;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ikx implements ilg
{
    public static final int e = 0;
    public final Context a;
    public final atke b;
    public final fln c;
    public final fzw d;
    private final atke f;
    private final flv g;
    private final vai h;
    private final ajb i;
    
    public ikx(final Context a, final atke b, final atke f, final ajb i, final flv g, final fzw d, final fln c, final vai h, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        this.a = a;
        this.b = b;
        this.f = f;
        this.i = i;
        this.g = g;
        this.d = d;
        this.c = c;
        this.h = h;
    }
    
    private final ikf e(final int n) {
        return new ikf(2130970926, new String[] { this.a.getResources().getQuantityString(2131886137, n, new Object[] { n }) });
    }
    
    private final ikf f(final int n) {
        return (ikf)this.g.d().J((asjr)new flp(n, 2)).J((asjr)new ijl(this, 4)).ac();
    }
    
    public final ikf a() {
        if (this.h.ar()) {
            return (ikf)this.d.aj((Callable)new ikw(this, 0), (Runnable)new inm(this, 1)).map((Function)new hra(this, 11)).orElse((Object)this.b(((aabo)this.b.a()).a().l().j()));
        }
        return this.b(((aabo)this.b.a()).a().l().j());
    }
    
    public final ikf b(final Collection collection) {
        final ArrayList list = new ArrayList();
        for (final aabf aabf : collection) {
            if (!aabf.q()) {
                list.add(aabf);
            }
        }
        final fmr fmr = (fmr)this.f.a();
        if (!list.isEmpty()) {
            return this.f(list.size());
        }
        final int c = ((afih)fmr.g).c;
        if (c > 0) {
            return this.e(c);
        }
        if (!collection.isEmpty()) {
            return this.e(collection.size());
        }
        return this.f(0);
    }
    
    public final ikf c(final aaas aaas) {
        if (aaas == null) {
            return new ikf(2130970926, new String[] { "" });
        }
        if (!aaas.e()) {
            adkp.H(aaas.e() ^ true);
            final int d = aaas.d;
            String s;
            if (d == 0) {
                s = this.a.getString(2132018884);
            }
            else {
                s = this.a.getString(2132018829, new Object[] { d });
            }
            return new ikf(2130970901, new String[] { s });
        }
        adkp.H(aaas.e());
        return new ikf(2130970926, new String[] { jgk.z(this.a, aaas.a) });
    }
    
    public final ikf d(final int n, final aabf aabf) {
        final ajb i = this.i;
        final inq inq = (inq)((afev)i.a).get(n);
        inq.getClass();
        final String s = "";
        ikf ikf;
        if (aabf != null && aabf.i() != aabb.a) {
            final aabb j = aabf.i();
            if (j != aabb.b && j != aabb.c) {
                if (j == aabb.d) {
                    final String string = ((Context)i.c).getString(2132017937, new Object[] { aabf.d() });
                    if (ajb.v(aabf, n)) {
                        ikf = new ikf(2130970901, new String[] { string, ((Context)i.c).getString(2132017938) });
                    }
                    else {
                        ikf = new ikf(2130970901, new String[] { string });
                    }
                }
                else {
                    final aezp a = inq.a(j, aabf.j, aabf.k);
                    String s2;
                    if (a.h()) {
                        s2 = ((Context)i.c).getString((int)a.c());
                    }
                    else {
                        s2 = aabf.k(j, (Context)i.c);
                    }
                    if (ajb.v(aabf, n)) {
                        ikf = new ikf(2130970901, new String[] { s2, ((Context)i.c).getString(2132017938) });
                    }
                    else {
                        ikf = new ikf(2130970922, new String[] { s2 });
                    }
                }
            }
            else {
                final aabe k = aabf.j;
                if (k != null && jgk.D(k) && n == 1) {
                    ikf = new ikf(2130970922, new String[] { jgk.A((Context)i.c, jgk.t(k, (oby)i.b), true) });
                }
                else {
                    ikf = new ikf(2130970922, new String[] { "" });
                }
            }
        }
        else {
            String string2 = s;
            if (n == 1) {
                string2 = ((Context)i.c).getString(2132017920);
            }
            ikf = new ikf(2130970922, new String[] { string2 });
        }
        return ikf;
    }
}
