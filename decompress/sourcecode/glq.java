import java.util.Arrays;
import j$.util.Optional;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class glq implements gle
{
    private final aorm a;
    private final String b;
    private final aioe c;
    private final aioe d;
    private final aioe e;
    private final ajsq f;
    private final List g;
    private final boolean h;
    private final boolean i;
    private final glh j;
    private Optional k;
    private final boolean l;
    private final float m;
    private final boolean n;
    private final boolean o;
    
    public glq(final aorm a, final String b, final aioe c, final aioe d, final aioe e, final ajsq f, final aora[] array, final boolean h, final boolean i, final glh j, final Optional k, final boolean l, final float m, final boolean n, final boolean o) {
        this.k = Optional.empty();
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        List<aora> list;
        if (array == null) {
            list = null;
        }
        else {
            list = Arrays.asList(array);
        }
        this.g = list;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
        this.m = m;
        this.n = n;
        this.o = o;
    }
    
    public final float a() {
        return this.m;
    }
    
    public final glh b() {
        return this.j;
    }
    
    public final aioe c() {
        return this.c;
    }
    
    public final aioe d() {
        return this.d;
    }
    
    public final aioe e() {
        return this.e;
    }
    
    public final ajsq f() {
        return this.f;
    }
    
    public final aorm g() {
        return this.a;
    }
    
    public final Optional h() {
        return this.k;
    }
    
    public final String i() {
        return this.b;
    }
    
    public final List j() {
        return this.g;
    }
    
    public final boolean k() {
        return this.o;
    }
    
    public final boolean l() {
        return this.n;
    }
    
    public final boolean m() {
        return this.l;
    }
    
    public final boolean n() {
        return this.h;
    }
    
    public final boolean o() {
        return this.i;
    }
    
    public final int s() {
        return 4;
    }
}
