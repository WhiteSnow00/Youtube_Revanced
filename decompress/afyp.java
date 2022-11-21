import java.util.Set;
import java.security.GeneralSecurityException;

// 
// Decompiled by Procyon v0.6.0
// 

final class afyp implements afyq
{
    final agcj a;
    final agcc b;
    
    public afyp(final agcj a, final agcc b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final afym a(final Class clazz) {
        try {
            return new afyn(this.a, clazz);
        }
        catch (final IllegalArgumentException ex) {
            throw new GeneralSecurityException("Primitive type not supported", ex);
        }
    }
    
    @Override
    public final afym b() {
        final agcj a = this.a;
        return new afyn(a, a.c);
    }
    
    @Override
    public final Class c() {
        return this.a.getClass();
    }
    
    @Override
    public final Class d() {
        return this.b.getClass();
    }
    
    @Override
    public final Set e() {
        return this.a.j();
    }
}
