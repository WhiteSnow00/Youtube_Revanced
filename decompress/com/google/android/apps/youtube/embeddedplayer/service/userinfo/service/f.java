// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.userinfo.service;

import java.util.Map;
import com.google.android.apps.youtube.embeddedplayer.service.clientinfo.service.d;
import android.content.SharedPreferences;

public final class f implements zrl
{
    private final SharedPreferences a;
    private final zoa b;
    private String c;
    private final vbs d;
    
    public f(final SharedPreferences a, final zoa b, final d d, final vbs d2) {
        this.c = "";
        a.getClass();
        this.a = a;
        this.b = b;
        this.d = d2;
        if (d2.M()) {
            this.c = d.a;
        }
    }
    
    public final alyf a() {
        return alyf.c;
    }
    
    public final void b(final Map map, final zqa zqa) {
        String s;
        if (zqa.D()) {
            s = zqa.x();
        }
        else if (this.b.c().g()) {
            s = this.a.getString("incognito_visitor_id", (String)null);
        }
        else if (this.d.M()) {
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
