// 
// Decompiled by Procyon v0.6.0
// 

public final class aals implements arom
{
    private final atnb a;
    private final int b;
    
    public aals(final atnb a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public static aals b(final atnb atnb) {
        return new aals(atnb, 0);
    }
    
    public static aals d(final atnb atnb) {
        return new aals(atnb, 1);
    }
    
    public static aals e(final atnb atnb) {
        return new aals(atnb, 2);
    }
    
    public static aals f(final atnb atnb) {
        return new aals(atnb, 3);
    }
    
    public static aals g(final atnb atnb) {
        return new aals(atnb, 4);
    }
    
    public static aals h(final atnb atnb) {
        return new aals(atnb, 5);
    }
    
    public static aske i(final adgg adgg) {
        final aske c = ((abqz)adgg.a).C();
        c.getClass();
        return c;
    }
    
    public static aske j(final adgg adgg) {
        final aske b = ((abqz)adgg.a).B();
        b.getClass();
        return b;
    }
    
    public static aske k(final adgg adgg) {
        final aske v = ((abqz)adgg.a).v();
        v.getClass();
        return v;
    }
    
    public static aske l(final adgg adgg) {
        final aske d = ((abqz)adgg.a).D();
        d.getClass();
        return d;
    }
    
    public static aske m(final adgg adgg) {
        final aske f = ((abqz)adgg.a).F();
        f.getClass();
        return f;
    }
    
    public static aske n(final adgg adgg) {
        final aske g = ((abqz)adgg.a).G();
        g.getClass();
        return g;
    }
    
    @Override
    public final Object a() {
        final int b = this.b;
        if (b == 0) {
            return this.c();
        }
        if (b == 1) {
            return this.c();
        }
        if (b == 2) {
            return this.c();
        }
        if (b == 3) {
            return this.c();
        }
        if (b != 4) {
            return this.c();
        }
        return this.c();
    }
    
    public final aske c() {
        final int b = this.b;
        if (b == 0) {
            return i((adgg)this.a.a());
        }
        if (b == 1) {
            return j((adgg)this.a.a());
        }
        if (b == 2) {
            return k((adgg)this.a.a());
        }
        if (b == 3) {
            return l((adgg)this.a.a());
        }
        if (b != 4) {
            return n((adgg)this.a.a());
        }
        return m((adgg)this.a.a());
    }
}
