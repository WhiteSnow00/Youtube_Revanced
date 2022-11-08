import java.util.Iterator;
import java.util.List;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.protobuf.MessageLite;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aaca extends vkm
{
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    
    public aaca(final vjh vjh, final adcr adcr, final eg e, final tgw tgw, final uyf g, final Executor d, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6) {
        super(adcr, tgw, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        this.f = this.c((MessageLite)akou.a, vjh, (tad)vrv.q, (tac)vta.h);
        this.g = g;
        this.d = d;
        this.e = e;
    }
    
    public aaca(final vjh vjh, final adcr adcr, final eg d, final uyi f, final zkz g, final tgw tgw, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6) {
        super(adcr, tgw, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        this.d = d;
        this.f = f;
        this.g = g;
        this.e = this.c((MessageLite)aldh.a, vjh, (tad)vue.n, (tac)vux.e);
    }
    
    public aaca(final vjh vjh, final adcr adcr, final eg d, final uyi f, final zkz g, final tgw tgw, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6, final byte[] array7) {
        super(adcr, tgw, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        this.d = d;
        this.f = f;
        this.g = g;
        this.e = this.c((MessageLite)aknw.a, vjh, (tad)vue.m, (tac)vux.d);
    }
    
    public aaca(final vjh vjh, final adcr adcr, final eg f, final uyi d, final zkz e, final tgw tgw, final byte[] array, final char[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6, final byte[] array7) {
        super(adcr, tgw, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        this.f = f;
        this.d = d;
        this.e = e;
        this.g = this.c((MessageLite)aknr.a, vjh, (tad)vue.l, (tac)vux.c);
    }
    
    public aaca(final vjh vjh, final adcr adcr, final tgw tgw, final uyf e, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6) {
        super(adcr, tgw, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        this.g = this.c((MessageLite)akko.a, vjh, (tad)vrv.f, (tac)vrj.r);
        this.f = this.c((MessageLite)akks.a, vjh, (tad)vrv.g, (tac)vrj.s);
        this.d = this.c((MessageLite)akoi.a, vjh, (tad)vrv.h, (tac)vrj.t);
        this.e = e;
    }
    
    public aaca(final vjh vjh, final adcr adcr, final zki d, final tgw tgw, final arud f, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6) {
        super(adcr, tgw, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        this.d = d;
        this.g = this.c((MessageLite)aktm.a, vjh, (tad)vvi.s, (tac)zds.d);
        this.e = this.c((MessageLite)aktj.a, vjh, (tad)vvi.t, (tac)zds.e);
        this.f = f;
    }
    
    public aaca(final vjh vjh, final adcr adcr, final zki e, final tgw tgw, final Executor d, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6) {
        super(adcr, tgw, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        this.e = e;
        this.d = d;
        this.g = this.c((MessageLite)ajud.a, vjh, (tad)vvi.g, (tac)vux.s);
        this.f = this.c((MessageLite)ajtw.a, vjh, (tad)vvi.h, (tac)vux.t);
    }
    
    public aaca(final vjh vjh, final adcr adcr, final zki d, final tgw tgw, final tdz e, final vbq g, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6) {
        super(adcr, tgw, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        this.d = d;
        this.e = e;
        this.g = g;
        this.f = new vsf(this, vjh, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public aaca(final vjh g, final adcr adcr, final zki d, final tgw tgw, final uyf e, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6) {
        super(adcr, tgw, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        this.d = d;
        g.getClass();
        this.g = g;
        this.e = e;
        this.f = this.c((MessageLite)akoo.a, g, (tad)fnb.k, (tac)ery.e);
    }
    
    public aaca(final vjh vjh, final adcr adcr, final zki e, final tgw tgw, final vua g, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6) {
        super(adcr, tgw, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        this.e = e;
        vjh.getClass();
        this.f = this.c((MessageLite)akyc.a, vjh, (tad)vrv.s, (tac)vta.j);
        this.d = this.c((MessageLite)akye.a, vjh, (tad)vrv.t, (tac)vta.k);
        g.getClass();
        this.g = g;
    }
    
    public aaca(final vjh vjh, final adcr adcr, final zki d, final uyi g, final zkz e, final tgw tgw, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6) {
        super(adcr, tgw, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        this.d = d;
        this.g = g;
        this.e = e;
        this.f = this.c((MessageLite)akwl.a, vjh, (tad)vue.s, (tac)vux.j);
    }
    
    public aaca(final vjh vjh, final adcr adcr, final zki d, final uyi g, final zkz e, final tgw tgw, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6, final byte[] array7) {
        super(adcr, tgw, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        this.d = d;
        this.g = g;
        this.e = e;
        this.f = this.c((MessageLite)akre.a, vjh, (tad)vue.q, (tac)vux.h);
    }
    
    public aaca(final vjh vjh, final adcr adcr, final zki d, final uyi g, final zkz e, final tgw tgw, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6, final byte[] array7, final byte[] array8) {
        super(adcr, tgw, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        this.d = d;
        this.g = g;
        this.e = e;
        this.f = this.c((MessageLite)alcr.a, vjh, (tad)vue.o, (tac)vux.f);
    }
    
    public aaca(final vjh vjh, final adcr adcr, final zki d, final uyi g, final zkz e, final tgw tgw, final byte[] array, final char[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6, final byte[] array7) {
        super(adcr, tgw, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        this.d = d;
        this.g = g;
        this.e = e;
        this.f = this.c((MessageLite)akoc.a, vjh, (tad)vue.p, (tac)vux.g);
    }
    
    public final aabz a() {
        return new aabz(this.c, ((zki)this.d).c(), null, null, null, null, null, null);
    }
    
    public final aktm b(final aabz aabz) {
        return (aktm)((vkh)this.g).d((vjn)aabz);
    }
    
    public final vvc d() {
        return new vvc(this.c, ((eg)this.d).aq(), (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public final ListenableFuture e(final vvc vvc, final Executor executor) {
        final ListenableFuture b = ((vkh)this.e).b((vjn)vvc, executor);
        if (((uyi)this.f).B()) {
            vwh.t((zkz)this.g, b, executor, alku.cr);
        }
        return b;
    }
    
    public final vub f() {
        return new vub(this.c, ((zki)this.e).c(), (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public final vud g() {
        return new vud(this.c, ((zki)this.e).c(), (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public final void h(final List list) {
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            ((vua)this.g).a(((alud)iterator.next()).c);
        }
    }
    
    public final void i(final vub vub, final znj znj) {
        ((vkh)this.f).e((vjn)vub, (znj)new gmt(this, znj, 7, null, null, null));
    }
    
    public final void j(final vud vud, final znj znj) {
        ((vkh)this.d).e((vjn)vud, (znj)new gmt(this, znj, 8, null, null, null));
    }
    
    public final vse k() {
        return new vse(this.c, ((zki)this.d).c(), (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public final void l(final vjn vjn, final znj znj) {
        ((vkk)this.f).i(vjn, znj);
    }
    
    public final hsb m() {
        final hsb hsb = new hsb(this.c, ((zki)this.d).c(), (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        if (((uyf)this.e).b() != null) {
            amga amga;
            if ((amga = ((uyf)this.e).b().i) == null) {
                amga = amga.a;
            }
            ahrz ahrz;
            if ((ahrz = amga.v) == null) {
                ahrz = ahrz.a;
            }
            ((vii)hsb).l = ahrz.c;
        }
        return hsb;
    }
    
    public final void n(final hsa hsa, final znj znj) {
        this.b.a((tjr)((vjh)this.g).a((vjn)hsa, (MessageLite)akok.a, znj, (tad)fnb.j, (tac)ery.d));
    }
}
