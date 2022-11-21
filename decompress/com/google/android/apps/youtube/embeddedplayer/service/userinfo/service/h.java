// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.userinfo.service;

import com.google.android.apps.youtube.embeddedplayer.service.clientinfo.service.d;
import android.content.SharedPreferences;

public final class h implements vnf
{
    private final SharedPreferences a;
    private final zoa b;
    private String c;
    private final vbs d;
    
    public h(final SharedPreferences a, final zoa b, final d d, final vbs d2) {
        this.c = "";
        this.a = a;
        this.b = b;
        this.d = d2;
        if (d2.M()) {
            this.c = d.a;
        }
    }
    
    public final void c(final aknj aknj) {
        if ((aknj.b & 0x2) != 0x0 && !aknj.c.isEmpty()) {
            final String c = aknj.c;
            if (this.b.c().g()) {
                if (!c.equals(this.a.getString("incognito_visitor_id", (String)null))) {
                    this.a.edit().putString("incognito_visitor_id", c).apply();
                }
            }
            else if (this.d.M()) {
                final String value = String.valueOf(this.c);
                final SharedPreferences a = this.a;
                final String concat = value.concat("_visitor_id");
                if (!c.equals(a.getString(concat, (String)null))) {
                    this.a.edit().putString(concat, c).apply();
                }
            }
            else if (!c.equals(this.a.getString("visitor_id", (String)null))) {
                this.a.edit().putString("visitor_id", c).apply();
            }
        }
    }
    
    public final void d(final vmz vmz, final aknj aknj, final znz znz) {
        vqf.d((vnf)this, aknj);
    }
    
    public final boolean f(final vmz vmz) {
        return !((vls)vmz).o() && (!((vls)vmz).r.equals("visitor_id") || this.b.c().g());
    }
}
