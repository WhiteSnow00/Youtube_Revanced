import java.util.Collections;
import java.util.Set;
import java.security.GeneralSecurityException;

// 
// Decompiled by Procyon v0.6.0
// 

final class afyo implements afyq
{
    final Object a;
    private final int b;
    
    public afyo(final afym a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public afyo(final agcc a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final afym a(final Class clazz) {
        if (this.b != 0) {
            if (((afym)this.a).b().equals(clazz)) {
                return (afym)this.a;
            }
            throw new InternalError("This should never be called, as we always first check supportedPrimitives.");
        }
        else {
            try {
                return new afyn((agcc)this.a, clazz);
            }
            catch (final IllegalArgumentException ex) {
                throw new GeneralSecurityException("Primitive type not supported", ex);
            }
        }
    }
    
    @Override
    public final afym b() {
        if (this.b != 0) {
            return (afym)this.a;
        }
        final agcc agcc = (agcc)this.a;
        return new afyn(agcc, agcc.c);
    }
    
    @Override
    public final Class c() {
        final int b = this.b;
        return this.a.getClass();
    }
    
    @Override
    public final Class d() {
        return null;
    }
    
    @Override
    public final Set e() {
        if (this.b != 0) {
            return Collections.singleton(((afym)this.a).b());
        }
        return ((agcc)this.a).j();
    }
}
