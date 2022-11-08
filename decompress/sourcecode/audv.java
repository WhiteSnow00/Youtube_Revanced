import java.util.Iterator;
import java.util.Collections;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeMap;
import java.util.Map;
import java.util.List;
import org.chromium.net.UrlResponseInfo$HeaderBlock;

// 
// Decompiled by Procyon v0.6.0
// 

public final class audv extends UrlResponseInfo$HeaderBlock
{
    public final List a;
    public Map b;
    
    public audv(final List a) {
        this.a = a;
    }
    
    @Override
    public final List getAsList() {
        return this.a;
    }
    
    @Override
    public final Map getAsMap() {
        final Map b = this.b;
        if (b != null) {
            return b;
        }
        final TreeMap treeMap = new TreeMap((Comparator<? super K>)String.CASE_INSENSITIVE_ORDER);
        for (final Map.Entry<Object, String> entry : this.a) {
            final ArrayList list = new ArrayList();
            if (treeMap.containsKey(entry.getKey())) {
                list.addAll((Collection)treeMap.get(entry.getKey()));
            }
            list.add(entry.getValue());
            treeMap.put(entry.getKey(), Collections.unmodifiableList((List<?>)list));
        }
        return this.b = Collections.unmodifiableMap((Map<?, ?>)treeMap);
    }
}
