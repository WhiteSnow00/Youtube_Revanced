// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.creation.videoeffects.fragment;

import android.util.AttributeSet;
import android.content.Context;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

public class StickerCatalogRecyclerView extends RecyclerView
{
    public final GridLayoutManager aa;
    
    public StickerCatalogRecyclerView(final Context context, final AttributeSet set) {
        super(context, set);
        this.getContext();
        this.af((nx)(this.aa = new GridLayoutManager(4)));
        this.ae((nu)null);
    }
}
