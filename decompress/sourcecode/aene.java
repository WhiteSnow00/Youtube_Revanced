import java.io.Closeable;
import android.os.Bundle;

// 
// Decompiled by Procyon v0.6.0
// 

final class aene extends atu
{
    final /* synthetic */ hgm a;
    
    public aene(final cgj cgj, final Bundle bundle, final hgm a, final byte[] array, final byte[] array2) {
        this.a = a;
        super(cgj, bundle);
    }
    
    protected final avo d(final Class clazz, final avh b) {
        final arid a = new arid();
        final hgm a2 = this.a;
        a2.b = b;
        a2.a = a;
        aqzg.z(a2.b, (Class)avh.class);
        aqzg.z(a2.a, (Class)arhw.class);
        final atjj atjj = ((aenf)aqqm.k((Object)new esv(), (Class)aenf.class)).a().get(clazz.getName());
        if (atjj != null) {
            final avo avo = (avo)atjj.a();
            avo.s((Closeable)new qpv(a, 2));
            return avo;
        }
        final String name = clazz.getName();
        final StringBuilder sb = new StringBuilder("Expected the @AccountViewModel-annotated class '");
        sb.append(name);
        sb.append("' to be available in the multi-binding of @AccountViewModelMap but none was found.");
        throw new IllegalStateException(sb.toString());
    }
}
