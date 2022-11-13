import j$.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class abjl extends abjm
{
    public abstract aiqj b(final Object p0);
    
    @Override
    public final String c(final Object o) {
        return abjr.c(this.b(o));
    }
    
    @Override
    public final String d(final Object o) {
        return abjr.e(this.b(o));
    }
    
    @Override
    public final boolean e(final Object o, final Object o2) {
        return Objects.equals(o, o2) || abjr.h(this.b(o), this.b(o2));
    }
    
    @Override
    public final lrf q(final Object o) {
        return abjr.a(this.b(o));
    }
    
    @Override
    public final aiqj r(final aiqj aiqj) {
        return abjr.b(this.b(this.i(aiqj)));
    }
}
