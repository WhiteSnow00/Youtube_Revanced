// 
// Decompiled by Procyon v0.6.0
// 

public abstract class acjs implements acjd
{
    private long a;
    
    protected final void g(final long a) {
        agot.y(a >= 0L, "Blocking duration must be greater or equal to 0: %ld", a);
        this.a = a;
    }
    
    public final long j() {
        return this.a;
    }
}
