// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.bottomsheet;

import android.os.Bundle;
import android.view.View;

final class b extends akw
{
    final c a;
    
    public b(final c a) {
        this.a = a;
    }
    
    public final void c(final View view, final aom aom) {
        super.c(view, aom);
        aom.g(1048576);
        aom.v(true);
    }
    
    public final boolean i(final View view, final int n, final Bundle bundle) {
        if (n == 1048576) {
            this.a.cancel();
            return true;
        }
        return super.i(view, n, bundle);
    }
}
