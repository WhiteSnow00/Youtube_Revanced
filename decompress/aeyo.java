import com.google.protobuf.ExtensionRegistryLite;
import com.google.android.libraries.blocks.runtime.RuntimeStreamWriter;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.android.libraries.blocks.runtime.InstanceProxy;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aeyo extends InstanceProxy
{
    public final aeyp a;
    
    public aeyo(final aeyp a) {
        this.a = a;
    }
    
    public final ListenableFuture a(final int n, final byte[] array) {
        final StringBuilder sb = new StringBuilder("No method found with identifier: ");
        sb.append(n);
        throw new IllegalArgumentException(sb.toString());
    }
    
    public final void b(final int n, final long n2, final byte[] array) {
        if (n == 2058110810) {
            final RuntimeStreamWriter runtimeStreamWriter = new RuntimeStreamWriter(n2);
            final aeyp a = this.a;
            final ahcg ahcg = (ahcg)ahcz.parseFrom((ahcz)ahcg.a, array, ExtensionRegistryLite.getGeneratedRegistry());
            a.j(runtimeStreamWriter);
            return;
        }
        if (n == 1489122403) {
            final RuntimeStreamWriter runtimeStreamWriter2 = new RuntimeStreamWriter(n2);
            final aeyp a2 = this.a;
            final ahcg ahcg2 = (ahcg)ahcz.parseFrom((ahcz)ahcg.a, array, ExtensionRegistryLite.getGeneratedRegistry());
            a2.i(runtimeStreamWriter2);
            return;
        }
        if (n == -1468256301) {
            final RuntimeStreamWriter runtimeStreamWriter3 = new RuntimeStreamWriter(n2);
            final aeyp a3 = this.a;
            final ahcg ahcg3 = (ahcg)ahcz.parseFrom((ahcz)ahcg.a, array, ExtensionRegistryLite.getGeneratedRegistry());
            a3.h(runtimeStreamWriter3);
            return;
        }
        final StringBuilder sb = new StringBuilder("No method found with identifier: ");
        sb.append(n);
        throw new IllegalArgumentException(sb.toString());
    }
    
    public final void c() {
    }
    
    public final boolean d(final int n) {
        return n == -1965322619 || n == 2058110810 || n == -222614826 || n == -1764962356 || n == -966226737 || n == 659148632 || n == 1489122403 || n == -1468256301;
    }
    
    public final byte[] e(final int n, final byte[] array) {
        if (n == -1965322619) {
            final ahcg ahcg = (ahcg)ahcz.parseFrom((ahcz)ahcg.a, array, ExtensionRegistryLite.getGeneratedRegistry());
            return ((ahbc)this.a.d()).toByteArray();
        }
        if (n == -222614826) {
            final ahcg ahcg2 = (ahcg)ahcz.parseFrom((ahcz)ahcg.a, array, ExtensionRegistryLite.getGeneratedRegistry());
            return ((ahbc)this.a.e()).toByteArray();
        }
        if (n == -1764962356) {
            final ahcg ahcg3 = (ahcg)ahcz.parseFrom((ahcz)ahcg.a, array, ExtensionRegistryLite.getGeneratedRegistry());
            return ((ahbc)this.a.f()).toByteArray();
        }
        if (n == -966226737) {
            final ahcg ahcg4 = (ahcg)ahcz.parseFrom((ahcz)ahcg.a, array, ExtensionRegistryLite.getGeneratedRegistry());
            return ((ahbc)this.a.c()).toByteArray();
        }
        if (n == 659148632) {
            final ahcg ahcg5 = (ahcg)ahcz.parseFrom((ahcz)ahcg.a, array, ExtensionRegistryLite.getGeneratedRegistry());
            return ((ahbc)this.a.b()).toByteArray();
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
