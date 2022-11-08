import com.google.android.libraries.elements.interfaces.Snapshot;
import com.google.android.libraries.elements.interfaces.Subscription;
import java.util.function.Consumer;
import com.google.android.libraries.elements.interfaces.Observer;
import com.google.android.libraries.elements.interfaces.ByteStore;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.android.libraries.blocks.runtime.RuntimeStreamWriter;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.android.libraries.blocks.runtime.InstanceProxy;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aevj extends InstanceProxy
{
    public final aevi a;
    
    public aevj(final aevi a) {
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
        if (n == -1997309435) {
            final RuntimeStreamWriter runtimeStreamWriter = new RuntimeStreamWriter(n2);
            final aevi a = this.a;
            final aqfc aqfc = (aqfc)agzi.parseFrom((agzi)aqfc.a, array, ExtensionRegistryLite.getGeneratedRegistry());
            final Subscription subscribe = ((ByteStore)((atjj)a.f).a()).subscribe(aqfc.b, (Observer)new ohl(aqfc, runtimeStreamWriter));
            if (subscribe != null) {
                runtimeStreamWriter.a((Consumer)new lke(subscribe, 11));
            }
            return;
        }
        final StringBuilder sb = new StringBuilder("No method found with identifier: ");
        sb.append(n);
        throw new IllegalArgumentException(sb.toString());
    }
    
    @Override
    public final void c() {
    }
    
    @Override
    public final boolean d(final int n) {
        return n == 1 || n == -764866051 || n == -1997309435 || n == 1862151975;
    }
    
    @Override
    public final byte[] e(final int n, final byte[] array) {
        if (n == 1) {
            final aqfc aqfc = (aqfc)agzi.parseFrom((agzi)aqfc.a, array, ExtensionRegistryLite.getGeneratedRegistry());
            final Snapshot snapshot = ((ByteStore)((atjj)this.a.f).a()).snapshot();
            final agza builder = aqfd.a.createBuilder();
            if (snapshot != null) {
                final byte[] noCopy = snapshot.findNoCopy(aqfc.b);
                if (noCopy != null) {
                    final agyc x = agyc.x(noCopy);
                    builder.copyOnWrite();
                    final aqfd aqfd = (aqfd)builder.instance;
                    aqfd.b |= 0x1;
                    aqfd.c = x;
                }
            }
            return ((agxl)builder.build()).toByteArray();
        }
        if (n == -764866051) {
            final aqfe aqfe = (aqfe)agzi.parseFrom((agzi)aqfe.a, array, ExtensionRegistryLite.getGeneratedRegistry());
            ((ByteStore)((atjj)this.a.f).a()).set(aqfe.b, aqfe.c.I());
            return ((agxl)aqff.a).toByteArray();
        }
        if (n == 1862151975) {
            return ((agxl)agxs.a(((ByteStore)((atjj)this.a.f).a()).snapshot().contains(((aqfc)agzi.parseFrom((agzi)aqfc.a, array, ExtensionRegistryLite.getGeneratedRegistry())).b))).toByteArray();
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
