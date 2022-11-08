// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.watch.nextgenwatch.flexy;

import android.content.Context;

public class FoldableStatesMonitor implements tfh
{
    public final kxm a;
    private final asgt b;
    private final asib c;
    private final bx d;
    
    public FoldableStatesMonitor(final Context context, final kct kct, final asgt asgt, final kxm a, final byte[] array, final byte[] array2) {
        final bx d = new bx(context, (byte[])null);
        this.d = d;
        this.a = a;
        this.b = asgt.e((aujo)((asgt)kct.b).p(), (aujo)asgt.L((asjc)kus.r).p(), (asit)new gcn(d, 13, (byte[])null)).p().V().ax().tw();
        this.c = new asib();
    }
    
    public final void oS(final aum aum) {
        this.c.c(this.b.am((asix)new kxr(this, 1), (asix)kul.j));
    }
    
    public final void oW(final aum aum) {
        this.c.b();
    }
}
