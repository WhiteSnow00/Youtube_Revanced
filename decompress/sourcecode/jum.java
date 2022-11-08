import java.util.concurrent.Executor;
import java.util.Observable;
import java.util.Observer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jum implements Observer
{
    public final /* synthetic */ Object a = a;
    private final /* synthetic */ int b;
    
    public jum(final lht a, final int b, final byte[] array, final byte[] array2) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void update(final Observable observable, final Object o) {
        final int b = this.b;
        if (b == 0) {
            if (((lht)this.a).b.equals(observable) && o instanceof aplu) {
                final lht lht = (lht)this.a;
                final Object a = lht.a;
                final blt blt = (blt)((atjj)lht.c).a();
                tcp.n((aum)a, tcp.b((aum)blt.a, afrp.e(((tku)((alm)blt.c).b).a(), (aexg)fee.k, (Executor)afsl.a), (aexg)new etw(blt, (wwv)((lht)this.a).f, 18, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null)), (trb)new jnf(this, o, 7), (trb)new jnf(this, o, 8));
            }
            return;
        }
        if (b != 1) {
            ((zbr)this.a).notifyObservers(o);
            return;
        }
        ((tyh)this.a).i();
    }
}
