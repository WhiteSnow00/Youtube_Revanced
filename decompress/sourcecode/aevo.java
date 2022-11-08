import java.util.function.Consumer;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.android.libraries.blocks.runtime.RuntimeStreamWriter;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.android.libraries.blocks.runtime.InstanceProxy;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aevo extends InstanceProxy
{
    public final aeby a;
    
    public aevo(final aeby a, final byte[] array, final byte[] array2, final byte[] array3) {
        this.a = a;
    }
    
    @Override
    public final ListenableFuture a(final int n, final byte[] array) {
        final StringBuilder sb = new StringBuilder("No method found with identifier: ");
        sb.append(n);
        throw new IllegalArgumentException(sb.toString());
    }
    
    @Override
    public final void b(final int n, final long n2, final byte[] array) {
        if (n == -1997309435) {
            final RuntimeStreamWriter runtimeStreamWriter = new RuntimeStreamWriter(n2);
            runtimeStreamWriter.a((Consumer)new abtb(((vce)this.a.a).h(((aqmb)agzi.parseFrom((agzi)aqmb.a, array, ExtensionRegistryLite.getGeneratedRegistry())).b, true).aB((asix)new abtm(runtimeStreamWriter, 12)), 2));
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
        return n == -1997309435;
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
