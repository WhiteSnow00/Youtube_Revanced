// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.remoteloaded;

import com.google.android.apps.youtube.embeddedplayer.service.context.a;
import android.graphics.Bitmap;
import android.content.res.Resources;
import com.google.android.apps.youtube.embeddedplayer.service.jar.client.m;
import android.widget.RelativeLayout$LayoutParams;
import android.graphics.drawable.Drawable;
import android.content.res.Resources$Theme;
import android.view.View$OnTouchListener;
import android.view.View$OnClickListener;
import com.google.android.apps.youtube.embeddedplayer.service.jar.client.w;
import java.util.concurrent.atomic.AtomicReference;
import com.google.android.apps.youtube.embeddedplayer.service.errorlogging.remoteloaded.c;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.view.ViewGroup$LayoutParams;
import android.text.TextUtils;
import com.google.android.apps.youtube.embeddedplayer.service.jar.client.n;
import com.google.android.apps.youtube.embeddedplayer.service.jar.b;
import android.widget.ImageView;
import android.view.View;
import android.widget.TextView;
import android.widget.FrameLayout;
import android.content.Context;

public final class g extends aazp implements com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.g
{
    private static final String e;
    public vax a;
    public sji b;
    public Context c;
    public boolean d;
    private FrameLayout f;
    private TextView g;
    private FrameLayout h;
    private View i;
    private TextView j;
    private abci k;
    private ImageView l;
    private f m;
    private boolean n;
    private boolean o;
    private final asic p;
    
    static {
        e = akb.a().b(" · ");
    }
    
    public g(final Context c) {
        super(c);
        this.d = true;
        this.c = c;
        final e e = new e();
        e.a = null;
        e.e(false);
        e.d(false);
        e.g(false);
        e.f(false);
        e.b = null;
        e.c(0);
        e.h(0);
        e.i(0);
        e.b(0);
        e.j(0);
        this.m = e.a();
        this.p = com.google.android.apps.youtube.embeddedplayer.service.jar.b.a.c((asix)new n(this, 14), (asjc)llz.h);
    }
    
    public final void A(final CharSequence charSequence) {
        if (this.k == null) {
            return;
        }
        CharSequence string = charSequence;
        if (TextUtils.isEmpty(charSequence)) {
            string = this.f.getResources().getString(2132017451);
        }
        this.k.b(string);
        this.k.c(0);
    }
    
    public final ViewGroup$LayoutParams a() {
        return new ViewGroup$LayoutParams(-1, -1);
    }
    
    public final void m(final ashp ashp) {
        ashp.aa((asix)new n(this, 15), (asix)com.google.android.apps.youtube.embeddedplayer.service.jar.client.m.f);
    }
    
    public final aazs mj(final Context context) {
        final aazs mj = super.mj(context);
        mj.e = false;
        mj.b();
        mj.a();
        return mj;
    }
    
    public final boolean mn() {
        return this.o && super.mn();
    }
    
    public final void n(final int n, final int n2, final int n3) {
        if (!this.mn()) {
            final e a = this.m.a();
            a.i(n);
            a.b(n2);
            a.j(n3);
            this.m = a.a();
            this.Z(64);
            return;
        }
        if (n == -1) {
            this.g.setText((CharSequence)this.f.getResources().getString(2132017446));
            return;
        }
        final String j = tsx.j((long)(n / 1000));
        if (n3 >= 2) {
            this.g.setText((CharSequence)this.f.getResources().getString(2132017454, new Object[] { com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.remoteloaded.g.e, n2, n3, j }));
            return;
        }
        this.g.setText((CharSequence)this.f.getResources().getString(2132017453, new Object[] { com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.remoteloaded.g.e, j }));
    }
    
    public final void o(int n) {
        if (!this.mn()) {
            final e a = this.m.a();
            a.h(n);
            this.m = a.a();
            this.Z(32);
            return;
        }
        n = (n + 999) / 1000;
        final TextView j = this.j;
        final Resources resources = this.f.getResources();
        final Integer value = n;
        j.setText((CharSequence)resources.getString(2132019832, new Object[] { value }));
        this.j.setContentDescription((CharSequence)this.f.getResources().getQuantityString(2131886088, n, new Object[] { value }));
    }
    
    public final boolean oU() {
        return this.n;
    }
    
    public final aazu ox() {
        return super.ox();
    }
    
    public final void p(final CharSequence a) {
        final e a2 = this.m.a();
        a2.a = a;
        this.m = a2.a();
        this.Z(8);
    }
    
    public final void q(final Bitmap b) {
        final e a = this.m.a();
        a.b = b;
        this.m = a.a();
        this.Z(16);
    }
    
    public final void r(final int n) {
        final e a = this.m.a();
        a.c(n);
        this.m = a.a();
        this.Z(1);
    }
    
    public final void s(final boolean b) {
        final e a = this.m.a();
        a.d(b);
        this.m = a.a();
        this.Z(2);
    }
    
    public final void t(final abci k) {
        k.getClass();
        agot.D(this.k == null);
        (this.k = k).a((View$OnClickListener)new w(this, 4));
        this.k.c(8);
    }
    
    public final void u(final sji b) {
        this.b = b;
    }
    
    public final void v(final boolean b) {
        final e a = this.m.a();
        a.f(b);
        this.m = a.a();
        this.Z(4);
    }
    
    public final void w(final boolean b) {
        final e a = this.m.a();
        a.g(b);
        this.m = a.a();
        this.Z(2);
    }
    
    public final void x(final boolean b) {
        final e a = this.m.a();
        a.e(b);
        this.m = a.a();
        this.Z(2);
    }
    
    public final void y(final boolean n) {
        this.n = n;
        if (n) {
            this.aa();
            return;
        }
        this.X();
        final abci k = this.k;
        if (k != null) {
            k.c(8);
        }
    }
    
    public final void z(final ajpr ajpr) {
        Context context2;
        final Context context = context2 = this.c;
        if (context instanceof a) {
            context2 = ((a)context).getBaseContext();
        }
        final vax a = this.a;
        if (a != null) {
            abyx.g(context2, ajpr, a, (Object)null, (aeby)null);
            return;
        }
        afqg.r("Unable to show dismissible ads dialog: command router not present.");
    }
}
