import com.google.protobuf.MessageLite;
import java.util.concurrent.ExecutionException;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iqj implements iqx
{
    public final ing a;
    public final fmm b;
    public final vdr c;
    public final vai d;
    public final aln e;
    private final Map f;
    private final iqk g;
    private final Executor h;
    
    public iqj(final Map f, final iqk g, final Executor h, final ing a, final fmm b, final vdr c, final aln e, final vai d, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.f = f;
        this.g = g;
        this.h = h;
        this.a = a;
        this.b = b;
        this.c = c;
        this.e = e;
        this.d = d;
    }
    
    public static final ahbb c() {
        final ahbb ahbb = (ahbb)((ahbh)alke.a).createBuilder();
        ((ahaz)ahbb).copyOnWrite();
        final alke alke = (alke)ahbb.instance;
        alke.c |= 0x8;
        alke.i = "downloads_page_recommendations_item_section_identifier";
        final ahaz builder = ((ahbh)alkg.a).createBuilder();
        final ahaz builder2 = ajhn.a.createBuilder();
        final ahaz builder3 = ajhl.a.createBuilder();
        builder3.copyOnWrite();
        final ajhl ajhl = (ajhl)builder3.instance;
        ajhl.b |= 0x1;
        ajhl.c = true;
        final ajhl c = (ajhl)builder3.build();
        builder2.copyOnWrite();
        final ajhn ajhn = (ajhn)builder2.instance;
        c.getClass();
        ajhn.c = c;
        ajhn.b = 3;
        final anul j = jgk.J((ajhn)builder2.build());
        builder.copyOnWrite();
        final alkg alkg = (alkg)builder.instance;
        j.getClass();
        alkg.e = j;
        alkg.b |= 0x4;
        ahbb.m((alkg)builder.build());
        return ahbb;
    }
    
    @Override
    public final afeq a(imt ex) {
        try {
            ex = (InterruptedException)((aftm)aftq.e((ListenableFuture)afvk.m(this.g.g()), (aezf)new etz(this, (imt)ex, 16), this.h)).get();
            return (afeq)ex;
        }
        catch (final InterruptedException ex) {}
        catch (final ExecutionException ex2) {}
        if (this.d.ai()) {
            zlm.c(zll.b, zlk.B, "Unable to get recs section response.", (Throwable)ex);
        }
        final ahaz builder = ((ahbh)anyy.a).createBuilder();
        final alke j = (alke)((ahaz)c()).build();
        builder.copyOnWrite();
        final anyy anyy = (anyy)builder.instance;
        j.getClass();
        anyy.j = j;
        anyy.b |= 0x10;
        return afeq.r((Object)new iqv((MessageLite)builder.build()));
    }
    
    public final aezp b(final iqh iqh, final Class clazz, final aezp aezp, final imt imt) {
        final iqw iqw = this.f.get(iqh);
        iqw.getClass();
        final afeq a = iqw.a(aezp).a(imt);
        if (a.isEmpty()) {
            return (aezp)aeyo.a;
        }
        return aezp.j((Object)clazz.cast(((iqv)a.get(0)).a));
    }
}
