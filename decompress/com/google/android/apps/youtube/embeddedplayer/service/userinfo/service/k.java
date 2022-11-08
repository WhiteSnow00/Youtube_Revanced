// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.userinfo.service;

import android.content.SharedPreferences;

public final class k implements zki
{
    private final SharedPreferences a;
    
    public k(final SharedPreferences a) {
        a.getClass();
        this.a = a;
    }
    
    public final zkh c() {
        return zkg.a;
    }
    
    public final zkh d(final String s) {
        if ("".equals(s)) {
            return zkg.a;
        }
        return null;
    }
    
    public final String k() {
        return this.a.getString("visitor_id", (String)null);
    }
    
    public final boolean t() {
        return false;
    }
}
