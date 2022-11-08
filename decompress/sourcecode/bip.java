import android.net.Uri;
import java.util.regex.Matcher;
import java.text.ParseException;
import android.text.TextUtils;
import j$.util.DesugarTimeZone;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.io.Reader;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;
import java.util.regex.Pattern;

// 
// Decompiled by Procyon v0.6.0
// 

final class bip implements brp
{
    private static final Pattern a;
    
    static {
        a = Pattern.compile("(.+?)(Z|((\\+|-|\u2212)(\\d\\d)(:?(\\d\\d))?))");
    }
    
    public bip() {
    }
    
    public static final Long b(final InputStream inputStream) {
        final String line = new BufferedReader(new InputStreamReader(inputStream, aexb.c)).readLine();
        try {
            final Matcher matcher = bip.a.matcher(line);
            if (matcher.matches()) {
                final String group = matcher.group(1);
                final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
                simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
                final long time = simpleDateFormat.parse(group).getTime();
                long n;
                if ("Z".equals(matcher.group(2))) {
                    n = time;
                }
                else {
                    long n2;
                    if (!"+".equals(matcher.group(4))) {
                        n2 = -1L;
                    }
                    else {
                        n2 = 1L;
                    }
                    final long long1 = Long.parseLong(matcher.group(5));
                    final String group2 = matcher.group(7);
                    long long2;
                    if (TextUtils.isEmpty((CharSequence)group2)) {
                        long2 = 0L;
                    }
                    else {
                        long2 = Long.parseLong(group2);
                    }
                    n = time - n2 * ((long1 * 60L + long2) * 60000L);
                }
                return n;
            }
            final StringBuilder sb = new StringBuilder("Couldn't parse timestamp: ");
            sb.append(line);
            throw ayz.c(sb.toString(), (Throwable)null);
        }
        catch (final ParseException ex) {
            throw ayz.c((String)null, (Throwable)ex);
        }
    }
}
