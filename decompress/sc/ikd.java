import java.util.HashSet;
import java.util.Set;
import android.util.Pair;
import com.google.protobuf.MessageLite;
import com.google.protos.youtube.api.innertube.DownloadsPageEndpointOuterClass;
import java.util.HashMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ikd implements wyv
{
    public final wyw a;
    public final Map b;
    public final Map c;
    public final Map d;
    public final Map e;
    public int f;
    
    public ikd(final wyw a) {
        this.a = a;
        this.f = 0;
        this.c = new HashMap();
        this.b = new HashMap();
        this.d = new HashMap();
        this.e = new HashMap();
    }
    
    public static boolean d(final aoiw aoiw) {
        aiqj a;
        if (aoiw.c == 6) {
            a = (aiqj)aoiw.d;
        }
        else {
            a = aiqj.a;
        }
        return ((ahbc)a).ry((ahaq)DownloadsPageEndpointOuterClass.downloadsPageEndpoint);
    }
    
    public static final boolean e(final aoiw aoiw) {
        aoiy a;
        if (aoiw.c == 3) {
            a = (aoiy)aoiw.d;
        }
        else {
            a = aoiy.a;
        }
        anul anul;
        if ((anul = a.c) == null) {
            anul = anul.a;
        }
        final acaa x = aakt.x((Object)anul);
        return x != null && (boolean)jgk.K(x, (aezf)iny.f, (Object)false);
    }
    
    public static final xab f(final String s, final MessageLite messageLite) {
        if (messageLite instanceof aoix) {
            return xaa.c(42355);
        }
        if (messageLite instanceof aoiw) {
            final aoiw aoiw = (aoiw)messageLite;
            final boolean d = d(aoiw);
            boolean b = true;
            if (!d) {
                b = (e(aoiw) && b);
            }
            adkp.H(b);
            final ajhp a = ajhp.a;
            ajhp ajhp;
            if (d(aoiw)) {
                aiqj a2;
                if (aoiw.c == 6) {
                    a2 = (aiqj)aoiw.d;
                }
                else {
                    a2 = aiqj.a;
                }
                if ((ajhp = ajhp.b(((ajhq)((ahbc)a2).rx((ahaq)DownloadsPageEndpointOuterClass.downloadsPageEndpoint)).c)) == null) {
                    ajhp = ajhp.a;
                }
            }
            else {
                aoiy a3;
                if (aoiw.c == 3) {
                    a3 = (aoiy)aoiw.d;
                }
                else {
                    a3 = aoiy.a;
                }
                anul anul;
                if ((anul = a3.c) == null) {
                    anul = anul.a;
                }
                final acaa x = aakt.x((Object)anul);
                ajhp = a;
                if (x != null) {
                    ajhp = (ajhp)jgk.K(x, (aezf)iny.d, (Object)ajhp.a);
                }
            }
            final int ordinal = ajhp.ordinal();
            xab xab;
            if (ordinal != 2) {
                if (ordinal != 3) {
                    xab = xaa.c(48082);
                }
                else {
                    xab = xaa.c(48084);
                }
            }
            else {
                xab = xaa.c(48083);
            }
            return xab;
        }
        if (messageLite instanceof aivu) {
            return xaa.c(42357);
        }
        if (messageLite instanceof aiwm) {
            if ("downloads_page_downloads_item_section_identifier".equals(s)) {
                return xaa.c(42356);
            }
            if ("downloads_page_recommendations_item_section_identifier".equals(s)) {
                return xaa.c(51723);
            }
        }
        else if (messageLite instanceof amte) {
            return xaa.c(69464);
        }
        return null;
    }
    
    public final appm a(final String s, final MessageLite messageLite) {
        if (!this.b.containsKey(s)) {
            return null;
        }
        final xab f = f(s, messageLite);
        if (f == null) {
            return null;
        }
        final Pair create = Pair.create((Object)this.b.get(s), (Object)messageLite);
        if (this.e.containsKey(s) && this.e.get(s).contains(messageLite)) {
            return this.a.g((Object)create, f);
        }
        if (this.d.containsKey(s)) {
            final Map map = this.d.get(s);
            if (map.containsKey(messageLite)) {
                return this.a.h((Object)create, f, (int)map.get(messageLite));
            }
        }
        return null;
    }
    
    public final appm b(final xab xab, final MessageLite messageLite) {
        if (xab.a != 51723) {
            return null;
        }
        String c = null;
        Label_0072: {
            if (messageLite instanceof aiwm) {
                final aiwm aiwm = (aiwm)messageLite;
                apkr apkr;
                if ((apkr = aiwm.t) == null) {
                    apkr = apkr.a;
                }
                if ((apkr.b & 0x1) != 0x0) {
                    apkr apkr2;
                    if ((apkr2 = aiwm.t) == null) {
                        apkr2 = apkr.a;
                    }
                    c = apkr2.c;
                    break Label_0072;
                }
            }
            c = null;
        }
        if (c != null) {
            return this.a.g((Object)c, xaa.c(7111));
        }
        return null;
    }
    
    public final void c(final String s, final MessageLite messageLite) {
        Set set2;
        if (!this.e.containsKey(s)) {
            final HashSet set = new HashSet();
            this.e.put(s, set);
            set2 = set;
        }
        else {
            set2 = this.e.get(s);
        }
        set2.add(messageLite);
    }
    
    public final wyw pF() {
        return this.a;
    }
}
