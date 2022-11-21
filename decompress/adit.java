import java.util.regex.Pattern;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adit implements qfz
{
    private static final Pattern a;
    private static final Pattern b;
    private static final Pattern c;
    private static final Pattern d;
    private static final Pattern e;
    private static final afgh f;
    
    static {
        f = afgh.v(new adir(a = Pattern.compile("^https://youtubei\\.googleapis\\.com/[^/]+/([^/]+)/([^?]+)"), "rpc"), new adir(c = Pattern.compile("^https://youtubei\\.googleapis\\.com/([a-zA-Z]+)_(204)"), "googleapis"), new adir(b = Pattern.compile("^https://www\\.youtube\\.com/([a-zA-Z]+)_(204)\\?"), "yt"), new adis(d = Pattern.compile("^https://.*\\.googlevideo\\.com/initplayback"), "onesie-initplayback"), new adis(e = Pattern.compile("^https://.*\\.googlevideo\\.com/videoplayback"), "videoplayback"));
    }
    
    public final String a(final String s) {
        final afgh f = adit.f;
        final int c = ((afjx)f).c;
        int i = 0;
        while (i < c) {
            final String a = f.get(i).a(s);
            ++i;
            if (a != null) {
                return a;
            }
        }
        return s;
    }
}
