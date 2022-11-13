import java.util.List;
import java.util.regex.Pattern;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adhe implements qfg
{
    private static final Pattern a;
    private static final Pattern b;
    private static final Pattern c;
    private static final Pattern d;
    private static final Pattern e;
    private static final afeq f;
    
    static {
        f = afeq.v((Object)new adhc(a = Pattern.compile("^https://youtubei\\.googleapis\\.com/[^/]+/([^/]+)/([^?]+)"), "rpc"), (Object)new adhc(c = Pattern.compile("^https://youtubei\\.googleapis\\.com/([a-zA-Z]+)_(204)"), "googleapis"), (Object)new adhc(b = Pattern.compile("^https://www\\.youtube\\.com/([a-zA-Z]+)_(204)\\?"), "yt"), (Object)new adhd(d = Pattern.compile("^https://.*\\.googlevideo\\.com/initplayback"), "onesie-initplayback"), (Object)new adhd(e = Pattern.compile("^https://.*\\.googlevideo\\.com/videoplayback"), "videoplayback"));
    }
    
    public final String a(final String s) {
        final afeq f = adhe.f;
        final int c = ((afih)f).c;
        int i = 0;
        while (i < c) {
            final String a = ((List<adhc>)f).get(i).a(s);
            ++i;
            if (a != null) {
                return a;
            }
        }
        return s;
    }
}
