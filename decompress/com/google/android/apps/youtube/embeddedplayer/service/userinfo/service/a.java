// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.userinfo.service;

import java.util.Map;
import com.google.android.apps.youtube.embeddedplayer.service.clientinfo.service.d;
import android.content.SharedPreferences;

public final class a implements zrl, vnf
{
    private final SharedPreferences a;
    private final String b;
    
    public a(final SharedPreferences a, final d d) {
        twd.n(d.a);
        a.getClass();
        this.a = a;
        this.b = String.format("%s_%s", "visitor_id", d.a);
    }
    
    public final alyf a() {
        return alyf.c;
    }
    
    public final void b(final Map map, final zqa zqa) {
        final String string = this.a.getString(this.b, (String)null);
        if (string != null) {
            map.put("X-Goog-Visitor-Id", string);
        }
    }
    
    public final void c(final aknj aknj) {
        if (!aknj.c.isEmpty() && !aknj.c.equals(this.a.getString(this.b, (String)null))) {
            this.a.edit().putString(this.b, aknj.c).apply();
        }
    }
    
    public final void d(final vmz vmz, final aknj aknj, final znz znz) {
        vqf.d((vnf)this, aknj);
    }
    
    public final boolean e() {
        return true;
    }
    
    public final boolean f(final vmz vmz) {
        return true;
    }
}
