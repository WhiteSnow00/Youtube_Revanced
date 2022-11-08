import java.util.List;
import java.util.Iterator;
import android.view.View;
import com.google.protos.youtube.api.innertube.BrowseEndpointOuterClass;
import java.util.Map;
import java.util.Collections;
import j$.util.concurrent.ConcurrentHashMap;
import android.content.SharedPreferences;

// 
// Decompiled by Procyon v0.6.0
// 

public final class krh implements fwu
{
    public final fwz a;
    public final krk b;
    public final gkw c;
    public fwt d;
    public fwt e;
    public fwt f;
    public fwt g;
    public fwt h;
    private final SharedPreferences i;
    private final acue j;
    
    public krh(final fwz a, final SharedPreferences i, final acue j, final fxo fxo, final krk b, final gkw c) {
        this.a = a;
        this.i = i;
        this.j = j;
        this.b = b;
        this.c = c;
        if (!i.contains("time_fusion_enabled")) {
            i.edit().putLong("time_fusion_enabled", System.currentTimeMillis()).apply();
        }
        if (i.getBoolean("show_subscribers_tab_tutorial", true)) {
            a.b((fwy)(this.d = new fwt(a, i, 5602, "show_subscribers_tab_tutorial", 2132019893, j)));
        }
        if (i.getBoolean("show_accounts_tab_tutorial", true)) {
            a.b((fwy)(this.e = new fwt(a, i, 5601, "show_accounts_tab_tutorial", 2132017441, j)));
        }
        if (i.getBoolean("show_subs_channels_tutorial", true)) {
            a.b((fwy)(this.f = new fwt(a, i, 5600, "show_subs_channels_tutorial", 2132019892, j)));
        }
        if (i.getBoolean("show_channels_notifications_tutorial", true)) {
            a.b((fwy)(this.g = new fwt(a, i, 4500, "show_channels_notifications_tutorial", 2132017692, j)));
        }
        if (i.getBoolean("show_trending_tab_tutorial", true)) {
            a.b((fwy)(this.h = new fwt(a, i, 5603, "show_trending_tab_tutorial", 2132019992, j)));
        }
        final qpt qpt = new qpt(this);
        if (fxo.a == null) {
            fxo.a = Collections.newSetFromMap((Map<Object, Boolean>)new ConcurrentHashMap());
        }
        fxo.a.add(qpt);
    }
    
    public static boolean d(final aioe aioe, final String s) {
        return aioe != null && (((aial)((agzd)aioe).rr((agyr)BrowseEndpointOuterClass.browseEndpoint)).b & 0x1) != 0x0 && aeda.y(((aial)((agzd)aioe).rr((agyr)BrowseEndpointOuterClass.browseEndpoint)).c, s);
    }
    
    @Override
    public final void a(final Object o, final View view) {
        if (this.f != null && o instanceof aige) {
            final Iterator<Object> iterator = ((List<Object>)((aige)o).e).iterator();
            int n = 0;
            while (iterator.hasNext()) {
                if (iterator.next().b == 48474525) {
                    ++n;
                }
            }
            if (n >= 5) {
                this.f.a = view;
            }
        }
        else if (this.g != null && o instanceof ezf) {
            final ezf ezf = (ezf)o;
            if (ezf.f() != null && ezf.f().b() != null && view.isShown()) {
                this.g.a = view;
            }
        }
        else if (o instanceof amti) {
            this.b.a(view);
            this.b.d = new qpt(this);
        }
        this.a.c();
    }
    
    public final void b(final boolean b) {
        if (!b) {
            this.a.f((fwy)this.b);
            return;
        }
        if (this.b.b()) {
            this.a.b((fwy)this.b);
        }
    }
    
    public final void c(final aopg aopg) {
        String s2;
        final String s = s2 = null;
        boolean b = false;
        Label_0073: {
            if (aopg != null) {
                aioe aioe;
                if ((aioe = aopg.d) == null) {
                    aioe = aioe.a;
                }
                if (d(aioe, "FEsubscriptions")) {
                    s2 = "show_subscribers_tab_tutorial";
                }
                else {
                    if (d(aioe, "FEaccount")) {
                        s2 = "show_accounts_tab_tutorial";
                        b = true;
                        break Label_0073;
                    }
                    s2 = s;
                    if (d(aioe, "FEtrending")) {
                        s2 = "show_trending_tab_tutorial";
                    }
                }
            }
            b = false;
        }
        if (s2 != null) {
            this.i.edit().putBoolean(s2, false).apply();
        }
        this.b.b = b;
    }
    
    public final boolean e() {
        if (this.c.b()) {
            this.c.d();
            return true;
        }
        return false;
    }
}
