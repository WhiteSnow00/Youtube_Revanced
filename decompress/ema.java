import java.util.HashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ema extends eks
{
    public long a;
    public long b;
    
    public ema() {
        this.a = -1L;
        this.b = -1L;
    }
    
    public ema(final String s) {
        this.a = -1L;
        this.b = -1L;
        final HashMap a = a(s);
        if (a != null) {
            this.a = (long)a.get(0);
            this.b = (long)a.get(1);
        }
    }
    
    protected final HashMap b() {
        final HashMap hashMap = new HashMap();
        hashMap.put(0, this.a);
        hashMap.put(1, this.b);
        return hashMap;
    }
}
