// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.edit.camera;

import android.view.animation.Animation;
import android.view.View;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.animation.AnimationUtils;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.ImageView;
import android.widget.FrameLayout;

public class CameraFocusOverlay extends FrameLayout
{
    final ImageView a;
    final ImageView b;
    
    public CameraFocusOverlay(final Context context, final AttributeSet set) {
        super(context, set);
        LayoutInflater.from(context).inflate(2131624118, (ViewGroup)this, true);
        this.a = (ImageView)this.findViewById(2131427973);
        this.b = (ImageView)this.findViewById(2131427972);
    }
    
    public final void a(final int n, final int n2) {
        int n3 = n;
        if (this.getResources().getConfiguration().getLayoutDirection() == 1) {
            n3 = this.getWidth() - n;
        }
        final Animation loadAnimation = AnimationUtils.loadAnimation(this.getContext(), 2130772041);
        this.b.setAnimation(loadAnimation);
        final Animation loadAnimation2 = AnimationUtils.loadAnimation(this.getContext(), 2130772042);
        this.a.setAnimation(loadAnimation2);
        final ImageView a = this.a;
        tqf.aF((View)a, tqf.an(new tvv[] { tqf.ax(n3 - a.getWidth() / 2), tqf.aB(n2 - this.a.getHeight() / 2) }), (Class)ViewGroup$MarginLayoutParams.class);
        final ImageView b = this.b;
        tqf.aF((View)b, tqf.an(new tvv[] { tqf.ax(n3 - b.getWidth() / 2), tqf.aB(n2 - this.b.getHeight() / 2) }), (Class)ViewGroup$MarginLayoutParams.class);
        loadAnimation2.start();
        loadAnimation.start();
    }
}
