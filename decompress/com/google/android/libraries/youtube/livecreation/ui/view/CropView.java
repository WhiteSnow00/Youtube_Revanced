// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.livecreation.ui.view;

import android.content.res.TypedArray;
import android.view.ViewGroup$LayoutParams;
import android.view.View$MeasureSpec;
import android.widget.TextView;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.PointF;
import android.view.View;
import android.graphics.Rect;
import android.widget.ImageView;
import android.graphics.Matrix;
import android.util.Pair;
import android.net.Uri;
import android.widget.FrameLayout;

public class CropView extends FrameLayout
{
    public Uri a;
    public int b;
    public int c;
    public int d;
    public int e;
    public Pair f;
    public int g;
    public int h;
    public Matrix i;
    public ImageView j;
    private int k;
    private int l;
    private int m;
    private CharSequence n;
    private Rect o;
    private View p;
    private View q;
    private View r;
    private Matrix s;
    private PointF t;
    private PointF u;
    private double v;
    private float[] w;
    private boolean x;
    private boolean y;
    private int z;
    
    public CropView(final Context context, AttributeSet obtainStyledAttributes) {
        super(context, obtainStyledAttributes);
        this.t = new PointF();
        this.u = new PointF();
        this.v = 1.0;
        this.w = new float[9];
        final boolean b = true;
        this.x = true;
        this.y = true;
        ((LayoutInflater)context.getSystemService("layout_inflater")).inflate(2131624655, (ViewGroup)this);
        obtainStyledAttributes = (AttributeSet)context.obtainStyledAttributes(obtainStyledAttributes, wol.b);
        try {
            this.b = ((TypedArray)obtainStyledAttributes).getInteger(7, 0);
            this.c = ((TypedArray)obtainStyledAttributes).getInteger(1, 0);
            this.d = ((TypedArray)obtainStyledAttributes).getDimensionPixelOffset(3, 0);
            this.e = ((TypedArray)obtainStyledAttributes).getDimensionPixelOffset(2, 0);
            this.k = ((TypedArray)obtainStyledAttributes).getInteger(6, this.b);
            this.l = ((TypedArray)obtainStyledAttributes).getInteger(5, this.c);
            this.m = ((TypedArray)obtainStyledAttributes).getInteger(4, this.k);
            this.n = tsx.d(((TypedArray)obtainStyledAttributes).getText(0));
            ((TypedArray)obtainStyledAttributes).recycle();
            final int b2 = this.b;
            agot.x(b2 > 0, "Width ratio must be positive. Was %s.", b2);
            final int c = this.c;
            agot.x(c > 0, "Height ratio must be positive. Was %s.", c);
            final int m = this.m;
            final int k = this.k;
            agot.A(m <= k, "A double mask width ratio must be smaller or equal to a single mask width ratio. %s > %s", m, k);
            final int d = this.d;
            boolean b3 = b;
            if (d != 0) {
                final int e = this.e;
                b3 = b;
                if (e != 0) {
                    b3 = (d * this.c - e * this.b == 0 && b);
                }
            }
            agot.v(b3, (Object)"Min width and height must match the given width and height ratio");
            this.i = new Matrix();
            this.s = new Matrix();
            this.z = 0;
        }
        finally {
            ((TypedArray)obtainStyledAttributes).recycle();
        }
    }
    
    private static double b(final MotionEvent motionEvent) {
        final float n = motionEvent.getX(0) - motionEvent.getX(1);
        final float n2 = motionEvent.getY(0) - motionEvent.getY(1);
        return Math.sqrt(n * n + n2 * n2);
    }
    
    private final Rect c() {
        this.i.getValues(this.w);
        final int n = (int)Math.ceil(this.w[2]);
        final int n2 = (int)Math.ceil(this.w[5]);
        final float[] w = this.w;
        final double floor = Math.floor(w[0] * this.g + w[3] * this.h);
        final float[] w2 = this.w;
        final Rect rect = new Rect(n, n2, (int)floor + n, (int)Math.floor(w2[4] * this.h + w2[1] * this.g) + n2);
        rect.sort();
        return rect;
    }
    
    private final void d() {
        final Rect c = this.c();
        final int d = this.d;
        final int n = 0;
        Rect c2 = null;
        Label_0184: {
            if (d <= 0) {
                c2 = c;
                if (this.e <= 0) {
                    break Label_0184;
                }
            }
            final Rect a = this.a();
            double n4;
            if (this.d >= a.width()) {
                final double n2 = this.d;
                final double n3 = a.width();
                Double.isNaN(n2);
                Double.isNaN(n3);
                n4 = n2 / n3;
                this.y = false;
            }
            else {
                n4 = 1.0;
            }
            double min = n4;
            if (this.e >= a.height()) {
                final double n5 = this.e;
                final double n6 = a.height();
                Double.isNaN(n5);
                Double.isNaN(n6);
                min = Math.min(n4, n5 / n6);
                this.y = false;
            }
            c2 = c;
            if (min < 1.0) {
                c2 = c;
                if (this.x) {
                    e(this.i, min);
                    c2 = this.c();
                }
            }
        }
        double n9;
        if (this.o.width() >= c2.width()) {
            final double n7 = this.o.width();
            final double n8 = c2.width();
            Double.isNaN(n7);
            Double.isNaN(n8);
            n9 = n7 / n8;
            this.x = true;
        }
        else {
            n9 = 1.0;
        }
        double max = n9;
        if (this.o.height() >= c2.height()) {
            final double n10 = this.o.height();
            final double n11 = c2.height();
            Double.isNaN(n10);
            Double.isNaN(n11);
            max = Math.max(n9, n10 / n11);
            this.x = true;
        }
        Rect c3 = c2;
        if (max > 1.0) {
            c3 = c2;
            if (this.y) {
                e(this.i, max);
                c3 = this.c();
            }
        }
        if (!c3.contains(this.o)) {
            int n14 = 0;
            Label_0427: {
                int n12;
                int n13;
                if (this.o.left < c3.left) {
                    n12 = this.o.left;
                    n13 = c3.left;
                }
                else {
                    if (this.o.right <= c3.right) {
                        n14 = 0;
                        break Label_0427;
                    }
                    n12 = this.o.right;
                    n13 = c3.right;
                }
                n14 = n12 - n13;
            }
            int n17 = 0;
            Label_0501: {
                int n15;
                int n16;
                if (this.o.top < c3.top) {
                    n15 = this.o.top;
                    n16 = c3.top;
                }
                else {
                    if (this.o.bottom <= c3.bottom) {
                        n17 = 0;
                        break Label_0501;
                    }
                    n15 = this.o.bottom;
                    n16 = c3.bottom;
                }
                n17 = n15 - n16;
            }
            if (n14 == 0) {
                if (n17 == 0) {
                    return;
                }
                n14 = n;
            }
            this.i.postTranslate((float)n14, (float)n17);
        }
    }
    
    private static final void e(final Matrix matrix, final double n) {
        final float n2 = (float)n;
        matrix.postScale(n2, n2);
    }
    
    public final Rect a() {
        final Rect rect = new Rect(this.o);
        final Rect c = this.c();
        rect.offset(-c.left, -c.top);
        final double n = (int)this.f.first;
        final double n2 = c.width();
        Double.isNaN(n);
        Double.isNaN(n2);
        final double n3 = n / n2;
        final double n4 = rect.left;
        Double.isNaN(n4);
        final int n5 = (int)(n4 * n3);
        final double n6 = rect.top;
        Double.isNaN(n6);
        final int n7 = (int)(n6 * n3);
        final double n8 = rect.width();
        Double.isNaN(n8);
        final int max = Math.max(1, (int)(n8 * n3));
        final double n9 = rect.height();
        Double.isNaN(n9);
        rect.set(n5, n7, max + n5, Math.max(1, (int)(n9 * n3)) + n7);
        return rect;
    }
    
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.j = (ImageView)this.findViewById(2131429296);
        this.p = this.findViewById(2131428547);
        this.q = this.findViewById(2131428544);
        this.r = this.findViewById(2131428548);
        final CharSequence n = this.n;
        if (n != null && n.length() > 0) {
            final TextView textView = (TextView)this.findViewById(2131428542);
            textView.setVisibility(0);
            textView.setText(this.n);
        }
    }
    
    public final void onMeasure(final int n, final int n2) {
        final Rect rect = new Rect(0, 0, View$MeasureSpec.getSize(n), View$MeasureSpec.getSize(n2));
        rect.sort();
        final int n3 = (int)this.getResources().getDimension(2131167071);
        final int n4 = rect.width() - n3;
        int n5 = rect.height() - n3;
        if (n4 > 0 && n5 > 0) {
            final double n6 = n4;
            final double n7 = n5;
            Double.isNaN(n6);
            Double.isNaN(n7);
            final double n8 = n6 / n7;
            final double n9 = this.k;
            final double n10 = this.l;
            Double.isNaN(n9);
            Double.isNaN(n10);
            final double n11 = n9 / n10;
            int n12;
            if (n8 > n11) {
                Double.isNaN(n7);
                n12 = (int)(n7 * n11);
            }
            else {
                n12 = n4;
                if (n8 < n11) {
                    Double.isNaN(n6);
                    n5 = (int)(n6 / n11);
                    n12 = n4;
                }
            }
            tmy.aH(this.p, n12, n5);
            this.p.setVisibility(0);
            final int m = this.m;
            if (m > 0.0f && this.k > m) {
                final int n13 = (n12 - m * n5 / this.l) / 2;
                tmy.aF(this.q, tmy.aD(n13), (Class)ViewGroup$LayoutParams.class);
                this.q.setVisibility(0);
                tmy.aF(this.r, tmy.aD(n13), (Class)ViewGroup$LayoutParams.class);
                this.r.setVisibility(0);
            }
            final int b = this.b;
            final int c = this.c;
            final double n14 = b;
            final double n15 = c;
            Double.isNaN(n14);
            Double.isNaN(n15);
            final double n16 = n14 / n15;
            int n17;
            if (n16 > n11) {
                n17 = b * n5 / c;
            }
            else {
                n17 = n12;
                if (n16 < n11) {
                    n5 = c * n12 / b;
                    n17 = n12;
                }
            }
            final int n18 = n17 / 2;
            final int n19 = n5 / 2;
            this.o = new Rect(rect.centerX() - n18, rect.centerY() - n19, rect.centerX() + n18, rect.centerY() + n19);
            if (this.a != null) {
                this.d();
                this.j.setImageMatrix(this.i);
            }
        }
        else {
            trn.b("Crop rectangle width and height must be positive.");
        }
        super.onMeasure(n, n2);
    }
    
    public final boolean onTouchEvent(final MotionEvent motionEvent) {
        final int n = motionEvent.getAction() & 0xFF;
        Label_0328: {
            if (n != 0) {
                if (n != 1) {
                    if (n == 2) {
                        final int z = this.z;
                        if (z == 1) {
                            this.i.set(this.s);
                            this.i.postTranslate(motionEvent.getX() - this.t.x, motionEvent.getY() - this.t.y);
                        }
                        else if (z == 2) {
                            final double b = b(motionEvent);
                            if (b > 10.0) {
                                final double n2 = b / this.v;
                                if ((n2 < 1.0 && this.x) || (n2 > 1.0 && this.y)) {
                                    this.i.set(this.s);
                                    final float n3 = (float)n2;
                                    this.i.postScale(n3, n3, this.u.x, this.u.y);
                                    if (n2 < 1.0) {
                                        this.y = true;
                                    }
                                    else {
                                        this.x = true;
                                    }
                                }
                            }
                        }
                        this.d();
                        break Label_0328;
                    }
                    if (n != 5) {
                        if (n != 6) {
                            break Label_0328;
                        }
                    }
                    else {
                        final double b2 = b(motionEvent);
                        this.v = b2;
                        if (b2 > 10.0) {
                            this.s.set(this.i);
                            this.u.set((motionEvent.getX(0) + motionEvent.getX(1)) / 2.0f, (motionEvent.getY(0) + motionEvent.getY(1)) / 2.0f);
                            this.z = 2;
                        }
                        break Label_0328;
                    }
                }
                this.z = 0;
                this.j.performClick();
            }
            else {
                this.s.set(this.i);
                this.t.set(motionEvent.getX(), motionEvent.getY());
                this.z = 1;
            }
        }
        this.j.setImageMatrix(this.i);
        return true;
    }
}
