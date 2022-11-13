import java.util.Set;
import com.google.firebase.datatransport.TransportRegistrar;
import com.google.firebase.analytics.connector.internal.AnalyticsConnectorRegistrar;
import android.content.Context;
import com.google.firebase.iid.Registrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import com.google.firebase.messaging.FirebaseMessagingRegistrar;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agjw implements agjd
{
    public static final agjw a;
    public static final agjw b;
    public static final agjw c;
    public static final agjw d;
    public static final agjw e;
    public static final agjw f;
    public static final agjw g;
    public static final agjw h;
    private final int i;
    
    static {
        h = new agjw(7);
        g = new agjw(6);
        f = new agjw(5);
        e = new agjw(4);
        d = new agjw(3);
        c = new agjw(2);
        b = new agjw(1);
        a = new agjw(0);
    }
    
    private agjw(final int i) {
        this.i = i;
    }
    
    public final Object a(final agjc agjc) {
        switch (this.i) {
            default: {
                final Set b = agjc.b((Class)agnm.class);
                final agnl a;
                if ((a = agnl.a) == null) {
                    synchronized (agnl.class) {
                        if (agnl.a == null) {
                            agnl.a = new agnl();
                        }
                    }
                }
                return new agnk(b, a);
            }
            case 6: {
                return FirebaseMessagingRegistrar.lambda$getComponents$0(agjc);
            }
            case 5: {
                return FirebaseInstallationsRegistrar.lambda$getComponents$0(agjc);
            }
            case 4: {
                return Registrar.lambda$getComponents$1(agjc);
            }
            case 3: {
                return Registrar.lambda$getComponents$0(agjc);
            }
            case 2: {
                return new agkq((Context)agjc.a((Class)Context.class), ((agia)agjc.a((Class)agia.class)).h(), agjc.b((Class)agkr.class), agjc.c((Class)agnp.class));
            }
            case 1: {
                return AnalyticsConnectorRegistrar.lambda$getComponents$0(agjc);
            }
            case 0: {
                return TransportRegistrar.lambda$getComponents$0(agjc);
            }
        }
    }
}
