import android.view.ViewGroup;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aavr implements aaqy, abps, acoq
{
    public final wyw a;
    public aavt b;
    public angt[] c;
    private final Context d;
    private final ViewGroup e;
    private final acgs f;
    private final vcy g;
    
    public aavr(final wyw a, final Context d, final ViewGroup e, final acgs f, final vcy g) {
        a.getClass();
        this.a = a;
        d.getClass();
        this.d = d;
        e.getClass();
        this.e = e;
        f.getClass();
        this.f = f;
        g.getClass();
        this.g = g;
    }
    
    public final void a(final acab acab, final abzz abzz) {
    }
    
    public final asir[] lX(final abpu abpu) {
        asir asir;
        if (((vai)abpu.ci().g).bx()) {
            asir = abpu.Q().an(new aauu(this, 3), (asjm)aaof.j);
        }
        else {
            asir = abpu.P().an(new aauu(this, 3), (asjm)aaof.j);
        }
        return new asir[] { asir };
    }
    
    @Override
    public final void rT(final aatn aatn, final aatj aatj) {
        final aavt b = new aavt(this.d, aatj, aatj.a().a(), this.f, this.e, this.g);
        this.b = b;
        final atke c = aatn.a.c();
        final acid j = b.j;
        final float n = j.n(2131170373);
        final float n2 = j.n(2131170372);
        final Boolean a = aatt.a;
        final acid i = b.j;
        final float n3 = i.n(2131170373) / 1.7777778f;
        final float n4 = i.n(2131170117);
        final float n5 = i.n(2131170094);
        final float n6 = i.n(2131170097);
        final float n7 = i.n(2131170098);
        final float n8 = i.n(2131170372);
        final float n9 = i.n(2131170372);
        final Context e = b.e;
        final ViewGroup g = b.g;
        final aatv a2 = b.f.a();
        final float a3 = aatt.a((n + (n2 + n2)) * 4.0f);
        final float a4 = aatt.a(n3 + (n4 + n4) + (n5 + n5 + n6 + n7 + n8) + (n9 + n9));
        ((aarc)b).m((aarz)(b.h = new aarm(e, g, a3, a4, a2, c)));
        ((aapo)b).l(a3, a4);
        ((aarc)this.b).k(0.0f, -30.0f, 0.0f);
        aatj.c((aaru)this.b);
        final aavt b2 = this.b;
        aatj.k = (aati)b2;
        final angt[] c2 = this.c;
        if (c2 != null) {
            b2.b(c2);
        }
    }
    
    @Override
    public final void rU() {
        this.b = null;
    }
}
