import android.os.Handler;
import android.content.Context;
import com.google.android.apps.youtube.app.extensions.reel.edit.activity.ReelCameraActivity;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hgf implements arjd
{
    public static ReelCameraActivity b(final Activity activity) {
        final ReelCameraActivity reelCameraActivity = (ReelCameraActivity)activity;
        reelCameraActivity.getClass();
        return reelCameraActivity;
    }
    
    public static cl c(final Activity activity) {
        final cl og = ((ReelCameraActivity)activity).b.og();
        og.getClass();
        return og;
    }
    
    public static umv d(final br br) {
        Object o = null;
        Label_0074: {
            if (br instanceof uqx) {
                o = ((uqx)br).az;
            }
            else if (br instanceof umv) {
                o = br;
            }
            else {
                if (br instanceof aemu) {
                    final aemu aemu = (aemu)br;
                    if (aemu.aN() instanceof umv) {
                        o = aemu.aN();
                        break Label_0074;
                    }
                }
                o = hgr.a;
            }
        }
        ((umv)o).getClass();
        return (umv)o;
    }
    
    public static ufj e(final br br) {
        ufj ufj;
        if (br instanceof aemu) {
            ufj = (ufj)((aemu)br).aN();
        }
        else {
            ufj = (ufj)br;
        }
        ufj.getClass();
        return ufj;
    }
    
    public static hic f(final Context context, final Handler handler) {
        return new hic(context, handler);
    }
    
    public static hif g(final Context context, final hjr hjr) {
        return new hif(context, hjr);
    }
    
    public static hig h(final hgl hgl) {
        return new hig(hgl);
    }
    
    public static cca i(final Context context) {
        return new cca(context);
    }
}
