import java.util.Iterator;
import android.text.TextUtils;
import com.google.android.gms.common.ConnectionResult;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mpo extends Exception
{
    private final abg a;
    
    public mpo(final abg a) {
        this.a = a;
    }
    
    @Override
    public final String getMessage() {
        final ArrayList list = new ArrayList();
        final Iterator iterator = this.a.keySet().iterator();
        boolean b = true;
        while (iterator.hasNext()) {
            final mqm mqm = (mqm)iterator.next();
            final ConnectionResult connectionResult = (ConnectionResult)((abn)this.a).get((Object)mqm);
            kgk.aL((Object)connectionResult);
            b &= (connectionResult.b() ^ true);
            final String a = mqm.a();
            final String string = connectionResult.toString();
            final StringBuilder sb = new StringBuilder();
            sb.append(a);
            sb.append(": ");
            sb.append(string);
            list.add(sb.toString());
        }
        final StringBuilder sb2 = new StringBuilder();
        if (b) {
            sb2.append("None of the queried APIs are available. ");
        }
        else {
            sb2.append("Some of the queried APIs are unavailable. ");
        }
        sb2.append(TextUtils.join((CharSequence)"; ", (Iterable)list));
        return sb2.toString();
    }
}
