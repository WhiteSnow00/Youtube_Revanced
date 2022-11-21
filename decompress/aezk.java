import com.google.protobuf.ExtensionRegistryLite;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.android.libraries.blocks.runtime.InstanceProxy;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aezk extends InstanceProxy
{
    public final aezl a;
    
    public aezk(final aezl a) {
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
        return n == -274309211 || n == 969062564 || n == 1278837188 || n == 996377521 || n == -1918963920 || n == -597674369;
    }
    
    public final byte[] e(final int n, final byte[] array) {
        if (n == -274309211) {
            return ((ahbc)this.a.b((aqus)ahcz.parseFrom(aqus.a, array, ExtensionRegistryLite.getGeneratedRegistry()))).toByteArray();
        }
        if (n == 969062564) {
            final ahcg ahcg = (ahcg)ahcz.parseFrom((ahcz)ahcg.a, array, ExtensionRegistryLite.getGeneratedRegistry());
            return this.a.e().toByteArray();
        }
        if (n == 1278837188) {
            final ahcg ahcg2 = (ahcg)ahcz.parseFrom((ahcz)ahcg.a, array, ExtensionRegistryLite.getGeneratedRegistry());
            return this.a.f().toByteArray();
        }
        if (n == 996377521) {
            final ahcg ahcg3 = (ahcg)ahcz.parseFrom((ahcz)ahcg.a, array, ExtensionRegistryLite.getGeneratedRegistry());
            return this.a.g().toByteArray();
        }
        if (n == -1918963920) {
            return ((ahbc)this.a.c((aquy)ahcz.parseFrom(aquy.a, array, ExtensionRegistryLite.getGeneratedRegistry()))).toByteArray();
        }
        if (n == -597674369) {
            final ahcg ahcg4 = (ahcg)ahcz.parseFrom((ahcz)ahcg.a, array, ExtensionRegistryLite.getGeneratedRegistry());
            return ((ahbc)this.a.d()).toByteArray();
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
