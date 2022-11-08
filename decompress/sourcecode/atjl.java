import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atjl implements Serializable, atjm
{
    private final Object a;
    
    public atjl(final Object a) {
        this.a = a;
    }
    
    @Override
    public final Object a() {
        return this.a;
    }
    
    @Override
    public final boolean b() {
        throw null;
    }
    
    @Override
    public final String toString() {
        return String.valueOf(this.a);
    }
}
