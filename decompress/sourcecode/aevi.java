import java.security.SecureRandom;
import java.util.function.Function;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aevi extends oaw
{
    public final Object f;
    
    public aevi(final arhr f) {
        this.f = f;
    }
    
    public aevi(final atjj f) {
        this.f = f;
    }
    
    public aevi(final nmo nmo, final abns abns, final byte[] array, final byte[] array2) {
        this.f = nmo.h((oaj)new xtg(14), (Function)new gjk(nmo, abns, 9, (byte[])null, (byte[])null));
    }
    
    public aevi(final vil f) {
        this.f = f;
    }
    
    public final apzu ab() {
        final agza builder = ((agzi)apzu.a).createBuilder();
        final float nextFloat = ((SecureRandom)((arhr)this.f).a()).nextFloat();
        builder.copyOnWrite();
        final apzu apzu = (apzu)builder.instance;
        apzu.b |= 0x1;
        apzu.c = nextFloat;
        return (apzu)builder.build();
    }
}
