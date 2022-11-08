import java.util.HashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class elu extends ekr
{
    public Long a;
    public Long b;
    public Long c;
    
    public elu() {
    }
    
    public elu(final String s) {
        final HashMap a = a(s);
        if (a != null) {
            this.a = (Long)a.get(0);
            this.b = (Long)a.get(1);
            this.c = (Long)a.get(2);
        }
    }
    
    protected final HashMap b() {
        final HashMap hashMap = new HashMap();
        hashMap.put(0, this.a);
        hashMap.put(1, this.b);
        hashMap.put(2, this.c);
        return hashMap;
    }
}
