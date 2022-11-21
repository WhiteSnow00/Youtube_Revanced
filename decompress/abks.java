import j$.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class abks extends abkt
{
    public abstract aisc b(final Object p0);
    
    public final String c(final Object o) {
        return abky.c(this.b(o));
    }
    
    public final String d(final Object o) {
        return abky.e(this.b(o));
    }
    
    public final boolean e(final Object o, final Object o2) {
        return Objects.equals(o, o2) || abky.h(this.b(o), this.b(o2));
    }
    
    public final lrt q(final Object o) {
        return abky.a(this.b(o));
    }
    
    public final aisc r(final aisc aisc) {
        return abky.b(this.b(this.i(aisc)));
    }
}
