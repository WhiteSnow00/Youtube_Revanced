// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.userinfo.service;

import java.util.Map;
import com.google.android.apps.youtube.embeddedplayer.service.clientinfo.service.d;
import android.content.SharedPreferences;

public final class a implements znt, vjt
{
    private final SharedPreferences a;
    private final String b;
    
    public a(final SharedPreferences a, final d d) {
        tsx.n(d.a);
        a.getClass();
        this.a = a;
        this.b = String.format("%s_%s", "visitor_id", d.a);
    }
    
    public final alub a() {
        return alub.c;
    }
    
    public final void b(final Map map, final zmi zmi) {
        final String string = this.a.getString(this.b, (String)null);
        if (string != null) {
            map.put("X-Goog-Visitor-Id", string);
        }
    }
    
    public final void c(final akjf akjf) {
        if (!akjf.c.isEmpty() && !akjf.c.equals(this.a.getString(this.b, (String)null))) {
            this.a.edit().putString(this.b, akjf.c).apply();
        }
    }
    
    public final boolean e() {
        return true;
    }
}
