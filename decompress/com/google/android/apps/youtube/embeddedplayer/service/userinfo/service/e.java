// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.userinfo.service;

import java.util.Map;
import com.google.android.apps.youtube.embeddedplayer.service.clientinfo.service.d;
import android.content.SharedPreferences;

public final class e implements znt
{
    private final SharedPreferences a;
    private final zki b;
    private String c;
    private final uyi d;
    
    public e(final SharedPreferences a, final zki b, final d d, final uyi d2) {
        this.c = "";
        a.getClass();
        this.a = a;
        this.b = b;
        this.d = d2;
        if (d2.L()) {
            this.c = d.a;
        }
    }
    
    public final alub a() {
        return alub.c;
    }
    
    public final void b(final Map map, final zmi zmi) {
        String s;
        if (zmi.D()) {
            s = zmi.x();
        }
        else if (this.b.c().g()) {
            s = this.a.getString("incognito_visitor_id", (String)null);
        }
        else if (this.d.L()) {
            s = this.a.getString(String.valueOf(this.c).concat("_visitor_id"), (String)null);
        }
        else {
            s = this.a.getString("visitor_id", (String)null);
        }
        if (s != null) {
            map.put("X-Goog-Visitor-Id", s);
        }
    }
    
    public final boolean e() {
        return true;
    }
}
