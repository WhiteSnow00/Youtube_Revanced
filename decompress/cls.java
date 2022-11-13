import java.util.regex.Matcher;
import android.content.pm.PackageInfo;
import android.os.Build$VERSION;
import java.util.regex.Pattern;

// 
// Decompiled by Procyon v0.6.0
// 

final class cls extends clj
{
    private final Pattern b;
    
    public cls() {
        this.b = Pattern.compile("\\A\\d+");
    }
    
    public final boolean d() {
        final boolean d = super.d();
        if (!d || Build$VERSION.SDK_INT >= 29) {
            return d;
        }
        final PackageInfo a = ckz.a();
        if (a == null) {
            return false;
        }
        final Matcher matcher = this.b.matcher(a.versionName);
        return matcher.find() && Integer.parseInt(a.versionName.substring(matcher.start(), matcher.end())) >= 105;
    }
}
