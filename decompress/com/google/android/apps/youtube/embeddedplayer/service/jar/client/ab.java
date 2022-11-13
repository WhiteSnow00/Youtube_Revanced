// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.jar.client;

import com.google.android.apps.youtube.embeddedplayer.service.layoutpolicy.remoteloaded.h;

public final class ab implements h
{
    final Object a;
    private final int b;
    
    public ab(final aehe a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public ab(final ac a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void a() {
        if (this.b != 0) {
            ((aehe)this.a).aA(6);
            return;
        }
        ((ac)this.a).a();
    }
    
    @Override
    public final void b() {
        if (this.b != 0) {
            ((aehe)this.a).aA(7);
            return;
        }
        ((ac)this.a).a();
    }
    
    @Override
    public final void c() {
        if (this.b != 0) {
            ((aehe)this.a).aA(5);
            return;
        }
        ((ac)this.a).a();
    }
}
