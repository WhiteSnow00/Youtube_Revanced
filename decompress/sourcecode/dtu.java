import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.Canvas;
import android.graphics.Paint$Align;
import android.graphics.Paint$Style;
import android.graphics.Color;
import java.util.List;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dtu extends Drawable implements dzj
{
    static final int a;
    private static final int d;
    private static final int e;
    private static final int f;
    final String b;
    final int c;
    private final Paint g;
    private final Paint h;
    private final List i;
    
    static {
        a = Color.parseColor("#22FF0000");
        d = Color.parseColor("#2200FF00");
        e = Color.parseColor("#CCFF0000");
        f = Color.parseColor("#CC00FF00");
    }
    
    public dtu(final List i) {
        final Paint g = new Paint();
        this.g = g;
        this.h = new Paint();
        g.setColor(-16777216);
        g.setAntiAlias(true);
        g.setStyle(Paint$Style.FILL);
        g.setTextSize(80.0f);
        g.setTextAlign(Paint$Align.LEFT);
        this.i = i;
        final int size = i.size();
        if (size > 0) {
            final StringBuilder sb = new StringBuilder();
            sb.append(size);
            sb.append("x");
            this.b = sb.toString();
            int c;
            if (i.get(size - 1)) {
                c = dtu.a;
            }
            else {
                c = dtu.d;
            }
            this.c = c;
            return;
        }
        this.b = "";
        this.c = 0;
    }
    
    public final boolean a(final dzj dzj) {
        return this.equals(dzj);
    }
    
    public final void draw(final Canvas canvas) {
        this.h.setColor(this.c);
        final Rect bounds = this.getBounds();
        canvas.drawRect(bounds, this.h);
        final int size = this.i.size();
        final int left = bounds.left;
        final int right = bounds.right;
        final int top = bounds.top;
        final int min = Math.min(top + 100, bounds.bottom);
        for (int i = 0; i < size; ++i) {
            final int n = i * 20 + left;
            final int n2 = n + 16;
            if (n2 >= right) {
                break;
            }
            if (this.i.get(i)) {
                this.h.setColor(dtu.e);
            }
            else {
                this.h.setColor(dtu.f);
            }
            canvas.drawRect((float)n, (float)top, (float)n2, (float)min, this.h);
        }
        if (size > 3) {
            canvas.drawText(this.b, (float)left, top + 80.0f, this.g);
        }
    }
    
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null) {
            if (this.getClass() == o.getClass()) {
                final dtu dtu = (dtu)o;
                if (this.c == dtu.c && this.b.equals(dtu.b) && this.i.equals(dtu.i)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public final int getOpacity() {
        return -3;
    }
    
    public final int hashCode() {
        return this.i.hashCode();
    }
    
    public final void setAlpha(final int n) {
    }
    
    public final void setColorFilter(final ColorFilter colorFilter) {
    }
}
