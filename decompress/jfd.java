import android.os.Bundle;
import java.util.HashMap;
import java.util.function.Function;
import j$.util.Optional;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jfd implements acsv
{
    public final Object a;
    private final int b;
    
    public jfd(final fwp a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public jfd(final jfg a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public jfd(final kgw a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public jfd(final sxt a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public jfd(final wyw a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public final Map a() {
        final int b = this.b;
        if (b == 0) {
            return afev.m("PLAYLIST_CREATION_LISTENER_KEY", new jfe((jfg)this.a));
        }
        if (b == 1) {
            return (Map)Optional.ofNullable((Object)((fwp)this.a).f).map((Function)fwk.c).orElse((Object)null);
        }
        if (b == 2) {
            final Object a = this.a;
            final HashMap hashMap = new HashMap(2);
            final Bundle bundle = new Bundle();
            bundle.putBoolean("menu_as_bottom_sheet", true);
            hashMap.put("com.google.android.libraries.youtube.innertube.bundle", bundle);
            hashMap.put("sectionListController", ((kgw)a).b.c("sectionListController"));
            return hashMap;
        }
        if (b != 3) {
            final Object a2 = this.a;
            final HashMap hashMap2 = new HashMap();
            hashMap2.put("com.google.android.libraries.youtube.logging.interaction_logger", a2);
            return hashMap2;
        }
        final Object a3 = this.a;
        final HashMap hashMap3 = new HashMap();
        final sxt sxt = (sxt)a3;
        hashMap3.put("pause_subscription_resume_time_ms_key", ((apdz)sxt.j.d.get(sxt.k)).e);
        return hashMap3;
    }
}
