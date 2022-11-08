import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class ardk implements ardp
{
    public final String a;
    public final List b;
    Map c;
    
    public ardk(final String a) {
        this.b = new ArrayList();
        this.c = new HashMap();
        this.a = a;
    }
    
    public final long a() {
        final long[] m = this.m();
        final int length = m.length;
        long n = 0L;
        for (int i = 0; i < length; ++i) {
            n += m[i];
        }
        return n;
    }
    
    public dra b() {
        throw null;
    }
    
    public final String c() {
        return this.a;
    }
    
    public List d() {
        throw null;
    }
    
    public final List e() {
        return this.b;
    }
    
    public List f() {
        throw null;
    }
    
    public final Map g() {
        return this.c;
    }
    
    public long[] h() {
        throw null;
    }
}
