import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class arit implements ariy
{
    public final String a;
    public final List b;
    Map c;
    
    public arit(final String a) {
        this.b = new ArrayList();
        this.c = new HashMap();
        this.a = a;
    }
    
    @Override
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
    
    @Override
    public dre b() {
        throw null;
    }
    
    @Override
    public final String c() {
        return this.a;
    }
    
    @Override
    public List d() {
        throw null;
    }
    
    @Override
    public final List e() {
        return this.b;
    }
    
    @Override
    public List f() {
        throw null;
    }
    
    @Override
    public final Map g() {
        return this.c;
    }
    
    @Override
    public long[] h() {
        throw null;
    }
}
