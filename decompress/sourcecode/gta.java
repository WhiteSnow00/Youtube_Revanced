import java.util.HashMap;

// 
// Decompiled by Procyon v0.6.0
// 

final class gta extends HashMap
{
    public gta(final int n) {
        super(n);
    }
    
    final Object a(final String s, final aeyr aeyr) {
        if (this.containsKey(s)) {
            return this.get(s);
        }
        final Object a = aeyr.a();
        this.put(s, a);
        return a;
    }
}
