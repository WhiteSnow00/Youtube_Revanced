import java.util.Map;
import com.google.android.gms.common.api.Status;
import java.util.Locale;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adzr extends mpn
{
    public adzr(final int n) {
        final Locale default1 = Locale.getDefault();
        final Map a = adzt.a;
        final Integer value = n;
        String string;
        if (a.containsKey(value) && adzt.b.containsKey(value)) {
            final String s = adzt.a.get(value);
            final String s2 = adzt.b.get(value);
            final StringBuilder sb = new StringBuilder();
            sb.append(s);
            sb.append(" (https://developer.android.com/reference/com/google/android/play/core/install/model/InstallErrorCode#");
            sb.append(s2);
            sb.append(")");
            string = sb.toString();
        }
        else {
            string = "";
        }
        super(new Status(n, String.format(default1, "Install Error(%d): %s", n, string)));
        if (n != 0) {
            return;
        }
        throw new IllegalArgumentException("errorCode should not be 0.");
    }
}
