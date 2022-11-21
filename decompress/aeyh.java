import com.google.protobuf.ExtensionRegistryLite;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.android.libraries.blocks.runtime.InstanceProxy;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aeyh extends InstanceProxy
{
    public final aeyg a;
    
    public aeyh(final aeyg a) {
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
        return n == -1127349984 || n == 57022758;
    }
    
    public final byte[] e(final int n, final byte[] array) {
        if (n == -1127349984) {
            final ahcg ahcg = (ahcg)ahcz.parseFrom((ahcz)ahcg.a, array, ExtensionRegistryLite.getGeneratedRegistry());
            final aeyg a = this.a;
            final ahcr builder = ((ahcz)aqds.a).createBuilder();
            final ahfq c = ahgt.c(a.f.c());
            builder.copyOnWrite();
            final aqds aqds = (aqds)builder.instance;
            c.getClass();
            aqds.c = c;
            aqds.b |= 0x1;
            return ((ahbc)builder.build()).toByteArray();
        }
        if (n == 57022758) {
            final ahcg ahcg2 = (ahcg)ahcz.parseFrom((ahcz)ahcg.a, array, ExtensionRegistryLite.getGeneratedRegistry());
            final aeyg a2 = this.a;
            final ahcr builder2 = ((ahcz)aqeh.a).createBuilder();
            final long e = a2.f.e();
            final long g = a2.g;
            builder2.copyOnWrite();
            final aqeh aqeh = (aqeh)builder2.instance;
            aqeh.b |= 0x1;
            aqeh.c = e - g;
            return ((ahbc)builder2.build()).toByteArray();
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
