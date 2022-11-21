import j$.util.Optional;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.android.libraries.blocks.runtime.InstanceProxy;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aeyk extends InstanceProxy
{
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
        return n == 846025404;
    }
    
    public final byte[] e(int ah, final byte[] array) {
        if (ah == 846025404) {
            final aqdu aqdu = (aqdu)ahcz.parseFrom((ahcz)aqdu.a, array, ExtensionRegistryLite.getGeneratedRegistry());
            final int ai = aewr.ai(aqdu.c);
            final int n = 1;
            if ((ah = ai) == 0) {
                ah = 1;
            }
            final znf a = znf.a;
            final zng a2 = zng.a;
            Optional optional = null;
            Label_0097: {
                if (--ah != 1) {
                    if (ah == 2) {
                        optional = Optional.of((Object)zng.b);
                        break Label_0097;
                    }
                    if (ah != 3) {
                        optional = Optional.empty();
                        break Label_0097;
                    }
                }
                optional = Optional.of((Object)zng.a);
            }
            final zng zng = (zng)optional.orElse((Object)null);
            ah = aewr.ah(aqdu.d);
            if (ah == 0) {
                ah = n;
            }
            Optional optional2 = null;
            switch (ah - 1) {
                default: {
                    optional2 = Optional.empty();
                    break;
                }
                case 33: {
                    optional2 = Optional.of((Object)znf.F);
                    break;
                }
                case 32: {
                    optional2 = Optional.of((Object)znf.E);
                    break;
                }
                case 30: {
                    optional2 = Optional.of((Object)znf.C);
                    break;
                }
                case 28: {
                    optional2 = Optional.of((Object)znf.A);
                    break;
                }
                case 27: {
                    optional2 = Optional.of((Object)znf.g);
                    break;
                }
                case 26: {
                    optional2 = Optional.of((Object)znf.i);
                    break;
                }
                case 25: {
                    optional2 = Optional.of((Object)znf.q);
                    break;
                }
                case 24: {
                    optional2 = Optional.of((Object)znf.s);
                    break;
                }
                case 22: {
                    optional2 = Optional.of((Object)znf.x);
                    break;
                }
                case 21: {
                    optional2 = Optional.of((Object)znf.o);
                    break;
                }
                case 20: {
                    optional2 = Optional.of((Object)znf.j);
                    break;
                }
                case 19: {
                    optional2 = Optional.of((Object)znf.k);
                    break;
                }
                case 18: {
                    optional2 = Optional.of((Object)znf.h);
                    break;
                }
                case 17: {
                    optional2 = Optional.of((Object)znf.v);
                    break;
                }
                case 16: {
                    optional2 = Optional.of((Object)znf.m);
                    break;
                }
                case 15: {
                    optional2 = Optional.of((Object)znf.f);
                    break;
                }
                case 14: {
                    optional2 = Optional.of((Object)znf.u);
                    break;
                }
                case 13: {
                    optional2 = Optional.of((Object)znf.y);
                    break;
                }
                case 12: {
                    optional2 = Optional.of((Object)znf.l);
                    break;
                }
                case 11: {
                    optional2 = Optional.of((Object)znf.z);
                    break;
                }
                case 10: {
                    optional2 = Optional.of((Object)znf.t);
                    break;
                }
                case 9: {
                    optional2 = Optional.of((Object)znf.n);
                    break;
                }
                case 8: {
                    optional2 = Optional.of((Object)znf.e);
                    break;
                }
                case 7: {
                    optional2 = Optional.of((Object)znf.r);
                    break;
                }
                case 6: {
                    optional2 = Optional.of((Object)znf.p);
                    break;
                }
                case 5: {
                    optional2 = Optional.of((Object)znf.d);
                    break;
                }
                case 4: {
                    optional2 = Optional.of((Object)znf.w);
                    break;
                }
                case 3: {
                    optional2 = Optional.of((Object)znf.c);
                    break;
                }
                case 2: {
                    optional2 = Optional.of((Object)znf.b);
                    break;
                }
                case 1: {
                    optional2 = Optional.of((Object)znf.a);
                    break;
                }
            }
            final znf znf = (znf)optional2.orElse((Object)null);
            ahcg ahcg;
            if (zng != null && znf != null) {
                if ((aqdu.b & 0x4) != 0x0) {
                    znh.b(zng, znf, aqdu.e);
                }
                else {
                    znh.b(zng, znf, (String)null);
                }
                ahcg = ahcg.a;
            }
            else {
                ahcg = ahcg.a;
            }
            return ((ahbc)ahcg).toByteArray();
        }
        final StringBuilder sb = new StringBuilder("No method found with identifier: ");
        sb.append(ah);
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
