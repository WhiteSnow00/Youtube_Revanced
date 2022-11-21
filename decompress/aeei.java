import com.google.android.gms.common.api.Status;
import java.util.Locale;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aeei extends mrg
{
    public aeei() {
        final Locale default1 = Locale.getDefault();
        final Integer value = -1;
        String string;
        if (!aeen.a.containsKey(value)) {
            string = "";
        }
        else {
            final String s = aeen.a.get(value);
            final String s2 = aeen.b.get(value);
            final StringBuilder sb = new StringBuilder();
            sb.append(s);
            sb.append(" (https://developer.android.com/reference/com/google/android/play/core/review/model/ReviewErrorCode.html#");
            sb.append(s2);
            sb.append(")");
            string = sb.toString();
        }
        super(new Status(-1, String.format(default1, "Review Error(%d): %s", value, string)));
    }
}
