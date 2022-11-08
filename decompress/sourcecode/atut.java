import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atut
{
    public static final Object a(Object o, final Object o2) {
        final boolean a = atqb.a;
        if (o == null) {
            o = o2;
        }
        else if (o instanceof ArrayList) {
            ((ArrayList)o).add(o2);
        }
        else {
            final ArrayList list = new ArrayList(4);
            list.add(o);
            list.add(o2);
            o = list;
        }
        return o;
    }
    
    @Override
    public final boolean equals(final Object o) {
        throw null;
    }
    
    @Override
    public final int hashCode() {
        throw null;
    }
    
    @Override
    public final String toString() {
        throw null;
    }
}
