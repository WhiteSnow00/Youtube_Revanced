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

public final class accy implements ohr
{
    public final Activity a;
    public int b;
    public AlertDialog c;
    private final arhr d;
    private final arhr e;
    private final arhr f;
    private final arhr g;
    private asib h;
    private final uyi i;
    private final aeim j;
    private final aeby k;
    
    public accy(final Context context, final arhr d, final arhr e, final arhr f, final arhr g, final aeim j, final uyi i, final aeby k, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
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
        final asib h = this.h;
        if (h != null) {
            h.dispose();
            this.h = null;
        }
    }
    
    public final void b(final aqdk aqdk, final ohq ohq) {
        final asib h = this.h;
        if (h != null) {
            h.dispose();
        }
        final asib h2 = new asib();
        this.h = h2;
        this.b = this.a.getRequestedOrientation();
        final ort ort = (ort)this.d.a();
        final int i = ohq.i;
        if (i != -1) {
            this.a.setRequestedOrientation(i);
        }
        final int n = ohq.n;
        abyy abyy;
        if (n != 2 && n != 3) {
            abyy = this.k.af((Context)this.a);
        }
        else {
            abyy = this.k.ag((Context)this.a, 2132084283);
        }
        final String a = ohq.a;
        if (!TextUtils.isEmpty((CharSequence)a)) {
            ((AlertDialog$Builder)abyy).setTitle((CharSequence)a);
        }
        if (!TextUtils.isEmpty((CharSequence)ohq.b)) {
            ((AlertDialog$Builder)abyy).setMessage((CharSequence)ohq.b);
        }
        final orr g = ohq.g;
        final boolean empty = TextUtils.isEmpty((CharSequence)ohq.c);
        final wwv wwv = null;
        if (!empty) {
            final CommandOuterClass$Command e = ohq.e;
            final String c = ohq.c;
            Object o;
            if (e == null) {
                o = null;
            }
            else {
                o = new gio(ort, e, g, 15);
            }
            ((AlertDialog$Builder)abyy).setPositiveButton((CharSequence)c, (DialogInterface$OnClickListener)o);
        }
        final CommandOuterClass$Command f = ohq.f;
        if (!TextUtils.isEmpty((CharSequence)ohq.d)) {
            final String d = ohq.d;
            Object o2;
            if (f == null) {
                o2 = null;
            }
            else {
                o2 = new gio(ort, f, g, 16);
            }
            ((AlertDialog$Builder)abyy).setNegativeButton((CharSequence)d, (DialogInterface$OnClickListener)o2);
        }
        if (f != null) {
            ((AlertDialog$Builder)abyy).setOnCancelListener((DialogInterface$OnCancelListener)new accw(ort, f, g));
        }
        if ((aqdk.b & 0x1) != 0x0) {
            final dvt dvt = new dvt((Context)this.a);
            final dsw l = dvt.l;
            final agyc m = ohq.m;
            if (m != null) {
                final wwv wwv2 = (wwv)this.g.a();
                if (!m.H()) {
                    wwv2.b(wya.b(46220), (aioe)null, (alff)null);
                    wwv2.D((wxz)new wws(m));
                }
            }
            Object k = ohq.k;
            if (!(k instanceof wwv)) {
                k = wwv;
                if (ohq.m != null) {
                    k = this.g.a();
                }
            }
            wwv n2;
            if ((n2 = (wwv)k) == null) {
                n2 = ((wwu)this.f.a()).n();
            }
            final olq olq = (olq)this.e.a();
            final ory a2 = orz.a();
            a2.a = (View)dvt;
            a2.i(false);
            a2.h(afcr.r((Object)aaja.B((Object)((agxl)aqdk).toByteArray())));
            a2.g(this.j.L(n2));
            final dtf b = ComponentTree.b(l, olq.a(l, a2.a(), ((agxl)aqdk).toByteArray(), acbf.I(n2), h2));
            b.d = false;
            dvt.B(b.a());
            ((AlertDialog$Builder)abyy).setView((View)dvt);
        }
        final DialogInterface$OnKeyListener h3 = ohq.h;
        if (h3 != null) {
            ((AlertDialog$Builder)abyy).setOnKeyListener(h3);
        }
        if (ohq.l != null) {
            ((AlertDialog$Builder)abyy).setCancelable(Boolean.TRUE.equals(ohq.l));
        }
        final ohp j = ohq.j;
        ((AlertDialog$Builder)abyy).setOnDismissListener((DialogInterface$OnDismissListener)new accx(this, h2, j, ohq));
        if (this.a.isDestroyed()) {
            return;
        }
        final AlertDialog create = ((AlertDialog$Builder)abyy).create();
        create.show();
        final Window window = create.getWindow();
        if (window != null) {
            window.clearFlags(131072);
            window.setSoftInputMode(16);
            if (this.i.f(45381539L)) {
                final Drawable a3 = agw.a(create.getContext(), 2131231024);
                a3.getClass();
                window.setBackgroundDrawable(a3);
            }
        }
        if (ohq.n == 2 && window != null) {
            window.getDecorView().setSystemUiVisibility(5894);
        }
        if (j != null) {
            j.e();
        }
        this.c = create;
    }
}
