// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.extensions.reel.creation.shorts.effects;

import android.widget.SeekBar$OnSeekBarChangeListener;
import android.widget.LinearLayout$LayoutParams;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.util.AttributeSet;
import android.content.Context;
import android.support.v7.widget.AppCompatSeekBar;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.research.xeno.effect.Control$FloatSetting;
import android.widget.LinearLayout;

public class ShortsIntensitySliderView extends LinearLayout
{
    public Control$FloatSetting a;
    public YouTubeTextView b;
    public AppCompatSeekBar c;
    
    public ShortsIntensitySliderView(final Context context) {
        super(context);
        this.c(context);
    }
    
    public ShortsIntensitySliderView(final Context context, final AttributeSet set) {
        super(context, set);
        this.c(context);
    }
    
    public static float a(final int n) {
        return n / 100.0f;
    }
    
    public static int b(final float n) {
        return Math.round(n * 100.0f);
    }
    
    private final void c(final Context context) {
        LayoutInflater.from(context).inflate(2131625412, (ViewGroup)this, true);
        this.b = (YouTubeTextView)this.findViewById(2131430665);
        (this.c = (AppCompatSeekBar)this.findViewById(2131431339)).setOnSeekBarChangeListener((SeekBar$OnSeekBarChangeListener)new hcb(this, this.c.getPaddingLeft() + this.c.getPaddingRight(), (LinearLayout$LayoutParams)this.b.getLayoutParams()));
    }
}
