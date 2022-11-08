import java.util.concurrent.Callable;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Iterator;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModelImpl;
import java.util.Map;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

final class iec extends icy
{
    private final atjj a;
    private final zvp b;
    private final zki c;
    private final Executor d;
    
    public iec(final atjj a, final zvp b, final zki c, final Executor d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    private static anas o(final zzl zzl, final Map map) {
        final PlayerResponseModel p2 = zzl.p;
        akve akve;
        if (p2 == null) {
            akve = akve.a;
        }
        else {
            akve = ((PlayerResponseModelImpl)p2).b;
        }
        final String a = zzl.a();
        final long f = zzl.f;
        final afdu c = fbp.C(map, zzl.a());
        final anas d = anat.d(gkt.br(a));
        d.e(((agxl)akve).toByteString());
        d.f(Long.valueOf(f));
        d.c(gkt.bo(a));
        d.d(gkt.by(a));
        d.b(gkt.bg(a));
        final afie k = c.k();
        while (((Iterator)k).hasNext()) {
            final String au = gkt.aU((String)((Iterator)k).next());
            for (int i = 0; i <= 0; ++i) {
                final String s = (new String[] { au })[i];
                final agzc a2 = d.a;
                ((agza)a2).copyOnWrite();
                final anav anav = (anav)a2.instance;
                final anav a3 = anav.a;
                s.getClass();
                final agzy j = anav.j;
                if (!j.c()) {
                    anav.j = agzi.mutableCopy(j);
                }
                anav.j.add((Object)s);
            }
        }
        return d;
    }
    
    private final Map p() {
        return ((zzu)this.a.a()).a().g().f();
    }
    
    @Deprecated
    public final afdu a(final aack aack) {
        final afds i = afdu.i();
        final Map p = this.p();
        final Iterator iterator = aack.l().j().iterator();
        while (iterator.hasNext()) {
            i.h(o((zzl)iterator.next(), p));
        }
        return i.g();
    }
    
    @Deprecated
    public final void b(final vdv vdv, final zzl zzl) {
        vdv.j((vdj)o(zzl, this.p()));
    }
    
    public final ListenableFuture c(final aack aack) {
        return this.b.a(this.c.c());
    }
    
    public final ListenableFuture g(final vdv vdv, final String s) {
        return afld.k((Callable)new hlc(vdv, s, 18), this.d);
    }
    
    public final ListenableFuture j(final vdv vdv, final zzl zzl) {
        return (ListenableFuture)aete.f(this.b.b(this.c.c(), zzl.a())).g((aexg)new hwh(vdv, 11), this.d);
    }
    
    @Deprecated
    public final void l(final vdv vdv, final String s) {
        vdv.g(gkt.br(s));
    }
}
