import android.graphics.Paint$Style;
import android.graphics.Path;
import android.graphics.Paint;

// 
// Decompiled by Procyon v0.6.0
// 

public final class advy
{
    public static final int[] a;
    public static final float[] b;
    public static final int[] c;
    public static final float[] d;
    public final Paint e;
    public final Paint f;
    public final Paint g;
    public int h;
    public int i;
    public int j;
    public final Path k;
    public final Paint l;
    
    static {
        a = new int[3];
        b = new float[] { 0.0f, 0.5f, 1.0f };
        c = new int[4];
        d = new float[] { 0.0f, 0.0f, 0.5f, 1.0f };
    }
    
    public advy() {
        this.k = new Path();
        final Paint l = new Paint();
        this.l = l;
        this.e = new Paint();
        this.a(-16777216);
        l.setColor(0);
        final Paint f = new Paint(4);
        (this.f = f).setStyle(Paint$Style.FILL);
        this.g = new Paint(f);
    }
    
    public final void a(final int n) {
        this.h = ahy.f(n, 68);
        this.i = ahy.f(n, 20);
        this.j = ahy.f(n, 0);
        this.e.setColor(this.h);
    }
}
