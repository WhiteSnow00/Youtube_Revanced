import com.google.protobuf.ExtensionRegistryLite;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.android.libraries.blocks.runtime.InstanceProxy;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aeyl extends InstanceProxy
{
    public final aeyz a;
    
    public aeyl(final aeyz a, final byte[] array, final byte[] array2) {
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
        return n == 1199368048;
    }
    
    public final byte[] e(final int n, final byte[] array) {
        if (n == 1199368048) {
            final aqef aqef = (aqef)ahcz.parseFrom((ahcz)aqef.a, array, ExtensionRegistryLite.getGeneratedRegistry());
            final wza wza = (wza)((arna)this.a.f).a();
            akpu akpu;
            if ((akpu = aqef.b) == null) {
                akpu = akpu.h();
            }
            final boolean d = wza.d(akpu);
            final ahcr builder = ((ahcz)aqeg.a).createBuilder();
            builder.copyOnWrite();
            final aqeg aqeg = (aqeg)builder.instance;
            aqeg.b |= 0x1;
            aqeg.c = d;
            return ((ahbc)builder.build()).toByteArray();
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
