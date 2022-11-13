import java.util.function.Supplier;
import android.content.Context;
import java.text.Format;
import j$.util.function.Function$_CC;
import java.text.NumberFormat;
import java.util.function.Function;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adfl implements Function
{
    public final Object a;
    private final int b;
    
    public adfl(final adrh a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public adfl(final NumberFormat a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final Function andThen(final Function function) {
        final int b = this.b;
        if (b == 0) {
            return Function$_CC.$default$andThen((Function)this, function);
        }
        if (b == 1) {
            return Function$_CC.$default$andThen((Function)this, function);
        }
        if (b != 2) {
            return Function$_CC.$default$andThen((Function)this, function);
        }
        return Function$_CC.$default$andThen((Function)this, function);
    }
    
    @Override
    public final Object apply(final Object o) {
        final int b = this.b;
        if (b == 0) {
            return ((Format)this.a).format(o);
        }
        if (b == 1) {
            return ((NumberFormat)this.a).format((double)o / 1000.0);
        }
        if (b == 2) {
            return ((NumberFormat)this.a).format((double)o * 100.0);
        }
        final Object a = this.a;
        final Context applicationContext = ((Context)o).getApplicationContext();
        final adrh adrh = (adrh)a;
        final zkt zkt = new zkt(adrh, 6);
        final adrj g = adrh.g;
        final afvs e = g.e;
        if (e == null) {
            throw new NullPointerException("Null incomingIpcExecutor");
        }
        final afvs d = g.d;
        if (d != null) {
            return odh.c(applicationContext, (Supplier)zkt, new ode(d, e));
        }
        throw new NullPointerException("Null outgoingIpcExecutor");
    }
    
    @Override
    public final Function compose(final Function function) {
        final int b = this.b;
        if (b == 0) {
            return Function$_CC.$default$compose((Function)this, function);
        }
        if (b == 1) {
            return Function$_CC.$default$compose((Function)this, function);
        }
        if (b != 2) {
            return Function$_CC.$default$compose((Function)this, function);
        }
        return Function$_CC.$default$compose((Function)this, function);
    }
}
