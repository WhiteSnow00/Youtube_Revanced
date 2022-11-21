import java.io.Closeable;
import android.os.Bundle;

// 
// Decompiled by Procyon v0.6.0
// 

final class aeqx extends atx
{
    final hho a;
    
    public aeqx(final cgn cgn, final Bundle bundle, final hho a, final byte[] array, final byte[] array2) {
        this.a = a;
        super(cgn, bundle);
    }
    
    @Override
    protected final avq d(final Class clazz, final avj b) {
        final arnm a = new arnm();
        final hho a2 = this.a;
        a2.b = b;
        a2.a = a;
        arxu.o(a2.b, avj.class);
        arxu.o(a2.a, arnf.class);
        final atnb atnb = ((aeqy)aqvs.i((Object)new eta(), (Class)aeqy.class)).a().get(clazz.getName());
        if (atnb != null) {
            final avq avq = (avq)atnb.a();
            avq.s((Closeable)new qrx(a, 2));
            return avq;
        }
        final String name = clazz.getName();
        final StringBuilder sb = new StringBuilder("Expected the @AccountViewModel-annotated class '");
        sb.append(name);
        sb.append("' to be available in the multi-binding of @AccountViewModelMap but none was found.");
        throw new IllegalStateException(sb.toString());
    }
}
