import java.util.List;
import java.util.concurrent.Executor;
import java.util.Iterator;
import android.text.TextUtils;
import android.net.Uri;
import com.google.common.util.concurrent.ListenableFuture;

// 
// Decompiled by Procyon v0.6.0
// 

public final class admb extends admd
{
    public final addp a;
    private final zki b;
    private final albc c;
    private final adjl d;
    private final adjz f;
    private final adcr g;
    private final aeim h;
    private final aeim i;
    
    public admb(final arud arud, final zki b, final albc c, final adjl d, final addp a, final aeim h, final aeim i, final adjz f, final adcr g, final adjo adjo, final adcr adcr, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        super(arud, apfs.r, adjo, g, adcr, (byte[])null, (byte[])null, (byte[])null);
        this.b = b;
        this.c = c;
        this.d = d;
        this.a = a;
        this.h = h;
        this.i = i;
        this.g = g;
        this.f = f;
    }
    
    public final adkb a(final adku adku) {
        return (adkb)this.f;
    }
    
    public final adkr b(final adku adku) {
        adkr adkr;
        if ((adkr = adku.Q) == null) {
            adkr = adkr.a;
        }
        return adkr;
    }
    
    public final ListenableFuture d(String ax, final adit adit, final adku adku) {
        final zkh d = this.b.d(adku.e);
        if (d == null) {
            throw adim.a(apfr.r);
        }
        final agza builder = ((agzi)alaf.a).createBuilder();
        final String k = adku.k;
        builder.copyOnWrite();
        final alaf alaf = (alaf)builder.instance;
        k.getClass();
        alaf.b |= 0x4;
        alaf.e = k;
        final int d2 = adku.d;
        final apgh apgh = null;
        adkq adkq;
        if ((d2 & 0x80) != 0x0) {
            if ((adkq = adku.at) == null) {
                adkq = adkq.a;
            }
        }
        else {
            adkq = null;
        }
        final aila m = aeim.m(adkq);
        if (m != null) {
            builder.copyOnWrite();
            final alaf alaf2 = (alaf)builder.instance;
            alaf2.g = m;
            alaf2.b |= 0x10;
        }
        final agza builder2 = ((agzi)alaj.a).createBuilder();
        final agza builder3 = ((agzi)alai.a).createBuilder();
        builder3.copyOnWrite();
        final alai alai = (alai)builder3.instance;
        alai.b |= 0x1;
        alai.c = true;
        builder2.copyOnWrite();
        final alaj alaj = (alaj)builder2.instance;
        final alai d3 = (alai)builder3.build();
        d3.getClass();
        alaj.d = d3;
        alaj.b |= 0x20;
        final agza builder4 = ((agzi)akru.a).createBuilder();
        builder4.copyOnWrite();
        final akru akru = (akru)builder4.instance;
        akru.c = 0;
        akru.b |= 0x1;
        builder2.copyOnWrite();
        final alaj alaj2 = (alaj)builder2.instance;
        final akru c = (akru)builder4.build();
        c.getClass();
        alaj2.c = c;
        alaj2.b |= 0x4;
        builder.copyOnWrite();
        final alaf alaf3 = (alaf)builder.instance;
        final alaj h = (alaj)builder2.build();
        h.getClass();
        alaf3.h = h;
        alaf3.b |= 0x80;
        final Uri parse = Uri.parse(adku.f);
        apgc d4;
        if (this.i.l(parse)) {
            d4 = this.i.j(parse, adku.L, adku.ap);
        }
        else {
            final aeim h2 = this.h;
            int d5;
            if ((d5 = adio.D(adku.v)) == 0) {
                d5 = 1;
            }
            d4 = h2.i(d5, parse, (adlf)null).h(adku.L, adku.ap);
        }
        builder.copyOnWrite();
        final alaf alaf4 = (alaf)builder.instance;
        d4.getClass();
        alaf4.d = d4;
        alaf4.b |= 0x2;
        adks adks;
        if ((adks = adks.a(adku.l)) == null) {
            adks = adks.a;
        }
        final int c2 = adcr.C(adks);
        builder.copyOnWrite();
        final alaf alaf5 = (alaf)builder.instance;
        alaf5.f = c2 - 1;
        alaf5.b |= 0x8;
        if ((adku.d & 0x800) != 0x0) {
            apmo i;
            if ((i = adku.aw) == null) {
                i = apmo.a;
            }
            builder.copyOnWrite();
            final alaf alaf6 = (alaf)builder.instance;
            i.getClass();
            alaf6.i = i;
            alaf6.b |= 0x200;
        }
        if ((adku.d & 0x1000) != 0x0) {
            ax = adku.ax;
            builder.copyOnWrite();
            final alaf alaf7 = (alaf)builder.instance;
            ax.getClass();
            alaf7.b |= 0x1000;
            alaf7.j = ax;
        }
        final adjl d6 = this.d;
        final adje adje = new adje(d6.c, d, ((agzi)builder.build()).toBuilder(), (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        ((vii)adje).i();
        final alag alag = (alag)d6.e.d((vjn)adje);
        alah alah;
        if ((alah = alag.d) == null) {
            alah = alah.a;
        }
        if (alah.b != 64128279) {
            this.g.j("CreateVideoTask UploadFeedbackItem not populated");
            return afva.m(((adnr)this).t(this.e.s(apfr.ag), true));
        }
        alah alah2;
        if ((alah2 = alag.d) == null) {
            alah2 = alah.a;
        }
        apfu a;
        if (alah2.b == 64128279) {
            a = (apfu)alah2.c;
        }
        else {
            a = apfu.a;
        }
        final String c3 = alag.c;
        final boolean x = adcr.x(a);
        final Iterator<Object> iterator = ((List<Object>)a.d).iterator();
        while (true) {
            apfw apfw;
            do {
                final apgh apgh2 = apgh;
                if (!iterator.hasNext()) {
                    final aorx u = adcr.u(a);
                    adkr adkr;
                    if (u != null && !u.d.isEmpty()) {
                        if (TextUtils.isEmpty((CharSequence)c3)) {
                            this.g.j("CreateVideoTask video id not populated");
                            adkr = this.e.s(apfr.ah);
                        }
                        else if (!x) {
                            this.g.j("CreateVideoTask video registration failed");
                            adkr = this.e.s(apfr.aj);
                        }
                        else {
                            adkr = this.e.t();
                        }
                    }
                    else {
                        this.g.j("CreateVideoTask feedback continuation not populated");
                        adkr = this.e.s(apfr.ai);
                    }
                    return afva.m(((adnr)this).u(adkr, true, (asix)new abde(this, u, c3, apgh2, 3)));
                }
                apfw = iterator.next();
            } while ((apfw.b & 0x20) == 0x0);
            apgh apgh2;
            if ((apgh2 = apfw.d) == null) {
                apgh2 = apgh.a;
            }
            continue;
        }
    }
    
    public final ListenableFuture e(final String s, final adit adit) {
        return afva.r((afrx)new jkv(this, s, adit, 14), (Executor)afsl.a);
    }
    
    public final asit f() {
        return (asit)adhq.o;
    }
    
    public final String g() {
        return "CreateVideoTask";
    }
    
    public final boolean i() {
        return true;
    }
    
    public final boolean j(final adku adku) {
        final int b = adku.b;
        return (b & 0x1) != 0x0 && (b & 0x40) != 0x0 && (adku.c & 0x80) != 0x0;
    }
    
    public final boolean k() {
        return true;
    }
    
    public final adkb l() {
        return (adkb)this.f;
    }
    
    public final adiw w(final Throwable t, final adku adku, final boolean b) {
        if (t instanceof vkn) {
            final adcr e = this.e;
            final apfr e2 = apfr.e;
            adkr adkr;
            if ((adkr = adku.Q) == null) {
                adkr = adkr.a;
            }
            adkr.getClass();
            return ((adnr)this).t(e.I(e2, adkr, (List)this.c.i, this.g), b);
        }
        return super.w(t, adku, b);
    }
}
