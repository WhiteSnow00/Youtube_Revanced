import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agkk implements agkb
{
    public static final agkk a;
    public static final agkk b;
    private final int c;
    
    static {
        b = new agkk(1);
        a = new agkk(0);
    }
    
    private agkk(final int c) {
        this.c = c;
    }
    
    public final void a(final Object o, final Object o2) {
        if (this.c != 0) {
            final Map.Entry entry = (Map.Entry)o;
            ((agkc)o2).b(agkj.a, entry.getKey());
            ((agkc)o2).b(agkj.b, entry.getValue());
            return;
        }
        throw new agjz("Couldn't find encoder for type ".concat(String.valueOf(o.getClass().getCanonicalName())));
    }
}
