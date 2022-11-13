import android.content.DialogInterface$OnCancelListener;
import android.content.DialogInterface$OnClickListener;
import android.app.AlertDialog$Builder;
import java.util.concurrent.Future;
import java.lang.ref.WeakReference;
import com.google.common.util.concurrent.ListenableFuture;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public class abnl implements abmf, vws
{
    private final Context a;
    protected ListenableFuture b;
    public boolean c;
    public abni d;
    private final abjj e;
    private WeakReference f;
    
    public abnl(final Context a, final abjj e) {
        this.b = afwm.m((Object)false);
        this.a = a;
        this.e = e;
    }
    
    private final Boolean e() {
        Boolean value = false;
        if (!this.b.isDone()) {
            this.b = afwm.m((Object)value);
        }
        else {
            value = (Boolean)teu.h((Future)this.b, (Object)value);
        }
        return value;
    }
    
    public static abkh h(final akwz akwz, final String s) {
        final int c = akwz.c;
        int cg;
        if ((cg = aqsx.cG(c)) == 0) {
            cg = 1;
        }
        boolean b = false;
        int n3 = 0;
        Label_0097: {
            int n;
            if (cg == 2) {
                n = 2;
            }
            else if (cg != 3 && cg != 7) {
                if (aakv.q(akwz)) {
                    final int cg2 = aqsx.cG(c);
                    int n2 = 5;
                    if (cg2 != 0) {
                        if (cg2 == 5) {
                            n2 = 6;
                        }
                    }
                    b = true;
                    n3 = n2;
                    break Label_0097;
                }
                n = 1;
            }
            else {
                n = 3;
            }
            b = false;
            n3 = n;
        }
        akwx akwx;
        if ((akwx = akwz.f) == null) {
            akwx = akwx.a;
        }
        int n4;
        if (akwx.b == 109608350) {
            akwx akwx2;
            if ((akwx2 = akwz.f) == null) {
                akwx2 = akwx.a;
            }
            ance a;
            if (akwx2.b == 109608350) {
                a = (ance)akwx2.c;
            }
            else {
                a = ance.a;
            }
            if (!a.b) {
                n4 = 3;
            }
            else {
                n4 = 2;
            }
        }
        else {
            n4 = 1;
        }
        final String d = akwz.d;
        akwy akwy;
        if ((akwy = akwz.g) == null) {
            akwy = akwy.a;
        }
        anew a2;
        if (akwy.b == 58356580) {
            akwy akwy2;
            if ((akwy2 = akwz.g) == null) {
                akwy2 = akwy.a;
            }
            if (akwy2.b == 58356580) {
                a2 = (anew)akwy2.c;
            }
            else {
                a2 = anew.a;
            }
        }
        else {
            a2 = null;
        }
        return new abkh(n3, b, n4, d, (Throwable)null, s, (String)null, a2);
    }
    
    protected void b(final akwz akwz, final tcc tcc, final String s) {
        abnm.a(tcc, h(akwz, s));
    }
    
    protected void c(final akwz akwz, final tcc tcc, final String s) {
        final abni d = this.d;
        if (d == null) {
            abnm.a(tcc, h(akwz, s));
            return;
        }
        d.c = akwz.e;
        d.d = akwz.d;
        d.e = aakv.l(akwz);
        final abnh onCancelListener = new abnh(d, new abnk(this, akwz, tcc, s), d.b, d.e);
        final aeea g = d.g;
        Object al;
        if (g != null && g.ao()) {
            al = d.g.al((Context)d.a);
        }
        else {
            al = new AlertDialog$Builder((Context)d.a);
        }
        (d.f = ((AlertDialog$Builder)al).setTitle((CharSequence)d.c).setMessage((CharSequence)d.d).setPositiveButton(2132017776, (DialogInterface$OnClickListener)onCancelListener).setNegativeButton(2132017611, (DialogInterface$OnClickListener)onCancelListener).setOnCancelListener((DialogInterface$OnCancelListener)onCancelListener).create()).show();
        this.l((abnn)d);
    }
    
    protected void d() {
    }
    
    protected void f() {
    }
    
    public final abkh i(final String s) {
        return new abkh(1, this.a.getString(2132020017), s);
    }
    
    public final abnn j() {
        final WeakReference f = this.f;
        if (f != null) {
            return (abnn)f.get();
        }
        return null;
    }
    
    public final void k(final akwz akwz, final tcc tcc, final String s) {
        if (akwz == null) {
            abnm.a(tcc, this.i(s));
            return;
        }
        if (!aakv.o(akwz) && !aakv.n(akwz)) {
            if (aakv.q(akwz)) {
                final abnn j = this.j();
                if (j != null) {
                    j.b();
                }
                this.c(akwz, tcc, s);
                return;
            }
            abnm.a(tcc, h(akwz, s));
        }
        else {
            final abjv g = this.e.g();
            if (!aakv.m(akwz) && g == abjv.d) {
                abnm.a(tcc, new abkh(13, this.a.getString(2132017514), s));
                return;
            }
            tcc.b((Object)null, (Object)abnm.a);
            this.d();
        }
    }
    
    protected final void l(final abnn abnn) {
        this.f = new WeakReference((T)abnn);
    }
    
    public final void oM(final vwv vwv) {
        vwv.I = this.e();
        vwv.H = this.c;
    }
    
    public void sG(final abmi abmi) {
        final boolean booleanValue = this.e();
        abmi.g = booleanValue;
        abmi.f = this.c;
        abmi.w((abmh)new abnj(this, booleanValue));
    }
}
