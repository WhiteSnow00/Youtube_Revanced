// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.common.ui.navigationbar;

import android.graphics.Insets;
import android.view.WindowInsets;
import android.view.View$MeasureSpec;
import android.view.WindowInsets$Type;
import android.os.Build$VERSION;
import android.graphics.Canvas;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.Paint;
import android.view.ViewGroup;

public class NavigationBarDividerLayout extends ViewGroup
{
    public final Paint a;
    public int b;
    public int c;
    public fjv d;
    private int e;
    
    public NavigationBarDividerLayout(final Context context) {
        super(context);
        this.a = new Paint();
        this.a(context, null, 2130969996, 2132083360);
    }
    
    public NavigationBarDividerLayout(final Context context, final AttributeSet set) {
        super(context, set);
        this.a = new Paint();
        this.a(context, set, 2130969996, 2132083360);
    }
    
    public NavigationBarDividerLayout(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.a = new Paint();
        this.a(context, set, n, 2132083360);
    }
    
    public NavigationBarDividerLayout(final Context context, final AttributeSet set, final int n, final int n2) {
        super(context, set, n, n2);
        this.a = new Paint();
        this.a(context, set, n, n2);
    }
    
    private final void a(final Context context, final AttributeSet set, final int n, final int n2) {
        this.setWillNotDraw(false);
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, ghh.a, n, n2);
        this.c = obtainStyledAttributes.getColor(0, 0);
        this.b = Math.max(0, obtainStyledAttributes.getDimensionPixelSize(1, 0));
        obtainStyledAttributes.recycle();
        this.a.setColor(this.c);
    }
    
    private static final int b(final int n, final int n2, final int n3) {
        if (n != 0) {
            return 1;
        }
        if (n2 != 0) {
            return 2;
        }
        if (n3 != 0) {
            return 3;
        }
        return 0;
    }
    
    protected final void onDraw(final Canvas canvas) {
        final int b = this.b;
        if (b == 0) {
            return;
        }
        final int e = this.e;
        if (e == 1) {
            canvas.drawRect(0.0f, 0.0f, (float)b, (float)this.getHeight(), this.a);
            return;
        }
        if (e == 2) {
            canvas.drawRect((float)(this.getWidth() - this.b), 0.0f, (float)this.getWidth(), (float)this.getHeight(), this.a);
            return;
        }
        if (e != 3) {
            return;
        }
        canvas.drawRect(0.0f, (float)(this.getHeight() - this.b), (float)this.getWidth(), (float)this.getHeight(), this.a);
    }
    
    protected final void onLayout(final boolean b, int measuredWidth, int measuredHeight, int n, int i) {
        measuredWidth = this.getMeasuredWidth();
        measuredHeight = this.getMeasuredHeight();
        n = this.e;
        if (n != 1) {
            if (n != 2) {
                if (n == 3) {
                    measuredHeight -= this.b;
                }
            }
            else {
                measuredWidth -= this.b;
            }
            n = 0;
        }
        else {
            n = this.b;
        }
        int childCount;
        for (childCount = this.getChildCount(), i = 0; i < childCount; ++i) {
            this.getChildAt(i).layout(n, 0, measuredWidth, measuredHeight);
        }
    }
    
    protected final void onMeasure(int e, int n) {
        final fjv d = this.d;
        if (d != null && d.j().c()) {
            this.e = 0;
        }
        else if (Build$VERSION.SDK_INT >= 30) {
            final WindowInsets rootWindowInsets = this.getRootWindowInsets();
            if (rootWindowInsets.isVisible(WindowInsets$Type.navigationBars())) {
                final Insets insets = rootWindowInsets.getInsets(WindowInsets$Type.navigationBars());
                this.e = b(insets.left, insets.right, insets.bottom);
            }
            else {
                this.e = 0;
            }
        }
        else if ((this.getWindowSystemUiVisibility() & 0x2) == 0x0) {
            final WindowInsets rootWindowInsets2 = this.getRootWindowInsets();
            this.e = b(rootWindowInsets2.getStableInsetLeft(), rootWindowInsets2.getStableInsetRight(), rootWindowInsets2.getStableInsetBottom());
        }
        else {
            this.e = 0;
        }
        final int size = View$MeasureSpec.getSize(e);
        final int size2 = View$MeasureSpec.getSize(n);
        e = this.e;
        Label_0204: {
            if (e != 1 && e != 2) {
                if (e == 3) {
                    n = size2 - this.b;
                    e = size;
                    break Label_0204;
                }
                e = size;
            }
            else {
                e = size - this.b;
            }
            n = size2;
        }
        this.setMeasuredDimension(size, size2);
        this.measureChildren(View$MeasureSpec.makeMeasureSpec(e, 1073741824), View$MeasureSpec.makeMeasureSpec(n, 1073741824));
    }
}
