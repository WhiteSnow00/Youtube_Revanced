import java.util.concurrent.Callable;
import java.util.Iterator;
import java.util.Map;
import android.util.Pair;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ied extends icy
{
    private final atjj a;
    private final zvp b;
    private final zki c;
    private final Executor d;
    
    public ied(final atjj a, final zvp b, final zki c, final Executor d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public static boolean o(final aoux aoux) {
        aouv aouv;
        if ((aouv = aouv.b(((aova)aoux.a.instance).e)) == null) {
            aouv = aouv.a;
        }
        return aouv != aouv.a;
    }
    
    private static afcr p(final zze zze) {
        if (zze == null) {
            return afcr.q();
        }
        final afcm d = afcr.d();
        final zzd b = zze.b;
        final zzd a = zze.a;
        final boolean e = zze.e;
        if (b != null) {
            d.h(w(b, 2, e));
        }
        if (a != null) {
            d.h(w(a, 3, e));
        }
        return d.g();
    }
    
    private static afdu q(final afdu afdu) {
        final afds i = afdu.i();
        final afie k = afdu.k();
        while (((Iterator)k).hasNext()) {
            final zze zze = (zze)((Iterator)k).next();
            final String f = zze.f();
            final long c = zze.c;
            aouv aouv;
            if (c == 0L) {
                aouv = aouv.b;
            }
            else if (c == zze.d) {
                aouv = aouv.g;
            }
            else {
                aouv = aouv.d;
            }
            i.h(fbp.r(f, aouv, p(zze), aewp.a));
        }
        return i.g();
    }
    
    private final afdu r(final afdu afdu) {
        final zul d = ((zzu)this.a.a()).a().d();
        final afds i = afdu.i();
        final afie k = afdu.k();
        while (((Iterator)k).hasNext()) {
            final zze m = d.m((String)((Iterator)k).next(), (foi)null);
            if (m != null) {
                i.h(m);
            }
        }
        return i.g();
    }
    
    private final ListenableFuture s(final vdv vdv, final zzl zzl) {
        return (ListenableFuture)aete.f(this.b.b(this.c.c(), zzl.a())).g((aexg)new etw(vdv, zzl, 11), this.d);
    }
    
    private static aoux t(final zzl zzl) {
        final zyw l = zzl.l;
        final zzo o = zzl.o;
        final zyw a = zyw.a;
        final int ordinal = l.ordinal();
        Pair pair = null;
        Label_0236: {
            if (ordinal != 12 && ordinal != 14) {
                switch (ordinal) {
                    default: {
                        pair = new Pair((Object)aouv.a, (Object)aewp.a);
                        break Label_0236;
                    }
                    case 8: {
                        pair = new Pair((Object)aouv.e, (Object)aewp.a);
                        break Label_0236;
                    }
                    case 5: {
                        pair = new Pair((Object)aouv.f, (Object)aexq.k((Object)aouw.b));
                        break Label_0236;
                    }
                    case 2: {
                        if (o == null) {
                            pair = new Pair((Object)aouv.a, (Object)aewp.a);
                            break Label_0236;
                        }
                        final aouv b = o.b;
                        aexq aexq;
                        if (o.g.o("sd_card_offline_disk_error")) {
                            aexq = aexq.k((Object)aouw.c);
                        }
                        else {
                            aexq = aewp.a;
                        }
                        pair = new Pair((Object)b, (Object)aexq);
                        break Label_0236;
                    }
                    case 1: {
                        pair = new Pair((Object)aouv.g, (Object)aewp.a);
                        break Label_0236;
                    }
                    case 3:
                    case 4:
                    case 6:
                    case 7: {
                        break;
                    }
                }
            }
            pair = new Pair((Object)aouv.f, (Object)aewp.a);
        }
        final aouv aouv = (aouv)pair.first;
        final aexq aexq2 = (aexq)pair.second;
        if (aouv == aouv.a) {
            return null;
        }
        return fbp.r(zzl.a(), aouv, p(zzl.n), aexq2);
    }
    
    private final Map u() {
        return ((zzu)this.a.a()).a().g().f();
    }
    
    private final void v(final vdv vdv, final zzl zzl) {
        final aoux t = t(zzl);
        final afdu q = q(this.r(fbp.C(this.u(), zzl.a())));
        if (t != null) {
            vdv.j((vdj)t);
        }
        else {
            vdv.g(gkt.by(zzl.a()));
        }
        final afie k = q.k();
        while (((Iterator)k).hasNext()) {
            vdv.j((vdj)((Iterator)k).next());
        }
    }
    
    private static aojk w(final zzd zzd, int n, final boolean b) {
        final long d = zzd.d;
        final long b2 = zzd.b();
        final agza builder = ((agzi)aojk.a).createBuilder();
        builder.copyOnWrite();
        final aojk aojk = (aojk)builder.instance;
        aojk.b |= 0x1;
        aojk.c = d;
        builder.copyOnWrite();
        final aojk aojk2 = (aojk)builder.instance;
        final int b3 = aojk2.b;
        final int n2 = 2;
        aojk2.b = (b3 | 0x2);
        aojk2.d = b2;
        builder.copyOnWrite();
        final aojk aojk3 = (aojk)builder.instance;
        aojk3.e = n - 1;
        aojk3.b |= 0x4;
        n = n2;
        if (d == b2) {
            if (b) {
                n = 3;
            }
            else {
                n = 4;
            }
        }
        builder.copyOnWrite();
        final aojk aojk4 = (aojk)builder.instance;
        aojk4.f = n - 1;
        aojk4.b |= 0x8;
        final agyc byteString = ((agxl)zzd.b.a).toByteString();
        builder.copyOnWrite();
        final aojk aojk5 = (aojk)builder.instance;
        aojk5.b |= 0x10;
        aojk5.g = byteString;
        return (aojk)builder.build();
    }
    
    @Deprecated
    public final afdu a(final aack aack) {
        final afds i = afdu.i();
        final Map u = this.u();
        for (final zzl zzl : aack.l().j()) {
            final aoux t = t(zzl);
            if (t != null) {
                i.h(t);
            }
            i.j((Iterable)q(this.r(fbp.C(u, zzl.a()))));
        }
        return i.g();
    }
    
    @Deprecated
    public final void b(final vdv vdv, final zzl zzl) {
        this.v(vdv, zzl);
    }
    
    public final ListenableFuture c(final aack aack) {
        return (ListenableFuture)aete.f(this.b.a(this.c.c())).g((aexg)htt.f, this.d);
    }
    
    public final ListenableFuture f(final vdv vdv, final zzl zzl) {
        return this.s(vdv, zzl);
    }
    
    public final ListenableFuture g(final vdv vdv, final String s) {
        return afld.k((Callable)new hlc(vdv, s, 19), this.d);
    }
    
    public final ListenableFuture j(final vdv vdv, final zzl zzl) {
        return this.s(vdv, zzl);
    }
    
    @Deprecated
    public final void k(final vdv vdv, final zzl zzl) {
        this.v(vdv, zzl);
    }
    
    @Deprecated
    public final void l(final vdv vdv, final String s) {
        vdv.g(gkt.by(s));
    }
}
