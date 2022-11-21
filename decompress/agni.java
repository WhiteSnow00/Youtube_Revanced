import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agni
{
    public static final long a;
    public static final Pattern b;
    private static agni c;
    
    static {
        a = TimeUnit.HOURS.toSeconds(1L);
        b = Pattern.compile("\\AA[\\w-]{38}\\z");
    }
    
    private agni() {
    }
    
    public static agni b() {
        if (agpx.a == null) {
            agpx.a = new agpx();
        }
        if (agni.c == null) {
            agni.c = new agni();
        }
        return agni.c;
    }
    
    static boolean d(final String s) {
        return s.contains(":");
    }
    
    public final long a() {
        return TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
    }
    
    public final boolean c(final agnn agnn) {
        return TextUtils.isEmpty((CharSequence)agnn.b) || agnn.e + agnn.d < this.a() + agni.a;
    }
}
