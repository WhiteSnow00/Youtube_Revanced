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

final class gnr implements svs
{
    final /* synthetic */ gns a;
    private final svs b;
    private final vax c;
    
    public gnr(final gns a, final svs b, final vax c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final void a() {
        this.a.b.d((Object)new ffx());
        final svs b = this.b;
        if (b != null) {
            b.a();
        }
    }
    
    public final void b() {
        this.a.b.d((Object)new ffs());
        ((DialogFragmentController)this.a.c).k();
        final gns a = this.a;
        final swk o = a.o;
        if (o != null) {
            o.b();
        }
        else {
            a.l.c(2132019099);
        }
        final svs b = this.b;
        if (b != null) {
            b.b();
        }
    }
    
    public final void d(final vvk vvk) {
        final svs b = this.b;
        if (b != null) {
            b.d(vvk);
        }
    }
    
    public final void e(final aldd aldd) {
        this.a.e.n().D((wxz)new wws(aldd.g.I()));
        final int t = aqql.T(aldd.h);
        final String s = null;
        Label_0079: {
            if (t != 0) {
                if (t == 2) {
                    break Label_0079;
                }
            }
            if (aldd.f.size() > 0) {
                this.c.e((List)aldd.f, (Object)null);
            }
        }
        String d = s;
        if (aldd != null) {
            alcv alcv;
            if ((alcv = aldd.d) == null) {
                alcv = alcv.a;
            }
            apuz a;
            if (alcv.b == 62441981) {
                a = (apuz)alcv.c;
            }
            else {
                a = apuz.a;
            }
            d = s;
            if ((a.b & 0x2) != 0x0) {
                alcv alcv2;
                if ((alcv2 = aldd.d) == null) {
                    alcv2 = alcv.a;
                }
                apuz a2;
                if (alcv2.b == 62441981) {
                    a2 = (apuz)alcv2.c;
                }
                else {
                    a2 = apuz.a;
                }
                d = a2.d;
            }
        }
        if (!TextUtils.isEmpty((CharSequence)d)) {
            final hsj c = hsk.c(d);
            c.d = false;
            c.c(true);
            c.e(true);
            final hsk a3 = c.a();
            this.a.f.c(a3.b, (acgy)a3);
        }
        this.a.p.U(aldd);
        ((DialogFragmentController)this.a.c).k();
        final swk o = this.a.o;
        if (o != null) {
            o.d();
        }
        alcv alcv3;
        if ((alcv3 = aldd.d) == null) {
            alcv3 = alcv.a;
        }
        Label_0827: {
            if (alcv3 != null) {
                final int b = alcv3.b;
                if (b != 96152614) {
                    if (b != 200043314) {
                        break Label_0827;
                    }
                }
                final wwv n = this.a.e.n();
                final FrameLayout view = new FrameLayout((Context)this.a.a);
                final gns a4 = this.a;
                final AlertDialog create = ((AlertDialog$Builder)a4.i.af((Context)a4.a)).setView((View)view).create();
                final acij acij = new acij();
                ((wwx)acij).a(n);
                if (alcv3.b == 96152614) {
                    final van g = this.a.g;
                    create.getClass();
                    final hwz hwz = new hwz(create, 1);
                    final Context context = (Context)((atjj)g.d).a();
                    context.getClass();
                    final vax vax = (vax)((atjj)g.b).a();
                    vax.getClass();
                    final van van = (van)((atjj)g.c).a();
                    van.getClass();
                    final auip auip = (auip)((atjj)g.a).a();
                    auip.getClass();
                    final suz suz = new suz(context, vax, van, auip, (ViewGroup)view, (suw)hwz, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
                    amec a5;
                    if (alcv3.b == 96152614) {
                        a5 = (amec)alcv3.c;
                    }
                    else {
                        a5 = amec.a;
                    }
                    ((acja)suz).mN(acij, (Object)a5);
                    view.addView(suz.b);
                }
                final AlertDialog alertDialog = create;
                if (alcv3.b == 200043314) {
                    final hyc h = this.a.h;
                    alertDialog.getClass();
                    final qpt qpt = new qpt(alertDialog);
                    final Context context2 = (Context)((atjj)h.a).a();
                    context2.getClass();
                    final auip auip2 = (auip)((atjj)h.d).a();
                    auip2.getClass();
                    final aceo aceo = (aceo)((atjj)h.c).a();
                    aceo.getClass();
                    final elw elw = (elw)((atjj)h.b).a();
                    elw.getClass();
                    final fuf fuf = new fuf(context2, auip2, aceo, elw, (ViewGroup)view, qpt, null, null, null, null, null, null);
                    ajdh a6;
                    if (alcv3.b == 200043314) {
                        a6 = (ajdh)alcv3.c;
                    }
                    else {
                        a6 = ajdh.a;
                    }
                    fuf.mN(acij, (Object)a6);
                    view.addView(fuf.a);
                }
                alertDialog.show();
            }
        }
        final svs b2 = this.b;
        if (b2 != null) {
            b2.e(aldd);
        }
    }
    
    public final void f() {
        this.a.p.S();
        ((DialogFragmentController)this.a.c).n();
        final String string = this.a.d.getString(2132019100);
        final gns a = this.a;
        final swk o = a.o;
        if (o != null) {
            o.c((CharSequence)string);
        }
        else {
            a.l.d(string);
        }
        final svs b = this.b;
        if (b != null) {
            b.f();
        }
    }
    
    public final void rW(final CharSequence charSequence) {
        this.a.b.d((Object)new fft());
        this.a.p.S();
        ((DialogFragmentController)this.a.c).n();
        String s;
        if (TextUtils.isEmpty(charSequence)) {
            s = this.a.d.getString(2132017992);
        }
        else {
            s = charSequence.toString();
        }
        final gns a = this.a;
        final swk o = a.o;
        if (o != null) {
            o.c((CharSequence)s);
        }
        else {
            a.l.d(s);
        }
        final svs b = this.b;
        if (b != null) {
            b.rW(charSequence);
        }
    }
}
