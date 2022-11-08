// 
// Decompiled by Procyon v0.6.0
// 

public final class ipx
{
    public final int a;
    public final alyn b;
    
    public ipx() {
    }
    
    public ipx(final int a, final alyn b) {
        this.a = a;
        if (b != null) {
            this.b = b;
            return;
        }
        throw new NullPointerException("Null videoEntity");
    }
    
    public static ipx a(final int n, final alyn alyn) {
        return new ipx(n, alyn);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof ipx) {
            final ipx ipx = (ipx)o;
            if (this.a == ipx.a && this.b.equals((Object)ipx.b)) {
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
