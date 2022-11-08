import java.lang.reflect.Method;

// 
// Decompiled by Procyon v0.6.0
// 

@Deprecated
final class atx
{
    final int a;
    final Method b;
    
    public atx(final int a, final Method b) {
        this.a = a;
        (this.b = b).setAccessible(true);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof atx)) {
            return false;
        }
        final atx atx = (atx)o;
        return this.a == atx.a && this.b.getName().equals(atx.b.getName());
    }
    
    @Override
    public final int hashCode() {
        return this.a * 31 + this.b.getName().hashCode();
    }
}
