import java.util.List;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class eof implements eoe
{
    private final /* synthetic */ int a;
    
    public eof(final int a) {
        this.a = a;
    }
    
    public final boolean a() {
        final int a = this.a;
        return a == 0 || a == 1;
    }
    
    public final void b(final Map map) {
        final int a = this.a;
        if (a == 0) {
            map.toString();
            return;
        }
        if (a != 1) {
            return;
        }
        map.toString();
    }
    
    public final void c(final List list, final List list2, final List list3) {
        final int a = this.a;
        int i = 0;
        final int n = 0;
        if (a == 0) {
            while (i < list.size()) {
                final String s = list.get(i);
                ((Long)list2.get(i)).longValue();
                ++i;
            }
            return;
        }
        int j = n;
        if (a != 1) {
            return;
        }
        while (j < list.size()) {
            final String s2 = list.get(j);
            ((Long)list3.get(j)).longValue();
            ++j;
        }
    }
}
