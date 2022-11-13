// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.jar.client;

import android.os.Handler;
import com.google.android.apps.youtube.embeddedplayer.service.jar.c;

public final class x implements c
{
    final Object a;
    private final int b;
    
    public x(final aehe a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public x(final ac a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public final void a(final int n) {
        if (this.b != 0) {
            if (n != 0 && n != 5) {
                if (n == 1) {
                    final aehe aehe = (aehe)this.a;
                    final Handler h = aehe.h;
                    final com.google.android.apps.youtube.embeddedplayer.service.layoutpolicy.remoteloaded.c i = aehe.I;
                    i.getClass();
                    h.post((Runnable)new a(i, 3));
                }
                return;
            }
            ((aehe)this.a).h.post((Runnable)new a(this, 2, (byte[])null));
        }
        else {
            if (n != 0 && n != 5) {
                if (n == 1) {
                    final ac ac = (ac)this.a;
                    final Handler m = ac.m;
                    final com.google.android.apps.youtube.embeddedplayer.service.layoutpolicy.remoteloaded.c x = ac.x;
                    x.getClass();
                    m.post((Runnable)new a(x, 9));
                }
                return;
            }
            ((ac)this.a).m.post((Runnable)new a(this, 8));
        }
    }
}
