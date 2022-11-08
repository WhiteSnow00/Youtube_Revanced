import java.util.HashMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gll implements acol
{
    private final Map a;
    
    public gll() {
        this(null);
    }
    
    public gll(final acpi acpi) {
        final HashMap a = new HashMap();
        this.a = a;
        if (acpi instanceof glj) {
            a.putAll((Map)((glj)acpi).a);
        }
    }
    
    private static Object d(final Object o) {
        if (o instanceof amqj) {
            return new glk(o.getClass(), ((amqj)o).f.I());
        }
        if (o instanceof akeh) {
            return new glk(o.getClass(), ((akeh)o).m.I());
        }
        if (o instanceof amps) {
            return new glk(o.getClass(), ((amps)o).g.I());
        }
        return o;
    }
    
    public final aexq a(final Object o) {
        return aexq.j(this.a.remove(d(o)));
    }
    
    public final void c(final Object o, final Object o2) {
        o.getClass();
        o2.getClass();
        this.a.put(d(o), o2);
    }
    
    @Override
    public final acpi qv() {
        return new glj(afcw.k(this.a));
    }
}
