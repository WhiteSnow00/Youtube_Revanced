import android.app.AlertDialog$Builder;
import android.graphics.drawable.Drawable;
import android.view.Window;
import android.content.DialogInterface$OnKeyListener;
import com.google.protos.youtube.elements.CommandOuterClass$Command;
import android.content.DialogInterface$OnDismissListener;
import android.view.View;
import com.facebook.litho.ComponentTree;
import android.content.DialogInterface$OnCancelListener;
import android.content.DialogInterface$OnClickListener;
import android.text.TextUtils;
import android.content.Context;
import android.app.AlertDialog;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acgl implements ojp
{
    public final Activity a;
    public int b;
    public AlertDialog c;
    private final arna d;
    private final arna e;
    private final arna f;
    private final arna g;
    private aslm h;
    private final vbs i;
    private final aheu j;
    private final aefs k;
    
    public acgl(final Context context, final arna d, final arna e, final arna f, final arna g, final aheu j, final vbs i, final aefs k, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6) {
        this.a = (Activity)context;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.j = j;
        this.i = i;
        this.k = k;
    }
    
    public final void a() {
        final AlertDialog c = this.c;
        if (c != null) {
            c.dismiss();
            this.c = null;
        }
        final aslm h = this.h;
        if (h != null) {
            h.dispose();
            this.h = null;
        }
    }
    
    public final void b(final aqiq aqiq, final ojo ojo) {
        final aslm h = this.h;
        if (h != null) {
            h.dispose();
        }
        final aslm h2 = new aslm();
        this.h = h2;
        this.b = this.a.getRequestedOrientation();
        final otu otu = (otu)this.d.a();
        final int i = ojo.i;
        if (i != -1) {
            this.a.setRequestedOrientation(i);
        }
        final int n = ojo.n;
        accl accl;
        if (n != 2 && n != 3) {
            accl = this.k.V((Context)this.a);
        }
        else {
            accl = this.k.W((Context)this.a, 2132084287);
        }
        final String a = ojo.a;
        if (!TextUtils.isEmpty((CharSequence)a)) {
            ((AlertDialog$Builder)accl).setTitle((CharSequence)a);
        }
        if (!TextUtils.isEmpty((CharSequence)ojo.b)) {
            ((AlertDialog$Builder)accl).setMessage((CharSequence)ojo.b);
        }
        final ots g = ojo.g;
        final boolean empty = TextUtils.isEmpty((CharSequence)ojo.c);
        final xab xab = null;
        if (!empty) {
            final CommandOuterClass$Command e = ojo.e;
            final String c = ojo.c;
            Object o;
            if (e == null) {
                o = null;
            }
            else {
                o = new gja(otu, e, g, 15);
            }
            ((AlertDialog$Builder)accl).setPositiveButton((CharSequence)c, (DialogInterface$OnClickListener)o);
        }
        final CommandOuterClass$Command f = ojo.f;
        if (!TextUtils.isEmpty((CharSequence)ojo.d)) {
            final String d = ojo.d;
            Object o2;
            if (f == null) {
                o2 = null;
            }
            else {
                o2 = new gja(otu, f, g, 16);
            }
            ((AlertDialog$Builder)accl).setNegativeButton((CharSequence)d, (DialogInterface$OnClickListener)o2);
        }
        if (f != null) {
            ((AlertDialog$Builder)accl).setOnCancelListener((DialogInterface$OnCancelListener)new acgj(otu, f, g));
        }
        if ((aqiq.b & 0x1) != 0x0) {
            final dvx dvx = new dvx((Context)this.a);
            final dta l = dvx.l;
            final ahbt m = ojo.m;
            if (m != null) {
                final xab xab2 = (xab)this.g.a();
                if (!m.H()) {
                    xab2.b(xbf.b(46220), (aisc)null, (alji)null);
                    xab2.D((xbe)new wzy(m));
                }
            }
            Object k = ojo.k;
            if (!(k instanceof xab)) {
                k = xab;
                if (ojo.m != null) {
                    k = this.g.a();
                }
            }
            xab pe;
            if ((pe = (xab)k) == null) {
                pe = ((xaa)this.f.a()).pE();
            }
            final onm onm = (onm)this.e.a();
            final otz a2 = oua.a();
            a2.a = (View)dvx;
            a2.i(false);
            a2.h(afgh.r(aamr.A(aqiq.toByteArray())));
            a2.g((ovh)this.j.T(pe));
            final dtj b = ComponentTree.b(l, onm.a(l, a2.a(), aqiq.toByteArray(), acet.I(pe), h2));
            b.d = false;
            dvx.B(b.a());
            ((AlertDialog$Builder)accl).setView((View)dvx);
        }
        final DialogInterface$OnKeyListener h3 = ojo.h;
        if (h3 != null) {
            ((AlertDialog$Builder)accl).setOnKeyListener(h3);
        }
        if (ojo.l != null) {
            ((AlertDialog$Builder)accl).setCancelable(Boolean.TRUE.equals(ojo.l));
        }
        final ojn j = ojo.j;
        ((AlertDialog$Builder)accl).setOnDismissListener((DialogInterface$OnDismissListener)new acgk(this, h2, j, ojo));
        if (this.a.isDestroyed()) {
            return;
        }
        final AlertDialog create = ((AlertDialog$Builder)accl).create();
        create.show();
        final Window window = create.getWindow();
        if (window != null) {
            window.clearFlags(131072);
            window.setSoftInputMode(16);
            if (this.i.aU()) {
                final Drawable a3 = agy.a(create.getContext(), 2131231024);
                a3.getClass();
                window.setBackgroundDrawable(a3);
            }
        }
        if (ojo.n == 2 && window != null) {
            window.getDecorView().setSystemUiVisibility(5894);
        }
        if (j != null) {
            j.e();
        }
        this.c = create;
    }
}
