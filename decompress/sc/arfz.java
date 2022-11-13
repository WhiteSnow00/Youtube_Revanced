import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class arfz implements arge
{
    public final String a;
    public final List b;
    Map c;
    
    public arfz(final String a) {
        this.b = new ArrayList();
        this.c = new HashMap();
        this.a = a;
    }
    
    public final long a() {
        final long[] m = this.m();
        final int length = m.length;
        int i = 0;
        long n = 0L;
        while (i < length) {
            n += m[i];
            ++i;
        }
        return n;
    }
    
    public drb b() {
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
