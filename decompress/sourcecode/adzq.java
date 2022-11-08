import com.google.android.play.core.install.InstallState;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adzq extends InstallState
{
    private final int a;
    private final long b;
    private final long c;
    private final int d;
    private final String e;
    
    public adzq(final int a, final long b, final long c, final int d, final String e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        if (e != null) {
            this.e = e;
            return;
        }
        throw new NullPointerException("Null packageName");
    }
    
    @Override
    public final int a() {
        return this.d;
    }
    
    @Override
    public final int b() {
        return this.a;
    }
    
    @Override
    public final long c() {
        return this.b;
    }
    
    @Override
    public final long d() {
        return this.c;
    }
    
    @Override
    public final String e() {
        return this.e;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof InstallState) {
            final InstallState installState = (InstallState)o;
            if (this.a == installState.b() && this.b == installState.c() && this.c == installState.d() && this.d == installState.a() && this.e.equals(installState.e())) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final int a = this.a;
        final long b = this.b;
        final long c = this.c;
        return ((((a ^ 0xF4243) * 1000003 ^ (int)(b ^ b >>> 32)) * 1000003 ^ (int)(c >>> 32 ^ c)) * 1000003 ^ this.d) * 1000003 ^ this.e.hashCode();
    }
    
    @Override
    public final String toString() {
        final int a = this.a;
        final long b = this.b;
        final long c = this.c;
        final int d = this.d;
        final String e = this.e;
        final StringBuilder sb = new StringBuilder("InstallState{installStatus=");
        sb.append(a);
        sb.append(", bytesDownloaded=");
        sb.append(b);
        sb.append(", totalBytesToDownload=");
        sb.append(c);
        sb.append(", installErrorCode=");
        sb.append(d);
        sb.append(", packageName=");
        sb.append(e);
        sb.append("}");
        return sb.toString();
    }
}
