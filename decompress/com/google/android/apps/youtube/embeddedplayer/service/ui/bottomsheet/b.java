// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.bottomsheet;

import android.view.View;

public final class b extends advd
{
    final d a;
    
    public b(final d a) {
        this.a = a;
    }
    
    @Override
    public final void a(final View view, final float n) {
        final d a = this.a;
        if (a.c) {
            a.a(0.6f);
            return;
        }
        if (n >= 0.0f) {
            a.a(n * 0.6f);
        }
    }
    
    @Override
    public final void b(final View view, final int n) {
        int n2 = n;
        Label_0023: {
            if (n != 5) {
                if ((n2 = n) != 4) {
                    break Label_0023;
                }
                n2 = 4;
            }
            this.a.cancel();
        }
        if (n2 == 3) {
            this.a.c = false;
        }
    }
}
