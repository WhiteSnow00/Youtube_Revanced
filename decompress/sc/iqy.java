// 
// Decompiled by Procyon v0.6.0
// 

public final class iqy
{
    public final int a;
    public final amar b;
    
    public iqy() {
    }
    
    public iqy(final int a, final amar b) {
        this.a = a;
        if (b != null) {
            this.b = b;
            return;
        }
        throw new NullPointerException("Null videoEntity");
    }
    
    public static iqy a(final int n, final amar amar) {
        return new iqy(n, amar);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof iqy) {
            final iqy iqy = (iqy)o;
            if (this.a == iqy.a && this.b.equals(iqy.b)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return (this.a ^ 0xF4243) * 1000003 ^ this.b.hashCode();
    }
    
    @Override
    public final String toString() {
        final int a = this.a;
        final String string = this.b.toString();
        final StringBuilder sb = new StringBuilder("DownloadsVideoData{positionIndex=");
        sb.append(a);
        sb.append(", videoEntity=");
        sb.append(string);
        sb.append("}");
        return sb.toString();
    }
}
