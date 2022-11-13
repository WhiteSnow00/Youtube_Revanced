import java.io.Closeable;
import android.os.Bundle;

// 
// Decompiled by Procyon v0.6.0
// 

final class arkp extends atv
{
    final ere a;
    
    public arkp(final cgk cgk, final Bundle bundle, final ere a) {
        this.a = a;
        super(cgk, bundle);
    }
    
    protected final avp d(final Class clazz, final avi b) {
        final arks c = new arks();
        final ere a = this.a;
        a.b = b;
        a.c = (arkl)c;
        arbu.y(a.b, avi.class);
        arbu.y(a.c, arkl.class);
        final atke atke = ((arkq)aqsy.k((Object)new esz(a.a, a.b), (Class)arkq.class)).a().get(clazz.getName());
        if (atke != null) {
            final avp avp = (avp)atke.a();
            avp.s((Closeable)new qrf(c, 3));
            return avp;
        }
        final String name = clazz.getName();
        final StringBuilder sb = new StringBuilder("Expected the @HiltViewModel-annotated class '");
        sb.append(name);
        sb.append("' to be available in the multi-binding of @HiltViewModelMap but none was found.");
        throw new IllegalStateException(sb.toString());
    }
}
