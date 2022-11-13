import java.util.Iterator;
import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class afdl implements Iterable
{
    private final aezp a;
    
    protected afdl() {
        this.a = (aezp)aeyo.a;
    }
    
    public afdl(final Iterable iterable) {
        this.a = aezp.k((Object)iterable);
    }
    
    public static afdl b(final Iterable iterable, final Iterable iterable2) {
        final Iterable[] array = new Iterable[2];
        int i = 0;
        array[0] = iterable;
        array[1] = iterable2;
        while (i < 2) {
            array[i].getClass();
            ++i;
        }
        return (afdl)new afdk(array);
    }
    
    public static afdl d(final Iterable iterable) {
        Object o;
        if (iterable instanceof afdl) {
            o = iterable;
        }
        else {
            o = new afdi(iterable, iterable);
        }
        return (afdl)o;
    }
    
    public static afdl e(final Object[] array) {
        return d(Arrays.asList(array));
    }
    
    public final aezp a() {
        final Iterator iterator = this.h().iterator();
        Object o;
        if (iterator.hasNext()) {
            o = aezp.k(iterator.next());
        }
        else {
            o = aeyo.a;
        }
        return (aezp)o;
    }
    
    public final afdl c(final aezs aezs) {
        return d(agpc.R(this.h(), aezs));
    }
    
    public final afdl f(final aezf aezf) {
        return d(agpc.S(this.h(), aezf));
    }
    
    public final afeq g() {
        return afeq.n(this.h());
    }
    
    public final Iterable h() {
        return (Iterable)this.a.e((Object)this);
    }
    
    @Override
    public final String toString() {
        return agpc.X(this.h());
    }
}
