// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.ads.ui;

import android.view.ViewParent;
import android.widget.TextView;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.util.Log;
import android.widget.FrameLayout;
import android.view.View$OnClickListener;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.content.Context;
import android.support.v7.widget.AppCompatEditText;

public class EditTextWithHelpIcon extends AppCompatEditText
{
    public smo a;
    private Context b;
    private View c;
    private Drawable d;
    private ImageView e;
    
    public EditTextWithHelpIcon(final Context b) {
        super(b);
        this.b = b;
    }
    
    public EditTextWithHelpIcon(final Context b, final AttributeSet set) {
        super(b, set);
        this.b = b;
    }
    
    public EditTextWithHelpIcon(final Context b, final AttributeSet set, final int n) {
        super(b, set, n);
        this.b = b;
    }
    
    private final void c() {
        final ImageView e = this.e;
        if (e == null) {
            return;
        }
        tpe.v((View)e, this.d != null);
        this.e.setImageDrawable(this.d);
        if (this.a != null) {
            this.e.setOnClickListener((View$OnClickListener)new sjg(this, 3));
        }
    }
    
    public final void b(Drawable d, final smo a) {
        if (d != null) {
            d.mutate();
            aiq.f(d, this.getCurrentHintTextColor());
            d.setBounds(0, 0, d.getIntrinsicWidth(), d.getIntrinsicHeight());
        }
        else {
            d = null;
        }
        this.d = d;
        this.a = a;
        this.c();
    }
    
    protected final void onMeasure(final int n, final int n2) {
        Label_0157: {
            if (this.c == null) {
                final ViewParent parent = this.getParent();
                if (!(parent instanceof FrameLayout)) {
                    Log.e("EditTextWithHelpIcon", "Can't init image view. Must be a direct child of FrameLayout.");
                    break Label_0157;
                }
                final ViewGroup viewGroup = (ViewGroup)parent;
                final View inflate = LayoutInflater.from(this.b).inflate(2131625630, viewGroup, false);
                this.c = inflate;
                this.e = (ImageView)inflate.findViewById(2131429231);
                viewGroup.addView(this.c);
                this.c();
            }
            final int measuredWidth = this.c.getMeasuredWidth();
            final ColorDrawable colorDrawable = new ColorDrawable();
            colorDrawable.setBounds(0, 0, measuredWidth, 1);
            final Drawable[] h = apt.h((TextView)this);
            apt.d((TextView)this, h[0], h[1], (Drawable)colorDrawable, h[3]);
            if (this.getMinimumHeight() <= 0) {
                this.setMinimumHeight(anb.g((View)this.e));
            }
        }
        super.onMeasure(n, n2);
    }
}
