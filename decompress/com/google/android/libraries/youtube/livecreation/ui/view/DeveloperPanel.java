// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.livecreation.ui.view;

import android.view.View;
import android.widget.SeekBar$OnSeekBarChangeListener;
import android.widget.TextView;
import android.widget.CompoundButton$OnCheckedChangeListener;
import android.widget.LinearLayout;
import android.view.View$OnClickListener;
import android.widget.ImageButton;
import android.view.ViewGroup;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.SeekBar;
import android.support.v7.widget.SwitchCompat;
import android.widget.RelativeLayout;

public class DeveloperPanel extends RelativeLayout
{
    public SwitchCompat a;
    public Runnable b;
    public SeekBar c;
    public SeekBar d;
    private SwitchCompat e;
    
    public DeveloperPanel(final Context context) {
        super(context);
        this.b(context);
    }
    
    public DeveloperPanel(final Context context, final AttributeSet set) {
        super(context, set);
        this.b(context);
    }
    
    public DeveloperPanel(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.b(context);
    }
    
    private final void b(final Context context) {
        inflate(context, 2131624621, (ViewGroup)this);
        this.setSaveEnabled(true);
        ((ImageButton)this.findViewById(2131428702)).setOnClickListener((View$OnClickListener)new woy(this, 19));
        final LinearLayout linearLayout = (LinearLayout)this.findViewById(2131428861);
        final LinearLayout linearLayout2 = (LinearLayout)this.findViewById(2131429087);
        final LinearLayout linearLayout3 = (LinearLayout)this.findViewById(2131427810);
        (this.a = (SwitchCompat)this.findViewById(2131431715)).setOnCheckedChangeListener((CompoundButton$OnCheckedChangeListener)new wuw(1));
        (this.e = (SwitchCompat)this.findViewById(2131428862)).setOnCheckedChangeListener((CompoundButton$OnCheckedChangeListener)new wuw(0));
        (this.c = (SeekBar)this.findViewById(2131429088)).setOnSeekBarChangeListener((SeekBar$OnSeekBarChangeListener)new wux(this, (TextView)this.findViewById(2131429089), 1));
        (this.d = (SeekBar)this.findViewById(2131427811)).setOnSeekBarChangeListener((SeekBar$OnSeekBarChangeListener)new wux(this, (TextView)this.findViewById(2131427812), 0));
        this.a();
    }
    
    private static final int c(final int n) {
        return (n - 50000) / 1000 / 50;
    }
    
    private static final int d() {
        adkp.H(true);
        return 1;
    }
    
    public final void a() {
        this.a.setEnabled(false);
        if (this.a.isChecked()) {
            if (this.b == null) {
                this.post(this.b = (Runnable)new wup(this, 4));
            }
        }
        else {
            final Runnable b = this.b;
            if (b != null) {
                this.removeCallbacks(b);
                this.b = null;
            }
        }
        this.e.setEnabled(false);
        this.e.setChecked(false);
        this.c.setEnabled(false);
        final SeekBar c = this.c;
        d();
        c.setMax(1);
        final SeekBar c2 = this.c;
        d();
        c2.setProgress(1);
        this.d.setEnabled(false);
        this.d.setMax(c(2500000));
        this.d.setProgress(c(50000));
    }
    
    protected final void onVisibilityChanged(final View view, final int n) {
        super.onVisibilityChanged(view, n);
        if (n == 0) {
            this.a();
        }
    }
}
