// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.relatedvideos.remoteloaded;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.graphics.Rect;

final class a extends hy
{
    public a() {
    }
    
    public final void b(final Rect rect, final View view, final RecyclerView recyclerView, final ok ok) {
        final int c = recyclerView.c(view);
        final int dimensionPixelSize = view.getResources().getDimensionPixelSize(2131169356);
        rect.left = dimensionPixelSize;
        rect.right = dimensionPixelSize;
        if (c < 0) {
            return;
        }
        if (c <= 0) {
            rect.left = view.getResources().getDimensionPixelSize(2131169355);
        }
        final nq m = recyclerView.m;
        if (m != null && c >= m.a() - 1) {
            rect.right = view.getResources().getDimensionPixelSize(2131169355);
        }
    }
}
