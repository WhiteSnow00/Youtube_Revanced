import android.os.Bundle;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aric implements avq
{
    private final Set a;
    private final avq b;
    private final atu c;
    
    public aric(final cgj cgj, final Bundle bundle, final Set a, final avq b, final erb erb) {
        this.a = a;
        this.b = b;
        this.c = (atu)new aria(cgj, bundle, erb);
    }
    
    public final avo a(final Class clazz) {
        if (this.a.contains(clazz.getName())) {
            return this.c.a(clazz);
        }
        return this.b.a(clazz);
    }
}
