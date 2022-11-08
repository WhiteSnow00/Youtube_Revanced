// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.livechat.ui.view;

import android.view.ViewConfiguration;
import android.view.MotionEvent;
import android.support.v7.widget.LinearLayoutManager;
import com.google.android.libraries.youtube.livechat.ui.common.WrappedLinearLayoutManager;
import android.util.AttributeSet;
import android.content.Context;
import android.support.v7.widget.RecyclerView;

public class LiveChatRecyclerView extends RecyclerView
{
    private final wdl aa;
    private float ab;
    private float ac;
    
    public LiveChatRecyclerView(final Context context) {
        super(context);
        this.aC((hy)(this.aa = new wdl()));
        this.ae(null);
    }
    
    public LiveChatRecyclerView(final Context context, final AttributeSet set) {
        super(context, set);
        this.aC((hy)(this.aa = new wdl()));
        this.ae(null);
    }
    
    public LiveChatRecyclerView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.aC((hy)(this.aa = new wdl()));
        this.ae(null);
    }
    
    @Override
    public final void af(final nw nw) {
        super.af(nw);
        if (nw instanceof WrappedLinearLayoutManager) {
            ((WrappedLinearLayoutManager)nw).s(true);
            return;
        }
        if (nw instanceof LinearLayoutManager) {
            ((LinearLayoutManager)nw).s(true);
        }
    }
    
    @Override
    public final boolean onTouchEvent(final MotionEvent motionEvent) {
        final int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.ab = motionEvent.getX();
            this.ac = motionEvent.getY();
        }
        else if (actionMasked == 1) {
            final float x = motionEvent.getX();
            final float y = motionEvent.getY();
            final float n = this.ab - x;
            final float n2 = this.ac - y;
            final float n3 = (float)ViewConfiguration.get(this.getContext()).getScaledTouchSlop();
            if (n * n + n2 * n2 < n3 * n3) {
                this.performClick();
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
