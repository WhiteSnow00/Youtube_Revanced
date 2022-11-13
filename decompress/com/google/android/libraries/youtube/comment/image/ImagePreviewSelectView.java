// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.comment.image;

import android.graphics.Rect;
import android.graphics.Matrix$ScaleToFit;
import android.util.Pair;
import android.view.ViewGroup$LayoutParams;
import android.view.View$MeasureSpec;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.RectF;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.FrameLayout;

public class ImagePreviewSelectView extends FrameLayout
{
    public ImageView a;
    public View b;
    public View c;
    public View d;
    public View e;
    public Drawable f;
    public akdw g;
    public float h;
    public PointF i;
    public Matrix j;
    public Matrix k;
    public boolean l;
    public RectF m;
    public float n;
    public int o;
    public int p;
    private View q;
    
    public ImagePreviewSelectView(final Context context) {
        super(context);
        this.d();
    }
    
    public ImagePreviewSelectView(final Context context, final AttributeSet set) {
        super(context, set);
        this.d();
    }
    
    public ImagePreviewSelectView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.d();
    }
    
    private final float a(final MotionEvent motionEvent) {
        float n;
        float n2;
        if (this.p == 2) {
            n = motionEvent.getX();
            n2 = this.i.x;
        }
        else {
            n = motionEvent.getY();
            n2 = this.i.y;
        }
        return n - n2;
    }
    
    private final float b(final float n) {
        final float h = this.h;
        final float n2 = -h;
        if (n < n2) {
            return n2;
        }
        if (n > h) {
            return h;
        }
        return n;
    }
    
    private final int c(final float n, final float n2) {
        final float n3 = this.o / 2.0f;
        float n4;
        if (this.p == 2) {
            n4 = this.m.width();
        }
        else {
            n4 = this.m.height();
        }
        return (int)((n - n2 + n3) * 100.0f / n4);
    }
    
    private final void d() {
        LayoutInflater.from(this.getContext()).inflate(2131624542, (ViewGroup)this);
        this.i = new PointF();
        this.k = new Matrix();
        this.j = new Matrix();
        this.m = new RectF();
        this.h = 0.0f;
        this.n = 0.0f;
        this.a = (ImageView)this.findViewById(2131429296);
        this.q = this.findViewById(2131431354);
        this.b = this.findViewById(2131431694);
        this.c = this.findViewById(2131428882);
        this.d = this.findViewById(2131432150);
        this.e = this.findViewById(2131427848);
    }
    
    private final void e(float n) {
        this.k.reset();
        this.k.set(this.j);
        if (this.p == 2) {
            n = this.b(this.n + n);
            this.k.postTranslate(n, 0.0f);
        }
        else {
            n = this.b(this.n + n);
            this.k.postTranslate(0.0f, n);
        }
        this.a.setImageMatrix(this.k);
    }
    
    public final void onMeasure(final int n, final int n2) {
        if (this.f != null) {
            final int size = View$MeasureSpec.getSize(n);
            int size2 = View$MeasureSpec.getSize(n2);
            final double n3 = size;
            Double.isNaN(n3);
            final int o = (int)(n3 * 0.8);
            this.o = o;
            tpe.aF(this.q, tpe.aE(o, o), (Class)ViewGroup$LayoutParams.class);
            final ViewGroup$LayoutParams layoutParams = this.a.getLayoutParams();
            final RectF rectF = new RectF();
            final int p2 = this.p;
            Pair pair;
            if (p2 != 2) {
                if (p2 != 3) {
                    if (p2 != 4) {
                        pair = null;
                    }
                    else {
                        this.h = 0.0f;
                        final RectF m = this.m;
                        final float n4 = (float)this.o;
                        m.set(0.0f, 0.0f, n4, n4);
                        rectF.set(0.0f, 0.0f, (float)this.f.getIntrinsicWidth(), (float)this.f.getIntrinsicHeight());
                        pair = new Pair((Object)this.o, (Object)this.o);
                    }
                }
                else {
                    final int o2 = this.o;
                    final float n5 = (float)o2;
                    final float n6 = (float)this.f.getIntrinsicHeight();
                    final float n7 = (float)this.f.getIntrinsicWidth();
                    final float n8 = (float)this.o;
                    final float n9 = n5 * n6 / n7;
                    final float h = (n9 - n8) / 2.0f;
                    this.h = h;
                    final float n10 = (float)size2;
                    final float n11 = h * 4.0f + n8;
                    if (n11 > n10) {
                        final float n12 = (n9 - n10) / 2.0f;
                        rectF.set(0.0f, n12, (float)this.f.getIntrinsicWidth(), this.f.getIntrinsicHeight() - n12);
                    }
                    else {
                        size2 = (int)n11;
                        rectF.set(0.0f, 0.0f, (float)this.f.getIntrinsicWidth(), (float)this.f.getIntrinsicHeight());
                    }
                    this.m.set(0.0f, 0.0f, (float)this.o, n9);
                    pair = new Pair((Object)o2, (Object)size2);
                }
            }
            else {
                final float n13 = (float)this.o;
                final float n14 = (float)this.f.getIntrinsicWidth();
                final float n15 = (float)this.f.getIntrinsicHeight();
                final float n16 = (float)this.o;
                final float n17 = n13 * n14 / n15;
                final float h2 = (n17 - n16) / 2.0f;
                this.h = h2;
                final float n18 = (float)size;
                final float n19 = h2 * 4.0f + n16;
                int n21;
                if (n19 > n18) {
                    final float n20 = (n17 - n18) / 2.0f;
                    rectF.set(n20, 0.0f, this.f.getIntrinsicWidth() - n20, (float)this.f.getIntrinsicHeight());
                    n21 = size;
                }
                else {
                    n21 = (int)n19;
                    rectF.set(0.0f, 0.0f, (float)this.f.getIntrinsicWidth(), (float)this.f.getIntrinsicHeight());
                }
                final int o3 = this.o;
                this.m.set(0.0f, 0.0f, n17, (float)o3);
                pair = new Pair((Object)n21, (Object)o3);
            }
            if (pair != null) {
                tpe.aF((View)this.a, tpe.aE((int)pair.first, (int)pair.second), (Class)ViewGroup$LayoutParams.class);
            }
            this.j.setRectToRect(rectF, new RectF(0.0f, 0.0f, (float)layoutParams.width, (float)layoutParams.height), Matrix$ScaleToFit.CENTER);
            final akdw g = this.g;
            if (g != null) {
                final int p3 = this.p;
                if (p3 != 2) {
                    if (p3 != 3) {
                        this.n = 0.0f;
                    }
                    else {
                        final double n22 = this.h;
                        final double d = g.d;
                        final double n23 = this.m.height();
                        Double.isNaN(n23);
                        Double.isNaN(n22);
                        this.n = this.b((float)(n22 - d * n23));
                    }
                }
                else {
                    final double n24 = this.h;
                    final double c = g.c;
                    final double n25 = this.m.width();
                    Double.isNaN(n25);
                    Double.isNaN(n24);
                    this.n = this.b((float)(n24 - c * n25));
                }
            }
            this.e(0.0f);
            final int c2 = this.c(this.h, this.n);
            final StringBuilder sb = new StringBuilder();
            final int p4 = this.p;
            if (p4 != 2) {
                if (p4 != 3) {
                    if (p4 == 4) {
                        sb.append(this.getContext().getString(2132017353, new Object[] { c2, 100 - c2 }));
                    }
                }
                else {
                    sb.append(this.getContext().getString(2132017353, new Object[] { c2, 100 - c2 }));
                    sb.append(" ");
                    sb.append(this.getContext().getString(2132017351));
                }
            }
            else {
                sb.append(this.getContext().getString(2132017352, new Object[] { c2, 100 - c2 }));
                sb.append(" ");
                sb.append(this.getContext().getString(2132017350));
            }
            this.q.setContentDescription((CharSequence)sb.toString());
        }
        super.onMeasure(n, n2);
    }
    
    public final boolean onTouchEvent(final MotionEvent motionEvent) {
        final int p = this.p;
        if (p != 2 && p != 3) {
            return false;
        }
        final int n = motionEvent.getAction() & 0xFF;
        if (n != 0) {
            if (n != 1) {
                if (n != 2) {
                    return false;
                }
                if (!this.l) {
                    return true;
                }
                this.e(this.a(motionEvent));
            }
            else {
                if (!this.l) {
                    return true;
                }
                this.e(this.a(motionEvent));
                this.l = false;
                final float b = this.b(this.n + this.a(motionEvent));
                this.n = b;
                final float h = this.h;
                final int p2 = this.p;
                String contentDescription;
                if (p2 != 2) {
                    if (p2 != 3) {
                        contentDescription = "";
                    }
                    else if (Math.round(b) == Math.round(h)) {
                        contentDescription = this.getContext().getString(2132017357);
                    }
                    else if (Math.round(b) == Math.round(-h)) {
                        contentDescription = this.getContext().getString(2132017354);
                    }
                    else {
                        final int c = this.c(h, b);
                        contentDescription = this.getContext().getString(2132017353, new Object[] { c, 100 - c });
                    }
                }
                else if (Math.round(b) == Math.round(h)) {
                    contentDescription = this.getContext().getString(2132017355);
                }
                else if (Math.round(b) == Math.round(-h)) {
                    contentDescription = this.getContext().getString(2132017356);
                }
                else {
                    final int c2 = this.c(h, b);
                    contentDescription = this.getContext().getString(2132017352, new Object[] { c2, 100 - c2 });
                }
                this.q.setContentDescription((CharSequence)contentDescription);
                this.q.announceForAccessibility((CharSequence)contentDescription);
                this.performClick();
            }
        }
        else {
            final Rect rect = new Rect();
            this.q.getHitRect(rect);
            this.l = false;
            if (rect.contains((int)motionEvent.getX(), (int)motionEvent.getY())) {
                this.i.set(motionEvent.getX(), motionEvent.getY());
                this.l = true;
            }
        }
        return true;
    }
}
