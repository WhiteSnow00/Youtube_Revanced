// 
// Decompiled by Procyon v0.6.0
// 

public abstract class abjm implements abjq
{
    public abstract String c(final Object p0);
    
    public abstract String d(final Object p0);
    
    public abstract boolean e(final Object p0, final Object p1);
    
    public final lrf h(final aiqj aiqj) {
        return this.q(this.i(aiqj));
    }
    
    public final Object i(final aiqj aiqj) {
        aiqj.getClass();
        adkp.H(((ahbc)aiqj).ry(this.a()));
        return ((ahbc)aiqj).rx(this.a());
    }
    
    public final String j(final aiqj aiqj) {
        return this.c(this.i(aiqj));
    }
    
    public final String k(final aiqj aiqj) {
        return this.d(this.i(aiqj));
    }
    
    public final boolean l(final aiqj aiqj, final aiqj aiqj2) {
        return this.e(this.i(aiqj), this.i(aiqj2));
    }
    
    public abstract lrf q(final Object p0);
    
    public aiqj r(final aiqj aiqj) {
        return aiqj;
    }
}
