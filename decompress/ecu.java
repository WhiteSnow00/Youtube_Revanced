// 
// Decompiled by Procyon v0.6.0
// 

public final class ecu implements ecr
{
    private final int a;
    private final int b;
    private final int c;
    private int d;
    
    public ecu(final int a, final int b, final int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final int a() {
        return this.d;
    }
    
    @Override
    public final void b(final eei eei, int n, final int n2) {
        final int d = this.d;
        if (1 == this.c) {
            n = n2;
        }
        this.d = d + n;
    }
    
    @Override
    public final boolean c() {
        int n;
        if (this.c == 1) {
            n = this.b;
        }
        else {
            n = this.a;
        }
        return this.d < n;
    }
}
