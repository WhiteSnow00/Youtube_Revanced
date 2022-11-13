import java.util.Arrays;
import android.text.TextUtils;
import android.util.Log;
import java.util.regex.Pattern;

// 
// Decompiled by Procyon v0.6.0
// 

final class agmw
{
    private static final Pattern d;
    public final String a;
    public final String b;
    public final String c;
    
    static {
        d = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");
    }
    
    public agmw(final String b, final String s) {
        String substring;
        if (s != null && s.startsWith("/topics/")) {
            Log.w("FirebaseMessaging", String.format("Format /topics/topic-name is deprecated. Only 'topic-name' should be used in %s.", b));
            substring = s.substring(8);
        }
        else {
            substring = s;
        }
        if (substring != null && agmw.d.matcher(substring).matches()) {
            this.a = substring;
            this.b = b;
            final StringBuilder sb = new StringBuilder();
            sb.append(b);
            sb.append("!");
            sb.append(s);
            this.c = sb.toString();
            return;
        }
        throw new IllegalArgumentException(String.format("Invalid topic name: %s does not match the allowed format %s.", substring, "[a-zA-Z0-9-_.~%]{1,900}"));
    }
    
    static agmw a(final String s) {
        if (TextUtils.isEmpty((CharSequence)s)) {
            return null;
        }
        final String[] split = s.split("!", -1);
        if (split.length != 2) {
            return null;
        }
        return new agmw(split[0], split[1]);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (!(o instanceof agmw)) {
            return false;
        }
        final agmw agmw = (agmw)o;
        return this.a.equals(agmw.a) && this.b.equals(agmw.b);
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.b, this.a });
    }
}
