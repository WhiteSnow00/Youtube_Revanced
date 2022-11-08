import java.util.List;
import java.util.regex.Pattern;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adfb implements qdw
{
    private static final Pattern a;
    private static final Pattern b;
    private static final Pattern c;
    private static final Pattern d;
    private static final Pattern e;
    private static final afcr f;
    
    static {
        f = afcr.v((Object)new adez(a = Pattern.compile("^https://youtubei\\.googleapis\\.com/[^/]+/([^/]+)/([^?]+)"), "rpc"), (Object)new adez(c = Pattern.compile("^https://youtubei\\.googleapis\\.com/([a-zA-Z]+)_(204)"), "googleapis"), (Object)new adez(b = Pattern.compile("^https://www\\.youtube\\.com/([a-zA-Z]+)_(204)\\?"), "yt"), (Object)new adfa(d = Pattern.compile("^https://.*\\.googlevideo\\.com/initplayback"), "onesie-initplayback"), (Object)new adfa(e = Pattern.compile("^https://.*\\.googlevideo\\.com/videoplayback"), "videoplayback"));
    }
    
    public final String a(final String s) {
        final afcr f = adfb.f;
        final int c = ((afgh)f).c;
        int i = 0;
        while (i < c) {
            final String a = ((List<adez>)f).get(i).a(s);
            ++i;
            if (a != null) {
                return a;
            }
        }
        return s;
    }
}
