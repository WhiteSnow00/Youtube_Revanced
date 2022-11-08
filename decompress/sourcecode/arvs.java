// 
// Decompiled by Procyon v0.6.0
// 

public final class arvs
{
    public static final arvs a;
    public final int b;
    
    static {
        a = new arvs();
    }
    
    public arvs() {
        this.b = 1;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null && this.getClass() == o.getClass()) {
            final arvs arvs = (arvs)o;
            return true;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return 1;
    }
    
    @Override
    public final String toString() {
        final String hexString = Integer.toHexString(1);
        final StringBuilder sb = new StringBuilder("BindServiceFlags{");
        sb.append(hexString);
        sb.append("}");
        return sb.toString();
    }
}
