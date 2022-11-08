import java.util.Collections;
import java.util.Set;
import java.security.GeneralSecurityException;

// 
// Decompiled by Procyon v0.6.0
// 

final class afuv implements afux
{
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;
    
    public afuv(final afut a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public afuv(final afyj a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final afut a(final Class clazz) {
        if (this.b != 0) {
            if (((afut)this.a).b().equals(clazz)) {
                return (afut)this.a;
            }
            throw new InternalError("This should never be called, as we always first check supportedPrimitives.");
        }
        else {
            try {
                return new afuu((afyj)this.a, clazz);
            }
            catch (final IllegalArgumentException ex) {
                throw new GeneralSecurityException("Primitive type not supported", ex);
            }
        }
    }
    
    @Override
    public final afut b() {
        if (this.b != 0) {
            return (afut)this.a;
        }
        final afyj afyj = (afyj)this.a;
        return new afuu(afyj, afyj.c);
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
            return Collections.singleton(((afut)this.a).b());
        }
        return ((afyj)this.a).j();
    }
}
