// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.youtube.api.jar.client;

import android.content.Context;

public final class a implements ttg
{
    public final Object a;
    private final int b;
    
    public a(final RemoteEmbeddedPlayer a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public a(final spv a, final int b, final byte[] array) {
        this.b = b;
        this.a = a;
    }
    
    public final void a(final Object o) {
        if (this.b != 0) {
            final Object a = this.a;
            final Throwable t = (Throwable)o;
            tpe.x((Context)((spv)a).c, 2132018008, 0);
            return;
        }
        final Object a2 = this.a;
        final Boolean b = (Boolean)o;
        final tqf k = ((RemoteEmbeddedPlayer)a2).j.k;
        if (k != null && b != null) {
            k.j((boolean)b);
        }
    }
}
