import java.util.Iterator;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dwo extends dst
{
    public static final int g = 0;
    @dyj
    public List a;
    @dyj
    public egv b;
    @dyj
    public egv c;
    @dyj
    public boolean d;
    @dyj
    public int e;
    @dyj
    public int f;
    
    public dwo() {
        super("Row");
    }
    
    public static dwn b(final dsx dsx) {
        final dwn dwn = new dwn();
        dwn.j(dsx, new dwo());
        return dwn;
    }
    
    public final /* bridge */ boolean a(final Object o) {
        return this.f((dst)o);
    }
    
    protected final dst c(final dsx dsx) {
        return this;
    }
    
    protected final dva d(final dsx dsx) {
        final dva d = bkv.d(dsx);
        int n;
        if (!this.d) {
            n = 3;
        }
        else {
            n = 4;
        }
        d.bO(n);
        final egv c = this.c;
        if (c != null) {
            d.bm(c);
        }
        final egv b = this.b;
        if (b != null) {
            d.bl(b);
        }
        final int e = this.e;
        if (e != 0) {
            d.bz(e);
        }
        final int f = this.f;
        if (f != 0) {
            d.bL(f);
        }
        final List a = this.a;
        if (a != null) {
            for (final dst dst : a) {
                if (dsx.m()) {
                    return dsx.a;
                }
                if (dsx.n()) {
                    d.aG(dst);
                }
                else {
                    d.bp(dst);
                }
            }
        }
        return d;
    }
    
    protected final boolean e() {
        return true;
    }
    
    public final boolean f(final dst dst) {
        if (this == dst) {
            return true;
        }
        if (dst == null || this.getClass() != dst.getClass()) {
            return false;
        }
        final dwo dwo = (dwo)dst;
        if (super.j == dwo.j) {
            return true;
        }
        final List a = this.a;
        if (a != null) {
            if (dwo.a == null || a.size() != dwo.a.size()) {
                return false;
            }
            for (int size = this.a.size(), i = 0; i < size; ++i) {
                if (!((dst)this.a.get(i)).f((dst)dwo.a.get(i))) {
                    return false;
                }
            }
        }
        else if (dwo.a != null) {
            return false;
        }
        final egv c = this.c;
        Label_0186: {
            if (c != null) {
                if (c.equals((Object)dwo.c)) {
                    break Label_0186;
                }
            }
            else if (dwo.c == null) {
                break Label_0186;
            }
            return false;
        }
        final egv b = this.b;
        Label_0221: {
            if (b != null) {
                if (b.equals((Object)dwo.b)) {
                    break Label_0221;
                }
            }
            else if (dwo.b == null) {
                break Label_0221;
            }
            return false;
        }
        final int e = this.e;
        if (e != 0) {
            if (e == dwo.e) {
                return this.d == dwo.d;
            }
        }
        else if (dwo.e == 0) {
            return this.d == dwo.d;
        }
        return false;
    }
}
