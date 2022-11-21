import android.content.Context;
import android.app.Application;
import youtube.media.engine.api.MediaEngineAudioContainerRegistrar;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afuk implements arom
{
    public static afui b() {
        final afuh a = afuh.a;
        a.getClass();
        return (afui)a;
    }
    
    public static void c(final Activity activity) {
        if (activity != null) {
            return;
        }
        throw new IllegalStateException("Attempted use of the activity when it is null");
    }
    
    public static bu d(final Activity activity) {
        try {
            final bu bu = (bu)activity;
            bu.getClass();
            return bu;
        }
        catch (final ClassCastException ex) {
            throw new IllegalStateException("Expected activity to be a FragmentActivity: ".concat(String.valueOf(String.valueOf(activity))), ex);
        }
    }
    
    public static MediaEngineAudioContainerRegistrar e(final noj noj) {
        return new MediaEngineAudioContainerRegistrar(noj, (byte[])null, (byte[])null);
    }
    
    public static aeoq f(final atnb atnb, final ahei ahei) {
        atnb.getClass();
        return (aeoq)new aeov((atnb)new aawk(atnb, 11), ahei, null, null);
    }
    
    public static Application g(final agpb agpb) {
        final Application b = areq.B((Context)agpb.a);
        b.getClass();
        return b;
    }
    
    public static Context h(final agpb agpb) {
        return (Context)agpb.a;
    }
    
    @Override
    public final Object a() {
        throw null;
    }
}
