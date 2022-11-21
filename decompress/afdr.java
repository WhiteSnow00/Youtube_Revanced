// 
// Decompiled by Procyon v0.6.0
// 

public abstract class afdr implements afjv
{
    @Override
    public void a(final afjt afjt) {
        throw null;
    }
    
    @Override
    public void b(final afjt afjt) {
        throw null;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o == this || (o instanceof afjv && this.c().equals(((afjv)o).c()));
    }
    
    @Override
    public final int hashCode() {
        return this.c().hashCode();
    }
    
    @Override
    public final String toString() {
        return this.c().toString();
    }
}
