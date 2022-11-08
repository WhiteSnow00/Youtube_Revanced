// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.extensions.reel.watch.activity;

public class ExternalApiLifecycleObserver implements tfg
{
    private final hku a;
    private final hlp b;
    private final cca c;
    private final avt d;
    
    public ExternalApiLifecycleObserver(final cca c, final avt d, final hku a, final hlp b, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.c = c;
        this.d = d;
        this.a = a;
        this.b = b;
    }
    
    public final void lW(final aum aum) {
        this.d.q((eue)this.b);
        this.c.q((euj)this.a);
    }
    
    public final void my(final aum aum) {
        this.d.p();
        this.c.q(null);
    }
}
