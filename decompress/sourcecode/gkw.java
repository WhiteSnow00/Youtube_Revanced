import java.util.Iterator;
import java.util.Map;
import java.util.HashMap;
import com.google.protobuf.MessageLite;
import android.util.Pair;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gkw implements fwy
{
    public final fwz a;
    public alhe b;
    private final gkx c;
    private final fjn d;
    private final wwu e;
    private final vax f;
    private final acup g;
    private final adcr h;
    
    public gkw(final fwz a, final gkx c, final fjn d, final wwu e, final vax f, final ktd b, final adcr h, final acup g, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.a = a;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.h = h;
        this.g = g;
        c.b = b;
    }
    
    private final boolean g() {
        final alhe b = this.b;
        return b != null && !b.p;
    }
    
    public final void a(final alhe b) {
        this.b = b;
        if (b == null) {
            this.c.a();
        }
    }
    
    public final boolean b() {
        return this.c.d();
    }
    
    public final int c() {
        return 6000;
    }
    
    public final void d() {
        this.a(null);
    }
    
    public final void e() {
        final alhe b = this.b;
        if (b == null) {
            return;
        }
        if (!this.b() && !this.g()) {
            this.c.b((Object)b, new Pair((Object)"overlay_controller_param", (Object)new ezi(this, 6)));
        }
        if (this.g()) {
            final alhe b2 = this.b;
            b2.getClass();
            if (!this.h.aK((MessageLite)b2)) {
                this.h.aJ((MessageLite)b2);
                final alhe b3 = this.b;
                b3.getClass();
                for (final aioe aioe : b3.o) {
                    if (aioe != null) {
                        final HashMap hashMap = new HashMap();
                        hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", b3);
                        this.f.c(aioe, (Map)hashMap);
                    }
                }
            }
            final wwv n = this.e.n();
            n.t((wxz)new wws(b2.n), (alff)null);
            aibc aibc;
            if ((aibc = b2.k) == null) {
                aibc = aibc.a;
            }
            aibb aibb;
            if ((aibc.b & 0x1) != 0x0) {
                aibc aibc2;
                if ((aibc2 = b2.k) == null) {
                    aibc2 = aibc.a;
                }
                if ((aibb = aibc2.c) == null) {
                    aibb = aibb.a;
                }
            }
            else {
                aibb = null;
            }
            final aibc m = b2.m;
            aibc a;
            if (m == null) {
                a = aibc.a;
            }
            else {
                a = m;
            }
            aibb aibb2;
            if ((a.b & 0x1) != 0x0) {
                aibc a2;
                if ((a2 = m) == null) {
                    a2 = aibc.a;
                }
                if ((aibb2 = a2.c) == null) {
                    aibb2 = aibb.a;
                }
            }
            else {
                aibb2 = null;
            }
            if (aibb != null && (aibb.b & 0x800000) != 0x0) {
                n.t((wxz)new wws(aibb.w.I()), (alff)null);
            }
            if (aibb2 != null && (aibb2.b & 0x800000) != 0x0) {
                n.t((wxz)new wws(aibb2.w), (alff)null);
            }
            this.b = null;
        }
    }
    
    public final boolean f() {
        return !this.d.l() && !this.g.j();
    }
}
