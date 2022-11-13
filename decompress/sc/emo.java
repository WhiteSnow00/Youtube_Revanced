import java.util.HashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class emo extends eks
{
    public Long a;
    public Long b;
    public Long c;
    public Long d;
    public Long e;
    
    public emo() {
    }
    
    public emo(final String s) {
        final HashMap a = a(s);
        if (a != null) {
            this.a = (Long)a.get(0);
            this.b = (Long)a.get(1);
            this.c = (Long)a.get(2);
            this.d = (Long)a.get(3);
            this.e = (Long)a.get(4);
        }
    }
    
    protected final HashMap b() {
        final HashMap hashMap = new HashMap();
        hashMap.put(0, this.a);
        hashMap.put(1, this.b);
        hashMap.put(2, this.c);
        hashMap.put(3, this.d);
        hashMap.put(4, this.e);
        return hashMap;
    }
}
