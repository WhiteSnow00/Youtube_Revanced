// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.user.profile.photopicker.common.view;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.BitmapShader;
import android.graphics.Shader$TileMode;
import android.graphics.Shader;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.RectF;
import android.graphics.Paint;
import android.graphics.Bitmap;
import android.view.View;

public class SquareImageView extends View
{
    public Bitmap a;
    public final dnx b;
    private final Paint c;
    private final Paint d;
    private int e;
    private RectF f;
    private int g;
    private int h;
    
    public SquareImageView(final Context context) {
        this(context, null);
        final int dimensionPixelSize = context.getResources().getDimensionPixelSize(2131168474);
        this.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
    }
    
    public SquareImageView(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public SquareImageView(Context obtainStyledAttributes, final AttributeSet set, final int n) {
        super(obtainStyledAttributes, set, n);
        this.c = new Paint(1);
        final Paint d = new Paint(1);
        this.d = d;
        this.b = (dnx)new qux(this, this);
        final TypedArray obtainStyledAttributes2 = obtainStyledAttributes.obtainStyledAttributes(new int[] { 2130969050 });
        try {
            d.setColor(obtainStyledAttributes2.getColor(0, 0));
            obtainStyledAttributes2.recycle();
            this.e = obtainStyledAttributes.getResources().getDimensionPixelSize(2131168464);
            if (arrj.c()) {
                obtainStyledAttributes = (Context)obtainStyledAttributes.getTheme().obtainStyledAttributes(set, quw.a, 0, 0);
                try {
                    this.e = ((TypedArray)obtainStyledAttributes).getDimensionPixelSize(0, this.e);
                }
                finally {}
            }
        }
        finally {
            obtainStyledAttributes2.recycle();
        }
    }
    
    public static SquareImageView a(final Context context) {
        final SquareImageView squareImageView = new SquareImageView(context);
        squareImageView.d();
        return squareImageView;
    }
    
    public final void b() {
        this.a = null;
        this.c.setShader((Shader)null);
        this.invalidate();
    }
    
    public final void c() {
        if (this.g != 0) {
            if (this.h != 0) {
                final BitmapShader shader = new BitmapShader(this.a, Shader$TileMode.REPEAT, Shader$TileMode.REPEAT);
                final float n = (float)this.g;
                final float n2 = (float)this.h;
                final float n3 = (float)this.a.getWidth();
                final float n4 = (float)this.a.getHeight();
                final float n5 = n3 / n4;
                final float n6 = n / n2;
                float n7;
                if (n5 <= n6) {
                    n7 = n3;
                }
                else {
                    n7 = n4 * n6;
                }
                float n8;
                if (n5 >= n6) {
                    n8 = n4;
                }
                else {
                    n8 = n3 / n6;
                }
                final Matrix localMatrix = new Matrix();
                localMatrix.postTranslate(-((n3 - n7) / 2.0f), -((n4 - n8) / 2.0f));
                localMatrix.postScale(n / n7, n2 / n8);
                shader.setLocalMatrix(localMatrix);
                this.c.setShader((Shader)shader);
                this.invalidate();
            }
        }
    }
    
    public final void d() {
        this.e = 0;
        this.invalidate();
    }
    
    public final void onDraw(final Canvas canvas) {
        final RectF f = this.f;
        if (f == null) {
            return;
        }
        if (this.a != null) {
            final float n = (float)this.e;
            canvas.drawRoundRect(f, n, n, this.c);
            return;
        }
        final float n2 = (float)this.e;
        canvas.drawRoundRect(f, n2, n2, this.d);
    }
    
    public final void onMeasure(final int n, final int n2) {
        super.onMeasure(n, n);
    }
    
    protected final void onSizeChanged(final int n, final int n2, int paddingBottom, int paddingRight) {
        super.onSizeChanged(n, n2, paddingBottom, paddingRight);
        paddingRight = this.getPaddingRight();
        paddingBottom = this.getPaddingBottom();
        this.g = n - paddingRight;
        this.h = n2 - paddingBottom;
        this.f = new RectF((float)this.getPaddingLeft(), (float)this.getPaddingTop(), (float)this.g, (float)this.h);
        if (this.a != null) {
            this.c();
        }
    }
}
