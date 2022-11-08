import com.google.protobuf.ExtensionRegistryLite;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.android.libraries.blocks.runtime.InstanceProxy;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aevt extends InstanceProxy
{
    public final aevu a;
    
    public aevt(final aevu a) {
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
        return n == -274309211 || n == 969062564 || n == 1278837188 || n == 996377521 || n == -1918963920 || n == -597674369;
    }
    
    @Override
    public final byte[] e(final int n, final byte[] array) {
        if (n == -274309211) {
            return ((agxl)this.a.b((aqpn)agzi.parseFrom((agzi)aqpn.a, array, ExtensionRegistryLite.getGeneratedRegistry()))).toByteArray();
        }
        if (n == 969062564) {
            final agyp agyp = (agyp)agzi.parseFrom((agzi)agyp.a, array, ExtensionRegistryLite.getGeneratedRegistry());
            return ((agxl)this.a.e()).toByteArray();
        }
        if (n == 1278837188) {
            final agyp agyp2 = (agyp)agzi.parseFrom((agzi)agyp.a, array, ExtensionRegistryLite.getGeneratedRegistry());
            return ((agxl)this.a.f()).toByteArray();
        }
        if (n == 996377521) {
            final agyp agyp3 = (agyp)agzi.parseFrom((agzi)agyp.a, array, ExtensionRegistryLite.getGeneratedRegistry());
            return ((agxl)this.a.g()).toByteArray();
        }
        if (n == -1918963920) {
            return ((agxl)this.a.c((aqpt)agzi.parseFrom((agzi)aqpt.a, array, ExtensionRegistryLite.getGeneratedRegistry()))).toByteArray();
        }
        if (n == -597674369) {
            final agyp agyp4 = (agyp)agzi.parseFrom((agzi)agyp.a, array, ExtensionRegistryLite.getGeneratedRegistry());
            return ((agxl)this.a.d()).toByteArray();
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
