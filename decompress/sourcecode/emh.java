import java.util.HashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class emh extends ekr
{
    public Long a;
    public Long b;
    
    public emh() {
    }
    
    public emh(final String s) {
        final HashMap a = a(s);
        if (a != null) {
            this.a = (Long)a.get(0);
            this.b = (Long)a.get(1);
        }
    }
    
    protected final HashMap b() {
        final HashMap hashMap = new HashMap();
        hashMap.put(0, this.a);
        hashMap.put(1, this.b);
        return hashMap;
    }
}
