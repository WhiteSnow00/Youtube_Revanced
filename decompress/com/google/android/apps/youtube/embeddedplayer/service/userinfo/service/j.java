// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.userinfo.service;

import android.content.SharedPreferences$OnSharedPreferenceChangeListener;
import java.util.Set;
import java.util.Map;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;

final class j implements SharedPreferences
{
    private final SharedPreferences a;
    private final String b;
    private final vbs c;
    
    public j(final SharedPreferences a, final String b, final vbs c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    private final String a(final String s) {
        return k.i(s, this.b);
    }
    
    public final boolean contains(final String s) {
        return this.a.contains(this.a(s));
    }
    
    public final SharedPreferences$Editor edit() {
        return (SharedPreferences$Editor)new i(this.a.edit(), this.b, this.c);
    }
    
    public final Map getAll() {
        return this.a.getAll();
    }
    
    public final boolean getBoolean(final String s, final boolean b) {
        return this.a.getBoolean(this.a(s), b);
    }
    
    public final float getFloat(final String s, final float n) {
        return this.a.getFloat(this.a(s), n);
    }
    
    public final int getInt(final String s, final int n) {
        return this.a.getInt(this.a(s), n);
    }
    
    public final long getLong(final String s, final long n) {
        return this.a.getLong(this.a(s), n);
    }
    
    public final String getString(final String s, final String s2) {
        if (this.c.L() && s.equals("visitor_id")) {
            return this.a.getString(s, s2);
        }
        return this.a.getString(this.a(s), s2);
    }
    
    public final Set getStringSet(final String s, final Set set) {
        return this.a.getStringSet(this.a(s), set);
    }
    
    public final void registerOnSharedPreferenceChangeListener(final SharedPreferences$OnSharedPreferenceChangeListener sharedPreferences$OnSharedPreferenceChangeListener) {
        this.a.registerOnSharedPreferenceChangeListener(sharedPreferences$OnSharedPreferenceChangeListener);
    }
    
    public final void unregisterOnSharedPreferenceChangeListener(final SharedPreferences$OnSharedPreferenceChangeListener sharedPreferences$OnSharedPreferenceChangeListener) {
        this.a.unregisterOnSharedPreferenceChangeListener(sharedPreferences$OnSharedPreferenceChangeListener);
    }
}
