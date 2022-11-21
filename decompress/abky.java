import java.util.Iterator;
import android.text.TextUtils;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abky
{
    private static final Map a;
    
    static {
        a = (Map)new ConcurrentHashMap();
        f((abkx)new ablm());
        f((abkx)new abln());
        f((abkx)new abkv());
        f((abkx)new ablg());
    }
    
    static lrt a(final aisc aisc) {
        final abkx i = i(aisc);
        if (i != null) {
            return i.h(aisc);
        }
        return lrt.a;
    }
    
    public static aisc b(final aisc aisc) {
        final abkx i = i(aisc);
        aisc r = aisc;
        if (i != null) {
            r = i.r(aisc);
        }
        return r;
    }
    
    public static String c(final aisc aisc) {
        final abkx i = i(aisc);
        String j;
        if (i != null) {
            j = i.j(aisc);
        }
        else {
            j = "";
        }
        return j;
    }
    
    public static String d(final aisc aisc) {
        final abkx i = i(aisc);
        String h;
        if (i != null) {
            h = i.h(aisc).h;
        }
        else {
            h = "";
        }
        return h;
    }
    
    public static String e(final aisc aisc) {
        final abkx i = i(aisc);
        String k;
        if (i != null) {
            k = i.k(aisc);
        }
        else {
            k = "";
        }
        return k;
    }
    
    public static void f(final abkx abkx) {
        abky.a.put(abkx.a(), abkx);
    }
    
    public static boolean g(final PlaybackStartDescriptor playbackStartDescriptor, final PlaybackStartDescriptor playbackStartDescriptor2) {
        if (playbackStartDescriptor == playbackStartDescriptor2) {
            return true;
        }
        if (playbackStartDescriptor != null) {
            if (playbackStartDescriptor2 != null) {
                final aisc b = playbackStartDescriptor.b;
                final aisc b2 = playbackStartDescriptor2.b;
                if (b != null && b2 != null) {
                    return h(b, b2);
                }
                if (playbackStartDescriptor.l() == null && playbackStartDescriptor2.l() == null && playbackStartDescriptor.s() == playbackStartDescriptor2.s()) {
                    if (playbackStartDescriptor.u() == playbackStartDescriptor2.u()) {
                        if (TextUtils.equals((CharSequence)playbackStartDescriptor.i(), (CharSequence)playbackStartDescriptor2.i())) {
                            if (TextUtils.equals((CharSequence)"", (CharSequence)playbackStartDescriptor.i()) || Math.abs(playbackStartDescriptor.a() - playbackStartDescriptor2.a()) <= 1) {
                                return TextUtils.equals((CharSequence)playbackStartDescriptor.k(), (CharSequence)playbackStartDescriptor2.k());
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
    
    public static boolean h(aisc b, final aisc aisc) {
        b = b(b);
        final aisc b2 = b(aisc);
        final abkx i = i(b);
        return i != null && ((ahcu)b2).ry(i.a()) && i.l(b, b2);
    }
    
    private static abkx i(final aisc aisc) {
        if (aisc != null) {
            for (final abkx abkx : abky.a.values()) {
                if (((ahcu)aisc).ry(abkx.a())) {
                    return abkx;
                }
            }
        }
        return null;
    }
}
