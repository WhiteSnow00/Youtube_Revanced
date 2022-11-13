import java.lang.reflect.Method;

// 
// Decompiled by Procyon v0.6.0
// 

@Deprecated
final class aty
{
    final int a;
    final Method b;
    
    public aty(final int a, final Method b) {
        this.a = a;
        (this.b = b).setAccessible(true);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof aty)) {
            return false;
        }
        final aty aty = (aty)o;
        return this.a == aty.a && this.b.getName().equals(aty.b.getName());
    }
    
    @Override
    public final int hashCode() {
        return this.a * 31 + this.b.getName().hashCode();
    }
}
