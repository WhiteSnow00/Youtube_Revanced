import com.google.android.libraries.blocks.runtime.RuntimeStreamWriter;
import java.util.concurrent.Executor;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.android.libraries.blocks.runtime.InstanceProxy;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aeve extends InstanceProxy
{
    public final aevd a;
    
    public aeve(final aevd a) {
        this.a = a;
    }
    
    @Override
    public final ListenableFuture a(final int n, final byte[] array) {
        if (n == 879513754) {
            return afrp.f(this.a.ab((apyv)agzi.parseFrom((agzi)apyv.a, array, ExtensionRegistryLite.getGeneratedRegistry())), (afry)aada.d, (Executor)afsl.a);
        }
        final StringBuilder sb = new StringBuilder("No method found with identifier: ");
        sb.append(n);
        throw new IllegalArgumentException(sb.toString());
    }
    
    @Override
    public final void b(final int n, final long n2, final byte[] array) {
        if (n == -1743061909) {
            this.a.ac((apzv)agzi.parseFrom((agzi)apzv.a, array, ExtensionRegistryLite.getGeneratedRegistry()), new RuntimeStreamWriter(n2));
            return;
        }
        final StringBuilder sb = new StringBuilder("No method found with identifier: ");
        sb.append(n);
        throw new IllegalArgumentException(sb.toString());
    }
    
    @Override
    public final void c() {
    }
    
    @Override
    public final boolean d(final int n) {
        return n == -1743061909 || n == 879513754;
    }
    
    @Override
    public final byte[] e(final int n, final byte[] array) {
        final StringBuilder sb = new StringBuilder("No method found with identifier: ");
        sb.append(n);
        throw new IllegalArgumentException(sb.toString());
    }
    
    @Override
    public final void f(final int n) {
        final StringBuilder sb = new StringBuilder("No method found with identifier: ");
        sb.append(n);
        throw new IllegalArgumentException(sb.toString());
    }
    
    @Override
    public final ListenableFuture g(final int n) {
        final StringBuilder sb = new StringBuilder("No method found with identifier: ");
        sb.append(n);
        throw new IllegalArgumentException(sb.toString());
    }
}
