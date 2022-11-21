// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.edit.ui;

import java.util.PriorityQueue;
import java.util.Arrays;
import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.PathEffect;
import android.graphics.CornerPathEffect;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.EditText;

public class RoundedCornersEditText extends EditText
{
    public boolean a;
    private final uvj b;
    
    public RoundedCornersEditText(final Context context, final AttributeSet set) {
        super(context, set);
        this.a = true;
        this.b = new uvj();
    }
    
    public final void a(final int d) {
        if (this.a) {
            final uvj b = this.b;
            if (d != b.d) {
                b.b.setPathEffect((PathEffect)new CornerPathEffect((float)d));
                b.d = d;
            }
            this.invalidate();
        }
    }
    
    public final Drawable getBackground() {
        if (this.a) {
            return (Drawable)new ColorDrawable(this.b.b.getColor());
        }
        return super.getBackground();
    }
    
    protected final void onDraw(final Canvas canvas) {
        if (this.a) {
            final uvj b = this.b;
            if (b.b.getColor() != 0) {
                if (this.getText().length() != 0) {
                    final int[] array = new int[2];
                    this.getLocationOnScreen(array);
                    final StringBuilder a = b.a;
                    a.delete(0, a.length());
                    final StringBuilder a2 = b.a;
                    a2.append((CharSequence)this.getText());
                    a2.append(b.b.getColor());
                    a2.append(this.getTextSize());
                    a2.append(Arrays.toString(array));
                    a2.append(this.getTypeface());
                    a2.append(this.getTextAlignment());
                    final int hashCode = b.a.toString().hashCode();
                    if (hashCode != b.c) {
                        b.c = hashCode;
                        final vfw f = b.f;
                        final atky e = b.e;
                        e.a = 0;
                        ((PriorityQueue)e.b).clear();
                        final int lineCount = this.getLineCount();
                        final int length = this.getText().length();
                        for (int i = 0; i < lineCount; ++i) {
                            final int lineStart = this.getLayout().getLineStart(i);
                            if (lineStart != length && this.getText().charAt(lineStart) != '\n') {
                                e.r(this.getLayout().getLineLeft(i) + this.getPaddingLeft() - uvj.a((EditText)this), this.getLayout().getLineRight(i) + this.getPaddingLeft() + uvj.a((EditText)this));
                            }
                            else {
                                e.r(0.0f, 0.0f);
                            }
                        }
                        final float n = this.getTextSize() * 0.6f;
                        final vfw f2 = b.f;
                        final atky e2 = b.e;
                        while (!((PriorityQueue)e2.b).isEmpty()) {
                            final uvi uvi = ((PriorityQueue)e2.b).poll();
                            final afbh q = e2.q(uvi.a - 1);
                            if (q.h()) {
                                vfw.X(e2, uvi, (uvi)q.c(), n);
                            }
                            final afbh q2 = e2.q(uvi.a + 1);
                            if (q2.h()) {
                                vfw.X(e2, uvi, (uvi)q2.c(), n);
                            }
                        }
                    }
                    int j = 0;
                    int n2 = 0;
                    int n3 = 0;
                    while (j < this.getLineCount()) {
                        final int lineStart2 = this.getLayout().getLineStart(j);
                        int n4;
                        int n5;
                        if (lineStart2 != this.getLayout().getLineEnd(j)) {
                            if (this.getText().charAt(lineStart2) == '\n') {
                                if ((n4 = n2) > 0) {
                                    canvas.drawPath(b.b((EditText)this, n3, j - 1), b.b);
                                    n4 = 0;
                                }
                                n5 = j + 1;
                            }
                            else if (j == this.getLineCount() - 1) {
                                canvas.drawPath(b.b((EditText)this, n3, j), b.b);
                                n4 = n2;
                                n5 = n3;
                            }
                            else {
                                n4 = n2 + 1;
                                n5 = n3;
                            }
                        }
                        else {
                            n4 = n2;
                            n5 = n3;
                            if (n2 > 0) {
                                canvas.drawPath(b.b((EditText)this, n3, j - 1), b.b);
                                n4 = 0;
                                n5 = n3;
                            }
                        }
                        ++j;
                        n2 = n4;
                        n3 = n5;
                    }
                }
            }
        }
        super.onDraw(canvas);
    }
    
    public final void setBackgroundColor(final int n) {
        if (this.a) {
            this.b.b.setColor(n);
            this.invalidate();
            return;
        }
        super.setBackgroundColor(n);
    }
    
    public final void setTextSize(final int n, final float n2) {
        if (this.a) {
            final int n3 = (int)(0.8f * n2);
            this.setPadding(n3, 0, n3, 0);
        }
        super.setTextSize(n, n2);
    }
}
