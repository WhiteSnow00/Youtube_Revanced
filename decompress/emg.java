import java.util.HashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class emg extends eks
{
    public Long a;
    public Boolean b;
    public Boolean c;
    
    public emg() {
    }
    
    public emg(final String s) {
        final HashMap a = a(s);
        if (a != null) {
            this.a = (Long)a.get(0);
            this.b = (Boolean)a.get(1);
            this.c = (Boolean)a.get(2);
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
