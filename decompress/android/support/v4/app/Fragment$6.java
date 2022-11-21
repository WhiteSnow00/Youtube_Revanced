// 
// Decompiled by Procyon v0.6.0
// 

package android.support.v4.app;

import android.view.View;

public class Fragment$6 implements aun
{
    final br a;
    
    public Fragment$6(final br a) {
        this.a = a;
    }
    
    public final void a(final aup aup, final aui aui) {
        if (aui == aui.ON_STOP) {
            final View o = this.a.O;
            if (o != null) {
                o.cancelPendingInputEvents();
            }
        }
    }
}
