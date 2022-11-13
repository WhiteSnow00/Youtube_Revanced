import android.view.Window;
import android.view.ViewGroup;
import android.view.View;
import android.app.Activity;
import android.view.LayoutInflater;
import android.os.Bundle;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Looper;
import android.app.Dialog;
import android.os.Handler;
import android.content.DialogInterface$OnDismissListener;
import android.content.DialogInterface$OnCancelListener;

// 
// Decompiled by Procyon v0.6.0
// 

public class bi extends br implements DialogInterface$OnCancelListener, DialogInterface$OnDismissListener
{
    private Handler Zg;
    private final Runnable Zh;
    private final DialogInterface$OnCancelListener Zi;
    private int Zj;
    private int Zk;
    private boolean Zl;
    private final auz Zm;
    private boolean Zr;
    private boolean Zs;
    public final DialogInterface$OnDismissListener a;
    private boolean ai;
    private boolean am;
    public int b;
    public boolean c;
    public Dialog d;
    public boolean e;
    
    public bi() {
        this.Zh = (Runnable)new be(this, 0);
        this.Zi = (DialogInterface$OnCancelListener)new bf(this);
        this.a = (DialogInterface$OnDismissListener)new bg(this);
        this.Zj = 0;
        this.b = 0;
        this.ai = true;
        this.c = true;
        this.Zk = -1;
        this.Zm = (auz)new ta(this, 1);
        this.e = false;
    }
    
    private final void qk(final boolean b, final boolean b2) {
        if (this.Zr) {
            return;
        }
        this.Zr = true;
        this.Zs = false;
        final Dialog d = this.d;
        if (d != null) {
            d.setOnDismissListener((DialogInterface$OnDismissListener)null);
            this.d.dismiss();
            if (!b2) {
                if (Looper.myLooper() == this.Zg.getLooper()) {
                    this.onDismiss((DialogInterface)this.d);
                }
                else {
                    this.Zg.post(this.Zh);
                }
            }
        }
        this.am = true;
        if (this.Zk >= 0) {
            this.G().ae(this.Zk, b);
            this.Zk = -1;
            return;
        }
        final ct i = this.G().i();
        i.z();
        i.n((br)this);
        if (b) {
            i.k();
            return;
        }
        i.a();
    }
    
    public void dismiss() {
        this.qk(false, false);
    }
    
    public void lP(final Context context) {
        super.lP(context);
        super.Z.h(this.Zm);
        if (!this.Zs) {
            this.Zr = false;
        }
    }
    
    public final void nb(final boolean b) {
        this.ai = b;
        final Dialog d = this.d;
        if (d != null) {
            d.setCancelable(b);
        }
    }
    
    public final void nc(final int zj, final int b) {
        if (cl.W(2)) {
            new StringBuilder("Setting style and theme for DialogFragment ").append(this);
        }
        if ((this.Zj = zj) == 2) {
            this.b = 16973913;
        }
        if (b != 0) {
            this.b = b;
        }
    }
    
    public LayoutInflater nj(final Bundle bundle) {
        final LayoutInflater aa = this.aA();
        if (!this.c || this.Zl) {
            if (cl.W(2)) {
                new StringBuilder("getting layout inflater for DialogFragment ").append(this);
            }
            return aa;
        }
        if (!this.e) {
            try {
                this.Zl = true;
                final Dialog pn = this.pN(bundle);
                this.d = pn;
                if (this.c) {
                    this.rI(pn, this.Zj);
                    final Context nt = this.nT();
                    if (nt instanceof Activity) {
                        this.d.setOwnerActivity((Activity)nt);
                    }
                    this.d.setCancelable(this.ai);
                    this.d.setOnCancelListener(this.Zi);
                    this.d.setOnDismissListener(this.a);
                    this.e = true;
                }
                else {
                    this.d = null;
                }
            }
            finally {
                this.Zl = false;
            }
        }
        if (cl.W(2)) {
            new StringBuilder("get layout inflater for DialogFragment ").append(this);
        }
        final Dialog d = this.d;
        if (d != null) {
            return aa.cloneInContext(d.getContext());
        }
        return aa;
    }
    
    public final bw nl() {
        return (bw)new bh(this, super.nl());
    }
    
    public void nm() {
        super.nm();
        final Dialog d = this.d;
        if (d != null) {
            this.am = true;
            d.setOnDismissListener((DialogInterface$OnDismissListener)null);
            this.d.dismiss();
            if (!this.Zr) {
                this.onDismiss((DialogInterface)this.d);
            }
            this.d = null;
            this.e = false;
        }
    }
    
    public void nn() {
        super.nn();
        if (!this.Zs && !this.Zr) {
            this.Zr = true;
        }
        super.Z.l(this.Zm);
    }
    
    public void no() {
        super.no();
        final Dialog d = this.d;
        if (d != null) {
            this.am = false;
            d.show();
            final View decorView = this.d.getWindow().getDecorView();
            di.f(decorView, (aun)this);
            di.e(decorView, (avv)this);
            cax.c(decorView, (cgk)this);
        }
    }
    
    public void np() {
        super.np();
        final Dialog d = this.d;
        if (d != null) {
            d.hide();
        }
    }
    
    public final void nq(Bundle bundle) {
        super.nq(bundle);
        if (this.d != null && bundle != null) {
            bundle = bundle.getBundle("android:savedDialogState");
            if (bundle != null) {
                this.d.onRestoreInstanceState(bundle);
            }
        }
    }
    
    public final void nr(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        super.nr(layoutInflater, viewGroup, bundle);
        if (this.O == null && this.d != null && bundle != null) {
            final Bundle bundle2 = bundle.getBundle("android:savedDialogState");
            if (bundle2 != null) {
                this.d.onRestoreInstanceState(bundle2);
            }
        }
    }
    
    public void onCancel(final DialogInterface dialogInterface) {
    }
    
    public void onDismiss(final DialogInterface dialogInterface) {
        if (!this.am) {
            if (cl.W(3)) {
                new StringBuilder("onDismiss called for DialogFragment ").append(this);
            }
            this.qk(true, true);
        }
    }
    
    public void oq(final Bundle bundle) {
        super.oq(bundle);
        this.Zg = new Handler();
        this.c = (this.E == 0);
        if (bundle != null) {
            this.Zj = bundle.getInt("android:style", 0);
            this.b = bundle.getInt("android:theme", 0);
            this.ai = bundle.getBoolean("android:cancelable", true);
            this.c = bundle.getBoolean("android:showsDialog", this.c);
            this.Zk = bundle.getInt("android:backStackId", -1);
        }
    }
    
    public Dialog pN(final Bundle bundle) {
        if (cl.W(3)) {
            new StringBuilder("onCreateDialog called for DialogFragment ").append(this);
        }
        return (Dialog)new qu(this.nY(), this.b);
    }
    
    public void pO() {
        this.qk(true, false);
    }
    
    public void pP(final Bundle bundle) {
        final Dialog d = this.d;
        if (d != null) {
            final Bundle onSaveInstanceState = d.onSaveInstanceState();
            onSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        final int zj = this.Zj;
        if (zj != 0) {
            bundle.putInt("android:style", zj);
        }
        final int b = this.b;
        if (b != 0) {
            bundle.putInt("android:theme", b);
        }
        if (!this.ai) {
            bundle.putBoolean("android:cancelable", false);
        }
        if (!this.c) {
            bundle.putBoolean("android:showsDialog", false);
        }
        final int zk = this.Zk;
        if (zk != -1) {
            bundle.putInt("android:backStackId", zk);
        }
    }
    
    public final void r(final cl cl, final String s) {
        this.Zr = false;
        this.Zs = true;
        final ct i = cl.i();
        i.z();
        i.s((br)this, s);
        i.d();
    }
    
    public void rI(final Dialog dialog, final int n) {
        if (n != 1 && n != 2) {
            if (n != 3) {
                return;
            }
            final Window window = dialog.getWindow();
            if (window != null) {
                window.addFlags(24);
            }
        }
        dialog.requestWindowFeature(1);
    }
    
    public final void rJ(final cl cl, final String s) {
        this.Zr = false;
        this.Zs = true;
        final ct i = cl.i();
        i.z();
        i.s((br)this, s);
        i.a();
    }
    
    public final void s(final ct ct, final String s) {
        this.Zr = false;
        this.Zs = true;
        ct.s((br)this, s);
        this.am = false;
        this.Zk = ct.a();
    }
}
