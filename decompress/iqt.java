// 
// Decompiled by Procyon v0.6.0
// 

public final class iqt
{
    public final int a;
    public final alzj b;
    
    public iqt() {
    }
    
    public iqt(final int a, final alzj b) {
        this.a = a;
        if (b != null) {
            this.b = b;
            return;
        }
        throw new NullPointerException("Null playlistEntity");
    }
    
    public static iqt a(final int n, final alzj alzj) {
        return new iqt(n, alzj);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof iqt) {
            final iqt iqt = (iqt)o;
            if (this.a == iqt.a && this.b.equals((Object)iqt.b)) {
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
