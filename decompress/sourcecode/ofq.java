import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import android.util.Log;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ofq
{
    public static boolean a;
    public static final Object b;
    private static final String[] c;
    
    static {
        c = new String[] { "COLLECTION_BASIS_VERIFIER" };
        b = new Object();
    }
    
    public static void a(final oeu oeu, final elw elw) {
        final nkp a = nkn.a(oeu.a);
        final String concat = "com.google.android.libraries.consentverifier#".concat(String.valueOf(oeu.a.getPackageName()));
        final int e = elw.E(oeu.a);
        final String[] c = ofq.c;
        final mse b = msf.b();
        b.a = (mry)new nko(concat, e, c);
        final nly t = ((mpr)a).t(b.a());
        final Executor d = nzj.D(oeu);
        try {
            t.o(d, (nlu)new ofp(a, concat, d, 0));
            t.n(d, (nls)new mii(concat, 9));
        }
        catch (final RejectedExecutionException ex) {
            Log.w("CBVerifier", String.format("Execution failure when updating phenotypeflags for %s. %s", concat, ex));
        }
    }
}
