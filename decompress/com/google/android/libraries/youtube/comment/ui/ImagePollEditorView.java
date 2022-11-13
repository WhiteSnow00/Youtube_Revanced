// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.comment.ui;

import android.support.v7.widget.GridLayoutManager;
import android.util.AttributeSet;
import android.content.Context;
import android.support.v7.widget.RecyclerView;

public final class ImagePollEditorView extends RecyclerView
{
    public ImagePollEditorView(final Context context) {
        this(context, null);
    }
    
    public ImagePollEditorView(final Context context, final AttributeSet set) {
        super(context, set);
        this.getContext();
        final GridLayoutManager gridLayoutManager = new GridLayoutManager(2);
        gridLayoutManager.g = (mq)new svg(this);
        this.af((nw)gridLayoutManager);
        final nt e = super.E;
        if (e instanceof pc) {
            ((pc)e).x();
        }
    }
}
