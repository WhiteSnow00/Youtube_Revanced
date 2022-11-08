import com.google.common.util.concurrent.ListenableFuture;

// 
// Decompiled by Procyon v0.6.0
// 

public final class grr implements grj
{
    public final arhr a;
    private final arhr b;
    private final arhr c;
    private final arhr d;
    
    public grr(final arhr a, final arhr b, final arhr c, final arhr d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public final ListenableFuture a() {
        final rgk a = ((rgm)this.d.a()).a();
        String e;
        if (a != null) {
            e = aexs.e(a.b);
        }
        else {
            e = "";
        }
        if (this.c.a() instanceof eoo) {
            ((eoo)this.c.a()).a(e);
        }
        final agza builder = ((agzi)eoy.a).createBuilder();
        final agzc agzc = (agzc)((agzi)epe.a).createBuilder();
        final agza builder2 = ((agzi)epf.a).createBuilder();
        builder2.copyOnWrite();
        final epf epf = (epf)builder2.instance;
        epf.b |= 0x4;
        epf.e = "com.google.android.youtube";
        agzc.copyOnWrite();
        final epe epe = (epe)agzc.instance;
        final epf d = (epf)builder2.build();
        d.getClass();
        epe.d = d;
        epe.b |= 0x4;
        builder.copyOnWrite();
        final eoy eoy = (eoy)builder.instance;
        final epe e2 = (epe)agzc.build();
        e2.getClass();
        eoy.e = e2;
        eoy.b |= 0x1;
        final agza builder3 = ((agzi)eph.a).createBuilder();
        builder3.copyOnWrite();
        final eph eph = (eph)builder3.instance;
        eph.b |= 0x1;
        eph.c = true;
        builder3.copyOnWrite();
        final eph eph2 = (eph)builder3.instance;
        eph2.b |= 0x2;
        eph2.d = true;
        final eph d2 = (eph)builder3.build();
        builder.copyOnWrite();
        final eoy eoy2 = (eoy)builder.instance;
        d2.getClass();
        eoy2.d = d2;
        eoy2.c = 6;
        ((epb)this.b.a()).b((asgb)new grq(this, 0)).c((Object)builder.build());
        return afva.m((Object)true);
    }
}
