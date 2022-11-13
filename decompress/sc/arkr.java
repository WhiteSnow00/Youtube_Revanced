import android.os.Bundle;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arkr implements avr
{
    private final Set a;
    private final avr b;
    private final atv c;
    
    public arkr(final cgk cgk, final Bundle bundle, final Set a, final avr b, final ere ere) {
        this.a = a;
        this.b = b;
        this.c = new arkp(cgk, bundle, ere);
    }
    
    public final avp a(final Class clazz) {
        if (this.a.contains(clazz.getName())) {
            return this.c.a(clazz);
        }
        return this.b.a(clazz);
    }
    
    public final avp b(final Class clazz, final avy avy) {
        return atc.d((avr)this, clazz);
    }
}
