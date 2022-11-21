// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.edit.camera;

import android.view.View$OnClickListener;
import android.content.res.Resources;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.util.AttributeSet;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.FrameLayout;

public class GalleryCameraRecordButtonView extends FrameLayout
{
    private final ImageView a;
    private final View b;
    private final float c;
    
    public GalleryCameraRecordButtonView(final Context context, final AttributeSet set) {
        super(context, set);
        LayoutInflater.from(context).inflate(2131624485, (ViewGroup)this, true);
        final ImageView imageView = (ImageView)this.findViewById(2131429103);
        final ImageView a = (ImageView)this.findViewById(2131429104);
        this.a = a;
        this.b = this.findViewById(2131430793);
        final Resources resources = this.getResources();
        resources.getDimension(2131166532);
        resources.getDimension(2131166531);
        final float n = resources.getDimension(2131166535) / resources.getDimension(2131166534);
        a.setScaleX(this.c = n);
        a.setScaleY(n);
    }
    
    public final void setOnClickListener(final View$OnClickListener onClickListener) {
        this.b.setOnClickListener(onClickListener);
    }
}
