import org.json.JSONException;
import android.util.Log;
import org.json.JSONObject;
import android.text.TextUtils;
import java.util.concurrent.TimeUnit;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agol
{
    public static final long a;
    public final String b;
    public final String c;
    public final long d;
    
    static {
        a = TimeUnit.DAYS.toMillis(7L);
    }
    
    private agol(final String b, final String c, final long d) {
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public static agol a(final String s) {
        if (TextUtils.isEmpty((CharSequence)s)) {
            return null;
        }
        if (s.startsWith("{")) {
            try {
                final JSONObject jsonObject = new JSONObject(s);
                return new agol(jsonObject.getString("token"), jsonObject.getString("appVersion"), jsonObject.getLong("timestamp"));
            }
            catch (final JSONException ex) {
                Log.w("FirebaseMessaging", "Failed to parse token: ".concat(ex.toString()));
                return null;
            }
        }
        return new agol(s, null, 0L);
    }
    
    public static String b(String string, final String s, final long n) {
        try {
            final JSONObject jsonObject = new JSONObject();
            jsonObject.put("token", (Object)string);
            jsonObject.put("appVersion", (Object)s);
            jsonObject.put("timestamp", n);
            string = jsonObject.toString();
            return string;
        }
        catch (final JSONException ex) {
            Log.w("FirebaseMessaging", "Failed to encode token: ".concat(ex.toString()));
            return null;
        }
    }
}
