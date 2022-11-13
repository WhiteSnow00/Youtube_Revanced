// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.relatedvideos.remoteloaded;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import java.util.concurrent.atomic.AtomicBoolean;
import android.support.v7.widget.GridLayoutManager;

final class b extends iw
{
    private final GridLayoutManager a;
    private final AtomicBoolean b;
    
    public b(final GridLayoutManager a, final AtomicBoolean b) {
        this.a = a;
        this.b = b;
    }
    
    public final void b(final RecyclerView recyclerView, int i) {
        if (i != 0) {
            this.b.set(true);
            return;
        }
        int m;
        d d;
        for (i = ((LinearLayoutManager)this.a).K(), m = ((LinearLayoutManager)this.a).M(), i = Math.max(0, i); i <= m; ++i) {
            d = (d)recyclerView.i(i, false);
            if (d != null) {
                d.F();
            }
        }
    }
}
