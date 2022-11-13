import android.support.v7.widget.AppCompatImageView;
import android.graphics.drawable.Drawable;
import android.content.res.Resources$Theme;
import android.graphics.Bitmap;
import android.widget.ImageView;
import com.google.protos.youtube.elements.CommandOuterClass$Command;
import android.net.Uri;
import java.util.concurrent.atomic.AtomicReference;
import android.content.Context;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class frw extends dst
{
    @dyi(a = 13)
    @dyj(a = dyk.a)
    zjp A;
    @dyi(a = 13)
    @dyj(a = dyk.a)
    aqgl B;
    @dyi(a = 13)
    @dyj(a = dyk.a)
    ovw a;
    @dyi(a = 13)
    @dyj(a = dyk.a)
    oby b;
    @dyi(a = 13)
    @dyj(a = dyk.a)
    otc c;
    @dyi(a = 13)
    @dyj(a = dyk.a)
    oti d;
    @dyi(a = 13)
    @dyj(a = dyk.a)
    Executor e;
    @dyi(a = 13)
    @dyj(a = dyk.a)
    acge f;
    @dyi(a = 13)
    @dyj(a = dyk.a)
    acgs g;
    @dyi(a = 0)
    @dyj(a = dyk.a)
    float y;
    @dyi(a = 13)
    @dyj(a = dyk.a)
    oum z;
    
    public frw() {
        super("ImageZoom");
    }
    
    private final frv aD() {
        return (frv)super.s;
    }
    
    private final gss aE() {
        return (gss)super.t;
    }
    
    protected static final gss b() {
        return new gss();
    }
    
    protected final int K() {
        return 30;
    }
    
    protected final Object R(final Context context) {
        return new fsd(context);
    }
    
    protected final void T(final dsx dsx) {
        final elx elx = new elx();
        elx.a = new AtomicReference(null);
        this.aD().a = (AtomicReference)elx.a;
    }
    
    protected final void Y(final dsx dsx, final dtb dtb) {
        final elx elx = new elx();
        final elx elx2 = new elx();
        final elx elx3 = new elx();
        final elx elx4 = new elx();
        final aqgl b = this.B;
        final ovw a = this.a;
        final acge f = this.f;
        aqgi aqgi;
        if ((aqgi = b.d) == null) {
            aqgi = aqgi.a;
        }
        final ahbb ahbb = (ahbb)((ahbh)aotp.a).createBuilder();
        for (int i = 0; i < aqgi.c.size(); ++i) {
            final aqgk aqgk = (aqgk)aqgi.c.get(i);
            if (aqgk.c == 1) {
                final ahaz builder = ((ahbh)aoto.a).createBuilder();
                String c;
                if (aqgk.c == 1) {
                    c = (String)aqgk.d;
                }
                else {
                    c = "";
                }
                builder.copyOnWrite();
                final aoto aoto = (aoto)builder.instance;
                c.getClass();
                aoto.b |= 0x1;
                aoto.c = c;
                final int e = aqgk.e;
                builder.copyOnWrite();
                final aoto aoto2 = (aoto)builder.instance;
                aoto2.b |= 0x2;
                aoto2.d = e;
                final int f2 = aqgk.f;
                builder.copyOnWrite();
                final aoto aoto3 = (aoto)builder.instance;
                aoto3.b |= 0x4;
                aoto3.e = f2;
                ahbb.cJ(builder);
            }
        }
        final aotp aotp = (aotp)((ahaz)ahbb).build();
        elx3.a = dtb.H();
        elx4.a = dtb.a();
        if (aotp.c.size() > 0 && dtb.H() > 0 && dtb.a() > 0) {
            final aoto o = aald.O(aotp, dtb.H(), dtb.a());
            elx.a = o;
            if (a != null) {
                elx2.a = ((tdm)((acic)f).a).a(acek.c(Uri.parse(o.c)));
            }
        }
        this.aE().d = elx.a;
        this.aE().e = elx2.a;
        this.aE().c = (Integer)elx3.a;
        this.aE().b = (Integer)elx4.a;
    }
    
    public final void Z(final dsx dsx, final dtb dtb, final int n, final int n2, final dwq dwq) {
        aqgi aqgi;
        if ((aqgi = this.B.d) == null) {
            aqgi = aqgi.a;
        }
        final int size = aqgi.c.size();
        float n3 = 1.0f;
        if (size != 0) {
            final aqgk aqgk = (aqgk)aqgi.c.get(0);
            final int f = aqgk.f;
            if (f != 0) {
                n3 = aqgk.e / (float)f;
            }
        }
        bma.h(n, n2, n3, dwq);
    }
    
    public final /* bridge */ boolean a(final Object o) {
        return this.f((dst)o);
    }
    
    protected final void aa(final dsx dsx, final Object o) {
        final fsd fsd = (fsd)o;
        final aqgl b = this.B;
        final acgs g = this.g;
        final otc c = this.c;
        final oti d = this.d;
        final ovw a = this.a;
        final zjp a2 = this.A;
        final Object d2 = this.aE().d;
        this.aE().c.intValue();
        this.aE().b.intValue();
        final Object e = this.aE().e;
        final int intValue = this.aE().a;
        final oum z = this.z;
        final acge f = this.f;
        final oby b2 = this.b;
        final AtomicReference a3 = this.aD().a;
        aqgi aqgi;
        if ((aqgi = b.d) == null) {
            aqgi = aqgi.a;
        }
        final Context b3 = dsx.b;
        fsd.a = intValue;
        fsd.b = aqgi.e;
        fsd.k = c;
        fsd.j = d;
        if ((b.c & 0x2) != 0x0) {
            CommandOuterClass$Command l;
            if ((l = b.e) == null) {
                l = CommandOuterClass$Command.getDefaultInstance();
            }
            fsd.l = l;
        }
        if ((b.c & 0x4) != 0x0) {
            CommandOuterClass$Command m;
            if ((m = b.f) == null) {
                m = CommandOuterClass$Command.getDefaultInstance();
            }
            fsd.m = m;
        }
        fsd.p = b.h;
        int g2;
        if ((g2 = aqsx.G(b.i)) == 0) {
            g2 = 1;
        }
        fsd.u = g2;
        int h;
        if ((h = aqsx.H(b.j)) == 0) {
            h = 1;
        }
        fsd.v = h;
        if (d2 != null) {
            final Uri cl = tpe.cL(((aoto)d2).c);
            final acgn a4 = acgo.a();
            a4.d = acgu.a();
            a4.f = 1;
            if (a == null) {
                a4.c = (acgq)new fry(b, b3, c, aqgi);
                g.h((ImageView)fsd, cl, a4.a());
                return;
            }
            int j;
            if ((j = aqsx.J(aqgi.d)) == 0) {
                j = 1;
            }
            final acek acek = new acek((ImageView)fsd, a, a2, f, b2, (tcc)new frz(fsd, z, j), z);
            a3.set(acek);
            if ((b.c & 0x8) != 0x0) {
                aqgi aqgi2;
                if ((aqgi2 = b.g) == null) {
                    aqgi2 = aqgi.a;
                }
                int i;
                if ((i = aqsx.J(aqgi2.d)) == 0) {
                    i = 1;
                }
                fsd.t = i;
                aakv.u(aqgi2, (ImageView)fsd, b3, c);
            }
            fsd.q = a2;
            fsd.r = a;
            if (e != null) {
                int k;
                if ((k = aqsx.J(aqgi.d)) == 0) {
                    k = 1;
                }
                fsd.t = k;
                acek.d((Bitmap)((zii)e).a);
                fsd.b();
                return;
            }
            g.l(cl, (tcc)acek);
        }
        else {
            int j2;
            if ((j2 = aqsx.J(aqgi.d)) == 0) {
                j2 = 1;
            }
            fsd.t = j2;
            final int c2 = osh.c(b3, aqgi);
            if (c2 > 0) {
                ((AppCompatImageView)fsd).setImageDrawable(ahv.f(b3.getResources(), c2, (Resources$Theme)null));
                fsd.b();
                return;
            }
            final aezp o2 = nbr.O(aqgi);
            if (o2.h()) {
                ((AppCompatImageView)fsd).setImageDrawable(nbr.M(b3, (byte[])o2.c()));
                fsd.b();
            }
        }
    }
    
    protected final void ab(final dsx dsx) {
        final elx elx = new elx();
        final aqgl b = this.B;
        elx.a = 0;
        aqgi aqgi;
        if ((aqgi = b.d) == null) {
            aqgi = aqgi.a;
        }
        if (aqgi.c.size() > 0 && ((aqgk)aqgi.c.get(0)).c == 3) {
            final aqgk aqgk = (aqgk)aqgi.c.get(0);
            aqgh a;
            if (aqgk.c == 3) {
                a = (aqgh)aqgk.d;
            }
            else {
                a = aqgh.a;
            }
            elx.a = a.d;
        }
        this.aE().a = (Integer)elx.a;
        final float y = this.y;
        if (y > 0.0f) {
            F(new ovz(y), dsx.e, dsx.h());
        }
    }
    
    protected final void ac(final dsx dsx, final Object o) {
        final fsd fsd = (fsd)o;
        final acgs g = this.g;
        final ovw a = this.a;
        final AtomicReference a2 = this.aD().a;
        g.d((ImageView)fsd);
        final acek acek = a2.getAndSet(null);
        if (acek != null) {
            acek.b.set(true);
        }
        if (a != null) {
            a.d();
            a.a();
        }
        ((AppCompatImageView)fsd).setImageDrawable((Drawable)null);
        fsd.k = null;
        fsd.l = null;
        fsd.m = null;
        fsd.a = 0;
        fsd.b = false;
        fsd.s = null;
        fsd.q = null;
        fsd.r = null;
        fsd.o = false;
        fsd.p = false;
        fsd.u = 1;
        fsd.v = 1;
    }
    
    protected final void ad(final dwr dwr, final dwr dwr2) {
        ((frv)dwr2).a = ((frv)dwr).a;
    }
    
    protected final boolean af() {
        return true;
    }
    
    protected final boolean ai() {
        return true;
    }
    
    public final boolean al() {
        return true;
    }
    
    public final boolean am() {
        return true;
    }
    
    public final int an() {
        return 3;
    }
    
    public final void ao() {
    }
    
    public final void ap() {
        fbu.g(this.g, (aoto)this.aE().d, (int)this.aE().c, (int)this.aE().b, this.z, this.d, this.e);
    }
    
    protected final boolean ay(final dst dst, final dst dst2) {
        final frw frw = (frw)dst;
        final frw frw2 = (frw)dst2;
        Object b;
        if (frw == null) {
            b = null;
        }
        else {
            b = frw.B;
        }
        final dub dub = new dub(b, (Object)frw2.B);
        return !((ahbh)dub.a).equals(dub.b);
    }
    
    public final boolean f(final dst dst) {
        if (this == dst) {
            return true;
        }
        if (dst == null || this.getClass() != dst.getClass()) {
            return false;
        }
        final frw frw = (frw)dst;
        final ovw a = this.a;
        Label_0062: {
            if (a != null) {
                if (a.equals((Object)frw.a)) {
                    break Label_0062;
                }
            }
            else if (frw.a == null) {
                break Label_0062;
            }
            return false;
        }
        final oby b = this.b;
        Label_0094: {
            if (b != null) {
                if (b.equals(frw.b)) {
                    break Label_0094;
                }
            }
            else if (frw.b == null) {
                break Label_0094;
            }
            return false;
        }
        final otc c = this.c;
        Label_0126: {
            if (c != null) {
                if (c.equals(frw.c)) {
                    break Label_0126;
                }
            }
            else if (frw.c == null) {
                break Label_0126;
            }
            return false;
        }
        final oti d = this.d;
        Label_0158: {
            if (d != null) {
                if (d.equals(frw.d)) {
                    break Label_0158;
                }
            }
            else if (frw.d == null) {
                break Label_0158;
            }
            return false;
        }
        final Executor e = this.e;
        Label_0190: {
            if (e != null) {
                if (e.equals(frw.e)) {
                    break Label_0190;
                }
            }
            else if (frw.e == null) {
                break Label_0190;
            }
            return false;
        }
        final acge f = this.f;
        Label_0222: {
            if (f != null) {
                if (f.equals(frw.f)) {
                    break Label_0222;
                }
            }
            else if (frw.f == null) {
                break Label_0222;
            }
            return false;
        }
        final acgs g = this.g;
        Label_0254: {
            if (g != null) {
                if (g.equals(frw.g)) {
                    break Label_0254;
                }
            }
            else if (frw.g == null) {
                break Label_0254;
            }
            return false;
        }
        if (Float.compare(this.y, frw.y) != 0) {
            return false;
        }
        final oum z = this.z;
        Label_0302: {
            if (z != null) {
                if (z.equals(frw.z)) {
                    break Label_0302;
                }
            }
            else if (frw.z == null) {
                break Label_0302;
            }
            return false;
        }
        final zjp a2 = this.A;
        Label_0334: {
            if (a2 != null) {
                if (a2.equals(frw.A)) {
                    break Label_0334;
                }
            }
            else if (frw.A == null) {
                break Label_0334;
            }
            return false;
        }
        final aqgl b2 = this.B;
        if (b2 != null) {
            if (((ahbh)b2).equals((Object)frw.B)) {
                return true;
            }
        }
        else if (frw.B == null) {
            return true;
        }
        return false;
    }
    
    public final /* bridge */ dst j() {
        final frw frw = (frw)super.j();
        frw.s = (dwr)new frv();
        frw.t = (duz)b();
        return frw;
    }
    
    protected final /* bridge */ duz n() {
        return (duz)b();
    }
    
    protected final /* bridge */ dwr o() {
        return (dwr)new frv();
    }
    
    protected final void r(final duz duz, final duz duz2) {
        final gss gss = (gss)duz;
        final gss gss2 = (gss)duz2;
        gss.a = gss2.a;
        gss.b = gss2.b;
        gss.e = gss2.e;
        gss.d = gss2.d;
        gss.c = gss2.c;
    }
}
