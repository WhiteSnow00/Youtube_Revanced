import java.util.Iterator;
import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class affc implements Iterable
{
    private final afbh a;
    
    protected affc() {
        this.a = afag.a;
    }
    
    public affc(final Iterable iterable) {
        this.a = afbh.k(iterable);
    }
    
    public static affc b(final Iterable iterable, final Iterable iterable2) {
        final Iterable[] array = new Iterable[2];
        int i = 0;
        array[0] = iterable;
        array[1] = iterable2;
        while (i < 2) {
            array[i].getClass();
            ++i;
        }
        return new affb(array);
    }
    
    public static affc d(final Iterable iterable) {
        affc affc;
        if (iterable instanceof affc) {
            affc = (affc)iterable;
        }
        else {
            affc = new afez(iterable, iterable);
        }
        return affc;
    }
    
    public static affc e(final Object[] array) {
        return d(Arrays.asList(array));
    }
    
    public final afbh a() {
        final Iterator iterator = this.h().iterator();
        afbh afbh;
        if (iterator.hasNext()) {
            afbh = afbh.k(iterator.next());
        }
        else {
            afbh = afag.a;
        }
        return afbh;
    }
    
    public final affc c(final afbk afbk) {
        return d(agpx.ai(this.h(), afbk));
    }
    
    public final affc f(final afax afax) {
        return d(agpx.aj(this.h(), afax));
    }
    
    public final afgh g() {
        return afgh.n(this.h());
    }
    
    public final Iterable h() {
        return (Iterable)this.a.e(this);
    }
    
    @Override
    public final String toString() {
        return agpx.ao(this.h());
    }
}
