import org.json.JSONException;
import java.io.UnsupportedEncodingException;
import java.util.Map;
import java.util.HashMap;
import org.json.JSONObject;

// 
// Decompiled by Procyon v0.6.0
// 

final class fxj extends zmp
{
    private final String a;
    private final String b;
    
    public fxj(final String s, final String a, final String b) {
        super(2, s, (dbd)null);
        this.a = a;
        this.b = b;
    }
    
    public final alm c(final dba dba) {
        final int a = dba.a;
        if (a != 200 && a != 204) {
            trn.c(fxk.a, "ERROR status code from external message response");
            return alm.m(new dbi(dba));
        }
        final String a2 = fxk.a;
        return alm.n((Object)null, (dav)null);
    }
    
    public final byte[] rG() {
        Object c = null;
        try {
            c = new JSONObject();
            ((JSONObject)c).put("event", (Object)this.a);
            final HashMap hashMap = new HashMap();
            hashMap.put("screenId", this.b);
            hashMap.put("method", "updateRemoteTransactionStatus");
            hashMap.put("params", ((JSONObject)c).toString());
            c = tgt.d((Map)hashMap, "ISO-8859-1").c();
            return (byte[])c;
        }
        catch (final UnsupportedEncodingException c) {}
        catch (final JSONException ex) {}
        trn.f(fxk.a, "Error while creating POST payload for the RemoteTransaction progress API.", (Throwable)c);
        return null;
    }
}
