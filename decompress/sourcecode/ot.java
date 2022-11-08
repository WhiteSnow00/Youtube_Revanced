// 
// Decompiled by Procyon v0.6.0
// 

public final class ot
{
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public boolean g;
    public boolean h;
    
    public ot() {
        this.a = 0;
        this.b = 0;
        this.c = Integer.MIN_VALUE;
        this.d = Integer.MIN_VALUE;
        this.e = 0;
        this.f = 0;
        this.g = false;
        this.h = false;
    }
    
    public final void a(final int a, final int b) {
        this.c = a;
        this.d = b;
        this.h = true;
        if (this.g) {
            if (b != Integer.MIN_VALUE) {
                this.a = b;
            }
            if (a != Integer.MIN_VALUE) {
                this.b = a;
            }
        }
        else {
            if (a != Integer.MIN_VALUE) {
                this.a = a;
            }
            if (b != Integer.MIN_VALUE) {
                this.b = b;
            }
        }
    }
}
