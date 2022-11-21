// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.jar;

import com.google.android.apps.youtube.embeddedplayer.service.jar.client.s;

final class e implements aeip
{
    final g a;
    
    public e(final g a) {
        this.a = a;
    }
    
    @Override
    public final String a(final String s) {
        final g a = this.a;
        if (a.c != null) {
            final s d = a.d;
            if (d != null) {
                return d.d(s);
            }
        }
        final s b = a.b;
        if (b != null) {
            return b.d(s);
        }
        return "";
    }
}
