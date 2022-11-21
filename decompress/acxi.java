import android.content.SharedPreferences;
import java.util.Iterator;
import android.content.SharedPreferences$Editor;
import java.util.Map;
import java.util.HashMap;
import android.util.Pair;

// 
// Decompiled by Procyon v0.6.0
// 

final class acxi implements acxb
{
    final acxb a;
    final akdp b;
    final Object c;
    final xab d;
    final boolean e;
    final acxj f;
    
    public acxi(final acxj f, final acxb a, final akdp b, final Object c, final xab d, final boolean e) {
        this.f = f;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    @Override
    public final /* bridge */ void a(final Object o, final int n) {
        final acxx acxx = (acxx)o;
        final acxb a = this.a;
        if (a != null) {
            a.a(acxx, n);
        }
    }
    
    @Override
    public final /* bridge */ void mu(Object c) {
        final acxx acxx = (acxx)c;
        final acxb a = this.a;
        if (a != null) {
            a.mu(acxx);
        }
        final acxj f = this.f;
        final akdp b = this.b;
        c = this.c;
        final xab d = this.d;
        if (!this.e) {
            f.c.add(new Pair((Object)b, c));
            final gab f2 = f.f;
            final String af = gab.af(b);
            final SharedPreferences$Editor putLong = ((SharedPreferences)f2.a).edit().putLong(af, ((SharedPreferences)f2.a).getLong(af, 0L) + 1L).putLong(gab.ae(b), ((oco)f2.b).c());
            if ((b.b & 0x40) != 0x0) {
                akdl akdl;
                if ((akdl = b.i) == null) {
                    akdl = akdl.a;
                }
                final int bh = adzw.bH(akdl.b);
                if (bh != 0) {
                    if (bh == 4) {
                        putLong.remove("add_to_long_press_hint_trigger_video_id");
                    }
                }
            }
            putLong.apply();
            if (b.j.size() != 0) {
                for (final aisc aisc : b.j) {
                    final HashMap hashMap = new HashMap();
                    hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", b);
                    f.a.c(aisc, (Map)hashMap);
                }
            }
        }
        byte[] i = null;
        Label_0384: {
            if ((b.b & 0x2) != 0x0) {
                akdm akdm;
                if ((akdm = b.d) == null) {
                    akdm = akdm.a;
                }
                if (akdm.b == 106514900) {
                    akdm akdm2;
                    if ((akdm2 = b.d) == null) {
                        akdm2 = akdm.a;
                    }
                    akdi a2;
                    if (akdm2.b == 106514900) {
                        a2 = (akdi)akdm2.c;
                    }
                    else {
                        a2 = akdi.a;
                    }
                    i = a2.h.I();
                    break Label_0384;
                }
            }
            i = null;
        }
        if (d != null && i != null) {
            d.t((xbe)new wzy(i), (alji)null);
        }
    }
}
