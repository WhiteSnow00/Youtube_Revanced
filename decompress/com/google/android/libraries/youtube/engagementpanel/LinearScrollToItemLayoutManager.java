// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.engagementpanel;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.content.Context;
import com.google.android.libraries.youtube.rendering.ui.OverScrollLinearLayoutManager;

public final class LinearScrollToItemLayoutManager extends OverScrollLinearLayoutManager implements acph
{
    public final uuh a;
    public int b;
    private Runnable d;
    
    private LinearScrollToItemLayoutManager(final Context context) {
        this.a = new uuh(context, 0, 500);
        this.d = (Runnable)thr.d;
    }
    
    public static LinearScrollToItemLayoutManager r(final Context context) {
        final LinearScrollToItemLayoutManager linearScrollToItemLayoutManager = new LinearScrollToItemLayoutManager(context);
        linearScrollToItemLayoutManager.d = (Runnable)new upe(linearScrollToItemLayoutManager, 12);
        return linearScrollToItemLayoutManager;
    }
    
    public final void bC(final RecyclerView recyclerView, final int b) {
        recyclerView.removeCallbacks(this.d);
        if (Math.abs(b - ((LinearLayoutManager)this).K()) < 7) {
            this.bD(b);
            return;
        }
        ((nw)this).aa(b);
        this.b = b;
        recyclerView.post(this.d);
    }
    
    public final void bD(final int b) {
        this.a.n();
        final uuh a = this.a;
        ((oj)a).b = b;
        ((nw)this).bf((oj)a);
    }
    
    public final void c(final RecyclerView recyclerView, final int b, final int n) {
        final uuh uuh = new uuh(recyclerView.getContext(), n, 800);
        ((oj)uuh).b = b;
        ((nw)this).bf((oj)uuh);
    }
}
