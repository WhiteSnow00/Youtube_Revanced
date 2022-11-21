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

public final class aeza extends InstanceProxy
{
    public final aeyz a;
    
    public aeza(final aeyz a) {
        this.a = a;
    }
    
    public final ListenableFuture a(final int n, final byte[] array) {
        final StringBuilder sb = new StringBuilder("No method found with identifier: ");
        sb.append(n);
        throw new IllegalArgumentException(sb.toString());
    }
    
    public final void b(final int n, final long n2, final byte[] array) {
        if (n == -1997309435) {
            final RuntimeStreamWriter runtimeStreamWriter = new RuntimeStreamWriter(n2);
            final aeyz a = this.a;
            final aqki aqki = (aqki)ahcz.parseFrom((ahcz)aqki.a, array, ExtensionRegistryLite.getGeneratedRegistry());
            final Subscription subscribe = ((ByteStore)((atnb)a.f).a()).subscribe(aqki.b, (Observer)new ojj(aqki, runtimeStreamWriter));
            if (subscribe != null) {
                runtimeStreamWriter.a((Consumer)new llr(subscribe, 14));
            }
            return;
        }
        final StringBuilder sb = new StringBuilder("No method found with identifier: ");
        sb.append(n);
        throw new IllegalArgumentException(sb.toString());
    }
    
    public final void c() {
    }
    
    public final boolean d(final int n) {
        return n == 1 || n == -764866051 || n == -1997309435 || n == 1862151975;
    }
    
    public final byte[] e(final int n, final byte[] array) {
        if (n == 1) {
            final aqki aqki = (aqki)ahcz.parseFrom((ahcz)aqki.a, array, ExtensionRegistryLite.getGeneratedRegistry());
            final Snapshot snapshot = ((ByteStore)((atnb)this.a.f).a()).snapshot();
            final ahcr builder = ((ahcz)aqkj.a).createBuilder();
            if (snapshot != null) {
                final byte[] noCopy = snapshot.findNoCopy(aqki.b);
                if (noCopy != null) {
                    final ahbt x = ahbt.x(noCopy);
                    builder.copyOnWrite();
                    final aqkj aqkj = (aqkj)builder.instance;
                    aqkj.b |= 0x1;
                    aqkj.c = x;
                }
            }
            return ((ahbc)builder.build()).toByteArray();
        }
        if (n == -764866051) {
            final aqkk aqkk = (aqkk)ahcz.parseFrom((ahcz)aqkk.a, array, ExtensionRegistryLite.getGeneratedRegistry());
            ((ByteStore)((atnb)this.a.f).a()).set(aqkk.b, aqkk.c.I());
            return ((ahbc)aqkl.a).toByteArray();
        }
        if (n == 1862151975) {
            return ((ahbc)ahbj.a(((ByteStore)((atnb)this.a.f).a()).snapshot().contains(((aqki)ahcz.parseFrom((ahcz)aqki.a, array, ExtensionRegistryLite.getGeneratedRegistry())).b))).toByteArray();
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
