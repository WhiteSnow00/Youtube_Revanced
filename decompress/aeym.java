import java.util.function.Consumer;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.android.libraries.blocks.runtime.RuntimeStreamWriter;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.android.libraries.blocks.runtime.InstanceProxy;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aeym extends InstanceProxy
{
    public final aezc a;
    
    public aeym(final aezc a, final byte[] array) {
        this.a = a;
    }
    
    public final ListenableFuture a(final int n, final byte[] array) {
        final StringBuilder sb = new StringBuilder("No method found with identifier: ");
        sb.append(n);
        throw new IllegalArgumentException(sb.toString());
    }
    
    public final void b(final int n, final long n2, final byte[] array) {
        if (n == 1096794815) {
            final RuntimeStreamWriter runtimeStreamWriter = new RuntimeStreamWriter(n2);
            final aezc a = this.a;
            final ahcg ahcg = (ahcg)ahcz.parseFrom((ahcz)ahcg.a, array, ExtensionRegistryLite.getGeneratedRegistry());
            runtimeStreamWriter.a((Consumer)new uvp(((arzb)((arna)a.f).a()).h().aH((asmi)new uzc(runtimeStreamWriter, 9)), 5));
            return;
        }
        if (n == -1062169965) {
            final RuntimeStreamWriter runtimeStreamWriter2 = new RuntimeStreamWriter(n2);
            runtimeStreamWriter2.a((Consumer)new uvp(((arzb)((arna)this.a.f).a()).g((asmn)new uxa((aqea)ahcz.parseFrom((ahcz)aqea.a, array, ExtensionRegistryLite.getGeneratedRegistry()), 10)).aH((asmi)new uzc(runtimeStreamWriter2, 10)), 6));
            return;
        }
        final StringBuilder sb = new StringBuilder("No method found with identifier: ");
        sb.append(n);
        throw new IllegalArgumentException(sb.toString());
    }
    
    public final void c() {
    }
    
    public final boolean d(final int n) {
        return n == 550601787 || n == -1229548663 || n == -827674897 || n == 1096794815 || n == -62449909 || n == -1062169965;
    }
    
    public final byte[] e(final int n, final byte[] array) {
        if (n == 550601787) {
            final ahcg ahcg = (ahcg)ahcz.parseFrom((ahcz)ahcg.a, array, ExtensionRegistryLite.getGeneratedRegistry());
            return ((vbo)((arna)this.a.g).a()).b().toByteArray();
        }
        if (n == -1229548663) {
            final aqea aqea = (aqea)ahcz.parseFrom((ahcz)aqea.a, array, ExtensionRegistryLite.getGeneratedRegistry());
            ajtj ajtj;
            if ((ajtj = ((vbo)((arna)this.a.g).a()).b().y) == null) {
                ajtj = ajtj.a;
            }
            return ((ahbc)aezc.I(ajtj, aqea.b)).toByteArray();
        }
        if (n == -827674897) {
            final ahcg ahcg2 = (ahcg)ahcz.parseFrom((ahcz)ahcg.a, array, ExtensionRegistryLite.getGeneratedRegistry());
            return ((arzb)((arna)this.a.f).a()).f().toByteArray();
        }
        if (n == -62449909) {
            final aqea aqea2 = (aqea)ahcz.parseFrom((ahcz)aqea.a, array, ExtensionRegistryLite.getGeneratedRegistry());
            ajtj ajtj2;
            if ((ajtj2 = ((arzb)((arna)this.a.f).a()).f().A) == null) {
                ajtj2 = ajtj.a;
            }
            return ((ahbc)aezc.I(ajtj2, aqea2.b)).toByteArray();
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
