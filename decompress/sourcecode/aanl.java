// 
// Decompiled by Procyon v0.6.0
// 

public final class aanl
{
    public int a;
    private long b;
    private long c;
    private boolean d;
    
    public aanl() {
        this.d = false;
        this.a = 200;
    }
    
    public final float a() {
        final float n = (this.b - this.c) / (float)this.a;
        float n2;
        if (n > 1.0f) {
            n2 = 1.0f;
        }
        else {
            n2 = n;
            if (n < 0.0f) {
                n2 = 0.0f;
            }
        }
        if (this.d) {
            return 1.0f - n2;
        }
        return n2;
    }
    
    public final void b(final boolean d, final long c) {
        this.c = c;
        if (this.d != d) {
            final long b = this.b;
            if (c < b) {
                this.b = this.a + c + c - b;
            }
            else {
                this.b = c + this.a;
            }
        }
        this.d = d;
    }
}
