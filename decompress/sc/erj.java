import android.os.Handler;
import android.content.Context;
import java.util.concurrent.Executor;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

final class erj implements atke
{
    public final eqy a;
    private final erk b;
    private final int c;
    private final esn d;
    
    public erj(final eqy a, final esn d, final erk b, final int c) {
        this.a = a;
        this.d = d;
        this.b = b;
        this.c = c;
    }
    
    public final Object a() {
        switch (this.c) {
            default: {
                return new uhg((Activity)this.d.c.a(), this.b.o(), this.b.a, (aeea)this.a.a.ck.a(), 0, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            case 12: {
                final bu bu = (bu)this.d.i.a();
                final erk b = this.b;
                return ufa.v(bu, b.a, b.o(), (acgs)this.a.jl.a(), this.b.n());
            }
            case 11: {
                return ufa.u((Activity)this.d.c.a(), (uhb)this.b.g.a(), this.b.o(), (Executor)this.a.r.a(), this.b.a, (wyv)this.d.j.a(), (ugq)this.b.e.a());
            }
            case 10: {
                return new uhg((Activity)this.d.c.a(), this.b.o(), this.b.a, (aeea)this.a.a.ck.a(), 1, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            case 9: {
                return new ouf((Executor)this.a.r.a(), (ulc)this.b.d.a());
            }
            case 8: {
                return new uhb((Context)this.d.c.a(), (acgs)this.a.jl.a(), (Executor)this.a.r.a(), (ouf)this.b.f.a(), (byte[])null, (byte[])null, (byte[])null);
            }
            case 7: {
                return new ugy((uhb)this.b.g.a(), this.b.a, (Executor)this.a.r.a(), (aeea)this.a.a.ck.a(), (ugq)this.b.e.a(), (wyv)this.d.j.a(), 0, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            case 6: {
                final bu bu2 = (bu)this.d.i.a();
                final erk b2 = this.b;
                return new ugw(bu2, b2.a, b2.p(), this.b.o(), (acgs)this.a.jl.a(), (Handler)this.a.G.a(), this.b.n(), (vcy)this.d.k.a(), (aeea)this.a.kb.a(), (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            case 5: {
                final erk b3 = this.b;
                final esn h = b3.h;
                final aujg aujg = new aujg(h.c, h.R, b3.b.ka, (byte[])null, (char[])null, (byte[])null, (byte[])null);
                final bu bu3 = (bu)this.d.i.a();
                final acgs acgs = (acgs)this.a.jl.a();
                final erk b4 = this.b;
                return new ugt(aujg, bu3, acgs, b4.a, b4.p(), this.b.o(), (ugq)this.b.e.a(), (wyv)this.d.j.a(), (aeea)this.a.a.ck.a(), (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            case 4: {
                final erk b5 = this.b;
                final eqy b6 = b5.b;
                return new ugd(new aujg(b6.iK, b5.h.ay, b6.a.cl, (char[])null, (byte[])null, (byte[])null), (Activity)this.d.c.a(), this.b.a, (arwh)this.a.v.a(), this.b.p(), this.b.o(), (ugq)this.b.e.a(), (aeea)this.a.a.ck.a(), (acuq)this.a.a.bl.a(), (wyv)this.d.j.a(), (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            case 3: {
                return new ugq((Context)this.d.c.a(), (Handler)this.a.G.a());
            }
            case 2: {
                return new eqb(this, 3);
            }
            case 1: {
                final Activity activity = (Activity)this.d.c.a();
                final erk b7 = this.b;
                return new ugy(activity, b7.a, (ufd)b7.c.a(), this.b.o(), (ugq)this.b.e.a(), (wyv)this.d.j.a(), (aeea)this.a.a.ck.a(), 1, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            case 0: {
                return new ufd((Context)this.d.c.a(), (Executor)this.a.r.a());
            }
        }
    }
}
