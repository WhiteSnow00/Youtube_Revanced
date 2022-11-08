// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.mdx;

import android.content.res.Resources;
import android.view.View$OnClickListener;
import j$.util.Optional;
import android.content.SharedPreferences;
import android.app.Activity;

public class MdxSmartRemoteMealbarController implements tfh, tec
{
    public final Activity a;
    public final actu b;
    public final xfw c;
    public final SharedPreferences d;
    public final xlv e;
    public final zki f;
    public final zko g;
    public final ttn h;
    private final tdz i;
    
    public MdxSmartRemoteMealbarController(final Activity a, final actu b, final xfw c, final tdz i, final SharedPreferences d, final xlv e, final zki f, final zko g, final ttn h) {
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
    
    public final Class[] ms(final Class clazz, final Object o, final int n) {
        Class[] array;
        if (n != -1) {
            if (n != 0) {
                final StringBuilder sb = new StringBuilder("unsupported op code: ");
                sb.append(n);
                throw new IllegalStateException(sb.toString());
            }
            final xod xod = (xod)o;
            final xhh b = xod.b();
            array = null;
            if (b != null) {
                if (this.e.g() == null) {
                    if (xod.a() != this.d.getLong("com.google.android.libraries.youtube.mdx.smartremote.LAST_SMART_REMOTE_REQUESTED_TIME", 0L)) {
                        final ibb ibb = new ibb(1);
                        final Resources resources = this.a.getResources();
                        if (this.f.c().g()) {
                            final actu b2 = this.b;
                            final actv h = b2.j().h(resources.getText(2132018598));
                            h.l = (actk)ibb;
                            final actv d = h.a(resources.getText(2132018597), (View$OnClickListener)new hpi(this, b, 10)).c(resources.getText(2132018594), (View$OnClickListener)hzo.b).d(2131232765);
                            d.k(false);
                            b2.l(d.j());
                        }
                        else {
                            final actu b3 = this.b;
                            final actv h2 = b3.j().h(resources.getText(2132018599));
                            h2.c = resources.getText(2132018596);
                            h2.l = (actk)ibb;
                            final actv d2 = h2.a(resources.getText(2132018595), (View$OnClickListener)new hpi(this, b, 11)).c(resources.getText(2132018594), (View$OnClickListener)hzo.c).d(2131232269);
                            d2.k(false);
                            b3.l(d2.j());
                        }
                        this.d.edit().putLong("com.google.android.libraries.youtube.mdx.smartremote.LAST_SMART_REMOTE_REQUESTED_TIME", xod.a()).apply();
                    }
                }
            }
        }
        else {
            array = new Class[] { xod.class };
        }
        return array;
    }
    
    public final void oS(final aum aum) {
        this.i.g((Object)this);
    }
    
    public final void oW(final aum aum) {
        this.i.m((Object)this);
    }
}
