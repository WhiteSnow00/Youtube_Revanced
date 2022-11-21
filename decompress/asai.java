// 
// Decompiled by Procyon v0.6.0
// 

public final class asai
{
    public static final asai a;
    public final int b;
    
    static {
        a = new asai();
    }
    
    public asai() {
        this.b = 1;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null && this.getClass() == o.getClass()) {
            final asai asai = (asai)o;
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
