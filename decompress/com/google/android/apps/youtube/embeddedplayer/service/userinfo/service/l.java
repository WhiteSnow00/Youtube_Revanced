// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.userinfo.service;

import android.content.SharedPreferences;

public final class l implements zoa
{
    private final SharedPreferences a;
    
    public l(final SharedPreferences a) {
        a.getClass();
        this.a = a;
    }
    
    public final znz c() {
        return zny.a;
    }
    
    public final znz d(final String s) {
        if ("".equals(s)) {
            return zny.a;
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
