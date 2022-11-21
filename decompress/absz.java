import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import android.text.TextUtils;
import java.util.Locale;
import java.util.concurrent.Executor;
import com.google.android.libraries.youtube.innertube.model.player.TrackingUrlModel;

// 
// Decompiled by Procyon v0.6.0
// 

public final class absz
{
    public final atnb a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    
    public absz(final aefs g, final String e, final atnb a, final zkt c, final aahn b, final aaig f, final aaks h, final abwe d, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6, final byte[] array7, final byte[] array8) {
        this.g = g;
        this.e = e;
        this.a = a;
        this.c = c;
        this.b = b;
        this.f = f;
        this.h = h;
        this.d = d;
    }
    
    public absz(final atnb b, final atnb c, final atnb d, final atnb e, final atnb f, final atnb a, final atnb g, final atnb h) {
        b.getClass();
        this.b = b;
        c.getClass();
        this.c = c;
        d.getClass();
        this.d = d;
        e.getClass();
        this.e = e;
        f.getClass();
        this.f = f;
        a.getClass();
        this.a = a;
        g.getClass();
        this.g = g;
        h.getClass();
        this.h = h;
    }
    
    public absz(final atnb g, final atnb c, final atnb a, final atnb h, final atnb b, final atnb e, final atnb d, final atnb f, final byte[] array) {
        g.getClass();
        this.g = g;
        c.getClass();
        this.c = c;
        a.getClass();
        this.a = a;
        h.getClass();
        this.h = h;
        b.getClass();
        this.b = b;
        e.getClass();
        this.e = e;
        this.d = d;
        f.getClass();
        this.f = f;
    }
    
    public final absy a(final ange ange, final TrackingUrlModel trackingUrlModel, final String s, final int n) {
        final aajb aajb = (aajb)((atnb)this.b).a();
        aajb.getClass();
        final Executor executor = (Executor)((atnb)this.c).a();
        executor.getClass();
        ((atnb)this.d).a().getClass();
        final mtf mtf = (mtf)((atnb)this.e).a();
        mtf.getClass();
        final zoa zoa = (zoa)((atnb)this.f).a();
        zoa.getClass();
        final tkq tkq = (tkq)this.a.a();
        tkq.getClass();
        final zmd zmd = (zmd)((atnb)this.g).a();
        zmd.getClass();
        final vbo vbo = (vbo)((atnb)this.h).a();
        vbo.getClass();
        ange.getClass();
        trackingUrlModel.getClass();
        s.getClass();
        return new absy(aajb, executor, mtf, zoa, tkq, zmd, vbo, ange, trackingUrlModel, s, n, null, null);
    }
    
    public final void b(final String s, final boolean b) {
        tcl.k();
        ((abwe)this.d).j((String)this.e, s, b);
    }
    
    public final void c(final String s) {
        ((aaig)this.f).o(String.format(Locale.US, "%s:%s:ad", this.e, s));
    }
    
    public final void d(final String s) {
        ((aaig)this.f).o(s);
    }
    
    public final void e(final String s) {
        this.d(aamn.s((String)this.e, s));
    }
    
    public final void f(final String s, final String s2, final String s3, final amze amze, final String s4, final int n, final aacw aacw, final int n2, final boolean b, final boolean b2, final boolean b3, final int n3) {
        this.g(s, ((aefs)this.g).cw(), s2, s3, amze, s4, n, aacw, n2, b, b2, b3, n3);
    }
    
    public final void g(final String d, String p13, final String s, final String s2, final amze amze, final String s3, int b, final aacw aacw, final int n, final boolean b2, final boolean b3, final boolean b4, final int n2) {
        tcl.k();
        final String s4 = aamn.s((String)this.e, d);
        ((aahn)this.b).e();
        final afbh a = ((aahn)this.b).a(s4);
        if (a.h() && (((aaha)a.c()).d() || ((aaha)a.c()).b())) {
            return;
        }
        final Object c = this.c;
        final aade aade = new aade();
        aahc.L((aach)aade, aakx.a(amze, 360));
        aahc.am((aach)aade, aacw.b());
        if (s3 != null) {
            aahc.J((aach)aade, s3);
        }
        aahc.al((aach)aade, b);
        final zkt zkt = (zkt)c;
        byte[] array;
        if ((array = ((zxm)zkt.e).m(d)) == null) {
            array = vby.b;
        }
        aahc.A((aach)aade, array);
        aahc.U((aach)aade, d);
        aahc.F((aach)aade, 0x1 == (n ^ 0x1));
        aahc.E((aach)aade, b3);
        aahc.an((aach)aade, n2);
        aahc.D((aach)aade, b4);
        aahc.Q((aach)aade, p13);
        if (s != null) {
            aahc.M((aach)aade, s);
        }
        if (!TextUtils.isEmpty((CharSequence)s2)) {
            aahc.V((aach)aade, s2);
        }
        if (b2) {
            ((absv)zkt.b).J(d);
        }
        aahc.O((aach)aade, ((oco)zkt.d).c());
        aahc.R((aach)aade, ((zxb)zkt.c).b);
        aahc.H((aach)aade, ((zxb)zkt.c).c);
        aahc.y((aach)aade, ((zxb)zkt.c).d);
        aahc.I((aach)aade, ((zxb)zkt.c).e);
        final akeo f = ((arzb)zkt.a).f();
        amwj amwj;
        if ((amwj = f.g) == null) {
            amwj = amwj.a;
        }
        if (amwj.i) {
            amwj amwj2;
            if ((amwj2 = f.g) == null) {
                amwj2 = amwj.a;
            }
            aahc.K((aach)aade, amwj2.j);
        }
        final PlayerResponseModel q = ((zxm)zkt.e).q(d);
        if (q != null) {
            final amxq b5 = q.B();
            if (b5 != null) {
                final ahbt k = b5.k;
                if (!k.H()) {
                    aahc.G((aach)aade, k.I());
                }
            }
        }
        aahc.T((aach)aade, 4);
        if (((aaks)this.h).i()) {
            final Object b6 = this.b;
            final Object e = this.e;
            if (1 != n) {
                b = 200;
            }
            else {
                b = 150;
            }
            ((aahn)b6).d(new aaha((String)e, s4, b, (aach)aade, 0));
        }
        final ahcr builder = ((ahcz)amxv.a).createBuilder();
        builder.copyOnWrite();
        final amxv amxv = (amxv)builder.instance;
        d.getClass();
        amxv.b |= 0x1;
        amxv.d = d;
        if (!b3) {
            b = 2;
        }
        else {
            b = 4;
        }
        builder.copyOnWrite();
        final amxv amxv2 = (amxv)builder.instance;
        amxv2.h = b - 1;
        amxv2.b |= 0x10;
        builder.copyOnWrite();
        final amxv amxv3 = (amxv)builder.instance;
        amxv3.t = amze.k;
        amxv3.b |= 0x100000;
        b = aacw.b();
        builder.copyOnWrite();
        final amxv amxv4 = (amxv)builder.instance;
        amxv4.r = b - 1;
        amxv4.b |= 0x10000;
        builder.copyOnWrite();
        final amxv amxv5 = (amxv)builder.instance;
        amxv5.x = 4;
        amxv5.c |= 0x2;
        builder.copyOnWrite();
        final amxv amxv6 = (amxv)builder.instance;
        amxv6.g = 1;
        amxv6.b |= 0x8;
        if (!TextUtils.isEmpty((CharSequence)p13)) {
            builder.copyOnWrite();
            final amxv amxv7 = (amxv)builder.instance;
            p13.getClass();
            amxv7.b |= 0x2;
            amxv7.e = p13;
        }
        p13 = aahc.p((aach)aade);
        if (p13 != null) {
            builder.copyOnWrite();
            final amxv amxv8 = (amxv)builder.instance;
            amxv8.b |= 0x80000;
            amxv8.s = p13;
        }
        final byte[] ag = aahc.ag((aach)aade);
        if (ag != null) {
            final ahbt x = ahbt.x(ag);
            builder.copyOnWrite();
            final amxv amxv9 = (amxv)builder.instance;
            amxv9.c |= 0x20;
            amxv9.z = x;
        }
        if (!((aaks)this.h).c().b()) {
            ((aacd)this.a.a()).b((amxv)builder.build());
        }
        if (!((aaks)this.h).i()) {
            if (1 != n) {
                b = 200;
            }
            else {
                b = 150;
            }
            tcl.k();
            ((aaig)this.f).c((String)this.e, s4, b, (aach)aade);
            return;
        }
        ((aaig)this.f).f(s4);
    }
}
