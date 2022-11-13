import java.util.List;
import java.util.Iterator;
import com.google.common.util.concurrent.ListenableFuture;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adkc implements afty
{
    public final String a;
    public final zme b;
    public final String c;
    public final admz d;
    public final adpp e;
    
    public adkc(final adpp e, final String a, final zme b, final String c, final admz d, final byte[] array) {
        this.e = e;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final ListenableFuture a() {
        final adpp e = this.e;
        final String a = this.a;
        final zme b = this.b;
        final String c = this.c;
        final admz d = this.d;
        adkp.I(a.isEmpty() ^ true, "Invalid or empty passed Video ID.");
        adkp.I(b.z() ^ true, "Cannot use a signed-out identity.");
        final Iterator iterator = ((adku)e.d).c().values().iterator();
        while (iterator.hasNext()) {
            if (!a.equals(((admv)iterator.next()).ac)) {
                continue;
            }
            throw new IllegalArgumentException("Attempted to add a new FeedbackOnlyUpload with a non-unique videoId.");
        }
        final ahaz builder = ((ahbh)admv.a).createBuilder();
        builder.copyOnWrite();
        final admv admv = (admv)builder.instance;
        a.getClass();
        admv.c |= 0x200000;
        admv.ac = a;
        builder.copyOnWrite();
        final admv admv2 = (admv)builder.instance;
        admv2.b |= 0x40;
        admv2.k = c;
        builder.copyOnWrite();
        final admv admv3 = (admv)builder.instance;
        d.getClass();
        admv3.i = d;
        admv3.b |= 0x10;
        final String d2 = b.d();
        builder.copyOnWrite();
        final admv admv4 = (admv)builder.instance;
        admv4.b |= 0x1;
        admv4.e = d2;
        final long c2 = ((oby)e.f).c();
        builder.copyOnWrite();
        final admv admv5 = (admv)builder.instance;
        admv5.b |= 0x8;
        admv5.h = c2;
        final admt c3 = admt.c;
        builder.copyOnWrite();
        final admv admv6 = (admv)builder.instance;
        admv6.l = c3.h;
        admv6.b |= 0x80;
        final adms s = ((adet)e.l).s();
        builder.copyOnWrite();
        final admv admv7 = (admv)builder.instance;
        s.getClass();
        admv7.an = s;
        admv7.d |= 0x1;
        final adms s2 = ((adet)e.l).s();
        builder.copyOnWrite();
        final admv admv8 = (admv)builder.instance;
        s2.getClass();
        admv8.Q = s2;
        admv8.c |= 0x1000;
        final adms s3 = ((adet)e.l).s();
        builder.copyOnWrite();
        final admv admv9 = (admv)builder.instance;
        s3.getClass();
        admv9.C = s3;
        admv9.b |= 0x40000000;
        final adms s4 = ((adet)e.l).s();
        builder.copyOnWrite();
        final admv admv10 = (admv)builder.instance;
        s4.getClass();
        admv10.N = s4;
        admv10.c |= 0x200;
        final adms s5 = ((adet)e.l).s();
        builder.copyOnWrite();
        final admv admv11 = (admv)builder.instance;
        s5.getClass();
        admv11.ag = s5;
        admv11.c |= 0x2000000;
        final adms s6 = ((adet)e.l).s();
        builder.copyOnWrite();
        final admv admv12 = (admv)builder.instance;
        s6.getClass();
        admv12.ah = s6;
        admv12.c |= 0x4000000;
        final adms s7 = ((adet)e.l).s();
        builder.copyOnWrite();
        final admv admv13 = (admv)builder.instance;
        s7.getClass();
        admv13.ar = s7;
        admv13.d |= 0x10;
        final adms s8 = ((adet)e.l).s();
        builder.copyOnWrite();
        final admv admv14 = (admv)builder.instance;
        s8.getClass();
        admv14.as = s8;
        admv14.d |= 0x20;
        final adms s9 = ((adet)e.l).s();
        builder.copyOnWrite();
        final admv admv15 = (admv)builder.instance;
        s9.getClass();
        admv15.ao = s9;
        admv15.d |= 0x2;
        final adms s10 = ((adet)e.l).s();
        builder.copyOnWrite();
        final admv admv16 = (admv)builder.instance;
        s10.getClass();
        admv16.R = s10;
        admv16.c |= 0x2000;
        final adms s11 = ((adet)e.l).s();
        builder.copyOnWrite();
        final admv admv17 = (admv)builder.instance;
        s11.getClass();
        admv17.am = s11;
        admv17.c |= Integer.MIN_VALUE;
        builder.copyOnWrite();
        admv.a((admv)builder.instance);
        builder.copyOnWrite();
        final admv admv18 = (admv)builder.instance;
        admv18.b |= 0x1000000;
        admv18.w = false;
        adpp.n(builder);
        final List k = adpp.k(e.a);
        builder.copyOnWrite();
        final admv admv19 = (admv)builder.instance;
        admv19.v = 1;
        admv19.b |= 0x100000;
        k.add(aphq.h);
        final admv admv20 = (admv)builder.build();
        ((adku)e.d).h(c, admv20);
        ((adlp)e.g).k(c, b.d(), aphs.a, 5, false, k.toArray(new aphq[0]));
        ((adln)e.h).c(c);
        ((adld)e.e).i(c, admv20);
        ((admj)((arkg)e.i).a()).z(admm.a(c).l());
        return afwm.m((Object)admv20);
    }
}
