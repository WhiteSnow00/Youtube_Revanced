import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import android.text.TextUtils;
import java.util.Locale;
import java.util.concurrent.Executor;
import com.google.android.libraries.youtube.innertube.model.player.TrackingUrlModel;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abrn
{
    public final atke a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    
    public abrn(final atke b, final atke c, final atke d, final atke e, final atke f, final atke a, final atke g, final atke h) {
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
    
    public abrn(final atke g, final atke c, final atke a, final atke h, final atke b, final atke e, final atke d, final atke f, final byte[] array) {
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
    
    public abrn(final msr g, final String e, final atke a, final ziy c, final aafq b, final aagi f, final aait h, final aanx d, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        this.g = g;
        this.e = e;
        this.a = a;
        this.c = c;
        this.b = b;
        this.f = f;
        this.h = h;
        this.d = d;
    }
    
    public final abrm a(final andx andx, final TrackingUrlModel trackingUrlModel, final String s, final int n) {
        final aahc aahc = (aahc)((atke)this.b).a();
        aahc.getClass();
        final Executor executor = (Executor)((atke)this.c).a();
        executor.getClass();
        ((atke)this.d).a().getClass();
        final mdp mdp = (mdp)((atke)this.e).a();
        mdp.getClass();
        final zmf zmf = (zmf)((atke)this.f).a();
        zmf.getClass();
        final tjm tjm = (tjm)this.a.a();
        tjm.getClass();
        final zki zki = (zki)((atke)this.g).a();
        zki.getClass();
        final vaf vaf = (vaf)((atke)this.h).a();
        vaf.getClass();
        andx.getClass();
        trackingUrlModel.getClass();
        s.getClass();
        return new abrm(aahc, executor, mdp, zmf, tjm, zki, vaf, andx, trackingUrlModel, s, n, null, null);
    }
    
    public final void b(final String s, final boolean b) {
        tbi.e();
        ((aanx)this.d).e((String)this.e, s, b);
    }
    
    public final void c(final String s) {
        ((aagi)this.f).o(String.format(Locale.US, "%s:%s:ad", this.e, s));
    }
    
    public final void d(final String s) {
        ((aagi)this.f).o(s);
    }
    
    public final void e(final String s) {
        this.d(aakr.s((String)this.e, s));
    }
    
    public final void f(final String s, final String s2, final String s3, final amwz amwz, final String s4, final int n, final aaaz aaaz, final int n2, final boolean b, final boolean b2, final boolean b3, final int n3) {
        this.g(s, ((msr)this.g).A(), s2, s3, amwz, s4, n, aaaz, n2, b, b2, b3, n3);
    }
    
    public final void g(final String d, String p13, final String s, final String s2, final amwz amwz, final String s3, int b, final aaaz aaaz, final int n, final boolean b2, final boolean b3, final boolean b4, final int n2) {
        tbi.e();
        final String s4 = aakr.s((String)this.e, d);
        ((aafq)this.b).e();
        final aezp a = ((aafq)this.b).a(s4);
        if (a.h() && (((aafd)a.c()).d() || ((aafd)a.c()).b())) {
            return;
        }
        final Object c = this.c;
        final aabh aabh = new aabh();
        aaff.L((aaak)aabh, aaiz.a(amwz, 360));
        aaff.am((aaak)aabh, aaaz.b());
        if (s3 != null) {
            aaff.J((aaak)aabh, s3);
        }
        aaff.al((aaak)aabh, b);
        final ziy ziy = (ziy)c;
        byte[] array;
        if ((array = ((zvo)ziy.e).m(d)) == null) {
            array = vap.b;
        }
        aaff.A((aaak)aabh, array);
        aaff.U((aaak)aabh, d);
        aaff.F((aaak)aabh, 0x1 == (n ^ 0x1));
        aaff.E((aaak)aabh, b3);
        aaff.an((aaak)aabh, n2);
        aaff.D((aaak)aabh, b4);
        aaff.Q((aaak)aabh, p13);
        if (s != null) {
            aaff.M((aaak)aabh, s);
        }
        if (!TextUtils.isEmpty((CharSequence)s2)) {
            aaff.V((aaak)aabh, s2);
        }
        if (b2) {
            ((abrj)ziy.b).J(d);
        }
        aaff.O((aaak)aabh, ((oby)ziy.d).c());
        aaff.R((aaak)aabh, ((zvd)ziy.c).b);
        aaff.H((aaak)aabh, ((zvd)ziy.c).c);
        aaff.y((aaak)aabh, ((zvd)ziy.c).d);
        aaff.I((aaak)aabh, ((zvd)ziy.c).e);
        final akcn f = ((arwh)ziy.a).f();
        amue amue;
        if ((amue = f.g) == null) {
            amue = amue.a;
        }
        if (amue.i) {
            amue amue2;
            if ((amue2 = f.g) == null) {
                amue2 = amue.a;
            }
            aaff.K((aaak)aabh, amue2.j);
        }
        final PlayerResponseModel q = ((zvo)ziy.e).q(d);
        if (q != null) {
            final amvl b5 = q.B();
            if (b5 != null) {
                final ahab k = b5.k;
                if (!k.H()) {
                    aaff.G((aaak)aabh, k.I());
                }
            }
        }
        aaff.T((aaak)aabh, 4);
        if (((aait)this.h).i()) {
            final Object b6 = this.b;
            final Object e = this.e;
            if (1 != n) {
                b = 200;
            }
            else {
                b = 150;
            }
            ((aafq)b6).d(new aafd((String)e, s4, b, (aaak)aabh, 0));
        }
        final ahaz builder = ((ahbh)amvq.a).createBuilder();
        builder.copyOnWrite();
        final amvq amvq = (amvq)builder.instance;
        d.getClass();
        amvq.b |= 0x1;
        amvq.d = d;
        if (!b3) {
            b = 2;
        }
        else {
            b = 4;
        }
        builder.copyOnWrite();
        final amvq amvq2 = (amvq)builder.instance;
        amvq2.h = b - 1;
        amvq2.b |= 0x10;
        builder.copyOnWrite();
        final amvq amvq3 = (amvq)builder.instance;
        amvq3.t = amwz.k;
        amvq3.b |= 0x100000;
        b = aaaz.b();
        builder.copyOnWrite();
        final amvq amvq4 = (amvq)builder.instance;
        amvq4.r = b - 1;
        amvq4.b |= 0x10000;
        builder.copyOnWrite();
        final amvq amvq5 = (amvq)builder.instance;
        amvq5.x = 4;
        amvq5.c |= 0x2;
        builder.copyOnWrite();
        final amvq amvq6 = (amvq)builder.instance;
        amvq6.g = 1;
        amvq6.b |= 0x8;
        if (!TextUtils.isEmpty((CharSequence)p13)) {
            builder.copyOnWrite();
            final amvq amvq7 = (amvq)builder.instance;
            p13.getClass();
            amvq7.b |= 0x2;
            amvq7.e = p13;
        }
        p13 = aaff.p((aaak)aabh);
        if (p13 != null) {
            builder.copyOnWrite();
            final amvq amvq8 = (amvq)builder.instance;
            amvq8.b |= 0x80000;
            amvq8.s = p13;
        }
        final byte[] ag = aaff.ag((aaak)aabh);
        if (ag != null) {
            final ahab x = ahab.x(ag);
            builder.copyOnWrite();
            final amvq amvq9 = (amvq)builder.instance;
            amvq9.c |= 0x20;
            amvq9.z = x;
        }
        if (!((aait)this.h).c().b()) {
            ((aaag)this.a.a()).b((amvq)builder.build());
        }
        if (!((aait)this.h).i()) {
            if (1 != n) {
                b = 200;
            }
            else {
                b = 150;
            }
            tbi.e();
            ((aagi)this.f).c((String)this.e, s4, b, (aaak)aabh);
            return;
        }
        ((aagi)this.f).f(s4);
    }
}
