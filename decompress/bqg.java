// 
// Decompiled by Procyon v0.6.0
// 

public final class bqg
{
    public final long a;
    public final long b;
    
    public bqg(final long a, final long b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof bqg)) {
            return false;
        }
        final bqg bqg = (bqg)o;
        return this.a == bqg.a && this.b == bqg.b;
    }
    
    @Override
    public final int hashCode() {
        return (int)this.a * 31 + (int)this.b;
    }
}
