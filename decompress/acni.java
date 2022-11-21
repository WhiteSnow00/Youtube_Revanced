// 
// Decompiled by Procyon v0.6.0
// 

public abstract class acni implements acmt
{
    private long a;
    
    protected final void g(final long a) {
        adme.O(a >= 0L, "Blocking duration must be greater or equal to 0: %ld", a);
        this.a = a;
    }
    
    @Override
    public final long j() {
        return this.a;
    }
}
