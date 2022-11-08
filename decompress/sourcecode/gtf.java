import android.graphics.Canvas;
import android.content.Context;
import android.graphics.RectF;
import android.graphics.Paint;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gtf extends View
{
    public Paint a;
    public int b;
    public int c;
    public int d;
    public int e;
    private final RectF f;
    
    public gtf(final Context context) {
        super(context);
        this.f = new RectF();
    }
    
    public final void onDraw(final Canvas canvas) {
        this.f.set(0.0f, (float)(this.getHeight() - this.e), this.b / 2.0f, (float)this.getHeight());
        canvas.drawRect(this.f, this.a);
        final float n = this.getWidth() / 10.0f;
        for (int i = 1; i < 5; ++i) {
            final float n2 = i * n;
            this.f.set(n2 - this.b / 2.0f, (float)(this.getHeight() - this.c), n2 + this.b / 2.0f, (float)this.getHeight());
            canvas.drawRect(this.f, this.a);
        }
        final float n3 = (this.getWidth() - this.b) / 2.0f;
        this.f.set(n3, (float)(this.getHeight() - this.d), this.b + n3, (float)this.getHeight());
        canvas.drawRect(this.f, this.a);
        for (int j = 6; j < 10; ++j) {
            final float n4 = j * n;
            this.f.set(n4 - this.b / 2.0f, (float)(this.getHeight() - this.c), n4 + this.b / 2.0f, (float)this.getHeight());
            canvas.drawRect(this.f, this.a);
        }
        this.f.set(this.getWidth() - this.b / 2.0f, (float)(this.getHeight() - this.e), (float)this.getWidth(), (float)this.getHeight());
        canvas.drawRect(this.f, this.a);
    }
}
