import com.google.protobuf.ExtensionRegistryLite;
import com.google.android.libraries.blocks.runtime.RuntimeStreamWriter;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.android.libraries.blocks.runtime.InstanceProxy;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aeyq extends InstanceProxy
{
    public final aeyr a;
    
    public aeyq(final aeyr a) {
        this.a = a;
    }
    
    public final ListenableFuture a(final int n, final byte[] array) {
        final StringBuilder sb = new StringBuilder("No method found with identifier: ");
        sb.append(n);
        throw new IllegalArgumentException(sb.toString());
    }
    
    public final void b(final int n, final long n2, final byte[] array) {
        if (n == 1379707729) {
            final RuntimeStreamWriter runtimeStreamWriter = new RuntimeStreamWriter(n2);
            final aeyr a = this.a;
            final ahcg ahcg = (ahcg)ahcz.parseFrom((ahcz)ahcg.a, array, ExtensionRegistryLite.getGeneratedRegistry());
            a.i(runtimeStreamWriter);
            return;
        }
        final StringBuilder sb = new StringBuilder("No method found with identifier: ");
        sb.append(n);
        throw new IllegalArgumentException(sb.toString());
    }
    
    public final void c() {
    }
    
    public final boolean d(final int n) {
        return n == 669964186 || n == 1379707729 || n == -1333711387 || n == -238953732 || n == -1918963920 || n == -977141100 || n == -1700092881 || n == -2061976318 || n == 1416723429;
    }
    
    public final byte[] e(final int n, final byte[] array) {
        if (n == 669964186) {
            final ahcg ahcg = (ahcg)ahcz.parseFrom((ahcz)ahcg.a, array, ExtensionRegistryLite.getGeneratedRegistry());
            return ((ahbc)this.a.h()).toByteArray();
        }
        if (n == -1333711387) {
            return ((ahbc)this.a.e((aqes)ahcz.parseFrom((ahcz)aqes.a, array, ExtensionRegistryLite.getGeneratedRegistry()))).toByteArray();
        }
        if (n == -238953732) {
            final ahcg ahcg2 = (ahcg)ahcz.parseFrom((ahcz)ahcg.a, array, ExtensionRegistryLite.getGeneratedRegistry());
            return ((ahbc)this.a.g()).toByteArray();
        }
        if (n == -1918963920) {
            return ((ahbc)this.a.a((aqfe)ahcz.parseFrom((ahcz)aqfe.a, array, ExtensionRegistryLite.getGeneratedRegistry()))).toByteArray();
        }
        if (n == -977141100) {
            return ((ahbc)this.a.c((aqdi)ahcz.parseFrom((ahcz)aqdi.a, array, ExtensionRegistryLite.getGeneratedRegistry()))).toByteArray();
        }
        if (n == -1700092881) {
            final ahcg ahcg3 = (ahcg)ahcz.parseFrom((ahcz)ahcg.a, array, ExtensionRegistryLite.getGeneratedRegistry());
            return ((ahbc)this.a.f()).toByteArray();
        }
        if (n == -2061976318) {
            return ((ahbc)this.a.d((aqer)ahcz.parseFrom((ahcz)aqer.a, array, ExtensionRegistryLite.getGeneratedRegistry()))).toByteArray();
        }
        if (n == 1416723429) {
            return ((ahbc)this.a.b((aqdf)ahcz.parseFrom((ahcz)aqdf.a, array, ExtensionRegistryLite.getGeneratedRegistry()))).toByteArray();
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
