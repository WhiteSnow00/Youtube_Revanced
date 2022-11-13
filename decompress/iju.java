import java.util.Iterator;
import java.util.HashSet;
import java.util.List;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iju implements iix
{
    private final Context a;
    private final vdr b;
    private final oby c;
    private final hzn d;
    
    public iju(final Context a, final vdr b, final oby c, final hzn d, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.b = b;
        this.a = a;
        this.c = c;
        this.d = d;
    }
    
    public final int a() {
        return 164;
    }
    
    public final int b() {
        return 224;
    }
    
    public final aezp c(final String s) {
        return aezp.k((Object)glb.A());
    }
    
    public final afft d(final String s) {
        final String a = glb.A();
        final affr i = afft.i();
        i.h((Object)this.d.J(a));
        final List list = (List)this.b.b().f(a).j((Class)alyt.class).X().t((asjr)ijp.f).K((asjs)ija.g).Z((asjr)ijp.g).K((asjs)ija.h).aF().ac();
        final HashSet set = new HashSet();
        for (final String s2 : list) {
            set.add(this.d.J(s2));
            set.add(this.d.J(glb.M(vgl.i(s2))));
        }
        i.j((Iterable)set);
        return i.g();
    }
    
    public final Class e() {
        return alyt.class;
    }
    
    public final Class f() {
        return ajhe.class;
    }
    
    public final argj g(final String s) {
        return new argj(2, s, (byte[])null);
    }
    
    public final /* bridge */ fzw h(final vfn vfn, final String d, final iiw iiw) {
        final alyt alyt = (alyt)vfn;
        final vdq b = this.b.b();
        d.getClass();
        adkp.R(d.isEmpty() ^ true, "key cannot be empty");
        final ahaz builder = ajhf.a.createBuilder();
        builder.copyOnWrite();
        final ajhf ajhf = (ajhf)builder.instance;
        ajhf.c |= 0x1;
        ajhf.d = d;
        final ajhc ajhc = new ajhc(builder);
        if (jgk.C(aezp.j((Object)alyt), (vfp)b)) {
            ajhc.e(this.a.getString(2132019992));
            ajhc.f(Integer.valueOf(81829));
            ajhc.c(aevy.c(this.a.getString(2132018353)));
            ajhc.b("https://support.google.com/youtube/answer/6307365");
            ajhc.d(Integer.valueOf(81830));
        }
        else {
            final long s = jgk.s(aezp.j((Object)alyt), this.c, (vfp)b);
            if (s < 2147483647L) {
                ajhc.e(jgk.A(this.a, s, false));
                ajhc.f(Integer.valueOf(106795));
                ajhc.c(aevy.c(this.a.getString(2132018353)));
                ajhc.b("https://support.google.com/youtube/answer/6141269");
                ajhc.d(Integer.valueOf(106796));
            }
        }
        return fzw.aC((vfn)ajhc.g());
    }
}
