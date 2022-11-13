// 
// Decompiled by Procyon v0.6.0
// 

public final class dgk implements dgd
{
    private final int a;
    
    public dgk(final int a) {
        this.a = a;
    }
    
    public final int a(final Object o) {
        if (this.a != 0) {
            return ((byte[])o).length;
        }
        return ((int[])o).length;
    }
    
    public final int b() {
        if (this.a != 0) {
            return 1;
        }
        return 4;
    }
    
    public final Object c(final int n) {
        if (this.a != 0) {
            return new byte[n];
        }
        return new int[n];
    }
}
