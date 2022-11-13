import com.google.protobuf.ExtensionRegistryLite;
import java.util.List;
import java.util.Collection;
import java.util.ArrayList;
import com.google.protos.youtube.api.innertube.CinematicContainerRendererOuterClass$CinematicContainerRenderer;
import j$.util.Optional;

// 
// Decompiled by Procyon v0.6.0
// 

public final class flz implements asjr
{
    public static final flz a;
    public static final flz b;
    public static final flz c;
    public static final flz d;
    public static final flz e;
    public static final flz f;
    public static final flz g;
    public static final flz h;
    public static final flz i;
    public static final flz j;
    public static final flz k;
    public static final flz l;
    public static final flz m;
    public static final flz n;
    public static final flz o;
    public static final flz p;
    public static final flz q;
    public static final flz r;
    public static final flz s;
    private final int t;
    
    static {
        s = new flz(20);
        r = new flz(19);
        q = new flz(18);
        p = new flz(17);
        o = new flz(16);
        n = new flz(15);
        m = new flz(14);
        l = new flz(13);
        k = new flz(10);
        j = new flz(9);
        i = new flz(8);
        h = new flz(7);
        g = new flz(6);
        f = new flz(5);
        e = new flz(4);
        d = new flz(3);
        c = new flz(2);
        b = new flz(1);
        a = new flz(0);
    }
    
    public flz(final int t) {
        this.t = t;
    }
    
    public final Object a(final Object o) {
        final int t = this.t;
        String j = "";
        final boolean b = true;
        final boolean b2 = true;
        final boolean b3 = true;
        boolean b4 = true;
        switch (t) {
            default: {
                return ((fzw)o).b;
            }
            case 19: {
                final Optional optional = (Optional)o;
                final int a = gcu.a;
                Optional optional2;
                if (optional.isPresent() && (((CinematicContainerRendererOuterClass$CinematicContainerRenderer)optional.get()).b & 0x4) != 0x0) {
                    aiky aiky;
                    if ((aiky = ((CinematicContainerRendererOuterClass$CinematicContainerRenderer)optional.get()).f) == null) {
                        aiky = aiky.a;
                    }
                    optional2 = Optional.of((Object)aiky);
                }
                else {
                    optional2 = Optional.empty();
                }
                return optional2;
            }
            case 18: {
                final aany aany = (aany)o;
                return aany.a().V().L((asjr)new fdg(aany, 19));
            }
            case 17: {
                return ((fnc)o).k;
            }
            case 16: {
                return ((flm)o).b;
            }
            case 15: {
                if (((flm)o).a <= 0) {
                    b4 = false;
                }
                return b4;
            }
            case 14: {
                return Optional.ofNullable((Object)((vft)o).c);
            }
            case 13: {
                return ((flm)o).a > 0 && b;
            }
            case 12: {
                final amac amac = (amac)((vft)o).c;
                if (amac != null) {
                    final boolean b5 = b2;
                    if (!amac.getItems().isEmpty()) {
                        return b5;
                    }
                }
                return false;
            }
            case 11: {
                final alyt alyt = (alyt)((vft)o).c;
                if (alyt != null) {
                    final boolean b6 = b3;
                    if (!alyt.getDownloads().isEmpty()) {
                        return b6;
                    }
                }
                return false;
            }
            case 10: {
                return afeq.o((Collection)o);
            }
            case 9: {
                return asht.U((Iterable)o);
            }
            case 8: {
                return ((flm)o).b;
            }
            case 7: {
                return ((ancy)o).c.m;
            }
            case 6: {
                return ((amam)o).b.e;
            }
            case 5: {
                return afeq.o((Collection)o);
            }
            case 4: {
                final String s = (String)o;
                alzm alzm;
                try {
                    alzm = (alzm)ahbh.parseFrom((ahbh)alzm.a, vgl.c(s), ExtensionRegistryLite.getGeneratedRegistry());
                }
                catch (final ahca ahca) {
                    final StringBuilder sb = new StringBuilder("Fetching util: entityKey=`");
                    sb.append(s);
                    sb.append("` does not contain a PlaylistVideoEntityId message as its identifier.");
                    ttr.b(sb.toString());
                    alzm = null;
                }
                if (alzm != null) {
                    j = glb.J(alzm.c);
                }
                return j;
            }
            case 3: {
                final List list = (List)o;
                return flm.a(list.size(), afeq.o((Collection)list));
            }
            case 2: {
                final amad amad = (amad)o;
                final int b7 = amad.b;
                String s2;
                if (b7 == 1) {
                    s2 = (String)amad.c;
                }
                else {
                    s2 = j;
                    if (b7 == 2) {
                        s2 = (String)amad.c;
                    }
                }
                return s2;
            }
            case 1: {
                return ((amac)o).getItems();
            }
            case 0: {
                return asht.U((Iterable)o);
            }
        }
    }
}
