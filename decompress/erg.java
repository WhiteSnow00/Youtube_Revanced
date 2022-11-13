import android.os.Handler;
import android.content.Context;
import java.util.concurrent.Executor;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

final class erg implements atke
{
    private final eqy a;
    private final erh b;
    private final int c;
    private final esp d;
    
    public erg(final eqy a, final esp d, final erh b, final int c) {
        this.a = a;
        this.d = d;
        this.b = b;
        this.c = c;
    }
    
    public final Object a() {
        switch (this.c) {
            default: {
                return new uhg((Activity)this.d.d.a(), this.b.n(), this.b.a, (aeea)this.a.a.ck.a(), 0, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            case 11: {
                final bu bu = (bu)this.d.l.a();
                final erh b = this.b;
                return ufa.v(bu, b.a, b.n(), (acgs)this.a.jl.a(), this.d.an());
            }
            case 10: {
                return ufa.u((Activity)this.d.d.a(), (uhb)this.b.f.a(), this.b.n(), (Executor)this.a.r.a(), this.b.a, (wyv)this.d.o.a(), (ugq)this.b.d.a());
            }
            case 9: {
                return new uhg((Activity)this.d.d.a(), this.b.n(), this.b.a, (aeea)this.a.a.ck.a(), 1, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            case 8: {
                return new ouf((Executor)this.a.r.a(), (ulc)this.d.eV.a());
            }
            case 7: {
                return new uhb((Context)this.d.d.a(), (acgs)this.a.jl.a(), (Executor)this.a.r.a(), (ouf)this.b.e.a(), (byte[])null, (byte[])null, (byte[])null);
            }
            case 6: {
                return new ugy((uhb)this.b.f.a(), this.b.a, (Executor)this.a.r.a(), (aeea)this.a.a.ck.a(), (ugq)this.b.d.a(), (wyv)this.d.o.a(), 0, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            case 5: {
                final bu bu2 = (bu)this.d.l.a();
                final erh b2 = this.b;
                return new ugw(bu2, b2.a, b2.o(), this.b.n(), (acgs)this.a.jl.a(), (Handler)this.a.G.a(), this.d.an(), (vcy)this.d.F.a(), (aeea)this.a.kb.a(), (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            case 4: {
                final erh b3 = this.b;
                final esp g = b3.g;
                final aujg aujg = new aujg(g.d, g.a.x, b3.b.ka, (byte[])null, (char[])null, (byte[])null, (byte[])null);
                final bu bu3 = (bu)this.d.l.a();
                final acgs acgs = (acgs)this.a.jl.a();
                final erh b4 = this.b;
                return new ugt(aujg, bu3, acgs, b4.a, b4.o(), this.b.n(), (ugq)this.b.d.a(), (wyv)this.d.o.a(), (aeea)this.a.a.ck.a(), (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            case 3: {
                return new ugd(this.d.Am(), (Activity)this.d.d.a(), this.b.a, (arwh)this.a.v.a(), this.b.o(), this.b.n(), (ugq)this.b.d.a(), (aeea)this.a.a.ck.a(), (acuq)this.a.a.bl.a(), (wyv)this.d.o.a(), (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            case 2: {
                return new ugq((Context)this.d.d.a(), (Handler)this.a.G.a());
            }
            case 1: {
                final Activity activity = (Activity)this.d.d.a();
                final erh b5 = this.b;
                return new ugy(activity, b5.a, (ufd)b5.c.a(), this.b.n(), (ugq)this.b.d.a(), (wyv)this.d.o.a(), (aeea)this.a.a.ck.a(), 1, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            case 0: {
                return new ufd((Context)this.d.d.a(), (Executor)this.a.r.a());
            }
        }
    }
}
