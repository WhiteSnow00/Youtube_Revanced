// 
// Decompiled by Procyon v0.6.0
// 

public final class aucc extends audp
{
    public aucc(final String s, final int n, final int n2) {
        super(s, n, n2);
    }
    
    public final boolean immediatelyRetryable() {
        final int b = this.b;
        return b == -358 || b == -352 || super.immediatelyRetryable();
    }
}
