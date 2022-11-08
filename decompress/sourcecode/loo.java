import com.google.android.apps.youtube.embeddedplayer.service.userinfo.service.k;
import android.net.Uri;
import android.content.Context;
import java.util.concurrent.Executor;
import com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.service.e;
import com.google.android.apps.youtube.embeddedplayer.service.userinfo.service.a;
import com.google.android.apps.youtube.embeddedplayer.service.clientinfo.service.d;
import android.content.SharedPreferences;
import com.google.android.apps.youtube.embeddedplayer.service.userinfo.service.l;

// 
// Decompiled by Procyon v0.6.0
// 

public final class loo implements arjd
{
    private final atjj a;
    private final /* synthetic */ int b;
    private final Object c;
    
    public loo(final atjj c, final atjj a, final int b) {
        this.b = b;
        this.c = c;
        this.a = a;
    }
    
    public loo(final atjj a, final atjj c, final int b, final byte[] array) {
        this.b = b;
        this.a = a;
        this.c = c;
    }
    
    public loo(final atjj a, final atjj c, final int b, final char[] array) {
        this.b = b;
        this.a = a;
        this.c = c;
    }
    
    public loo(final atjj a, final atjj c, final int b, final short[] array) {
        this.b = b;
        this.a = a;
        this.c = c;
    }
    
    public loo(final pht c, final atjj a, final int b) {
        this.b = b;
        this.c = c;
        this.a = a;
    }
    
    public static loo b(final atjj atjj, final atjj atjj2) {
        return new loo(atjj, atjj2, 2, (byte[])null);
    }
    
    public static loo c(final atjj atjj, final atjj atjj2) {
        return new loo(atjj, atjj2, 3);
    }
    
    public static loo d(final atjj atjj, final atjj atjj2) {
        return new loo(atjj, atjj2, 4);
    }
    
    public static loo e(final atjj atjj, final atjj atjj2) {
        return new loo(atjj, atjj2, 7);
    }
    
    public static oxp f(final phq phq, final lzi lzi) {
        return new oxp(phq, lzi, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
    }
}
