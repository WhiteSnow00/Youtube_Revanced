import java.util.Arrays;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

final class dil implements dii
{
    private final List a;
    private final akq b;
    
    public dil(final List a, final akq b) {
        this.a = a;
        this.b = b;
    }
    
    public final boolean a(final Object o) {
        final Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            if (((dii)iterator.next()).a(o)) {
                return true;
            }
        }
        return false;
    }
    
    public final alm b(final Object o, final int n, final int n2, final ddo ddo) {
        final int size = this.a.size();
        final ArrayList list = new ArrayList(size);
        int i = 0;
        ddj ddj = null;
        while (i < size) {
            final dii dii = this.a.get(i);
            Object a = ddj;
            if (dii.a(o)) {
                final alm b = dii.b(o, n, n2, ddo);
                a = ddj;
                if (b != null) {
                    a = b.a;
                    list.add(b.b);
                }
            }
            ++i;
            ddj = (ddj)a;
        }
        if (!list.isEmpty() && ddj != null) {
            return new alm(ddj, (ddx)new dik(list, this.b));
        }
        return null;
    }
    
    @Override
    public final String toString() {
        final String string = Arrays.toString(this.a.toArray());
        final StringBuilder sb = new StringBuilder("MultiModelLoader{modelLoaders=");
        sb.append(string);
        sb.append("}");
        return sb.toString();
    }
}
