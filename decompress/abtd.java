import java.util.concurrent.Executor;
import com.google.protobuf.ExtensionRegistryLite;
import java.util.List;
import java.util.concurrent.TimeUnit;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abtd implements zma
{
    static final int a;
    public static final alyf[] b;
    public final absz c;
    public final ajfd d;
    public alyj e;
    private final zoa f;
    private zkv g;
    private final atnb h;
    private final oco i;
    private final adhh j;
    
    static {
        a = (int)TimeUnit.DAYS.toHours(30L);
        b = new alyf[] { alyf.b, alyf.c, alyf.d };
    }
    
    public abtd(final zoa f, final adhh j, final absz c, final vbo vbo, final oco i, final atnb h, final byte[] array, final byte[] array2, final byte[] array3) {
        f.getClass();
        this.f = f;
        j.getClass();
        this.j = j;
        this.c = c;
        vbo.getClass();
        this.d = absy.e(vbo);
        this.i = i;
        this.h = h;
    }
    
    public static void e(final Throwable t) {
        tut.d("Request failed for attestation challenge", t);
    }
    
    public final zkv a() {
        if (this.g == null) {
            final ahcr builder = ((ahcz)ajfg.a).createBuilder();
            final ajfd d = this.d;
            if (d != null && (d.b & 0x8) != 0x0) {
                ajfg ajfg;
                if ((ajfg = d.e) == null) {
                    ajfg = ajfg.a;
                }
                final int c = ajfg.c;
                builder.copyOnWrite();
                final ajfg ajfg2 = (ajfg)builder.instance;
                ajfg2.b |= 0x1;
                ajfg2.c = c;
                ajfg ajfg3;
                if ((ajfg3 = this.d.e) == null) {
                    ajfg3 = ajfg.a;
                }
                final int d2 = ajfg3.d;
                builder.copyOnWrite();
                final ajfg ajfg4 = (ajfg)builder.instance;
                ajfg4.b |= 0x2;
                ajfg4.d = d2;
            }
            else {
                final int a = abtd.a;
                builder.copyOnWrite();
                final ajfg ajfg5 = (ajfg)builder.instance;
                ajfg5.b |= 0x1;
                ajfg5.c = a;
                builder.copyOnWrite();
                final ajfg ajfg6 = (ajfg)builder.instance;
                ajfg6.b |= 0x2;
                ajfg6.d = 30;
            }
            this.g = (zkv)new abtc(builder);
        }
        return this.g;
    }
    
    public final ajfm b() {
        return ajfm.g;
    }
    
    public final String c() {
        return "attestation";
    }
    
    public final void d(String o, zlo b, List iterator) {
        if ((o = this.f.d((String)o)) == null) {
            o = zny.a;
            tut.l("Cannot resolve Identity from identityId. Dispatching as Identities.PSEUDONYMOUS.");
        }
        final znc a = b.a;
        b = (zlo)this.j.b((znz)o, a.a, a.b);
        ((vos)b).b = 2;
        iterator = ((List)iterator).iterator();
        while (iterator.hasNext()) {
            final ahcr ahcr = (ahcr)iterator.next();
            final ahcr builder = ((ahcz)ahxt.a).createBuilder();
            try {
                ((ahbb)builder).mergeFrom(((lrk)ahcr.instance).e, ExtensionRegistryLite.getGeneratedRegistry());
                ((vos)b).a.add(builder.build());
            }
            catch (final ahds ahds) {
                znh.b(zng.b, znf.l, "AttestationDelayedEventDispatcher.dispatchEvents() could not deserialize AttestationObjectId");
            }
        }
        if (((vos)b).w()) {
            return;
        }
        tfx.k(this.j.d((vos)b, (Executor)afwd.a), (Executor)afwd.a, (tfv)zvv.o, (tfw)new xqc(this, (znz)o, 5));
    }
    
    public final void f() {
    }
    
    public final void g() {
    }
    
    public final zml h(final ahcr ahcr) {
        final znz d = this.f.d(((lrk)ahcr.instance).g);
        if (d == null) {
            return null;
        }
        final lrk lrk = (lrk)ahcr.instance;
        final znc znc = new znc(lrk.j, lrk.k);
        final adfz a = zmu.a();
        final ahcr builder = ((ahcz)ajsr.a).createBuilder();
        builder.copyOnWrite();
        ajsr.b((ajsr)builder.instance);
        a.c((ajsr)builder.build(), (foq)this.h.a());
        return new abtb(this.i.c(), a.a(), d, znc, ahcr);
    }
    
    public final void i() {
        zxd.n();
    }
}
