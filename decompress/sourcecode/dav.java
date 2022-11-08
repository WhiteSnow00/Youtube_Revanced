import java.util.Collections;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dav
{
    public byte[] a;
    public String b;
    public long c;
    public long d;
    public long e;
    public long f;
    public Map g;
    
    public dav() {
        this.g = Collections.emptyMap();
    }
    
    public final boolean a() {
        return this.e < System.currentTimeMillis();
    }
    
    public final boolean b() {
        return this.f < System.currentTimeMillis();
    }
}
