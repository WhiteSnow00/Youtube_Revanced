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

public class abg extends abn implements Map, j$.util.Map
{
    aba a;
    abc b;
    abe c;
    
    public abg() {
    }
    
    public abg(final int n) {
        super(n);
    }
    
    public abg(final abn abn) {
        super((byte[])null);
        this.h(abn);
    }
    
    public final Set entrySet() {
        aba a;
        if ((a = this.a) == null) {
            a = new aba(this);
            this.a = a;
        }
        return (Set)a;
    }
    
    public final Set keySet() {
        abc b;
        if ((b = this.b) == null) {
            b = new abc(this);
            this.b = b;
        }
        return (Set)b;
    }
    
    public final void putAll(final Map map) {
        this.g(super.d + map.size());
        for (final Entry<Object, V> entry : map.entrySet()) {
            this.put(entry.getKey(), (Object)entry.getValue());
        }
    }
    
    public final Collection values() {
        abe c;
        if ((c = this.c) == null) {
            c = new abe(this);
            this.c = c;
        }
        return (Collection)c;
    }
}
