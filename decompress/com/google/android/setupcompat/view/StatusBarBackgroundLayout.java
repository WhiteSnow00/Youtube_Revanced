// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.setupcompat.view;

import android.graphics.Canvas;
import android.view.WindowInsets;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;

public class StatusBarBackgroundLayout extends FrameLayout
{
    public Drawable a;
    private Object b;
    
    public StatusBarBackgroundLayout(final Context context) {
        super(context);
    }
    
    public StatusBarBackgroundLayout(final Context context, final AttributeSet set) {
        super(context, set);
    }
    
    public StatusBarBackgroundLayout(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
    }
    
    public final WindowInsets onApplyWindowInsets(final WindowInsets b) {
        this.b = b;
        return super.onApplyWindowInsets(b);
    }
    
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.b == null) {
            this.requestApplyInsets();
        }
    }
    
    protected final void onDraw(final Canvas canvas) {
        super.onDraw(canvas);
        final Object b = this.b;
        if (b != null) {
            final int systemWindowInsetTop = ((WindowInsets)b).getSystemWindowInsetTop();
            if (systemWindowInsetTop > 0) {
                this.a.setBounds(0, 0, this.getWidth(), systemWindowInsetTop);
                this.a.draw(canvas);
            }
        }
    }
}
