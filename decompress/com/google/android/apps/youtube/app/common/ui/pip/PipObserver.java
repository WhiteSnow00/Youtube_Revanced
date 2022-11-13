// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.common.ui.pip;

import java.util.concurrent.atomic.AtomicReference;
import android.app.Activity;

public class PipObserver implements aua
{
    public final atjm a;
    public final atjz b;
    public asir c;
    
    public PipObserver(final Activity activity, final atjz b) {
        gik gik;
        if (activity.isInPictureInPictureMode()) {
            gik = gik.a;
        }
        else {
            gik = gik.c;
        }
        this.a = atjm.aW((Object)gik);
        this.b = b;
    }
    
    public final void lW(final aun aun) {
        if (this.a.aX() == gik.b) {
            this.a.tu((Object)gik.c);
        }
    }
    
    public final void mM(final aun aun) {
        this.a.tx();
        final asir c = this.c;
        if (c != null) {
            asjv.b((AtomicReference)c);
        }
    }
    
    public final void mq(final aun aun) {
    }
    
    public final void my(final aun aun) {
    }
    
    public final void oS(final aun aun) {
    }
    
    public final void oX(final aun aun) {
    }
}
