import java.util.Arrays;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

final class dim implements dij
{
    private final List a;
    private final akr b;
    
    public dim(final List a, final akr b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean a(final Object o) {
        final Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            if (((dij)iterator.next()).a(o)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final aln b(final Object o, final int n, final int n2, final ddp ddp) {
        final int size = this.a.size();
        final ArrayList list = new ArrayList(size);
        int i = 0;
        ddk ddk = null;
        while (i < size) {
            final dij dij = this.a.get(i);
            Object a = ddk;
            if (dij.a(o)) {
                final aln b = dij.b(o, n, n2, ddp);
                a = ddk;
                if (b != null) {
                    a = b.a;
                    list.add(b.b);
                }
            }
            ++i;
            ddk = (ddk)a;
        }
        if (!list.isEmpty() && ddk != null) {
            return new aln(ddk, (ddy)new dil(list, this.b));
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
