import java.util.List;
import java.util.Map;
import android.view.View;
import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public class acqt implements View$OnClickListener
{
    public final View a;
    protected aibb b;
    public acqs c;
    public acqr d;
    public final aeby e;
    private final vax f;
    private final boolean g;
    private Map h;
    
    public acqt(final vax f, final aeby e, final View a, final uyi uyi, final byte[] array, final byte[] array2, final byte[] array3) {
        f.getClass();
        this.f = f;
        this.e = e;
        a.getClass();
        this.a = a;
        boolean g = false;
        if (uyi != null) {
            g = g;
            if (uyi.aL()) {
                g = true;
            }
        }
        this.g = g;
        a.setOnClickListener((View$OnClickListener)this);
    }
    
    private final afcw c() {
        final acqr d = this.d;
        Map a;
        if (d != null) {
            a = d.a();
        }
        else {
            a = null;
        }
        afcw afcw;
        if (a == null) {
            afcw = afgm.b;
        }
        else {
            afcw = afcw.k(a);
        }
        return afcw;
    }
    
    private final Map d(final afcw afcw, final boolean b) {
        final Map i = www.i((Object)this.b, b);
        final Map h = this.h;
        if (h != null) {
            i.putAll(h);
        }
        i.putAll((Map)afcw);
        if (this.g) {
            i.put("anchor_view", this.a);
        }
        return i;
    }
    
    public void a(final aibb b, final wwv wwv, final Map map) {
        Object k;
        if (map != null) {
            k = afcw.k(map);
        }
        else {
            k = null;
        }
        this.h = (Map)k;
        this.b = b;
        if (b == null) {
            this.a.setVisibility(8);
            return;
        }
        this.a.setVisibility(0);
        this.a.setEnabled(this.b.h ^ true);
        this.a.setClickable(this.b.h ^ true);
        final aibb b2 = this.b;
        String c;
        if ((b2.b & 0x80000) != 0x0) {
            ahgm ahgm;
            if ((ahgm = b2.s) == null) {
                ahgm = ahgm.a;
            }
            c = ahgm.c;
        }
        else {
            c = null;
        }
        if (c != null) {
            this.a.setContentDescription((CharSequence)c);
        }
        if (wwv != null) {
            final aibb b3 = this.b;
            if ((b3.b & 0x800000) != 0x0) {
                wwv.t((wxz)new wws(b3.w), (alff)null);
            }
        }
        if (b.q.size() != 0) {
            this.f.d((List)b.q, this.d(this.c(), false));
        }
        if (this.e != null) {
            if (this.a.isShown() && ana.am(this.a)) {
                this.e.S(b, this.a);
                return;
            }
            this.a.post((Runnable)new abwg(this, b, 11));
        }
    }
    
    public final void b(final aibb aibb, final wwv wwv) {
        this.a(aibb, wwv, null);
    }
    
    public final void onClick(final View view) {
        final aibb b = this.b;
        if (b != null) {
            if (!b.h) {
                if (this.c != null) {
                    final agzc agzc = (agzc)((agzi)b).toBuilder();
                    this.c.pT(agzc);
                    this.b = (aibb)((agza)agzc).build();
                }
                final aibb b2 = this.b;
                final int b3 = b2.b;
                if ((b3 & 0x4000) == 0x0) {
                    if ((b3 & 0x8000) == 0x0 && (b3 & 0x10000) == 0x0) {
                        return;
                    }
                }
                final afcw c = this.c();
                final int b4 = b2.b;
                if ((b4 & 0x4000) != 0x0) {
                    final boolean b5 = (b4 & 0x8000) != 0x0;
                    final vax f = this.f;
                    aioe aioe;
                    if ((aioe = b2.n) == null) {
                        aioe = aioe.a;
                    }
                    f.c(aioe, this.d(c, b5 ^ true));
                }
                if ((b2.b & 0x8000) != 0x0) {
                    final vax f2 = this.f;
                    aioe aioe2;
                    if ((aioe2 = b2.o) == null) {
                        aioe2 = aioe.a;
                    }
                    f2.c(aioe2, this.d(c, false));
                }
                if ((b2.b & 0x10000) != 0x0) {
                    final vax f3 = this.f;
                    aioe aioe3;
                    if ((aioe3 = b2.p) == null) {
                        aioe3 = aioe.a;
                    }
                    f3.c(aioe3, this.d(c, false));
                }
            }
        }
    }
}
