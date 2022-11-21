import java.util.UUID;

// 
// Decompiled by Procyon v0.6.0
// 

abstract class aeto implements aevk
{
    private final aevk a;
    private final UUID b;
    private final String c;
    
    public aeto(final String c, final aevk a) {
        c.getClass();
        this.c = c;
        this.a = a;
        this.b = a.d();
    }
    
    public aeto(final String c, final UUID b) {
        c.getClass();
        this.c = c;
        this.a = null;
        this.b = b;
    }
    
    @Override
    public final aevk a() {
        return this.a;
    }
    
    @Override
    public final String b() {
        return this.c;
    }
    
    @Override
    public final Thread c() {
        return null;
    }
    
    @Override
    public final void close() {
        aewp.j(this);
    }
    
    @Override
    public final UUID d() {
        return this.b;
    }
    
    @Override
    public final String toString() {
        return aewp.h(this);
    }
}
