// 
// Decompiled by Procyon v0.6.0
// 

package android.support.v7.widget;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.SeekBar;

public class AppCompatSeekBar extends SeekBar
{
    private final ko a;
    
    public AppCompatSeekBar(final Context context) {
        this(context, null);
    }
    
    public AppCompatSeekBar(final Context context, final AttributeSet set) {
        this(context, set, 2130970226);
    }
    
    public AppCompatSeekBar(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        pn.d((View)this, this.getContext());
        ((kk)(this.a = new ko((SeekBar)this))).b(set, n);
    }
    
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        final ko a = this.a;
        final Drawable c = a.c;
        if (c != null && c.isStateful() && c.setState(a.b.getDrawableState())) {
            a.b.invalidateDrawable(c);
        }
    }
    
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        final Drawable c = this.a.c;
        if (c != null) {
            c.jumpToCurrentState();
        }
    }
    
    protected void onDraw(final Canvas canvas) {
        monitorenter(this);
        try {
            super.onDraw(canvas);
            final ko a = this.a;
            if (a.c != null) {
                final int max = a.b.getMax();
                int n = 1;
                if (max > 1) {
                    final int intrinsicWidth = a.c.getIntrinsicWidth();
                    final int intrinsicHeight = a.c.getIntrinsicHeight();
                    int n2;
                    if (intrinsicWidth >= 0) {
                        n2 = intrinsicWidth >> 1;
                    }
                    else {
                        n2 = 1;
                    }
                    if (intrinsicHeight >= 0) {
                        n = intrinsicHeight >> 1;
                    }
                    a.c.setBounds(-n2, -n, n2, n);
                    final int width = a.b.getWidth();
                    final int paddingLeft = a.b.getPaddingLeft();
                    final int paddingRight = a.b.getPaddingRight();
                    final int save = canvas.save();
                    canvas.translate((float)a.b.getPaddingLeft(), (float)(a.b.getHeight() / 2));
                    for (int i = 0; i <= max; ++i) {
                        final float n3 = (float)max;
                        final float n4 = (float)(width - paddingLeft - paddingRight);
                        a.c.draw(canvas);
                        canvas.translate(n4 / n3, 0.0f);
                    }
                    canvas.restoreToCount(save);
                    monitorexit(this);
                    return;
                }
            }
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
}
