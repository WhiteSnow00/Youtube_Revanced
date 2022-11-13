import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

final class dfo
{
    final dnr a;
    final Executor b;
    
    public dfo(final dnr a, final Executor b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof dfo && this.a.equals(((dfo)o).a);
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
}
