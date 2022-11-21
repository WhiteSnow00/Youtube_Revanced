import android.os.Bundle;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arnl implements avs
{
    private final Set a;
    private final avs b;
    private final atx c;
    
    public arnl(final cgn cgn, final Bundle bundle, final Set a, final avs b, final erg erg) {
        this.a = a;
        this.b = b;
        this.c = (atx)new arnj(cgn, bundle, erg);
    }
    
    public final avq a(final Class clazz) {
        if (this.a.contains(clazz.getName())) {
            return this.c.a(clazz);
        }
        return this.b.a(clazz);
    }
    
    public final avq b(final Class clazz, final avz avz) {
        return aqo.e((avs)this, clazz);
    }
}
