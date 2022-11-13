// 
// Decompiled by Procyon v0.6.0
// 

final class adgp implements adgq
{
    private final int a;
    
    public adgp(final int a) {
        this.a = a;
    }
    
    public final int a() {
        if (this.a != 0) {
            return 10000;
        }
        return Integer.MAX_VALUE;
    }
    
    public final boolean b() {
        return this.a != 0;
    }
}
