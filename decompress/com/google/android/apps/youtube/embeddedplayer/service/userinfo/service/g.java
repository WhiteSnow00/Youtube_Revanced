// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.userinfo.service;

import com.google.android.apps.youtube.embeddedplayer.service.clientinfo.service.d;
import android.content.SharedPreferences;

public final class g implements vjt
{
    private final SharedPreferences a;
    private final zki b;
    private String c;
    private final uyi d;
    
    public g(final SharedPreferences a, final zki b, final d d, final uyi d2) {
        this.c = "";
        this.a = a;
        this.b = b;
        this.d = d2;
        if (d2.L()) {
            this.c = d.a;
        }
    }
    
    public final void c(final akjf akjf) {
        if ((akjf.b & 0x2) != 0x0 && !akjf.c.isEmpty()) {
            final String c = akjf.c;
            if (this.b.c().g()) {
                if (!c.equals(this.a.getString("incognito_visitor_id", (String)null))) {
                    this.a.edit().putString("incognito_visitor_id", c).apply();
                }
            }
            else if (this.d.L()) {
                final String concat = String.valueOf(this.c).concat("_visitor_id");
                if (!c.equals(this.a.getString(concat, (String)null))) {
                    this.a.edit().putString(concat, c).apply();
                }
            }
            else if (!c.equals(this.a.getString("visitor_id", (String)null))) {
                this.a.edit().putString("visitor_id", c).apply();
            }
        }
    }
    
    public final boolean f(final vjn vjn) {
        return !((vii)vjn).o() && (!((vii)vjn).r.equals("visitor_id") || this.b.c().g());
    }
}
