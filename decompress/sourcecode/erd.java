import android.os.Handler;
import android.content.Context;
import java.util.concurrent.Executor;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

final class erd implements atjj
{
    private final eqv a;
    private final ere b;
    private final int c;
    private final esm d;
    
    public erd(final eqv a, final esm d, final ere b, final int c) {
        this.a = a;
        this.d = d;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final Object a() {
        switch (this.c) {
            default: {
                return new ufd((Activity)this.d.d.a(), this.b.n(), this.b.a, (avt)this.a.a.cj.a(), 0, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            case 11: {
                final bu bu = (bu)this.d.l.a();
                final ere b = this.b;
                return tzb.v(bu, b.a, b.n(), (aceo)this.a.jh.a(), this.d.am());
            }
            case 10: {
                return tzb.u((Activity)this.d.d.a(), (uey)this.b.f.a(), this.b.n(), (Executor)this.a.r.a(), this.b.a, (wwu)this.d.o.a(), (uen)this.b.d.a());
            }
            case 9: {
                return new ufd((Activity)this.d.d.a(), this.b.n(), this.b.a, (avt)this.a.a.cj.a(), 1, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            case 8: {
                return new agkw((Executor)this.a.r.a(), (ujg)this.d.eU.a());
            }
            case 7: {
                return new uey((Context)this.d.d.a(), (aceo)this.a.jh.a(), (Executor)this.a.r.a(), (agkw)this.b.e.a(), (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            case 6: {
                return new uev((uey)this.b.f.a(), this.b.a, (Executor)this.a.r.a(), (avt)this.a.a.cj.a(), (uen)this.b.d.a(), (wwu)this.d.o.a(), 0, (byte[])null, (byte[])null, (byte[])null);
            }
            case 5: {
                final bu bu2 = (bu)this.d.l.a();
                final ere b2 = this.b;
                return new uet(bu2, b2.a, b2.o(), this.b.n(), (aceo)this.a.jh.a(), (Handler)this.a.G.a(), this.d.am(), (vax)this.d.E.a(), (aeby)this.a.jW.a(), (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            case 4: {
                final ere b3 = this.b;
                final esm g = b3.g;
                final auip auip = new auip(g.d, g.a.r, b3.b.jV, (byte[])null, (char[])null, (char[])null);
                final bu bu3 = (bu)this.d.l.a();
                final aceo aceo = (aceo)this.a.jh.a();
                final ere b4 = this.b;
                return new ueq(auip, bu3, aceo, b4.a, b4.o(), this.b.n(), (uen)this.b.d.a(), (wwu)this.d.o.a(), (avt)this.a.a.cj.a(), (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            case 3: {
                return new uea(this.d.Am(), (Activity)this.d.d.a(), this.b.a, (arud)this.a.v.a(), this.b.o(), this.b.n(), (uen)this.b.d.a(), (avt)this.a.a.cj.a(), (acsm)this.a.a.bl.a(), (wwu)this.d.o.a(), (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            case 2: {
                return new uen((Context)this.d.d.a(), (Handler)this.a.G.a());
            }
            case 1: {
                final Activity activity = (Activity)this.d.d.a();
                final ere b5 = this.b;
                return new uev(activity, b5.a, (uda)b5.c.a(), this.b.n(), (uen)this.b.d.a(), (wwu)this.d.o.a(), (avt)this.a.a.cj.a(), 1, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            case 0: {
                return new uda((Context)this.d.d.a(), (Executor)this.a.r.a());
            }
        }
    }
}
