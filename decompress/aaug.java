// 
// Decompiled by Procyon v0.6.0
// 

public final class aaug implements aaui
{
    public final aauk a;
    public final aauh b;
    
    public aaug(final aauk a, final aauh b) {
        this.a = a;
        this.b = b;
    }
    
    public final double a(final int n, final double n2) {
        final aauk a = this.a;
        final aauh b = this.b;
        final float c = a.c;
        final double n3 = n * 10000.0f;
        Double.isNaN(n3);
        final float n4 = (float)(n3 / n2);
        float n5;
        if (n4 < c) {
            n5 = a.a.a(n4);
        }
        else {
            n5 = a.b.a(n4);
        }
        return n5 / b.e;
    }
}
