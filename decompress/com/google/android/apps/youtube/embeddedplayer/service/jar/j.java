// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.jar;

public enum j
{
    a("VALID", 0, 0), 
    b("STACK_UNCLEAN", 1, 0), 
    c("OVERLAPPING", 2, 2132019155), 
    d("OBSCURED", 3, 2132019992);
    
    private static final j[] f;
    public final int e;
    
    private j(final String s, final int n, final int e) {
        this.e = e;
    }
    
    public final boolean a() {
        return this.equals(j.a);
    }
}
