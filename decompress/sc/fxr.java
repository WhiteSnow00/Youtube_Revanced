import org.json.JSONException;
import java.io.UnsupportedEncodingException;
import java.util.Map;
import java.util.HashMap;
import org.json.JSONObject;

// 
// Decompiled by Procyon v0.6.0
// 

final class fxr extends zol
{
    private final String a;
    private final String b;
    
    public fxr(final String s, final String a, final String b) {
        super(2, s, (dbe)null);
        this.a = a;
        this.b = b;
    }
    
    public final aln c(final dbb dbb) {
        final int a = dbb.a;
        if (a != 200 && a != 204) {
            ttr.c(fxs.a, "ERROR status code from external message response");
            return aln.m(new dbj(dbb));
        }
        final String a2 = fxs.a;
        return aln.n((Object)null, (daw)null);
    }
    
    public final /* bridge */ void rL(final Object o) {
        final Void void1 = (Void)o;
    }
    
    public final byte[] rM() {
        Object c = null;
        try {
            final JSONObject jsonObject = new JSONObject();
            jsonObject.put("event", (Object)this.a);
            c = new HashMap<String, String>();
            ((Map<String, String>)c).put("screenId", this.b);
            ((Map<String, String>)c).put("method", "updateRemoteTransactionStatus");
            ((Map<String, String>)c).put("params", jsonObject.toString());
            c = tiy.d((Map)c, "ISO-8859-1").c();
            return (byte[])c;
        }
        catch (final UnsupportedEncodingException c) {}
        catch (final JSONException ex) {}
        ttr.f(fxs.a, "Error while creating POST payload for the RemoteTransaction progress API.", (Throwable)c);
        return null;
    }
}
