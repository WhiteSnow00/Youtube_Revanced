// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.jar.client;

public final class m implements asjm
{
    public final boolean a;
    private final int b;
    
    public m(final boolean a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void a(final Object o) {
        if (this.b != 0) {
            final boolean a = this.a;
            final t t = (t)o;
            if (!t.o()) {
                t.g.z(t, a);
            }
            return;
        }
        ((t)o).l = kzr.l(this.a);
    }
}
