import java.util.Collection;
import java.util.Iterator;
import java.util.function.BiConsumer;
import java.util.Set;
import java.util.function.Function;
import j$.util.Map$_CC;
import java.util.function.BiFunction;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public class abh extends abo implements Map, j$.util.Map
{
    abb a;
    abd b;
    abf c;
    
    public abh() {
    }
    
    public abh(final int n) {
        super(n);
    }
    
    public abh(final abo abo) {
        super((byte[])null);
        this.h(abo);
    }
    
    public final Object compute(final Object o, final BiFunction biFunction) {
        return Map$_CC.$default$compute((Map)this, o, biFunction);
    }
    
    public final Object computeIfAbsent(final Object o, final Function function) {
        return Map$_CC.$default$computeIfAbsent((Map)this, o, function);
    }
    
    public final Object computeIfPresent(final Object o, final BiFunction biFunction) {
        return Map$_CC.$default$computeIfPresent((Map)this, o, biFunction);
    }
    
    public final Set entrySet() {
        abb a;
        if ((a = this.a) == null) {
            a = new abb(this);
            this.a = a;
        }
        return a;
    }
    
    public final void forEach(final BiConsumer biConsumer) {
        Map$_CC.$default$forEach((Map)this, biConsumer);
    }
    
    public final Set keySet() {
        abd b;
        if ((b = this.b) == null) {
            b = new abd(this);
            this.b = b;
        }
        return (Set)b;
    }
    
    public final Object merge(final Object o, final Object o2, final BiFunction biFunction) {
        return Map$_CC.$default$merge((Map)this, o, o2, biFunction);
    }
    
    public final void putAll(final Map map) {
        this.g(super.d + map.size());
        for (final Entry<Object, V> entry : map.entrySet()) {
            this.put(entry.getKey(), (Object)entry.getValue());
        }
    }
    
    public final void replaceAll(final BiFunction biFunction) {
        Map$_CC.$default$replaceAll((Map)this, biFunction);
    }
    
    public final Collection values() {
        abf c;
        if ((c = this.c) == null) {
            c = new abf(this);
            this.c = c;
        }
        return (Collection)c;
    }
}
