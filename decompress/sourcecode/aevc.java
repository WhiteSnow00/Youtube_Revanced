import java.util.concurrent.Executor;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.android.libraries.blocks.runtime.InstanceProxy;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aevc extends InstanceProxy
{
    public final aevi a;
    
    public aevc(final aevi a, final byte[] array) {
        this.a = a;
    }
    
    @Override
    public final ListenableFuture a(final int n, final byte[] array) {
        if (n == 1177725603) {
            final agyp agyp = (agyp)agzi.parseFrom((agzi)agyp.a, array, ExtensionRegistryLite.getGeneratedRegistry());
            return afrp.f(afva.m((Object)this.a.ab()), (afry)aada.c, (Executor)afsl.a);
        }
        final StringBuilder sb = new StringBuilder("No method found with identifier: ");
        sb.append(n);
        throw new IllegalArgumentException(sb.toString());
    }
    
    @Override
    public final void b(final int n, final long n2, final byte[] array) {
        final StringBuilder sb = new StringBuilder("No method found with identifier: ");
        sb.append(n);
        throw new IllegalArgumentException(sb.toString());
    }
    
    @Override
    public final void c() {
    }
    
    @Override
    public final boolean d(final int n) {
        return n == 1299956865 || n == 1177725603;
    }
    
    @Override
    public final byte[] e(final int n, final byte[] array) {
        if (n == 1299956865) {
            final agyp agyp = (agyp)agzi.parseFrom((agzi)agyp.a, array, ExtensionRegistryLite.getGeneratedRegistry());
            return ((agxl)this.a.ab()).toByteArray();
        }
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
