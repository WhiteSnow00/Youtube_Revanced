// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.edit.audioswap.ui;

import android.animation.ArgbEvaluator;
import android.view.ViewGroup$MarginLayoutParams;
import java.util.Set;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.util.AttributeSet;
import android.content.Context;
import com.google.android.libraries.video.editablevideo.EditableVideo;
import android.widget.SeekBar;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import android.widget.SeekBar$OnSeekBarChangeListener;
import android.widget.FrameLayout;

public class AudioCrossFadeView extends FrameLayout implements SeekBar$OnSeekBarChangeListener, rad
{
    public final YouTubeTextView a;
    public final YouTubeTextView b;
    public final SeekBar c;
    public EditableVideo d;
    public int e;
    
    public AudioCrossFadeView(final Context context, final AttributeSet set) {
        super(context, set);
        this.e = 1308622847;
        final View inflate = LayoutInflater.from(context).inflate(2131624043, (ViewGroup)this, true);
        this.a = (YouTubeTextView)inflate.findViewById(2131427674);
        this.b = (YouTubeTextView)inflate.findViewById(2131427673);
        (this.c = (SeekBar)inflate.findViewById(2131427675)).setOnSeekBarChangeListener((SeekBar$OnSeekBarChangeListener)this);
    }
    
    public final void a(final EditableVideo editableVideo, final Set set) {
    }
    
    public final void b(final EditableVideo editableVideo, final int n) {
        this.c.setProgress(Math.round(this.d.e() * 100.0f));
    }
    
    public final void c(final EditableVideo editableVideo, final Set set) {
    }
    
    public final void d(final View view, final int n, final int n2) {
        tqf.aF(view, tqf.ay(n, 0, n2, 0), (Class)ViewGroup$MarginLayoutParams.class);
    }
    
    public final void onProgressChanged(final SeekBar seekBar, int n, final boolean b) {
        final float n2 = (float)seekBar.getProgress();
        final EditableVideo d = this.d;
        final float n3 = n2 / 100.0f;
        if (d != null) {
            d.z(n3);
        }
        final ArgbEvaluator argbEvaluator = new ArgbEvaluator();
        n = this.e;
        final Integer value = -1;
        n = (int)argbEvaluator.evaluate(1.0f - n3, (Object)n, (Object)value);
        this.a.setTextColor(n);
        n = (int)argbEvaluator.evaluate(n3, (Object)this.e, (Object)value);
        this.b.setTextColor(n);
    }
    
    public final void onStartTrackingTouch(final SeekBar seekBar) {
    }
    
    public final void onStopTrackingTouch(final SeekBar seekBar) {
    }
}
