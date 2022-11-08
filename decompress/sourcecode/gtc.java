import android.graphics.Canvas;
import android.content.Context;
import android.graphics.Paint;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gtc extends View
{
    public Paint a;
    public int b;
    public int c;
    public int d;
    public float e;
    public int f;
    
    public gtc(final Context context) {
        super(context);
        this.e = -1.0f;
    }
    
    public final void onDraw(final Canvas canvas) {
        final float e = this.e;
        if (e >= 0.0f && e <= 1.0f) {
            final int width = this.getWidth();
            final int f = this.f;
            final int n = (int)((width - (f + f)) * this.e) + f;
            final int n2 = this.b / 2;
            final int c = this.c;
            final int height = this.getHeight();
            final int c2 = this.c;
            final float n3 = (float)this.d;
            canvas.drawRoundRect((float)(n - n2), (float)c, (float)(n + n2), (float)(height - c2), n3, n3, this.a);
        }
    }
}
