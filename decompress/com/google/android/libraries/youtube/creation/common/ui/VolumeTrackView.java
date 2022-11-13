// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.creation.common.ui;

import android.content.res.TypedArray;
import android.widget.SeekBar$OnSeekBarChangeListener;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.LinearLayout;

public final class VolumeTrackView extends LinearLayout
{
    public SeekBar a;
    public hak b;
    private ImageView c;
    private TextView d;
    private TextView e;
    private String f;
    private Drawable g;
    private Drawable h;
    private boolean i;
    
    public VolumeTrackView(final Context context) {
        this(context, null);
    }
    
    public VolumeTrackView(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public VolumeTrackView(final Context context, final AttributeSet set, int resourceId) {
        super(context, set, resourceId);
        LayoutInflater.from(context).inflate(2131625759, (ViewGroup)this);
        final TextView d = (TextView)this.findViewById(2131432172);
        d.getClass();
        this.d = d;
        final TextView e = (TextView)this.findViewById(2131432170);
        e.getClass();
        this.e = e;
        final String string = context.getString(2132020167);
        string.getClass();
        this.f = string;
        final ImageView c = (ImageView)this.findViewById(2131432171);
        c.getClass();
        this.c = c;
        final SeekBar a = (SeekBar)this.findViewById(2131431571);
        a.getClass();
        (this.a = a).setOnSeekBarChangeListener((SeekBar$OnSeekBarChangeListener)new hgl(this, 3));
        if (set == null) {
            return;
        }
        final TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(set, txl.d, 0, 0);
        resourceId = obtainStyledAttributes.getResourceId(0, -1);
        if (resourceId != -1) {
            this.g = context.getResources().getDrawable(resourceId);
            final ImageView c2 = this.c;
            c2.getClass();
            c2.setImageDrawable(this.g);
        }
        final int resourceId2 = obtainStyledAttributes.getResourceId(1, -1);
        if (resourceId != -1) {
            this.h = context.getResources().getDrawable(resourceId2);
        }
        this.b(obtainStyledAttributes.getString(2));
    }
    
    public final void a(final int n) {
        final TextView e = this.e;
        e.getClass();
        final String f = this.f;
        f.getClass();
        e.setText((CharSequence)String.format(f, n));
    }
    
    public final void b(final String text) {
        if (text != null) {
            final TextView d = this.d;
            d.getClass();
            d.setText((CharSequence)text);
        }
    }
    
    public final void c(final int n) {
        final boolean i = n == 0;
        if (i != this.i) {
            Drawable h = this.h;
            if (h != null) {
                final Drawable g = this.g;
                if (g != null) {
                    this.i = i;
                    final ImageView c = this.c;
                    c.getClass();
                    if (n != 0) {
                        h = g;
                    }
                    c.setImageDrawable(h);
                }
            }
        }
    }
}
