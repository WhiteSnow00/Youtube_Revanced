import java.util.List;
import com.google.vr.sdk.base.HeadsetSelector;
import android.content.Context;
import com.google.vr.sdk.base.HeadsetSelector$HeadsetInfo;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aaws
{
    public static final int a = 0;
    private static final HeadsetSelector$HeadsetInfo b;
    
    static {
        b = HeadsetSelector$HeadsetInfo.newInstance("Samsung", "Gear VR", "Samsung Gear VR", false);
    }
    
    static HeadsetSelector$HeadsetInfo a(final Context context, final tmx tmx) {
        if (aawu.b(context)) {
            final int a = aqsx.a(((aqrf)tmx.c()).c);
            if (a != 0) {
                if (a == 3) {
                    return aaws.b;
                }
            }
        }
        return HeadsetSelector.getCurrentHeadsetInfo(context);
    }
    
    static List b(final Context context, final tmx tmx) {
        final List recentHeadsetInfos = HeadsetSelector.getRecentHeadsetInfos(context);
        if (aawu.b(context)) {
            final HeadsetSelector$HeadsetInfo b = aaws.b;
            if (b.equals((Object)a(context, tmx))) {
                recentHeadsetInfos.add(0, b);
            }
            else {
                recentHeadsetInfos.add(b);
            }
        }
        return recentHeadsetInfos;
    }
    
    public static void c(final Throwable t) {
        ttr.d("Failed to update VR platform preference to store.", t);
    }
    
    public static void d(final Throwable t) {
        ttr.d("Failed to update VR platform preference to store.", t);
    }
    
    static int e(final HeadsetSelector$HeadsetInfo headsetSelector$HeadsetInfo) {
        if (headsetSelector$HeadsetInfo == null) {
            return 0;
        }
        if (aaws.b.equals((Object)headsetSelector$HeadsetInfo)) {
            return 3;
        }
        if (headsetSelector$HeadsetInfo.isCardboardViewer()) {
            return 1;
        }
        return 2;
    }
    
    static void f(final Context context, final tmx tmx, final HeadsetSelector$HeadsetInfo headsetSelector$HeadsetInfo) {
        if (aawu.b(context) && aaws.b.equals((Object)headsetSelector$HeadsetInfo)) {
            teu.m(tmx.b((aezf)aalg.n), (tes)zsa.l);
            return;
        }
        teu.m(tmx.b((aezf)aalg.o), (tes)zsa.m);
        HeadsetSelector.selectHeadset(context, headsetSelector$HeadsetInfo);
    }
}
