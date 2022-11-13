// 
// Decompiled by Procyon v0.6.0
// 

public final class ai
{
    public int a;
    public int b;
    public int c;
    public float d;
    public final float[] e;
    af[] f;
    int g;
    public int h;
    
    public ai(final int h) {
        this.a = -1;
        this.b = -1;
        this.c = 0;
        this.e = new float[6];
        this.f = new af[8];
        this.g = 0;
        this.h = h;
    }
    
    final void a(final af af) {
        int n = 0;
        for (int i = 0; i < this.g; ++i) {
            if (this.f[i] == af) {
                int g;
                while (true) {
                    g = this.g;
                    if (n >= g - i - 1) {
                        break;
                    }
                    final af[] f = this.f;
                    final int n2 = i + n;
                    f[n2] = f[n2 + 1];
                    ++n;
                }
                this.g = g - 1;
                return;
            }
        }
    }
    
    public final void b() {
        this.h = 5;
        this.c = 0;
        this.a = -1;
        this.b = -1;
        this.d = 0.0f;
        this.g = 0;
    }
    
    @Override
    public final String toString() {
        return "null";
    }
}
