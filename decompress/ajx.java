import android.util.Base64;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajx
{
    public final String a;
    public final String b;
    public final String c;
    public final List d;
    public final int e;
    public final String f;
    
    public ajx(final String c, final int e) {
        this.a = "com.mgoogle.android.gms.fonts";
        this.b = "com.mgoogle.android.gms";
        this.c = c;
        this.d = null;
        afc.c(true);
        this.e = e;
        this.f = a("com.mgoogle.android.gms.fonts", "com.mgoogle.android.gms", c);
    }
    
    public ajx(final String a, final String b, final String c, final List d) {
        this.a = a;
        this.b = b;
        this.c = c;
        afc.j(d);
        this.d = d;
        this.e = 0;
        this.f = a(a, b, c);
    }
    
    private static final String a(final String s, final String s2, final String s3) {
        final StringBuilder sb = new StringBuilder(s);
        sb.append("-");
        sb.append(s2);
        sb.append("-");
        sb.append(s3);
        return sb.toString();
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        final StringBuilder sb2 = new StringBuilder("FontRequest {mProviderAuthority: ");
        sb2.append(this.a);
        sb2.append(", mProviderPackage: ");
        sb2.append(this.b);
        sb2.append(", mQuery: ");
        sb2.append(this.c);
        sb2.append(", mCertificates:");
        sb.append(sb2.toString());
        for (int i = 0; i < this.d.size(); ++i) {
            sb.append(" [");
            final List list = this.d.get(i);
            for (int j = 0; j < list.size(); ++j) {
                sb.append(" \"");
                sb.append(Base64.encodeToString((byte[])list.get(j), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        sb.append("}");
        final StringBuilder sb3 = new StringBuilder("mCertificatesArray: ");
        sb3.append(this.e);
        sb.append(sb3.toString());
        return sb.toString();
    }
}
