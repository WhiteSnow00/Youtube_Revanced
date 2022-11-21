// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.playlist.ui;

import android.view.View$MeasureSpec;
import android.graphics.Canvas;
import android.content.res.TypedArray;
import android.content.res.Resources;
import android.view.View;
import android.graphics.Paint$Style;
import android.view.ViewGroup$LayoutParams;
import android.widget.ImageView$ScaleType;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.Paint;
import android.graphics.Rect;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import android.widget.ImageView;
import android.view.ViewGroup;

public class PlaylistThumbnailView extends ViewGroup
{
    public int a;
    public ImageView b;
    public YouTubeTextView c;
    protected trc d;
    private Rect e;
    private Rect f;
    private Paint g;
    private float h;
    private float i;
    private float j;
    private int k;
    private int l;
    private int m;
    private int n;
    private int o;
    private boolean p;
    private boolean q;
    private boolean r;
    private Drawable s;
    private Rect t;
    private int u;
    
    public PlaylistThumbnailView(final Context context) {
        super(context);
        this.g(context, null, 0, 0);
    }
    
    public PlaylistThumbnailView(final Context context, final AttributeSet set) {
        super(context, set);
        this.g(context, set, 0, 0);
    }
    
    public PlaylistThumbnailView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.g(context, set, n, 0);
    }
    
    public PlaylistThumbnailView(final Context context, final AttributeSet set, final int n, final int n2) {
        super(context, set, n, n2);
        this.g(context, set, n, n2);
    }
    
    private final void g(final Context context, final AttributeSet set, int k, final int n) {
        this.e = new Rect();
        this.f = new Rect();
        (this.b = new ImageView(context)).setScaleType(ImageView$ScaleType.CENTER_CROP);
        this.b.setLayoutParams(new ViewGroup$LayoutParams(-2, -1));
        (this.c = new YouTubeTextView(context)).setTypeface(acbx.a.a(context));
        this.c.setGravity(81);
        (this.g = new Paint()).setStyle(Paint$Style.FILL);
        this.p = true;
        this.d = new trc(context);
        final Resources resources = this.getResources();
        this.h = resources.getFraction(2131361819, 1, 1);
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, jgr.a, k, n);
        this.q = obtainStyledAttributes.getBoolean(5, false);
        this.i = obtainStyledAttributes.getDimension(2, resources.getDimension(2131167015));
        this.j = resources.getDimension(2131166504);
        this.c.setTextSize(0, this.i);
        k = tqf.cr(context, 2130970882);
        this.o = k;
        this.c.setTextColor(k);
        k = obtainStyledAttributes.getResourceId(0, 0);
        this.k = k;
        this.l = 2131233059;
        this.m = 2131233058;
        this.b(k);
        this.n = resources.getColor(obtainStyledAttributes.getResourceId(3, 2131102285));
        this.a = resources.getColor(obtainStyledAttributes.getResourceId(4, 2131102286));
        obtainStyledAttributes.recycle();
        this.u = 1;
        this.t = new Rect();
        this.addView((View)this.b);
        this.addView((View)this.c);
    }
    
    private final void h(final Drawable drawable, final Rect rect, final int n) {
        if (rect.width() != 0) {
            if (rect.height() != 0) {
                final int intrinsicWidth = drawable.getIntrinsicWidth();
                final int intrinsicHeight = drawable.getIntrinsicHeight();
                final int width = rect.width();
                final int height = rect.height();
                final int u = this.u;
                int n10 = 0;
                int n11 = 0;
                Label_0185: {
                    int n2 = 0;
                    int n3 = 0;
                    Label_0177: {
                        if (u != 4 && u != 6) {
                            if (intrinsicWidth <= width) {
                                n2 = intrinsicWidth;
                                if ((n3 = intrinsicHeight) <= height) {
                                    break Label_0177;
                                }
                            }
                            final float n4 = (float)intrinsicWidth;
                            final float n5 = (float)width;
                            final float n6 = (float)intrinsicHeight;
                            final float n7 = (float)height;
                            final float n8 = n4 / n5;
                            final float n9 = n6 / n7;
                            if (n8 > n9) {
                                n10 = (int)(n5 / n8);
                            }
                            else {
                                n10 = (int)(n7 / n9);
                            }
                            n11 = n10;
                            break Label_0185;
                        }
                        n2 = (int)this.getResources().getDimension(2131166503);
                        n3 = (int)this.getResources().getDimension(2131166503);
                    }
                    n11 = n3;
                    n10 = n2;
                }
                ali.a(n, n10, n11, rect, this.t, anc.f((View)this));
                drawable.setBounds(this.t.left, this.t.top, this.t.right, this.t.bottom);
            }
        }
    }
    
    private final boolean i() {
        return anc.f((View)this) == 1;
    }
    
    public final void a(final boolean r) {
        this.r = r;
        final YouTubeTextView c = this.c;
        float n;
        if (r) {
            n = this.j;
        }
        else {
            n = this.i;
        }
        c.setTextSize(0, n);
        if (this.u == 3) {
            this.b(this.m);
        }
        else {
            int n2;
            if (r) {
                n2 = this.l;
            }
            else {
                n2 = this.k;
            }
            this.b(n2);
        }
        this.requestLayout();
    }
    
    public final void b(int o) {
        if (o != 0) {
            this.h(this.s = agy.a(this.getContext(), o), this.e, 49);
            o = this.o;
            this.s = this.d.b(this.s, o);
        }
        this.invalidate();
    }
    
    public final void c(final int n) {
        this.c.setTextSize(0, this.getResources().getDimension(n));
    }
    
    public final void d(final boolean q) {
        if (this.q != q) {
            this.q = q;
            this.requestLayout();
        }
    }
    
    protected final boolean drawChild(final Canvas canvas, final View view, final long n) {
        final boolean drawChild = super.drawChild(canvas, view, n);
        if (this.p && view == this.b) {
            int color;
            if (this.q) {
                color = this.n;
            }
            else {
                color = this.a;
            }
            this.g.setColor(color);
            canvas.drawRect(this.f, this.g);
            final Drawable s = this.s;
            if (s != null) {
                s.draw(canvas);
            }
        }
        return drawChild;
    }
    
    public final void e(final boolean p) {
        if (this.p != p) {
            this.p = p;
            tqf.v((View)this.c, p);
            this.invalidate();
        }
    }
    
    public final void f(int u) {
        this.u = u;
        if (--u == 1) {
            this.a(true);
            return;
        }
        if (u == 2) {
            this.removeView((View)this.c);
            this.a(true);
            return;
        }
        if (u == 3) {
            this.a = this.getResources().getColor(2131102367);
            this.removeView((View)this.c);
            this.a(true);
            return;
        }
        if (u != 5) {
            this.a(false);
            return;
        }
        this.removeView((View)this.c);
    }
    
    protected final void onLayout(final boolean b, int i, int n, int n2, int childCount) {
        n2 -= i;
        n = childCount - n;
        if (this.r) {
            i = (n2 + n2) / 3;
        }
        else {
            i = n;
        }
        if (this.i()) {
            i = n2 - i;
            this.c.layout(0, 0, i, n / 2);
        }
        else {
            this.c.layout(i, 0, n2, n / 2);
            i = 0;
        }
        if (this.q) {
            this.b.layout(i, 0, n + i, n);
        }
        else {
            this.b.layout(0, 0, n2, n);
        }
        final Drawable s = this.s;
        if (s != null) {
            if (this.u == 3) {
                this.h(s, this.e, 17);
            }
            else {
                this.h(s, this.e, 49);
            }
        }
        childCount = this.getChildCount();
        if (childCount > 2) {
            View child;
            for (i = 0; i < childCount; ++i) {
                child = this.getChildAt(i);
                if (child != this.b && child != this.c) {
                    child.layout(0, 0, n2, n);
                }
            }
        }
    }
    
    protected final void onMeasure(int size, int measureSpec) {
        int size2;
        int measureSpec2;
        if (View$MeasureSpec.getMode(size) != 1073741824 && View$MeasureSpec.getMode(measureSpec) == 1073741824) {
            size = View$MeasureSpec.getSize(measureSpec);
            size2 = (int)(size * this.h);
            measureSpec2 = View$MeasureSpec.makeMeasureSpec(size2, 1073741824);
        }
        else {
            size2 = View$MeasureSpec.getSize(size);
            final int n = (int)(size2 / this.h);
            measureSpec = View$MeasureSpec.makeMeasureSpec(n, 1073741824);
            measureSpec2 = size;
            size = n;
        }
        if (size2 > 0 && size > 0) {
            if (this.q) {
                this.b.measure(measureSpec, measureSpec);
            }
            else {
                this.b.measure(measureSpec2, measureSpec);
            }
            int n2;
            if (this.r) {
                n2 = (size2 + size2) / 3;
            }
            else {
                n2 = size;
            }
            final float n3 = (float)size;
            final int u = this.u;
            final int n4 = u - 1;
            if (u == 0) {
                throw null;
            }
            final int n5 = 0;
            Label_0476: {
                if (n4 != 2) {
                    if (n4 == 3) {
                        this.f.set(0, 0, size2, size);
                        this.e.set(this.f.left, this.f.top + this.f.height() / 2 - (int)this.getResources().getDimension(2131166503) / 2, this.f.right, this.f.bottom);
                        break Label_0476;
                    }
                    if (n4 != 5) {
                        if (this.i()) {
                            this.f.set(0, 0, size2 - n2, size);
                        }
                        else {
                            this.f.set(n2, 0, size2, size);
                        }
                        final YouTubeTextView c = this.c;
                        final int measureSpec3 = View$MeasureSpec.makeMeasureSpec(this.f.width(), 1073741824);
                        final int n6 = this.f.height() / 2;
                        final int n7 = (int)(n3 * 0.1f) / 2;
                        c.measure(measureSpec3, View$MeasureSpec.makeMeasureSpec(n6 - n7, 1073741824));
                        this.e.set(this.f.left, this.f.top + this.f.height() / 2 + n7, this.f.right, this.f.bottom);
                        break Label_0476;
                    }
                }
                this.f.set(0, size - (int)this.getResources().getDimension(2131166503), size2, size);
                this.e.set(this.f.left, this.f.top, this.f.right, this.f.bottom);
            }
            final int childCount = this.getChildCount();
            if (childCount > 2) {
                for (int i = n5; i < childCount; ++i) {
                    final View child = this.getChildAt(i);
                    if (child != this.b && child != this.c) {
                        child.measure(measureSpec2, measureSpec);
                    }
                }
            }
        }
        this.setMeasuredDimension(size2, size);
    }
}
