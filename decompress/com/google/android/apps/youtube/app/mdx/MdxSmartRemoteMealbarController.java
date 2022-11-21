// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.mdx;

import android.content.res.Resources;
import android.view.View$OnClickListener;
import j$.util.Optional;
import android.content.SharedPreferences;
import android.app.Activity;

public class MdxSmartRemoteMealbarController implements tio, thj
{
    public final Activity a;
    public final acxl b;
    public final xje c;
    public final SharedPreferences d;
    public final xpf e;
    public final zoa f;
    public final zog g;
    public final twt h;
    private final thg i;
    
    public MdxSmartRemoteMealbarController(final Activity a, final acxl b, final xje c, final thg i, final SharedPreferences d, final xpf e, final zoa f, final zog g, final twt h) {
        a.getClass();
        this.a = a;
        this.b = b;
        this.c = c;
        this.i = i;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        Optional.empty();
    }
    
    public final tik g() {
        return tik.b;
    }
    
    public final void lW(final aup aup) {
    }
    
    public final void mp(final aup aup) {
    }
    
    public final Class[] mr(final Class clazz, final Object o, final int n) {
        Class[] array;
        if (n != -1) {
            if (n != 0) {
                final StringBuilder sb = new StringBuilder("unsupported op code: ");
                sb.append(n);
                throw new IllegalStateException(sb.toString());
            }
            final xrm xrm = (xrm)o;
            final xkr b = xrm.b();
            array = null;
            if (b != null) {
                if (this.e.g() == null) {
                    if (xrm.a() != this.d.getLong("com.google.android.libraries.youtube.mdx.smartremote.LAST_SMART_REMOTE_REQUESTED_TIME", 0L)) {
                        final icf icf = new icf(1);
                        final Resources resources = this.a.getResources();
                        if (this.f.c().g()) {
                            final acxl b2 = this.b;
                            final acxm h = b2.j().h(resources.getText(2132018601));
                            h.l = (acxb)icf;
                            final acxm d = h.a(resources.getText(2132018600), (View$OnClickListener)new hqk(this, b, 11)).c(resources.getText(2132018597), (View$OnClickListener)iat.b).d(2131232765);
                            d.k(false);
                            b2.l(d.j());
                        }
                        else {
                            final acxl b3 = this.b;
                            final acxm h2 = b3.j().h(resources.getText(2132018602));
                            h2.c = resources.getText(2132018599);
                            h2.l = (acxb)icf;
                            final acxm d2 = h2.a(resources.getText(2132018598), (View$OnClickListener)new hqk(this, b, 12)).c(resources.getText(2132018597), (View$OnClickListener)iat.c).d(2131232269);
                            d2.k(false);
                            b3.l(d2.j());
                        }
                        this.d.edit().putLong("com.google.android.libraries.youtube.mdx.smartremote.LAST_SMART_REMOTE_REQUESTED_TIME", xrm.a()).apply();
                    }
                }
            }
        }
        else {
            array = new Class[] { xrm.class };
        }
        return array;
    }
    
    public final void mx(final aup aup) {
    }
    
    public final void oO(final aup aup) {
    }
    
    public final void oT(final aup aup) {
        this.i.g((Object)this);
    }
    
    public final void oU() {
        tgj.d((tio)this);
    }
    
    public final void oX() {
        tgj.c((tio)this);
    }
    
    public final void oY(final aup aup) {
        this.i.m((Object)this);
    }
}
