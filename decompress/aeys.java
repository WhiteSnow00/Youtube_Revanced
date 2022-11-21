import com.google.android.libraries.blocks.runtime.BaseClient;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.android.libraries.blocks.runtime.InstanceProxy;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aeys extends InstanceProxy
{
    public final aeyz a;
    
    public aeys(final aeyz a, final byte[] array, final byte[] array2) {
        this.a = a;
    }
    
    public final ListenableFuture a(final int n, final byte[] array) {
        final StringBuilder sb = new StringBuilder("No method found with identifier: ");
        sb.append(n);
        throw new IllegalArgumentException(sb.toString());
    }
    
    public final void b(final int n, final long n2, final byte[] array) {
        final StringBuilder sb = new StringBuilder("No method found with identifier: ");
        sb.append(n);
        throw new IllegalArgumentException(sb.toString());
    }
    
    public final void c() {
    }
    
    public final boolean d(final int n) {
        return n == -727186507;
    }
    
    public final byte[] e(final int n, final byte[] array) {
        if (n == -727186507) {
            final aqex aqex = (aqex)ahcz.parseFrom((ahcz)aqex.a, array, ExtensionRegistryLite.getGeneratedRegistry());
            final aeyz a = this.a;
            final ahcr builder = ((ahcz)aqey.a).createBuilder();
            final Object f = a.f;
            final ahcr builder2 = ((ahcz)aqez.a).createBuilder();
            final String e = ((BaseClient)f).e();
            builder2.copyOnWrite();
            final aqez aqez = (aqez)builder2.instance;
            e.getClass();
            aqez.b |= 0x1;
            aqez.c = e;
            final aqez c = (aqez)builder2.build();
            builder.copyOnWrite();
            final aqey aqey = (aqey)builder.instance;
            c.getClass();
            aqey.c = c;
            aqey.b |= 0x1;
            return ((ahbc)builder.build()).toByteArray();
        }
        final StringBuilder sb = new StringBuilder("No method found with identifier: ");
        sb.append(n);
        throw new IllegalArgumentException(sb.toString());
    }
    
    public final void f(final int n) {
        final StringBuilder sb = new StringBuilder("No method found with identifier: ");
        sb.append(n);
        throw new IllegalArgumentException(sb.toString());
    }
    
    public final ListenableFuture g(final int n) {
        final StringBuilder sb = new StringBuilder("No method found with identifier: ");
        sb.append(n);
        throw new IllegalArgumentException(sb.toString());
    }
}
