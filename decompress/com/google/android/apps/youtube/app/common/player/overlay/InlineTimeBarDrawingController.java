// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.common.player.overlay;

import java.util.concurrent.Callable;
import java.util.ArrayList;
import android.graphics.Rect;
import java.util.List;

public class InlineTimeBarDrawingController implements thl
{
    public static final afft a;
    public final fph b;
    public final List c;
    private final vai d;
    private final msr e;
    
    static {
        a = afft.t((Object)fqa.a, (Object)fqa.b);
    }
    
    public InlineTimeBarDrawingController(final fph b, final vai d, final msr e, final byte[] array, final byte[] array2) {
        this.b = b;
        final fpf a = b.a;
        final List f = b.f;
        this.d = d;
        this.e = e;
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        this.c = new ArrayList();
    }
    
    public final thh g() {
        return thh.b;
    }
    
    public final void lW(final aun aun) {
    }
    
    public final void mM(final aun aun) {
    }
    
    public final void mq(final aun aun) {
    }
    
    public final void my(final aun aun) {
    }
    
    public final void oS(final aun aun) {
        if (this.d.cH()) {
            this.e.Q((Callable)new csi(this, 13));
        }
    }
    
    public final void oT() {
        tfg.c((thl)this);
    }
    
    public final void oW() {
        tfg.b((thl)this);
    }
    
    public final void oX(final aun aun) {
    }
}
