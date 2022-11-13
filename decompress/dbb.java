import java.util.Comparator;
import java.util.TreeMap;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dbb
{
    public final int a;
    public final byte[] b;
    public final Map c;
    public final List d;
    public final boolean e;
    public final long f;
    
    @Deprecated
    public dbb(final int n, final byte[] array, final Map map) {
        this(n, array, map, false, 0L);
    }
    
    private dbb(final int a, final byte[] b, final Map c, final List list, final boolean e, final long f) {
        this.a = a;
        this.b = b;
        this.c = c;
        List<Object> unmodifiableList;
        if (list == null) {
            unmodifiableList = null;
        }
        else {
            unmodifiableList = Collections.unmodifiableList((List<?>)list);
        }
        this.d = unmodifiableList;
        this.e = e;
        this.f = f;
    }
    
    @Deprecated
    public dbb(final int n, final byte[] array, final Map map, final boolean b, final long n2) {
        List<Object> emptyList;
        if (map == null) {
            emptyList = null;
        }
        else if (map.isEmpty()) {
            emptyList = Collections.emptyList();
        }
        else {
            final ArrayList list = new ArrayList(map.size());
            final Iterator iterator = map.entrySet().iterator();
            while (true) {
                emptyList = list;
                if (!iterator.hasNext()) {
                    break;
                }
                final Map.Entry<String, V> entry = (Map.Entry<String, V>)iterator.next();
                list.add(new daz(entry.getKey(), (String)entry.getValue()));
            }
        }
        this(n, array, map, emptyList, b, n2);
    }
    
    public dbb(final int n, final byte[] array, final boolean b, final long n2, final List list) {
        Map<Object, Object> emptyMap;
        if (list == null) {
            emptyMap = null;
        }
        else if (list.isEmpty()) {
            emptyMap = Collections.emptyMap();
        }
        else {
            final TreeMap treeMap = new TreeMap((Comparator<? super K>)String.CASE_INSENSITIVE_ORDER);
            final afkf d = ((afeq)list).D();
            while (true) {
                emptyMap = treeMap;
                if (!((Iterator)d).hasNext()) {
                    break;
                }
                final daz daz = (daz)((Iterator)d).next();
                treeMap.put(daz.a, daz.b);
            }
        }
        this(n, array, emptyMap, list, b, n2);
    }
    
    @Deprecated
    public dbb(final byte[] array, final Map map) {
        this(200, array, map, false, 0L);
    }
}
