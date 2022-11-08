import com.google.protobuf.ExtensionRegistryLite;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.android.libraries.blocks.runtime.InstanceProxy;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aevg extends InstanceProxy
{
    public final aevf a;
    
    public aevg(final aevf a) {
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
        return n == 1820290358;
    }
    
    @Override
    public final byte[] e(int c, final byte[] array) {
        if (c == 1820290358) {
            final aqau aqau = (aqau)agzi.parseFrom((agzi)aqau.a, array, ExtensionRegistryLite.getGeneratedRegistry());
            final aevf a = this.a;
            long n;
            if ((aqau.b & 0x1) != 0x0) {
                ahca ahca;
                if ((ahca = aqau.e) == null) {
                    ahca = ahca.a;
                }
                n = ahdd.b(ahca);
            }
            else {
                n = a.f.c();
            }
            c = aqau.c;
            Label_0149: {
                if (c != 8) {
                    if (c != 9 && c != 10 && c != 13) {
                        a.g.execute(aesm.h((Runnable)new hbw(a, aqau, n, 10)));
                        break Label_0149;
                    }
                }
                a.ab(aqau, n);
            }
            final agza builder = ((agzi)aqav.a).createBuilder();
            builder.copyOnWrite();
            final aqav aqav = (aqav)builder.instance;
            aqav.b |= 0x1;
            aqav.c = true;
            return ((agxl)builder.build()).toByteArray();
        }
        final StringBuilder sb = new StringBuilder("No method found with identifier: ");
        sb.append(c);
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
