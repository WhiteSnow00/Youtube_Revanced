// 
// Decompiled by Procyon v0.6.0
// 

public final class aalh implements arom
{
    private final atnb a;
    private final int b;
    
    public aalh(final atnb a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public static aalh b(final atnb atnb) {
        return new aalh(atnb, 0);
    }
    
    public static aalh d(final atnb atnb) {
        return new aalh(atnb, 1);
    }
    
    public static aalh e(final atnb atnb) {
        return new aalh(atnb, 2);
    }
    
    public static aalh f(final atnb atnb) {
        return new aalh(atnb, 3);
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
        if (b != 2) {
            return this.c();
        }
        return this.c();
    }
    
    public final abnw c() {
        final int b = this.b;
        if (b == 0) {
            return aamn.l((abof)this.a.a());
        }
        if (b == 1) {
            return aamn.j((abnx)this.a.a());
        }
        if (b != 2) {
            return aamn.m((abof)this.a.a());
        }
        return aamn.k((abof)this.a.a());
    }
}
