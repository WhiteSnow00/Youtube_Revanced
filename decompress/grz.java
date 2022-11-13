import com.google.common.util.concurrent.ListenableFuture;

// 
// Decompiled by Procyon v0.6.0
// 

public final class grz implements grq
{
    public final arkg a;
    private final arkg b;
    
    public grz(final arkg a, final arkg arkg) {
        this.a = a;
        this.b = (arkg)new grx(arkg, 0);
    }
    
    public final ListenableFuture a() {
        final ahaz builder = ((ahbh)epb.a).createBuilder();
        final ahbb ahbb = (ahbb)((ahbh)eph.a).createBuilder();
        final ahaz builder2 = ((ahbh)epi.a).createBuilder();
        builder2.copyOnWrite();
        final epi epi = (epi)builder2.instance;
        epi.b |= 0x4;
        epi.e = "com.google.android.youtube";
        ((ahaz)ahbb).copyOnWrite();
        final eph eph = (eph)ahbb.instance;
        final epi d = (epi)builder2.build();
        d.getClass();
        eph.d = d;
        eph.b |= 0x4;
        builder.copyOnWrite();
        final epb epb = (epb)builder.instance;
        final eph e = (eph)((ahaz)ahbb).build();
        e.getClass();
        epb.e = e;
        epb.b |= 0x1;
        final ahaz builder3 = ((ahbh)epk.a).createBuilder();
        builder3.copyOnWrite();
        final epk epk = (epk)builder3.instance;
        epk.b |= 0x1;
        epk.c = true;
        builder3.copyOnWrite();
        final epk epk2 = (epk)builder3.instance;
        epk2.b |= 0x2;
        epk2.d = true;
        final epk d2 = (epk)builder3.build();
        builder.copyOnWrite();
        final epb epb2 = (epb)builder.instance;
        d2.getClass();
        epb2.d = d2;
        epb2.c = 6;
        ((epe)this.b.a()).b((asgq)new gry(this, 0)).c(builder.build());
        return afwm.m((Object)true);
    }
}
