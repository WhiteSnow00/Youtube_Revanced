import java.util.Map;
import android.os.Handler;
import android.content.Context;
import android.view.ViewGroup;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hxx implements acks
{
    public final Object a;
    private final int b;
    
    public hxx(final aday a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hxx(final Activity a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hxx(final hyb a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hxx(final kge a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hxx(final rhk a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hxx(final rjr a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hxx(final rjs a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hxx(final wdz a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hxx(final wdz a, final int b, final byte[] array) {
        this.b = b;
        this.a = a;
    }
    
    public final acko a(final ViewGroup viewGroup) {
        switch (this.b) {
            default: {
                final Object a = this.a;
                final aday aday = (aday)a;
                return (acko)new addi(aday.a, (addh)a, aday.c, aday.d);
            }
            case 17: {
                final Object a2 = this.a;
                return (acko)((wdz)a2).a.aG((acps)a2);
            }
            case 16: {
                final Object a3 = this.a;
                return (acko)((wdz)a3).a.aG((acps)a3);
            }
            case 15: {
                final rjs rjs = (rjs)this.a;
                return (acko)rjs.ai.b((rjh)rjs.af, viewGroup);
            }
            case 14: {
                final rjs rjs2 = (rjs)this.a;
                return (acko)rjs2.ak.f((rjh)rjs2.af, viewGroup);
            }
            case 13: {
                final rjs rjs3 = (rjs)this.a;
                return (acko)rjs3.al.ac((rjh)rjs3.af, viewGroup);
            }
            case 12: {
                final rjs rjs4 = (rjs)this.a;
                return (acko)rjs4.aj.a((rjh)rjs4.af, viewGroup);
            }
            case 11: {
                final rjr rjr = (rjr)this.a;
                return (acko)rjr.ai.b((rjh)rjr.ae, viewGroup);
            }
            case 10: {
                final Object a4 = this.a;
                final rjr rjr2 = (rjr)a4;
                final rjy af = rjr2.af;
                final rjt ae = rjr2.ae;
                final Context context = (Context)((atke)af.a).a();
                context.getClass();
                final zmf zmf = (zmf)((atke)af.b).a();
                zmf.getClass();
                final riq riq = (riq)((atke)af.c).a();
                riq.getClass();
                final eg eg = (eg)((atke)af.d).a();
                eg.getClass();
                final Activity activity = (Activity)((atke)af.e).a();
                activity.getClass();
                final Handler handler = (Handler)((atke)af.f).a();
                handler.getClass();
                final pjd pjd = (pjd)((atke)af.g).a();
                ((atke)af.h).a().getClass();
                ae.getClass();
                return (acko)new rjx(context, zmf, riq, eg, activity, handler, pjd, (rjh)ae, (br)a4, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            case 9: {
                final rjr rjr3 = (rjr)this.a;
                return (acko)rjr3.ak.f((rjh)rjr3.ae, viewGroup);
            }
            case 8: {
                final rjr rjr4 = (rjr)this.a;
                return (acko)rjr4.al.ac((rjh)rjr4.ae, viewGroup);
            }
            case 7: {
                final rjr rjr5 = (rjr)this.a;
                return (acko)rjr5.aj.a((rjh)rjr5.ae, viewGroup);
            }
            case 6: {
                return (acko)new ackb(((rhk)this.a).a);
            }
            case 5: {
                return (acko)new ackb((Context)this.a);
            }
            case 4: {
                return (acko)((kge)this.a).c.p((Map)null, 2131624520);
            }
            case 3: {
                return (acko)((kge)this.a).c.p((Map)null, 2131624519);
            }
            case 2: {
                final Object a5 = this.a;
                final aujg aa = ((hyb)a5).aA;
                final Context context2 = (Context)((atke)aa.c).a();
                final vwa vwa = (vwa)((atke)aa.a).a();
                final mdp mdp = (mdp)((atke)aa.b).a();
                viewGroup.getClass();
                return (acko)new ken(context2, vwa, mdp, viewGroup, (swy)a5, 4, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            case 1: {
                final hyb hyb = (hyb)this.a;
                final ziy aw = hyb.aw;
                final hxy hxy = new hxy(hyb, 0);
                final Context context3 = (Context)((atke)aw.a).a();
                final vcy vcy = (vcy)((atke)aw.d).a();
                vcy.getClass();
                final mdp mdp2 = (mdp)((atke)aw.b).a();
                mdp2.getClass();
                return (acko)new sxd(context3, viewGroup, vcy, mdp2, (vbs)((atke)aw.c).a(), (aujg)((atke)aw.e).a(), (sxb)hxy, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            case 0: {
                final hyb hyb2 = (hyb)this.a;
                final vbs av = hyb2.av;
                final hxy hxy2 = new hxy(hyb2, 0);
                final mdp az = hyb2.az;
                final Context context4 = (Context)((atke)av.d).a();
                final vcy vcy2 = (vcy)((atke)av.a).a();
                vcy2.getClass();
                final mdp mdp3 = (mdp)((atke)av.b).a();
                mdp3.getClass();
                final aujg aujg = (aujg)((atke)av.c).a();
                az.getClass();
                return (acko)new sxm(context4, vcy2, mdp3, aujg, viewGroup, (sxb)hxy2, az, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
        }
    }
}
