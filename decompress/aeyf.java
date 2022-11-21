import java.util.function.Function;
import j$.util.Optional;
import java.util.function.Consumer;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.android.libraries.blocks.runtime.RuntimeStreamWriter;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.android.libraries.blocks.runtime.InstanceProxy;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aeyf extends InstanceProxy
{
    public final aeye a;
    
    public aeyf(final aeye a) {
        this.a = a;
    }
    
    public final ListenableFuture a(final int n, final byte[] array) {
        final StringBuilder sb = new StringBuilder("No method found with identifier: ");
        sb.append(n);
        throw new IllegalArgumentException(sb.toString());
    }
    
    public final void b(final int n, final long n2, final byte[] array) {
        if (n == 419345197) {
            final RuntimeStreamWriter runtimeStreamWriter = new RuntimeStreamWriter(n2);
            final aeye a = this.a;
            final ahcg ahcg = (ahcg)ahcz.parseFrom((ahcz)ahcg.a, array, ExtensionRegistryLite.getGeneratedRegistry());
            runtimeStreamWriter.a((Consumer)new snm(((askp)a.h.a).i(asjx.c).am((asmi)new tbf(runtimeStreamWriter, 3)), 17));
            return;
        }
        if (n == 874522134) {
            final RuntimeStreamWriter runtimeStreamWriter2 = new RuntimeStreamWriter(n2);
            final aeye a2 = this.a;
            final ahcg ahcg2 = (ahcg)ahcz.parseFrom((ahcz)ahcg.a, array, ExtensionRegistryLite.getGeneratedRegistry());
            runtimeStreamWriter2.a((Consumer)new snm(((aske)a2.i.a).am((asmi)new tpd(a2, runtimeStreamWriter2, 1)), 18));
            return;
        }
        final StringBuilder sb = new StringBuilder("No method found with identifier: ");
        sb.append(n);
        throw new IllegalArgumentException(sb.toString());
    }
    
    public final void c() {
    }
    
    public final boolean d(final int n) {
        return n == 419345197 || n == 874522134 || n == 1578688571 || n == -1637335863 || n == -273674961;
    }
    
    public final byte[] e(final int n, final byte[] array) {
        if (n == 1578688571) {
            final ahcg ahcg = (ahcg)ahcz.parseFrom((ahcz)ahcg.a, array, ExtensionRegistryLite.getGeneratedRegistry());
            final aeye a = this.a;
            final ahcr builder = ((ahcz)anhq.a).createBuilder();
            final anhp k = a.h.K();
            builder.copyOnWrite();
            final anhq anhq = (anhq)builder.instance;
            anhq.c = k.m;
            anhq.b |= 0x1;
            return ((ahbc)builder.build()).toByteArray();
        }
        if (n == -1637335863) {
            final anhr anhr = (anhr)ahcz.parseFrom((ahcz)anhr.a, array, ExtensionRegistryLite.getGeneratedRegistry());
            final aeye a2 = this.a;
            if ((anhr.b & 0x1) != 0x0 && a2.f.containsKey(a2.h.K())) {
                final afgm f = a2.f;
                anhp anhp;
                if ((anhp = anhp.b(anhr.c)) == null) {
                    anhp = anhp.a;
                }
                if (f.containsKey(anhp)) {
                    anhp anhp2;
                    if ((anhp2 = anhp.b(anhr.c)) == null) {
                        anhp2 = anhp.a;
                    }
                    if (((Optional)a2.g.a).map((Function)new kdk(anhp2, 20)).orElse((Object)false)) {
                        final ahcr builder2 = ((ahcz)anhs.a).createBuilder();
                        builder2.copyOnWrite();
                        final anhs anhs = (anhs)builder2.instance;
                        anhs.b |= 0x1;
                        anhs.c = true;
                        builder2.copyOnWrite();
                        final anhs anhs2 = (anhs)builder2.instance;
                        anhs2.d = anhp2.m;
                        anhs2.b |= 0x2;
                        final anhs anhs3 = (anhs)builder2.build();
                        return ((ahbc)anhs3).toByteArray();
                    }
                    final anhs anhs3 = anhs.a;
                    return ((ahbc)anhs3).toByteArray();
                }
            }
            final anhs anhs3 = anhs.a;
            return ((ahbc)anhs3).toByteArray();
        }
        if (n == -273674961) {
            final ahcg ahcg2 = (ahcg)ahcz.parseFrom((ahcz)ahcg.a, array, ExtensionRegistryLite.getGeneratedRegistry());
            final aeye a3 = this.a;
            final ahcr builder3 = ((ahcz)anha.a).createBuilder();
            final angz i = aeye.I(a3.i.L());
            builder3.copyOnWrite();
            final anha anha = (anha)builder3.instance;
            anha.c = i.f;
            anha.b |= 0x1;
            return ((ahbc)builder3.build()).toByteArray();
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
