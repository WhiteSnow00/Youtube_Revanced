// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.mdx;

import android.content.res.Resources;
import android.view.View$OnClickListener;
import j$.util.Optional;
import android.content.SharedPreferences;
import android.app.Activity;

public class MdxSmartRemoteMealbarController implements thl, tgg
{
    public final Activity a;
    public final acvy b;
    public final xhv c;
    public final SharedPreferences d;
    public final xnt e;
    public final zmf f;
    public final zml g;
    public final tvr h;
    private final tgd i;
    
    public MdxSmartRemoteMealbarController(final Activity a, final acvy b, final xhv c, final tgd i, final SharedPreferences d, final xnt e, final zmf f, final zml g, final tvr h) {
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
    
    public final thh g() {
        return thh.b;
    }
    
    public final void lW(final aun aun) {
    }
    
    public final void mM(final aun aun) {
    }
    
    public final void mq(final aun aun) {
    }
    
    public final Class[] ms(final Class clazz, final Object o, final int n) {
        Class[] array;
        if (n != -1) {
            if (n != 0) {
                final StringBuilder sb = new StringBuilder("unsupported op code: ");
                sb.append(n);
                throw new IllegalStateException(sb.toString());
            }
            final xqb xqb = (xqb)o;
            final xjg b = xqb.b();
            array = null;
            if (b != null) {
                if (this.e.g() == null) {
                    if (xqb.a() != this.d.getLong("com.google.android.libraries.youtube.mdx.smartremote.LAST_SMART_REMOTE_REQUESTED_TIME", 0L)) {
                        final ibw ibw = new ibw(1);
                        final Resources resources = this.a.getResources();
                        if (this.f.c().g()) {
                            final acvy b2 = this.b;
                            final acvz h = b2.j().h(resources.getText(2132018599));
                            h.l = (acvo)ibw;
                            final acvz d = h.a(resources.getText(2132018598), (View$OnClickListener)new hqd(this, b, 11)).c(resources.getText(2132018595), (View$OnClickListener)ial.b).d(2131232765);
                            d.k(false);
                            b2.l(d.j());
                        }
                        else {
                            final acvy b3 = this.b;
                            final acvz h2 = b3.j().h(resources.getText(2132018600));
                            h2.c = resources.getText(2132018597);
                            h2.l = (acvo)ibw;
                            final acvz d2 = h2.a(resources.getText(2132018596), (View$OnClickListener)new hqd(this, b, 12)).c(resources.getText(2132018595), (View$OnClickListener)ial.c).d(2131232269);
                            d2.k(false);
                            b3.l(d2.j());
                        }
                        this.d.edit().putLong("com.google.android.libraries.youtube.mdx.smartremote.LAST_SMART_REMOTE_REQUESTED_TIME", xqb.a()).apply();
                    }
                }
            }
        }
        else {
            array = new Class[] { xqb.class };
        }
        return array;
    }
    
    public final void my(final aun aun) {
    }
    
    public final void oS(final aun aun) {
        this.i.g((Object)this);
    }
    
    public final void oT() {
        tfg.c((thl)this);
    }
    
    public final void oW() {
        tfg.b((thl)this);
    }
    
    public final void oX(final aun aun) {
        this.i.m((Object)this);
    }
}
