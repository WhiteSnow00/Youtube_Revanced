import java.security.SecureRandom;
import java.util.function.Function;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aeyz extends ocs
{
    public final Object f;
    
    public aeyz(final arna f) {
        this.f = f;
    }
    
    public aeyz(final atnb f) {
        this.f = f;
    }
    
    public aeyz(final noj noj, final abqz abqz, final byte[] array, final byte[] array2) {
        this.f = noj.i((ocf)new xwx(15), (Function)new gjw(noj, abqz, 9, (byte[])null, (byte[])null));
    }
    
    public aeyz(final vlv f) {
        this.f = f;
    }
    
    public final aqfb I() {
        final ahcr builder = ((ahcz)aqfb.a).createBuilder();
        final float nextFloat = ((SecureRandom)((arna)this.f).a()).nextFloat();
        builder.copyOnWrite();
        final aqfb aqfb = (aqfb)builder.instance;
        aqfb.b |= 0x1;
        aqfb.c = nextFloat;
        return (aqfb)builder.build();
    }
}
