import java.util.concurrent.Callable;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class idh extends icx
{
    private final Executor a;
    
    public idh(final Executor a) {
        this.a = a;
    }
    
    public static alwx k(final zyz zyz) {
        final String a = zyz.a.a;
        final long e = zyz.e;
        final long f = zyz.f;
        final String bt = gkt.bt(a);
        bt.getClass();
        agot.E(bt.isEmpty() ^ true, (Object)"key cannot be empty");
        final agza builder = ((agzi)alxa.a).createBuilder();
        builder.copyOnWrite();
        final alxa alxa = (alxa)builder.instance;
        alxa.c |= 0x1;
        alxa.d = bt;
        final alwx alwx = new alwx(builder);
        final agza a2 = alwx.a;
        final long longValue = e;
        a2.copyOnWrite();
        final alxa alxa2 = (alxa)a2.instance;
        alxa2.c |= 0x4;
        alxa2.e = longValue;
        final agza a3 = alwx.a;
        final long longValue2 = f;
        a3.copyOnWrite();
        final alxa alxa3 = (alxa)a3.instance;
        alxa3.c |= 0x8;
        alxa3.f = longValue2;
        return alwx;
    }
    
    private final ListenableFuture l(final vdv vdv, final zyz zyz) {
        return afld.k((Callable)new hlc(vdv, zyz, 14), this.a);
    }
    
    public final ListenableFuture a(final vdv vdv, final zyz zyz) {
        return this.l(vdv, zyz);
    }
    
    public final ListenableFuture b(final vdv vdv, final String s) {
        return afld.k((Callable)new hlc(vdv, s, 13), this.a);
    }
    
    public final ListenableFuture c(final vdv vdv, final zyz zyz) {
        return this.l(vdv, zyz);
    }
    
    public final ListenableFuture f(final aack aack) {
        return afld.m(aack.i().k(), (aexg)htt.e, this.a);
    }
}
