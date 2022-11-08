import java.util.Collections;
import java.util.List;
import java.util.Collection;
import java.util.concurrent.ConcurrentMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.HashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahar
{
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    
    public ahar() {
        this.d = new HashMap();
        this.c = new HashMap();
        this.b = new HashMap();
        this.a = new HashMap();
    }
    
    public ahar(final aeim b, final aagm c, final byte[] array, final byte[] array2) {
        this.a = new Object();
        this.d = new HashMap();
        this.b = b;
        this.c = c;
    }
    
    public ahar(final aekp b, final ahar a, final oas c, final Executor d, final byte[] array, final byte[] array2, final byte[] array3) {
        this.b = b;
        this.a = a;
        this.c = c;
        this.d = d;
    }
    
    public ahar(final ahar ahar, final byte[] array) {
        this.d = new HashMap((Map<?, ?>)ahar.d);
        this.c = new HashMap((Map<?, ?>)ahar.c);
        this.b = new HashMap((Map<?, ?>)ahar.b);
        this.a = new HashMap((Map<?, ?>)ahar.a);
    }
    
    public ahar(final ahar ahar, final char[] array) {
        this.d = new HashMap((Map<?, ?>)ahar.d);
        this.c = new HashMap((Map<?, ?>)ahar.c);
        this.b = new HashMap((Map<?, ?>)ahar.b);
        this.a = new HashMap((Map<?, ?>)ahar.a);
    }
    
    public ahar(final ahcm c, final Object a, final ahcm d, final Object b) {
        this.c = c;
        this.a = a;
        this.d = d;
        this.b = b;
    }
    
    public ahar(final ConcurrentMap b, final afvg c, final afzs d, final Class a) {
        this.b = b;
        this.c = c;
        this.a = a;
        this.d = d;
    }
    
    public ahar(final oas c, final aeph b, final aepj a, final aftr d) {
        this.c = c;
        this.b = b;
        this.a = a;
        this.d = d;
    }
    
    public ahar(final oas c, final afts b, final atjj d, final atjj a) {
        this.c = c;
        this.b = b;
        this.d = d;
        this.a = a;
    }
    
    public final Collection a() {
        return ((Map<Object, Object>)this.b).values();
    }
    
    public final List b(final byte[] array) {
        final List list = ((Map<K, List>)this.b).get(new afvh(array));
        if (list != null) {
            return list;
        }
        return Collections.emptyList();
    }
    
    public final boolean c() {
        return !((afzs)this.d).b.isEmpty();
    }
    
    public final ahar d() {
        return new ahar(this, (char[])null);
    }
    
    public final void e() {
        synchronized (this.a) {
            ((Map)this.d).clear();
        }
    }
}
