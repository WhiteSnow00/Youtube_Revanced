import android.view.View$MeasureSpec;
import android.graphics.Canvas;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.Paint;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gtm extends View
{
    public Paint a;
    public float b;
    public float c;
    public final Rect d;
    public int e;
    private String f;
    
    public gtm(final Context context) {
        super(context);
        this.f = "Example Text";
        this.d = new Rect();
    }
    
    private final void b() {
        final Paint a = this.a;
        final String f = this.f;
        a.getTextBounds(f, 0, f.length(), this.d);
    }
    
    public final void a(final String f) {
        this.f = f;
        this.b();
    }
    
    public final void onDraw(final Canvas canvas) {
        canvas.drawText(this.f, this.c, (float)this.d.height(), this.a);
    }
    
    public final void onMeasure(final int n, final int n2) {
        this.b();
        final int size = View$MeasureSpec.getSize(n2);
        final int height = this.d.height();
        if (height > size) {
            super.onMeasure(n, View$MeasureSpec.makeMeasureSpec(height, 1073741824));
            return;
        }
        super.onMeasure(n, n2);
    }
}
