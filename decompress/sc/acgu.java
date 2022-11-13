// 
// Decompiled by Procyon v0.6.0
// 

public final class acgu
{
    public final int a;
    private final String b;
    
    public acgu() {
    }
    
    public acgu(final String b, final int a) {
        this.b = b;
        this.a = a;
    }
    
    public static acgu a() {
        return new acgu(null, 1);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof acgu) {
            final acgu acgu = (acgu)o;
            final String b = this.b;
            if (b == null) {
                if (acgu.b != null) {
                    return false;
                }
            }
            else if (!b.equals(acgu.b)) {
                return false;
            }
            if (this.a == acgu.a) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final String b = this.b;
        int hashCode;
        if (b == null) {
            hashCode = 0;
        }
        else {
            hashCode = b.hashCode();
        }
        return (hashCode ^ 0xF4243) * 1000003 ^ this.a;
    }
    
    @Override
    public final String toString() {
        final String b = this.b;
        final int a = this.a;
        final StringBuilder sb = new StringBuilder("ImageParams{videoId=");
        sb.append(b);
        sb.append(", imageType=");
        sb.append(a);
        sb.append("}");
        return sb.toString();
    }
}
