import android.text.Layout$Alignment;
import android.graphics.Bitmap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class azy
{
    public CharSequence a;
    public Bitmap b;
    public Layout$Alignment c;
    public Layout$Alignment d;
    public int e;
    public float f;
    public int g;
    public float h;
    public float i;
    public boolean j;
    public int k;
    public float l;
    private float m;
    private int n;
    private int o;
    private float p;
    private int q;
    
    public azy() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.m = -3.4028235E38f;
        this.n = Integer.MIN_VALUE;
        this.e = Integer.MIN_VALUE;
        this.f = -3.4028235E38f;
        this.g = Integer.MIN_VALUE;
        this.o = Integer.MIN_VALUE;
        this.p = -3.4028235E38f;
        this.h = -3.4028235E38f;
        this.i = -3.4028235E38f;
        this.j = false;
        this.q = -16777216;
        this.k = Integer.MIN_VALUE;
    }
    
    public azy(final azz azz) {
        this.a = azz.c;
        this.b = azz.f;
        this.c = azz.d;
        this.d = azz.e;
        this.m = azz.g;
        this.n = azz.h;
        this.e = azz.i;
        this.f = azz.j;
        this.g = azz.k;
        this.o = azz.p;
        this.p = azz.q;
        this.h = azz.l;
        this.i = azz.m;
        this.j = azz.n;
        this.q = azz.o;
        this.k = azz.r;
        this.l = azz.s;
    }
    
    public final azz a() {
        return new azz(this.a, this.c, this.d, this.b, this.m, this.n, this.e, this.f, this.g, this.o, this.p, this.h, this.i, this.j, this.q, this.k, this.l);
    }
    
    public final void b(final float m, final int n) {
        this.m = m;
        this.n = n;
    }
    
    public final void c(final float p2, final int o) {
        this.p = p2;
        this.o = o;
    }
    
    public final void d(final int q) {
        this.q = q;
        this.j = true;
    }
}
