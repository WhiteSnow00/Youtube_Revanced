import java.util.HashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ekt extends eks
{
    public String a;
    public long b;
    public String c;
    public String d;
    public String e;
    
    public ekt() {
        this.a = "E";
        this.b = -1L;
        this.c = "E";
        this.d = "E";
        this.e = "E";
    }
    
    public ekt(String s) {
        final String s2 = "E";
        this.a = "E";
        long longValue = -1L;
        this.b = -1L;
        this.c = "E";
        this.d = "E";
        this.e = "E";
        final HashMap a = a(s);
        if (a != null) {
            final Integer value = 0;
            if (a.get(value) == null) {
                s = "E";
            }
            else {
                s = (String)a.get(value);
            }
            this.a = s;
            final Integer value2 = 1;
            if (a.get(value2) != null) {
                longValue = (long)a.get(value2);
            }
            this.b = longValue;
            final Integer value3 = 2;
            if (a.get(value3) == null) {
                s = "E";
            }
            else {
                s = (String)a.get(value3);
            }
            this.c = s;
            final Integer value4 = 3;
            if (a.get(value4) == null) {
                s = "E";
            }
            else {
                s = (String)a.get(value4);
            }
            this.d = s;
            final Integer value5 = 4;
            if (a.get(value5) == null) {
                s = s2;
            }
            else {
                s = (String)a.get(value5);
            }
            this.e = s;
        }
    }
    
    protected final HashMap b() {
        final HashMap hashMap = new HashMap();
        hashMap.put(0, this.a);
        hashMap.put(4, this.e);
        hashMap.put(3, this.d);
        hashMap.put(2, this.c);
        hashMap.put(1, this.b);
        return hashMap;
    }
}
