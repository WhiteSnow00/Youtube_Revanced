import android.app.AlertDialog$Builder;
import com.google.android.apps.youtube.app.common.dialog.DialogFragmentController;
import android.app.AlertDialog;
import android.view.ViewGroup;
import android.view.View;
import android.content.Context;
import android.widget.FrameLayout;
import android.text.TextUtils;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

final class gny implements sxx
{
    final gnz a;
    private final sxx b;
    private final vcy c;
    
    public gny(final gnz a, final sxx b, final vcy c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final void a() {
        this.a.b.d((Object)new fgd());
        final sxx b = this.b;
        if (b != null) {
            b.a();
        }
    }
    
    public final void b() {
        this.a.b.d((Object)new ffy());
        ((DialogFragmentController)this.a.c).k();
        final gnz a = this.a;
        final syp o = a.o;
        if (o != null) {
            o.b();
        }
        else {
            a.l.c(2132019100);
        }
        final sxx b = this.b;
        if (b != null) {
            b.b();
        }
    }
    
    public final void d(final vxl vxl) {
        final sxx b = this.b;
        if (b != null) {
            b.d(vxl);
        }
    }
    
    public final void e(final alfg alfg) {
        this.a.e.pF().D((wzz)new wyt(alfg.g.I()));
        final int u = aqsx.U(alfg.h);
        final String s = null;
        Label_0080: {
            if (u != 0) {
                if (u == 2) {
                    break Label_0080;
                }
            }
            if (alfg.f.size() > 0) {
                this.c.e((List)alfg.f, (Object)null);
            }
        }
        String d = s;
        if (alfg != null) {
            aley aley;
            if ((aley = alfg.d) == null) {
                aley = aley.a;
            }
            apxj a;
            if (aley.b == 62441981) {
                a = (apxj)aley.c;
            }
            else {
                a = apxj.a;
            }
            d = s;
            if ((a.b & 0x2) != 0x0) {
                aley aley2;
                if ((aley2 = alfg.d) == null) {
                    aley2 = aley.a;
                }
                apxj a2;
                if (aley2.b == 62441981) {
                    a2 = (apxj)aley2.c;
                }
                else {
                    a2 = apxj.a;
                }
                d = a2.d;
            }
        }
        if (!TextUtils.isEmpty((CharSequence)d)) {
            final htf c = htg.c(d);
            c.d = false;
            c.c(true);
            c.e(true);
            final htg a3 = c.a();
            this.a.f.c(a3.b, (acjb)a3);
        }
        this.a.p.K(alfg);
        ((DialogFragmentController)this.a.c).k();
        final syp o = this.a.o;
        if (o != null) {
            o.d();
        }
        aley aley3;
        if ((aley3 = alfg.d) == null) {
            aley3 = aley.a;
        }
        Label_0791: {
            if (aley3 != null) {
                final int b = aley3.b;
                if (b != 96152614) {
                    if (b != 200043314) {
                        break Label_0791;
                    }
                }
                final wyw pf = this.a.e.pF();
                final FrameLayout view = new FrameLayout((Context)this.a.a);
                final gnz a4 = this.a;
                final AlertDialog create = ((AlertDialog$Builder)a4.i.al((Context)a4.a)).setView((View)view).create();
                final ackm ackm = new ackm();
                ((wyy)ackm).a(pf);
                if (aley3.b == 96152614) {
                    final vbs g = this.a.g;
                    create.getClass();
                    final hxy hxy = new hxy(create, 1);
                    final Context context = (Context)((atke)g.d).a();
                    context.getClass();
                    final vcy vcy = (vcy)((atke)g.a).a();
                    vcy.getClass();
                    final vbs vbs = (vbs)((atke)g.b).a();
                    vbs.getClass();
                    final aujg aujg = (aujg)((atke)g.c).a();
                    aujg.getClass();
                    final sxe sxe = new sxe(context, vcy, vbs, aujg, (ViewGroup)view, (sxb)hxy, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
                    amgg a5;
                    if (aley3.b == 96152614) {
                        a5 = (amgg)aley3.c;
                    }
                    else {
                        a5 = amgg.a;
                    }
                    ((acld)sxe).mN(ackm, (Object)a5);
                    view.addView(sxe.b);
                }
                if (aley3.b == 200043314) {
                    final hyx h = this.a.h;
                    create.getClass();
                    final pvh pvh = new pvh(create);
                    final Context context2 = (Context)((atke)h.a).a();
                    context2.getClass();
                    final aujg aujg2 = (aujg)((atke)h.d).a();
                    aujg2.getClass();
                    final acgs acgs = (acgs)((atke)h.c).a();
                    acgs.getClass();
                    final elx elx = (elx)((atke)h.b).a();
                    elx.getClass();
                    final fun fun = new fun(context2, aujg2, acgs, elx, (ViewGroup)view, pvh, null, null, null, null, null);
                    ajfl a6;
                    if (aley3.b == 200043314) {
                        a6 = (ajfl)aley3.c;
                    }
                    else {
                        a6 = ajfl.a;
                    }
                    fun.mN(ackm, (Object)a6);
                    view.addView(fun.a);
                }
                create.show();
            }
        }
        final sxx b2 = this.b;
        if (b2 != null) {
            b2.e(alfg);
        }
    }
    
    public final void f() {
        this.a.p.I();
        ((DialogFragmentController)this.a.c).n();
        final String string = this.a.d.getString(2132019101);
        final gnz a = this.a;
        final syp o = a.o;
        if (o != null) {
            o.c((CharSequence)string);
        }
        else {
            a.l.d(string);
        }
        final sxx b = this.b;
        if (b != null) {
            b.f();
        }
    }
    
    public final void sc(final CharSequence charSequence) {
        this.a.b.d((Object)new ffz());
        this.a.p.I();
        ((DialogFragmentController)this.a.c).n();
        String s;
        if (TextUtils.isEmpty(charSequence)) {
            s = this.a.d.getString(2132017993);
        }
        else {
            s = charSequence.toString();
        }
        final gnz a = this.a;
        final syp o = a.o;
        if (o != null) {
            o.c((CharSequence)s);
        }
        else {
            a.l.d(s);
        }
        final sxx b = this.b;
        if (b != null) {
            b.sc(charSequence);
        }
    }
}
