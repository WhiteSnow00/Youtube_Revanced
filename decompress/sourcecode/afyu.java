import j$.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

final class afyu
{
    private final Class a;
    private final ageq b;
    
    public afyu(final Class a, final ageq b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (!(o instanceof afyu)) {
            return false;
        }
        final afyu afyu = (afyu)o;
        return afyu.a.equals(this.a) && afyu.b.equals(this.b);
    }
    
    @Override
    public final int hashCode() {
        return Objects.hash(new Object[] { this.a, this.b });
    }
    
    @Override
    public final String toString() {
        final String simpleName = this.a.getSimpleName();
        final String value = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder();
        sb.append(simpleName);
        sb.append(", object identifier: ");
        sb.append(value);
        return sb.toString();
    }
}
