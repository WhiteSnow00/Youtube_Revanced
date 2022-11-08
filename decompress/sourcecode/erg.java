import android.os.Handler;
import android.content.Context;
import java.util.concurrent.Executor;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

final class erg implements atjj
{
    public final eqv a;
    private final erh b;
    private final int c;
    private final esk d;
    
    public erg(final eqv a, final esk d, final erh b, final int c) {
        this.a = a;
        this.d = d;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final Object a() {
        switch (this.c) {
            default: {
                return new ufd((Activity)this.d.c.a(), this.b.o(), this.b.a, (avt)this.a.a.cj.a(), 0, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            case 12: {
                final bu bu = (bu)this.d.i.a();
                final erh b = this.b;
                return tzb.v(bu, b.a, b.o(), (aceo)this.a.jh.a(), this.b.n());
            }
            case 11: {
                return tzb.u((Activity)this.d.c.a(), (uey)this.b.g.a(), this.b.o(), (Executor)this.a.r.a(), this.b.a, (wwu)this.d.j.a(), (uen)this.b.e.a());
            }
            case 10: {
                return new ufd((Activity)this.d.c.a(), this.b.o(), this.b.a, (avt)this.a.a.cj.a(), 1, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            case 9: {
                return new agkw((Executor)this.a.r.a(), (ujg)this.b.d.a());
            }
            case 8: {
                return new uey((Context)this.d.c.a(), (aceo)this.a.jh.a(), (Executor)this.a.r.a(), (agkw)this.b.f.a(), (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            case 7: {
                return new uev((uey)this.b.g.a(), this.b.a, (Executor)this.a.r.a(), (avt)this.a.a.cj.a(), (uen)this.b.e.a(), (wwu)this.d.j.a(), 0, (byte[])null, (byte[])null, (byte[])null);
            }
            case 6: {
                final bu bu2 = (bu)this.d.i.a();
                final erh b2 = this.b;
                return new uet(bu2, b2.a, b2.p(), this.b.o(), (aceo)this.a.jh.a(), (Handler)this.a.G.a(), this.b.n(), (vax)this.d.k.a(), (aeby)this.a.jW.a(), (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            case 5: {
                final erh b3 = this.b;
                final esk h = b3.h;
                final auip auip = new auip(h.c, h.S, b3.b.jV, (byte[])null, (char[])null, (char[])null);
                final bu bu3 = (bu)this.d.i.a();
                final aceo aceo = (aceo)this.a.jh.a();
                final erh b4 = this.b;
                return new ueq(auip, bu3, aceo, b4.a, b4.p(), this.b.o(), (uen)this.b.e.a(), (wwu)this.d.j.a(), (avt)this.a.a.cj.a(), (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            case 4: {
                final erh b5 = this.b;
                final eqv b6 = b5.b;
                return new uea(new auip(b6.iG, b5.h.ay, b6.a.ck, (byte[])null, (byte[])null, (byte[])null, (char[])null), (Activity)this.d.c.a(), this.b.a, (arud)this.a.v.a(), this.b.p(), this.b.o(), (uen)this.b.e.a(), (avt)this.a.a.cj.a(), (acsm)this.a.a.bl.a(), (wwu)this.d.j.a(), (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            case 3: {
                return new uen((Context)this.d.c.a(), (Handler)this.a.G.a());
            }
            case 2: {
                return new epy(this, 3);
            }
            case 1: {
                final Activity activity = (Activity)this.d.c.a();
                final erh b7 = this.b;
                return new uev(activity, b7.a, (uda)b7.c.a(), this.b.o(), (uen)this.b.e.a(), (wwu)this.d.j.a(), (avt)this.a.a.cj.a(), 1, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            case 0: {
                return new uda((Context)this.d.c.a(), (Executor)this.a.r.a());
            }
        }
    }
}
