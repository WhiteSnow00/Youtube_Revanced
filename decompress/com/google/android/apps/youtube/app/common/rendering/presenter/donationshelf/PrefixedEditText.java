// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.common.rendering.presenter.donationshelf;

import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.content.Context;
import com.google.android.material.textfield.TextInputEditText;

public class PrefixedEditText extends TextInputEditText
{
    public String a;
    public float[] b;
    public int c;
    private boolean d;
    private int e;
    
    public PrefixedEditText(final Context context) {
        super(context);
    }
    
    public PrefixedEditText(final Context context, final AttributeSet set) {
        super(context, set);
    }
    
    public PrefixedEditText(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
    }
    
    protected final void onDraw(final Canvas canvas) {
        super.onDraw(canvas);
        final String a = this.a;
        if (a != null) {
            canvas.drawText(a, (float)this.e, (float)this.getLineBounds(0, (Rect)null), (Paint)this.getPaint());
        }
    }
    
    protected final void onMeasure(int i, int length) {
        super.onMeasure(i, length);
        if (this.d) {
            return;
        }
        if (this.a == null) {
            return;
        }
        this.getPaint().getTextWidths(this.a, this.b);
        final float[] b = this.b;
        length = b.length;
        i = 0;
        float n = 0.0f;
        while (i < length) {
            n += b[i];
            ++i;
        }
        i = this.getCompoundPaddingLeft();
        this.e = i;
        final double n2 = n;
        Double.isNaN(n2);
        this.setPadding((int)(n2 + 0.5) + i + this.c, this.getPaddingRight(), this.getPaddingTop(), this.getPaddingBottom());
        this.d = true;
    }
}
