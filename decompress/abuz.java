import java.util.Collections;
import java.util.List;
import android.util.Pair;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abuz
{
    public static final Pair a;
    final List b;
    final List c;
    public final List d;
    
    static {
        a = new Pair((Object)null, (Object)null);
    }
    
    public abuz(final List list, final List list2, final List list3) {
        final int size = list.size();
        final int size2 = list2.size();
        final boolean b = true;
        adme.U(size == size2, "startTimes and endTimes differ in size");
        adme.U(list.size() == list3.size() && b, "startTimes and lines differ in size");
        this.b = Collections.unmodifiableList((List<?>)list);
        this.c = Collections.unmodifiableList((List<?>)list2);
        this.d = Collections.unmodifiableList((List<?>)list3);
    }
    
    public final int a(final long n, final boolean b) {
        int binarySearch;
        final int n2 = binarySearch = Collections.binarySearch(this.b, n);
        if (n2 < 0) {
            binarySearch = -n2 - 2;
            if (binarySearch < 0 || n >= (long)this.c.get(binarySearch)) {
                return -1;
            }
        }
        int n3 = binarySearch;
    Label_0069_Outer:
        while (true) {
            if (!b) {
                break Label_0086;
            }
            while (true) {
                final int n4 = binarySearch - 1;
                n3 = binarySearch;
                binarySearch = n4;
                Label_0092: {
                    break Label_0092;
                    binarySearch = n3 + 1;
                }
                if (binarySearch >= this.b.size() || binarySearch < 0 || (long)this.b.get(binarySearch) > n || (long)this.c.get(binarySearch) <= n) {
                    return n3;
                }
                n3 = binarySearch;
                if (b) {
                    continue;
                }
                break;
            }
            continue Label_0069_Outer;
        }
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.b.size(); ++i) {
            sb.append("[");
            sb.append(this.b.get(i));
            sb.append(" - ");
            sb.append(this.c.get(i));
            sb.append(": ");
            sb.append((CharSequence)this.d.get(i));
            sb.append("]");
        }
        return sb.toString();
    }
}
