import j$.time.Duration;
import java.util.function.ToLongFunction;
import java.util.function.Function;
import java.util.Collection;
import j$.util.Collection$_EL;
import java.util.Iterator;
import java.util.HashSet;
import java.util.List;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ijw implements iix
{
    private final Context a;
    private final fln b;
    private final oby c;
    private final zmf d;
    private final vdr e;
    private final hzn f;
    private final hzn g;
    
    public ijw(final Context a, final fln b, final oby c, final zmf d, final vdr e, final hzn f, final hzn g, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
    }
    
    public final int a() {
        return 164;
    }
    
    public final int b() {
        return 301;
    }
    
    public final aezp c(final String s) {
        return aezp.k((Object)glb.A());
    }
    
    public final afft d(final String s) {
        final String v = glb.V();
        final affr i = afft.i();
        i.h((Object)this.f.J(v));
        final hzn g = this.g;
        final ajhp d = ajhp.d;
        final flv flv = (flv)((atke)g.a).a();
        flv.getClass();
        d.getClass();
        i.h((Object)new iiv(flv, d));
        final List list = (List)this.e.a(this.d.c()).f(v).j((Class)alyt.class).X().t((asjr)ijp.h).K((asjs)ija.i).Z((asjr)ijp.i).K((asjs)ija.j).aF().ac();
        final HashSet set = new HashSet();
        for (final String s2 : list) {
            final String j = vgl.i(s2);
            set.add(this.f.J(s2));
            set.add(this.f.J(glb.J(j)));
            set.add(this.f.J(glb.Y(j)));
            set.add(this.f.J(glb.P(j)));
            set.add(this.f.J(glb.W(j)));
        }
        i.j((Iterable)set);
        return i.g();
    }
    
    public final Class e() {
        return alyt.class;
    }
    
    public final Class f() {
        return ajis.class;
    }
    
    public final argj g(final String s) {
        return new argj(2, s, (byte[])null);
    }
    
    public final fzw h(final vfn vfn, String string, final iiw iiw) {
        final alyt alyt = (alyt)vfn;
        this.e.a(this.d.c());
        string.getClass();
        adkp.R(string.isEmpty() ^ true, "key cannot be empty");
        final ahaz builder = ajit.a.createBuilder();
        builder.copyOnWrite();
        final ajit ajit = (ajit)builder.instance;
        ajit.c |= 0x1;
        ajit.d = string;
        final ajiq ajiq = new ajiq(builder);
        final Iterator<Object> iterator = ((List<Object>)((flm)this.b.e(fll.a().c()).ac()).b).iterator();
        long n = 0L;
        long n2 = 0L;
        while (iterator.hasNext()) {
            final vfn vfn2 = iterator.next();
            if (vfn2 instanceof amar) {
                final amam c = ((amar)vfn2).c();
                if (c == null) {
                    continue;
                }
                long longValue = n2;
                if (c.getAddedTimestampMillis() > n2) {
                    longValue = c.getAddedTimestampMillis();
                }
                final ancy f = c.f();
                long sum = 0L;
                Label_0254: {
                    if (f != null) {
                        final aoxc h = f.h();
                        if (h != null) {
                            sum = Collection$_EL.stream((Collection)Collection$_EL.stream((Collection)h.c()).flatMap((Function)ifj.i).collect(afci.a)).mapToLong((ToLongFunction)ijv.a).sum();
                            break Label_0254;
                        }
                    }
                    sum = 0L;
                }
                n += sum;
                n2 = longValue;
            }
        }
        final auad auad = new auad(n, n2);
        final long longValue2 = (long)auad.a;
        final long longValue3 = (long)auad.b;
        if (longValue2 > 0L) {
            final Context a = this.a;
            string = a.getString(2132019852, new Object[] { tvb.g(a.getResources(), tpe.V(longValue2)) });
            final ahaz a2 = ajiq.a;
            a2.copyOnWrite();
            final ajit ajit2 = (ajit)a2.instance;
            string.getClass();
            ajit2.c |= 0x2;
            ajit2.e = string;
            final int n3 = (int)Duration.ofMillis(this.c.c() - longValue3).toDays();
            if (n3 == 0) {
                ajiq.b(this.a.getString(2132019841));
            }
            else {
                ajiq.b(this.a.getResources().getQuantityString(2131886153, n3, new Object[] { n3 }));
            }
        }
        return fzw.aC((vfn)ajiq.c());
    }
}
