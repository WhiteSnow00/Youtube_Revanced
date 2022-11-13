import java.util.List;
import java.util.concurrent.ExecutionException;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.protobuf.MessageLite;
import java.util.Map;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iqb implements iqx
{
    public final iqk a;
    public final iqk b;
    public final fln c;
    public final fmr d;
    public final Executor e;
    public final vai f;
    private final Map g;
    private final iqk h;
    
    public iqb(final Map g, final iqk h, final iqk a, final iqk b, final fln c, final fmr d, final Executor e, final vai f) {
        this.g = g;
        this.h = h;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public static final afeq d() {
        final ahaz builder = ((ahbh)anyy.a).createBuilder();
        final ahbb f = f(ajhp.b, -1);
        builder.copyOnWrite();
        final anyy anyy = (anyy)builder.instance;
        final alke j = (alke)((ahaz)f).build();
        j.getClass();
        anyy.j = j;
        anyy.b |= 0x10;
        return afeq.r((Object)new iqv((MessageLite)builder.build()));
    }
    
    private final aezp e(final iqh iqh, final Class clazz, final aezp aezp, final imt imt) {
        final aezp b = this.b(iqh, aezp, imt);
        if (b.h()) {
            return aezp.k((Object)clazz.cast(((iqv)b.c()).a));
        }
        return (aezp)aeyo.a;
    }
    
    private static ahbb f(final ajhp ajhp, final int n) {
        final ahaz builder = ((ahbh)alkg.a).createBuilder();
        final anul i = jgk.I(ajhj.a, ajhp, n);
        builder.copyOnWrite();
        final alkg alkg = (alkg)builder.instance;
        i.getClass();
        alkg.e = i;
        alkg.b |= 0x4;
        final alkg alkg2 = (alkg)builder.build();
        final ahbb ahbb = (ahbb)((ahbh)alke.a).createBuilder();
        ahbb.m(alkg2);
        ((ahaz)ahbb).copyOnWrite();
        final alke alke = (alke)ahbb.instance;
        alke.c |= 0x8;
        alke.i = "downloads_page_downloads_item_section_identifier";
        return ahbb;
    }
    
    @Override
    public final afeq a(imt ex) {
        try {
            ex = (InterruptedException)((aftm)aftq.f((ListenableFuture)afvk.m(this.h.g()), (aftz)new ier(this, (imt)ex, 7), this.e)).get();
            return (afeq)ex;
        }
        catch (final InterruptedException ex) {}
        catch (final ExecutionException ex2) {}
        if (this.f.ai()) {
            zlm.c(zll.b, zlk.B, "Unable to get manual downloads section response.", (Throwable)ex);
        }
        return d();
    }
    
    public final aezp b(final iqh iqh, final aezp aezp, final imt imt) {
        final iqw iqw = this.g.get(iqh);
        iqw.getClass();
        final afeq a = iqw.a(aezp).a(imt);
        if (a.isEmpty()) {
            return (aezp)aeyo.a;
        }
        return aezp.k((Object)a.get(0));
    }
    
    public final afeq c(final afeq afeq, final ajhp ajhp, final boolean b, final boolean b2, boolean b3, final boolean b4, final imt imt, final int n) {
        final ahbb f = f(ajhp, n);
        final boolean empty = afeq.isEmpty();
        final boolean b5 = false;
        Label_0198: {
            if (empty) {
                final iqh c = iqh.c;
                ahyi ahyi;
                if (!b4 && !b3) {
                    ahyi = ahyi.b;
                }
                else {
                    ahyi = ahyi.c;
                }
                final aezp e = this.e(c, alkh.class, aezp.k((Object)new iqz(ahyi)), imt);
                if (e.h()) {
                    f.l((alkh)e.c());
                    break Label_0198;
                }
            }
            else {
                for (int size = ((List)afeq).size(), i = 0; i < size; ++i) {
                    f.l((alkh)((iqv)((List<Object>)afeq).get(i)).a);
                }
                if (n >= 0 && afeq.size() > n) {
                    final aezp e2 = this.e(iqh.n, alkh.class, aezp.k((Object)(afeq.size() - n)), imt);
                    if (e2.h()) {
                        f.l((alkh)e2.c());
                    }
                }
            }
            b3 = false;
        }
        boolean b6 = false;
        Label_0214: {
            if (b2) {
                b6 = b5;
                if (b) {
                    break Label_0214;
                }
            }
            b6 = true;
        }
        if (!b3) {
            final aezp e3 = this.e(iqh.d, alkc.class, aezp.k((Object)new iqu(b6)), imt);
            if (e3.h()) {
                final alkc d = (alkc)e3.c();
                ((ahaz)f).copyOnWrite();
                final alke alke = (alke)f.instance;
                final alke a = alke.a;
                alke.d = d;
                alke.c |= 0x1;
            }
        }
        final ahaz builder = ((ahbh)anyy.a).createBuilder();
        builder.copyOnWrite();
        final anyy anyy = (anyy)builder.instance;
        final alke j = (alke)((ahaz)f).build();
        j.getClass();
        anyy.j = j;
        anyy.b |= 0x10;
        return afeq.r((Object)new iqv((MessageLite)builder.build()));
    }
}
