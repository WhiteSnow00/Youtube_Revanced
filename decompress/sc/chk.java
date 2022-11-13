import android.graphics.Paint$Style;
import android.graphics.Paint$Cap;
import android.graphics.Path;
import android.graphics.Paint;
import android.graphics.RectF;

// 
// Decompiled by Procyon v0.6.0
// 

public final class chk
{
    final RectF a;
    final Paint b;
    final Paint c;
    final Paint d;
    float e;
    float f;
    public float g;
    float h;
    int[] i;
    float j;
    float k;
    float l;
    boolean m;
    Path n;
    float o;
    public float p;
    public int q;
    public int r;
    int s;
    int t;
    
    public chk() {
        this.a = new RectF();
        final Paint b = new Paint();
        this.b = b;
        final Paint c = new Paint();
        this.c = c;
        final Paint d = new Paint();
        this.d = d;
        this.e = 0.0f;
        this.f = 0.0f;
        this.g = 0.0f;
        this.h = 5.0f;
        this.o = 1.0f;
        this.s = 255;
        b.setStrokeCap(Paint$Cap.SQUARE);
        b.setAntiAlias(true);
        b.setStyle(Paint$Style.STROKE);
        c.setStyle(Paint$Style.FILL);
        c.setAntiAlias(true);
        d.setColor(0);
    }
    
    final int a() {
        return this.i[0];
    }
    
    final void b() {
        this.j = 0.0f;
        this.k = 0.0f;
        this.l = 0.0f;
        this.e = 0.0f;
        this.f = 0.0f;
        this.g = 0.0f;
    }
    
    public final void c(final int[] i) {
        this.i = i;
        this.h();
    }
    
    public final void d(final boolean m) {
        if (this.m != m) {
            this.m = m;
        }
    }
    
    public final void e(final float n) {
        this.h = n;
        this.b.setStrokeWidth(n);
    }
    
    public final void f() {
        this.j = this.e;
        this.k = this.f;
        this.l = this.g;
    }
    
    public final void g() {
        final int length = this.i.length;
    }
    
    public final void h() {
        this.t = this.i[0];
    }
}
