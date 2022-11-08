// 
// Decompiled by Procyon v0.6.0
// 

public final class bwi
{
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    
    public bwi(final int a, final int b, final int c, final int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final boolean a(final int n) {
        if (n == 1) {
            if (this.a - this.b > 1) {
                return true;
            }
        }
        else if (this.c - this.d > 1) {
            return true;
        }
        return false;
    }
}
