import java.util.concurrent.TimeUnit;
import java.util.concurrent.ExecutionException;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.protobuf.MessageLite;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ird implements iqx, iqk
{
    public final vdr a;
    public final iqw b;
    public final iqk c;
    public final zmf d;
    public final vai e;
    public final fzw f;
    private final fln g;
    private final Executor h;
    
    public ird(final vdr a, final iqw b, final fln g, final fzw f, final iqk c, final Executor h, final zmf d, final vai e, final byte[] array, final byte[] array2, final byte[] array3) {
        this.a = a;
        this.b = b;
        this.g = g;
        this.f = f;
        this.c = c;
        this.h = h;
        this.d = d;
        this.e = e;
    }
    
    public static afeq c() {
        final ahaz builder = ((ahbh)anyy.a).createBuilder();
        final alke j = (alke)((ahaz)e()).build();
        builder.copyOnWrite();
        final anyy anyy = (anyy)builder.instance;
        j.getClass();
        anyy.j = j;
        anyy.b |= 0x10;
        return afeq.r((Object)new iqv((MessageLite)builder.build()));
    }
    
    public static ahbb e() {
        final ahbb ahbb = (ahbb)((ahbh)alke.a).createBuilder();
        final ahaz builder = ((ahbh)alkg.a).createBuilder();
        final ahaz builder2 = ajhn.a.createBuilder();
        final ahaz builder3 = ajhi.a.createBuilder();
        builder3.copyOnWrite();
        final ajhi ajhi = (ajhi)builder3.instance;
        ajhi.b |= 0x1;
        ajhi.c = true;
        final ajhi c = (ajhi)builder3.build();
        builder2.copyOnWrite();
        final ajhn ajhn = (ajhn)builder2.instance;
        c.getClass();
        ajhn.c = c;
        ajhn.b = 5;
        final anul j = jgk.J((ajhn)builder2.build());
        builder.copyOnWrite();
        final alkg alkg = (alkg)builder.instance;
        j.getClass();
        alkg.e = j;
        alkg.b |= 0x4;
        ahbb.m((alkg)builder.build());
        ((ahaz)ahbb).copyOnWrite();
        final alke alke = (alke)ahbb.instance;
        alke.c |= 0x8;
        alke.i = "downloads_page_disclaimer_item_section_identifier";
        return ahbb;
    }
    
    @Override
    public final afeq a(final imt imt) {
        tbi.e();
        try {
            return (afeq)((aftm)aftq.f((ListenableFuture)afvk.m(vdh.aY(this.d().C((asjr)iqm.e).M((ashq)ashn.B((Object)false)).Z())), (aftz)new ier(this, imt, 10), this.h)).get();
        }
        catch (final ExecutionException | InterruptedException ex) {
            return c();
        }
    }
    
    public final aezp b(final amar amar) {
        final fzw f = this.f;
        final vdq a = ((vdr)f.a).a(((zmf)f.b).c());
        final ashn c = a.f(amar.b.r).j((Class)amam.class).C((asjr)flz.g);
        a.getClass();
        final amwb amwb = (amwb)c.w((asjr)new fdg(a, 13)).j((Class)ancy.class).C((asjr)flz.h).w((asjr)new fdg(a, 13)).j((Class)amwb.class).af();
        if (amwb == null) {
            return (aezp)aeyo.a;
        }
        final amvl w = jgk.w(amwb);
        if (w != null && w.g > 0) {
            return aezp.k((Object)(int)TimeUnit.SECONDS.toDays(w.g));
        }
        return (aezp)aeyo.a;
    }
    
    public final ashn d() {
        return this.g.e(fll.a().c()).J((asjr)iqm.c).J((asjr)new ijl(this, 14)).g((asjs)ija.q).C((asjr)iqm.d).M((ashq)ashn.B((Object)0));
    }
    
    @Override
    public final ListenableFuture g() {
        throw null;
    }
}
