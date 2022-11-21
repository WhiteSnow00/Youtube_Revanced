import java.util.Map;
import com.google.android.gms.common.api.Status;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aefh extends mrg
{
    public aefh(final int n) {
        final Map a = aefu.a;
        final Integer value = n;
        String string;
        if (a.containsKey(value) && aefu.b.containsKey(value)) {
            final String s = aefu.a.get(value);
            final String s2 = aefu.b.get(value);
            final StringBuilder sb = new StringBuilder();
            sb.append(s);
            sb.append(" (https://developer.android.com/reference/com/google/android/play/core/splitinstall/model/SplitInstallErrorCode.html#");
            sb.append(s2);
            sb.append(")");
            string = sb.toString();
        }
        else {
            string = "";
        }
        super(new Status(n, String.format("Split Install Error(%d): %s", n, string)));
        if (n != 0) {
            return;
        }
        throw new IllegalArgumentException("errorCode should not be 0.");
    }
    
    public final int b() {
        return super.a();
    }
}
