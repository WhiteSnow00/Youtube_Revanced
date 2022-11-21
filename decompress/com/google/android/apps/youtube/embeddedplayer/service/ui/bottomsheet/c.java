// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.bottomsheet;

import android.os.Bundle;
import android.view.View;

final class c extends akx
{
    final d a;
    
    public c(final d a) {
        this.a = a;
    }
    
    public final void c(final View view, final aon aon) {
        super.c(view, aon);
        aon.h(1048576);
        aon.w(true);
    }
    
    public final boolean i(final View view, final int n, final Bundle bundle) {
        if (n == 1048576) {
            this.a.cancel();
            return true;
        }
        return super.i(view, n, bundle);
    }
}
