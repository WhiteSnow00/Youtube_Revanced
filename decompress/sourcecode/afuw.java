import java.util.Set;
import java.security.GeneralSecurityException;

// 
// Decompiled by Procyon v0.6.0
// 

final class afuw implements afux
{
    final /* synthetic */ afyq a;
    final /* synthetic */ afyj b;
    
    public afuw(final afyq a, final afyj b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final afut a(final Class clazz) {
        try {
            return new afuu((afyj)this.a, clazz);
        }
        catch (final IllegalArgumentException ex) {
            throw new GeneralSecurityException("Primitive type not supported", ex);
        }
    }
    
    @Override
    public final afut b() {
        final afyq a = this.a;
        return new afuu((afyj)a, ((afyj)a).c);
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
        return ((afyj)this.a).j();
    }
}
