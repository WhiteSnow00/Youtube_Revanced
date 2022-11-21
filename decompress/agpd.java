import com.google.protobuf.MessageLite;
import java.util.Collections;
import java.util.Set;
import java.util.HashSet;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agpd
{
    public static volatile agpd a;
    public final Object b;
    
    public agpd() {
        this.b = new HashSet();
    }
    
    public agpd(final ahcd b) {
        ahdq.i((Object)b, "output");
        this.b = b;
        final ahcd ahcd = b;
        b.f = this;
    }
    
    public agpd(final ahcr b) {
        this.b = b;
    }
    
    public agpd(final ahct b) {
        this.b = b;
    }
    
    private agpd(final ahgc ahgc, final Object o, final ahgc ahgc2, final Object o2) {
        this.b = new ahei(ahgc, o, ahgc2, o2);
    }
    
    public agpd(final short[] array) {
        this.b = ajiw.a.createBuilder();
    }
    
    public static int b(final ahei ahei, final Object o, final Object o2) {
        return ahcm.a((ahgc)ahei.c, 1, o) + ahcm.a((ahgc)ahei.d, 2, o2);
    }
    
    public static void c(final ahcd ahcd, final ahei ahei, final Object o, final Object o2) {
        ahcm.h(ahcd, (ahgc)ahei.c, 1, o);
        ahcm.h(ahcd, (ahgc)ahei.d, 2, o2);
    }
    
    public static agpd w(final ahgc ahgc, final Object o, final ahgc ahgc2, final Object o2) {
        return new agpd(ahgc, o, ahgc2, o2);
    }
    
    public final ahjz A() {
        return new ahjz((ahkb)((ahcr)this.b).build());
    }
    
    public final ajis B(final vgx vgx) {
        return new ajis((ajiw)((ahcr)this.b).build(), vgx);
    }
    
    public final void C(final aowb... array) {
        for (int i = 0; i <= 0; ++i) {
            final aowb aowb = array[i];
            final ahcr ahcr = (ahcr)this.b;
            ahcr.copyOnWrite();
            final ajiw ajiw = (ajiw)ahcr.instance;
            final ajiw a = ajiw.a;
            aowb.getClass();
            final ahdp c = ajiw.c;
            if (!c.c()) {
                ajiw.c = ahcz.mutableCopy(c);
            }
            ajiw.c.add((Object)aowb);
        }
    }
    
    public final void D(final aqbo aqbo) {
        final ahcr ahcr = (ahcr)this.b;
        ahcr.copyOnWrite();
        final ajiw ajiw = (ajiw)ahcr.instance;
        final ajiw a = ajiw.a;
        ajiw.e = aqbo.f;
        ajiw.b |= 0x1;
    }
    
    public final ajhs E() {
        return new ajhs((ajht)((ahcr)this.b).build());
    }
    
    public final aisb F(final vgx vgx) {
        return new aisb((aisc)((ahcr)this.b).build(), vgx);
    }
    
    public final aiqt G(final vgx vgx) {
        return new aiqt((aipu)((ahcr)this.b).build(), vgx);
    }
    
    public final void H() {
        final aipm aipm = (aipm)((ahcr)this.b).build();
    }
    
    public final void I() {
        final aipk aipk = (aipk)((ahcr)this.b).build();
    }
    
    public final void J() {
        final aipj aipj = (aipj)((ahcr)this.b).build();
    }
    
    public final aiqm K(final vgx vgx) {
        return new aiqm((aiph)((ahcr)this.b).build(), vgx);
    }
    
    final Set a() {
        synchronized (this.b) {
            return Collections.unmodifiableSet((Set<?>)this.b);
        }
    }
    
    public final void d(final int n, final boolean b) {
        ((ahcd)this.b).l(n, b);
    }
    
    public final void e(final int n, final ahbt ahbt) {
        ((ahcd)this.b).n(n, ahbt);
    }
    
    public final void f(final int n, final double n2) {
        ((ahcd)this.b).ap(n, n2);
    }
    
    public final void g(final int n, final int n2) {
        ((ahcd)this.b).t(n, n2);
    }
    
    public final void h(final int n, final int n2) {
        ((ahcd)this.b).p(n, n2);
    }
    
    public final void i(final int n, final long n2) {
        ((ahcd)this.b).r(n, n2);
    }
    
    public final void j(final int n, final float n2) {
        ((ahcd)this.b).ar(n, n2);
    }
    
    public final void k(final int n, final Object o, final ahfg ahfg) {
        final Object b = this.b;
        final MessageLite messageLite = (MessageLite)o;
        final ahcd ahcd = (ahcd)b;
        ahcd.B(n, 3);
        ahfg.l((Object)messageLite, ahcd.f);
        ahcd.B(n, 4);
    }
    
    public final void l(final int n, final int n2) {
        ((ahcd)this.b).t(n, n2);
    }
    
    public final void m(final int n, final long n2) {
        ((ahcd)this.b).E(n, n2);
    }
    
    public final void n(final int n, final Object o, final ahfg ahfg) {
        ((ahcd)this.b).v(n, (MessageLite)o, ahfg);
    }
    
    public final void o(final int n, final Object o) {
        if (o instanceof ahbt) {
            ((ahcd)this.b).y(n, (ahbt)o);
            return;
        }
        ((ahcd)this.b).x(n, (MessageLite)o);
    }
    
    public final void p(final int n, final int n2) {
        ((ahcd)this.b).p(n, n2);
    }
    
    public final void q(final int n, final long n2) {
        ((ahcd)this.b).r(n, n2);
    }
    
    public final void r(final int n, final int n2) {
        ((ahcd)this.b).au(n, n2);
    }
    
    public final void s(final int n, final long n2) {
        ((ahcd)this.b).aw(n, n2);
    }
    
    public final void t(final int n, final String s) {
        ((ahcd)this.b).z(n, s);
    }
    
    public final void u(final int n, final int n2) {
        ((ahcd)this.b).C(n, n2);
    }
    
    public final void v(final int n, final long n2) {
        ((ahcd)this.b).E(n, n2);
    }
    
    public final aiqk x(final vgx vgx) {
        return new aiqk((aipf)((ahcr)this.b).build());
    }
    
    public final aibt y() {
        return new aibt((aibu)((ahcr)this.b).build());
    }
    
    public final ahka z(final vgx vgx) {
        return new ahka((ahkc)((ahcr)this.b).build(), vgx);
    }
}
