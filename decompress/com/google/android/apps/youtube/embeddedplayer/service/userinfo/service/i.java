// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.userinfo.service;

import java.util.Set;
import android.content.SharedPreferences$Editor;

final class i implements SharedPreferences$Editor
{
    private final SharedPreferences$Editor a;
    private final String b;
    private final vbs c;
    
    public i(final SharedPreferences$Editor a, final String b, final vbs c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    private final String a(final String s) {
        return k.i(s, this.b);
    }
    
    public final void apply() {
        this.a.apply();
    }
    
    public final SharedPreferences$Editor clear() {
        this.a.clear();
        return (SharedPreferences$Editor)this;
    }
    
    public final boolean commit() {
        return this.a.commit();
    }
    
    public final SharedPreferences$Editor putBoolean(final String s, final boolean b) {
        this.a.putBoolean(this.a(s), b);
        return (SharedPreferences$Editor)this;
    }
    
    public final SharedPreferences$Editor putFloat(final String s, final float n) {
        this.a.putFloat(this.a(s), n);
        return (SharedPreferences$Editor)this;
    }
    
    public final SharedPreferences$Editor putInt(final String s, final int n) {
        this.a.putInt(this.a(s), n);
        return (SharedPreferences$Editor)this;
    }
    
    public final SharedPreferences$Editor putLong(final String s, final long n) {
        this.a.putLong(this.a(s), n);
        return (SharedPreferences$Editor)this;
    }
    
    public final SharedPreferences$Editor putString(final String s, final String s2) {
        if (this.c.L() && s.equals(this.a("visitor_id"))) {
            this.a.putString(s, s2);
        }
        else {
            this.a.putString(this.a(s), s2);
        }
        return (SharedPreferences$Editor)this;
    }
    
    public final SharedPreferences$Editor putStringSet(final String s, final Set set) {
        this.a.putStringSet(this.a(s), set);
        return (SharedPreferences$Editor)this;
    }
    
    public final SharedPreferences$Editor remove(final String s) {
        this.a.remove(this.a(s));
        return (SharedPreferences$Editor)this;
    }
}
