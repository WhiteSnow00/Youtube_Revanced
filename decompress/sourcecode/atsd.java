import android.os.Handler$Callback;
import android.os.Handler;
import android.os.Build$VERSION;
import android.os.Looper;
import android.view.Choreographer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atsd
{
    private static volatile Choreographer choreographer;
    
    static {
        final atsc atsc = null;
        Object g = null;
        try {
            Object mainLooper = Looper.getMainLooper();
            ((Handler)mainLooper).getClass();
            if (Build$VERSION.SDK_INT >= 28) {
                final Object invoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, mainLooper);
                invoke.getClass();
                mainLooper = invoke;
            }
            else {
                try {
                    mainLooper = Handler.class.getDeclaredConstructor(Looper.class, Handler$Callback.class, Boolean.TYPE).newInstance(mainLooper, null, true);
                }
                catch (final NoSuchMethodException ex) {
                    mainLooper = new Handler((Looper)mainLooper);
                }
            }
            final atsb atsb = new atsb((Handler)mainLooper, (String)null);
        }
        finally {
            final Throwable t;
            g = arxj.g(t);
        }
        if (g instanceof atjq) {
            g = atsc;
        }
        final atsc atsc2 = (atsc)g;
    }
    
    public static final atsc a(final Handler handler) {
        return (atsc)new atsb(handler, "main");
    }
}
