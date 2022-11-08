import java.util.concurrent.TimeUnit;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class asfr
{
    public final arrl a;
    public final arrk b;
    
    protected asfr(final arrl a, final arrk b) {
        a.getClass();
        this.a = a;
        this.b = b;
    }
    
    public abstract asfr a(final arrl p0, final arrk p1);
    
    public final asfr d(final long n, final TimeUnit timeUnit) {
        return this.a(this.a, this.b.a(arsh.c(n, timeUnit)));
    }
    
    public final asfr e(final arro... array) {
        return this.a(arrs.b(this.a, array), this.b);
    }
}
