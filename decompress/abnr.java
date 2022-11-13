import org.apache.http.HttpResponse;
import java.util.regex.Matcher;
import android.text.TextUtils;
import org.apache.http.Header;
import java.util.regex.Pattern;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abnr
{
    private static final Pattern d;
    public final long a;
    public final long b;
    public final long c;
    private final boolean e;
    
    static {
        d = Pattern.compile("bytes=(\\d*)-(\\d*)");
    }
    
    private abnr(final long a, final long b, final long c, final boolean e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.e = e;
    }
    
    public static abnr a(final Header header, final long n) {
        long long1 = n - 1L;
        if (header == null) {
            return new abnr(0L, long1, n, false);
        }
        final Matcher matcher = abnr.d.matcher(header.getValue());
        if (!matcher.matches()) {
            return new abnr(0L, long1, n, false);
        }
        final String group = matcher.group(1);
        long long2;
        if (!TextUtils.isEmpty((CharSequence)group)) {
            long2 = Long.parseLong(group);
        }
        else {
            long2 = 0L;
        }
        final String group2 = matcher.group(2);
        if (!TextUtils.isEmpty((CharSequence)group2)) {
            long1 = Long.parseLong(group2);
        }
        return new abnr(long2, long1, n, true);
    }
    
    public final boolean b(final HttpResponse httpResponse) {
        final long c = this.c;
        Label_0172: {
            if (c == -1L) {
                if (this.a < 0L) {
                    break Label_0172;
                }
            }
            else {
                final long a = this.a;
                if (a < 0L) {
                    break Label_0172;
                }
                final long b = this.b;
                if (b >= c) {
                    break Label_0172;
                }
                if (a > b) {
                    break Label_0172;
                }
            }
            if (this.e) {
                httpResponse.setStatusCode(206);
                final long a2 = this.a;
                final long b2 = this.b;
                final long c2 = this.c;
                final StringBuilder sb = new StringBuilder("bytes ");
                sb.append(a2);
                sb.append("-");
                sb.append(b2);
                sb.append("/");
                sb.append(c2);
                httpResponse.setHeader("Content-Range", sb.toString());
            }
            else {
                httpResponse.setStatusCode(200);
            }
            return true;
        }
        httpResponse.setStatusCode(416);
        return false;
    }
}
