import com.google.android.libraries.blocks.runtime.BaseClient;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.android.libraries.blocks.runtime.InstanceProxy;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aevb extends InstanceProxy
{
    public final aevi a;
    
    public aevb(final aevi a, final byte[] array, final byte[] array2) {
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
        final StringBuilder sb = new StringBuilder("No method found with identifier: ");
        sb.append(n);
        throw new IllegalArgumentException(sb.toString());
    }
    
    @Override
    public final void c() {
    }
    
    @Override
    public final boolean d(final int n) {
        return n == -727186507;
    }
    
    @Override
    public final byte[] e(final int n, final byte[] array) {
        if (n == -727186507) {
            final apzr apzr = (apzr)agzi.parseFrom((agzi)apzr.a, array, ExtensionRegistryLite.getGeneratedRegistry());
            final aevi a = this.a;
            final agza builder = ((agzi)apzs.a).createBuilder();
            final Object f = a.f;
            final agza builder2 = ((agzi)apzt.a).createBuilder();
            final String e = ((BaseClient)f).e();
            builder2.copyOnWrite();
            final apzt apzt = (apzt)builder2.instance;
            e.getClass();
            apzt.b |= 0x1;
            apzt.c = e;
            final apzt c = (apzt)builder2.build();
            builder.copyOnWrite();
            final apzs apzs = (apzs)builder.instance;
            c.getClass();
            apzs.c = c;
            apzs.b |= 0x1;
            return ((agxl)builder.build()).toByteArray();
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
