// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.edit.camera;

import android.os.Bundle;
import android.os.Parcelable;
import android.graphics.Path;
import android.graphics.Canvas;
import android.view.View$MeasureSpec;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.Paint$Align;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.Paint;
import android.view.View;

public class MultiSegmentCameraProgressIndicator extends View
{
    public final int a;
    public final Paint b;
    public int c;
    int d;
    public int e;
    public int f;
    public boolean g;
    ProgressBarData[] h;
    int i;
    private final int j;
    private final int k;
    private final int l;
    private final int m;
    private final float n;
    private final Paint o;
    private final Paint p;
    private final Paint q;
    private final String r;
    private final String s;
    
    public MultiSegmentCameraProgressIndicator(final Context context) {
        this(context, null, 0);
    }
    
    public MultiSegmentCameraProgressIndicator(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public MultiSegmentCameraProgressIndicator(final Context context, final AttributeSet set, int dimensionPixelOffset) {
        super(context, set, dimensionPixelOffset);
        this.d = 30000;
        this.f = -1;
        this.g = true;
        final Resources resources = context.getResources();
        this.j = resources.getDimensionPixelSize(2131169719);
        final int dimensionPixelSize = resources.getDimensionPixelSize(2131169722);
        this.a = dimensionPixelSize;
        final String string = resources.getString(2132019774);
        this.r = string;
        final String string2 = resources.getString(2132019775);
        this.s = string2;
        (this.p = new Paint()).setColor(resources.getColor(2131102094));
        (this.q = new Paint()).setColor(resources.getColor(2131102089));
        (this.o = new Paint()).setColor(resources.getColor(2131102093));
        this.m = resources.getDimensionPixelSize(2131169724);
        final Paint b = new Paint();
        (this.b = b).setColor(resources.getColor(2131102092));
        b.setAntiAlias(true);
        b.setTextAlign(Paint$Align.LEFT);
        b.setTextSize((float)resources.getDimensionPixelSize(2131169723));
        final Rect rect = new Rect();
        b.getTextBounds(string, 0, string.length(), rect);
        this.k = rect.width();
        final int height = rect.height();
        b.getTextBounds(string2, 0, string2.length(), rect);
        this.l = rect.width();
        final int height2 = rect.height();
        dimensionPixelOffset = resources.getDimensionPixelOffset(2131169718);
        this.n = dimensionPixelSize + dimensionPixelOffset - b.ascent();
        this.c = dimensionPixelSize + dimensionPixelOffset + Math.max(height, height2) + (int)Math.ceil(b.descent());
    }
    
    private final float g(final int n) {
        final float n2 = (float)this.getWidth();
        return Math.min(n2, n / (float)this.d * n2);
    }
    
    private final int h(final boolean b) {
        int e = this.e;
        final ProgressBarData[] h = this.h;
        int n = e;
        if (h != null) {
            int n2 = 0;
            int n3 = 0;
            while (true) {
                n = e;
                if (n2 >= h.length) {
                    break;
                }
                final ProgressBarData progressBarData = h[n2];
                int n4 = 0;
                Label_0066: {
                    if (b) {
                        n4 = e;
                        if (n3 >= this.i) {
                            break Label_0066;
                        }
                    }
                    n4 = e + progressBarData.c();
                }
                ++n3;
                ++n2;
                e = n4;
            }
        }
        return n;
    }
    
    private static int i(final int n, int min) {
        final int mode = View$MeasureSpec.getMode(min);
        final int size = View$MeasureSpec.getSize(min);
        if (mode == 1073741824) {
            min = size;
        }
        else {
            min = n;
            if (mode == Integer.MIN_VALUE) {
                min = Math.min(n, size);
            }
        }
        return min;
    }
    
    final float a(float n, final int n2) {
        final float n3 = (float)n2;
        n -= n3 / 2.0f;
        if (n < 0.0f) {
            n = 0.0f;
        }
        else if (n3 + n > this.getWidth()) {
            return (float)(this.getWidth() - n2);
        }
        return n;
    }
    
    final void b(final Canvas canvas, final float n, final Paint paint) {
        canvas.drawRect(n, 0.0f, n + this.m, (float)this.a, paint);
    }
    
    public final void c(final int d) {
        adme.K(d > 0);
        this.d = d;
        this.postInvalidate();
    }
    
    public final void d(final ProgressBarData[] array) {
        int length;
        if (array != null) {
            length = array.length;
        }
        else {
            length = 0;
        }
        this.e(array, length);
    }
    
    public final void e(final ProgressBarData[] h, int i) {
        this.h = h;
        this.e = 0;
        this.f = -1;
        this.g = true;
        if (h == null) {
            i = 0;
        }
        this.i = i;
        this.postInvalidate();
    }
    
    final void f(final Canvas canvas, float n, float n2, float n3, final boolean b, final Paint paint) {
        int n5;
        final int n4 = n5 = 1;
        if (b) {
            if (this.getWidth() - n2 <= this.j) {
                n5 = n4;
            }
            else {
                n5 = 0;
            }
        }
        final float n6 = (float)this.j;
        final Path path = new Path();
        path.moveTo(n2, n6 + 0.0f);
        if (n5 != 0) {
            final float n7 = -n6;
            path.rQuadTo(0.0f, n7, n7, n7);
        }
        else {
            final float n8 = -n6;
            path.rLineTo(0.0f, n8);
            path.rLineTo(n8, 0.0f);
        }
        final float n9 = n6 + n6;
        n3 = n3 + 0.0f - n9;
        n2 = n2 - n - n9;
        path.rLineTo(-n2, 0.0f);
        n = -n6;
        path.rQuadTo(n, 0.0f, n, n6);
        path.rLineTo(0.0f, n3);
        path.rQuadTo(0.0f, n6, n6, n6);
        path.rLineTo(n2, 0.0f);
        if (n5 != 0) {
            path.rQuadTo(n6, 0.0f, n6, n);
        }
        else {
            path.rLineTo(n6, 0.0f);
            path.rLineTo(0.0f, n);
        }
        path.rLineTo(0.0f, -n3);
        path.close();
        canvas.drawPath(path, paint);
    }
    
    protected final void onDraw(final Canvas canvas) {
        super.onDraw(canvas);
        this.f(canvas, 0.0f, (float)this.getWidth(), (float)this.a, false, this.p);
        final int n = 0;
        final int n2 = 0;
        int n3;
        if (this.h(false) <= 0) {
            n3 = n;
        }
        else {
            final ProgressBarData[] h = this.h;
            if (h != null) {
                int n4 = 0;
                int n5;
                for (int i = 0; i < h.length; ++i, n4 = n5) {
                    final ProgressBarData progressBarData = h[i];
                    n5 = n4 + progressBarData.c();
                    Paint q = this.q;
                    if (progressBarData.b() != 0) {
                        q = new Paint();
                        q.setColor(this.getContext().getResources().getColor(progressBarData.b()));
                    }
                    if (progressBarData.a() != 0) {
                        q.setAlpha(this.getContext().getResources().getInteger(progressBarData.a()));
                    }
                    this.f(canvas, this.g(n4), this.g(n5), (float)this.a, true, q);
                }
            }
            if (this.e > 0) {
                final int h2 = this.h(true);
                this.f(canvas, this.g(h2 - this.e), this.g(h2), (float)this.a, true, this.q);
            }
            final ProgressBarData[] h3 = this.h;
            n3 = n;
            if (h3 != null) {
                n3 = 0;
                final int n6 = 0;
                int j = n2;
                int n7 = n6;
                while (j < h3.length) {
                    final ProgressBarData progressBarData2 = h3[j];
                    int n8 = n3;
                    if (j < this.i) {
                        n8 = n3 + progressBarData2.c();
                    }
                    n7 += progressBarData2.c();
                    if (progressBarData2.d() != 0) {
                        final Paint paint = new Paint();
                        paint.setColor(this.getContext().getResources().getColor(progressBarData2.d()));
                        this.b(canvas, this.g(n7), paint);
                    }
                    else {
                        this.b(canvas, this.g(n7), this.o);
                    }
                    ++j;
                    n3 = n8;
                }
            }
        }
        final int f = this.f;
        if (f != -1) {
            final int n9 = f + n3;
            final float g = this.g(n3);
            final float g2 = this.g(n9);
            if (n9 < this.d) {
                this.b(canvas, g2, this.o);
            }
            if (this.g) {
                final float a = this.a(g, this.k);
                final float a2 = this.a(g2, this.l);
                canvas.drawText(this.s, a2, this.n, this.b);
                if (this.k + a < a2) {
                    canvas.drawText(this.r, a, this.n, this.b);
                }
            }
        }
    }
    
    protected final void onMeasure(final int n, final int n2) {
        this.setMeasuredDimension(i(this.getSuggestedMinimumWidth() + this.getPaddingLeft() + this.getPaddingRight(), n), i(this.c + this.getPaddingTop() + this.getPaddingBottom(), n2));
    }
    
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            final Bundle bundle = (Bundle)parcelable;
            this.d = bundle.getInt("INSTANCE_STATE_MAX_RECORDING_DURATION_KEY");
            this.e = bundle.getInt("INSTANCE_STATE_IN_PROGRESS_DURATION_KEY");
            this.f = bundle.getInt("INSTANCE_STATE_IN_PROGRESS_RECORDING_LIMIT_KEY");
            this.i = bundle.getInt("INSTANCE_STATE_NUM_RECORDED_SEGMENT_KEY");
            final Parcelable[] parcelableArray = bundle.getParcelableArray("INSTANCE_STATE_RECORDED_SEGMENT_PROGRESS_BAR_DATA_KEY");
            if (parcelableArray != null) {
                this.h = new ProgressBarData[parcelableArray.length];
                for (int i = 0; i < parcelableArray.length; ++i) {
                    this.h[i] = (ProgressBarData)parcelableArray[i];
                }
            }
            this.g = bundle.getBoolean("INSTANCE_STATE_SHOW_TEXT_INDICATORS_KEY");
            parcelable = bundle.getParcelable("INSTANCE_STATE_SUPERCLASS_KEY");
            if (parcelable != null) {
                super.onRestoreInstanceState(parcelable);
            }
            this.postInvalidate();
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }
    
    protected final Parcelable onSaveInstanceState() {
        final Bundle bundle = new Bundle();
        bundle.putParcelable("INSTANCE_STATE_SUPERCLASS_KEY", super.onSaveInstanceState());
        bundle.putInt("INSTANCE_STATE_MAX_RECORDING_DURATION_KEY", this.d);
        bundle.putInt("INSTANCE_STATE_IN_PROGRESS_DURATION_KEY", this.e);
        final ProgressBarData[] h = this.h;
        if (h != null) {
            bundle.putParcelableArray("INSTANCE_STATE_RECORDED_SEGMENT_PROGRESS_BAR_DATA_KEY", (Parcelable[])h);
        }
        bundle.putInt("INSTANCE_STATE_IN_PROGRESS_RECORDING_LIMIT_KEY", this.f);
        bundle.putInt("INSTANCE_STATE_NUM_RECORDED_SEGMENT_KEY", this.i);
        bundle.putBoolean("INSTANCE_STATE_SHOW_TEXT_INDICATORS_KEY", this.g);
        return (Parcelable)bundle;
    }
}
