import com.google.android.libraries.blocks.runtime.RuntimeStreamWriter;
import java.util.concurrent.Executor;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.android.libraries.blocks.runtime.InstanceProxy;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aeyv extends InstanceProxy
{
    public final aeyu a;
    
    public aeyv(final aeyu a) {
        this.a = a;
    }
    
    public final ListenableFuture a(final int n, final byte[] array) {
        if (n == 879513754) {
            return afvh.f(this.a.I((aqdt)ahcz.parseFrom((ahcz)aqdt.a, array, ExtensionRegistryLite.getGeneratedRegistry())), (afvq)aagt.d, (Executor)afwd.a);
        }
        final StringBuilder sb = new StringBuilder("No method found with identifier: ");
        sb.append(n);
        throw new IllegalArgumentException(sb.toString());
    }
    
    public final void b(final int n, final long n2, final byte[] array) {
        if (n == -1743061909) {
            this.a.J((aqfc)ahcz.parseFrom((ahcz)aqfc.a, array, ExtensionRegistryLite.getGeneratedRegistry()), new RuntimeStreamWriter(n2));
            return;
        }
        final StringBuilder sb = new StringBuilder("No method found with identifier: ");
        sb.append(n);
        throw new IllegalArgumentException(sb.toString());
    }
    
    public final void c() {
    }
    
    public final boolean d(final int n) {
        return n == -1743061909 || n == 879513754;
    }
    
    public final byte[] e(final int n, final byte[] array) {
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
