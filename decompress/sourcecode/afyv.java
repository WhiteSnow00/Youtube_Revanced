import j$.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

final class afyv
{
    private final Class a;
    private final Class b;
    
    public afyv(final Class a, final Class b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (!(o instanceof afyv)) {
            return false;
        }
        final afyv afyv = (afyv)o;
        return afyv.a.equals(this.a) && afyv.b.equals(this.b);
    }
    
    @Override
    public final int hashCode() {
        return Objects.hash(new Object[] { this.a, this.b });
    }
    
    @Override
    public final String toString() {
        final String simpleName = this.a.getSimpleName();
        final String simpleName2 = this.b.getSimpleName();
        final StringBuilder sb = new StringBuilder();
        sb.append(simpleName);
        sb.append(" with serialization type: ");
        sb.append(simpleName2);
        return sb.toString();
    }
}
