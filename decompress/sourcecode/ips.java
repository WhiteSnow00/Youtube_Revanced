// 
// Decompiled by Procyon v0.6.0
// 

public final class ips
{
    public final int a;
    public final alxe b;
    
    public ips() {
    }
    
    public ips(final int a, final alxe b) {
        this.a = a;
        if (b != null) {
            this.b = b;
            return;
        }
        throw new NullPointerException("Null playlistEntity");
    }
    
    public static ips a(final int n, final alxe alxe) {
        return new ips(n, alxe);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof ips) {
            final ips ips = (ips)o;
            if (this.a == ips.a && this.b.equals((Object)ips.b)) {
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
        final StringBuilder sb = new StringBuilder("DownloadsPlaylistData{positionIndex=");
        sb.append(a);
        sb.append(", playlistEntity=");
        sb.append(string);
        sb.append("}");
        return sb.toString();
    }
}
