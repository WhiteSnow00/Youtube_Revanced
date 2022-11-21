import com.google.protobuf.ExtensionRegistryLite;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.android.libraries.blocks.runtime.InstanceProxy;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aeyx extends InstanceProxy
{
    public final aeyw a;
    
    public aeyx(final aeyw a) {
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
        return n == 1820290358;
    }
    
    public final byte[] e(int c, final byte[] array) {
        if (c == 1820290358) {
            final aqga aqga = (aqga)ahcz.parseFrom((ahcz)aqga.a, array, ExtensionRegistryLite.getGeneratedRegistry());
            final aeyw a = this.a;
            long n;
            if ((aqga.b & 0x1) != 0x0) {
                ahfq ahfq;
                if ((ahfq = aqga.e) == null) {
                    ahfq = ahfq.a;
                }
                n = ahgt.b(ahfq);
            }
            else {
                n = a.f.c();
            }
            c = aqga.c;
            Label_0150: {
                if (c != 8) {
                    if (c != 9 && c != 10 && c != 13) {
                        a.g.execute(aewf.h((Runnable)new hcw(a, aqga, n, 10)));
                        break Label_0150;
                    }
                }
                a.I(aqga, n);
            }
            final ahcr builder = ((ahcz)aqgb.a).createBuilder();
            builder.copyOnWrite();
            final aqgb aqgb = (aqgb)builder.instance;
            aqgb.b |= 0x1;
            aqgb.c = true;
            return ((ahbc)builder.build()).toByteArray();
        }
        final StringBuilder sb = new StringBuilder("No method found with identifier: ");
        sb.append(c);
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
