import java.util.Iterator;
import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class afbm implements Iterable
{
    private final aexq a;
    
    protected afbm() {
        this.a = (aexq)aewp.a;
    }
    
    public afbm(final Iterable iterable) {
        this.a = aexq.k(iterable);
    }
    
    public static afbm b(final Iterable iterable, final Iterable iterable2) {
        final Iterable[] array = new Iterable[2];
        int i = 0;
        array[0] = iterable;
        array[1] = iterable2;
        while (i < 2) {
            array[i].getClass();
            ++i;
        }
        return (afbm)new afbl(array);
    }
    
    public static afbm d(final Iterable iterable) {
        Object o;
        if (iterable instanceof afbm) {
            o = iterable;
        }
        else {
            o = new afbj(iterable, iterable);
        }
        return (afbm)o;
    }
    
    public static afbm e(final Object[] array) {
        return d(Arrays.asList(array));
    }
    
    public final aexq a() {
        final Iterator iterator = this.h().iterator();
        Object o;
        if (iterator.hasNext()) {
            o = aexq.k(iterator.next());
        }
        else {
            o = aewp.a;
        }
        return (aexq)o;
    }
    
    public final afbm c(final aext aext) {
        return d(adwd.aG(this.h(), aext));
    }
    
    public final afbm f(final aexg aexg) {
        return d(adwd.aH(this.h(), aexg));
    }
    
    public final afcr g() {
        return afcr.n(this.h());
    }
    
    public final Iterable h() {
        return (Iterable)this.a.e(this);
    }
    
    @Override
    public final String toString() {
        return adwd.aM(this.h());
    }
}
