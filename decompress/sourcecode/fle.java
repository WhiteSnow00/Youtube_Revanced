// 
// Decompiled by Procyon v0.6.0
// 

public final class fle
{
    public final aexq a;
    public final aexq b;
    public final aexq c;
    
    public fle() {
    }
    
    public fle(final aexq a, final aexq b, final aexq c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public static pa a() {
        return new pa(null, null);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof fle) {
            final fle fle = (fle)o;
            if (this.a.equals(fle.a) && this.b.equals(fle.b) && this.c.equals(fle.c)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return ((this.a.hashCode() ^ 0xF4243) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c.hashCode();
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final String value2 = String.valueOf(this.b);
        final String value3 = String.valueOf(this.c);
        final StringBuilder sb = new StringBuilder("DownloadsDataRequest{filterType=");
        sb.append(value);
        sb.append(", maxCount=");
        sb.append(value2);
        sb.append(", sortOrder=");
        sb.append(value3);
        sb.append("}");
        return sb.toString();
    }
}
