// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.player.subtitles.model;

public final class AutoValue_SubtitleTrack extends SubtitleTrack
{
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final String f;
    public final boolean g;
    public final int h;
    public final String i;
    public final String j;
    public final String k;
    public final CharSequence l;
    public final boolean m;
    
    public AutoValue_SubtitleTrack(final String a, final String b, final String c, final String d, final int e, final String f, final boolean g, final int h, final String i, final String j, final String k, final CharSequence l, final boolean m) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
        this.m = m;
    }
    
    public final int a() {
        return this.h;
    }
    
    @Deprecated
    public final int b() {
        return this.e;
    }
    
    public final abth c() {
        return new abth(this);
    }
    
    public final CharSequence d() {
        return this.l;
    }
    
    public final String e() {
        return this.a;
    }
    
    @Deprecated
    public final String f() {
        return this.b;
    }
    
    public final String g() {
        return this.i;
    }
    
    public final String h() {
        return this.f;
    }
    
    @Deprecated
    public final String i() {
        return this.c;
    }
    
    public final String j() {
        return this.k;
    }
    
    public final String k() {
        return this.d;
    }
    
    public final String l() {
        return this.j;
    }
    
    public final boolean m() {
        return this.g;
    }
    
    public final boolean n() {
        return this.m;
    }
}
