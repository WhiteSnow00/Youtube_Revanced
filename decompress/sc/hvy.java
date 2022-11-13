import java.util.List;
import com.google.android.apps.youtube.app.common.ui.navigation.PaneDescriptor;

// 
// Decompiled by Procyon v0.6.0
// 

final class hvy extends acnv
{
    final kau a;
    final hwl b;
    
    public hvy(final hwl b, final kau a) {
        this.b = b;
        this.a = a;
    }
    
    public final void a() {
        final kau a = this.a;
        fwc.d(((acns)a).m, (acjn)((acns)a).f, vxg.f(this.b.aL()), this.b.cf);
        final boolean p = this.a.p();
        final hwl b = this.b;
        if (p != b.aE) {
            b.aE = p;
            b.bB();
        }
    }
    
    public final void b() {
        this.b.aT.post((Runnable)new hvt(this, 2));
    }
    
    public final void c(final vgu vgu, final boolean b) {
        if (b) {
            if (this.a == this.b.r()) {
                final hwl b2 = this.b;
                if (!b2.cQ.az(PaneDescriptor.b((ggq)b2))) {
                    this.b.bJ();
                }
                final hwl b3 = this.b;
                if (b3.cQ.ax(PaneDescriptor.b((ggq)b3))) {
                    this.b.bM();
                }
            }
            final kag bm = this.b.bM;
            if (bm != null) {
                final anyv a = vgu.a;
                if (bm.c.isEmpty()) {
                    final List list = bm.b.get(a);
                    bm.b.clear();
                    bm.a.clear();
                    if (list != null) {
                        bm.b.put(a, list);
                        bm.b((List)list);
                    }
                }
            }
        }
        final kau a2 = this.a;
        fwc.d(((acns)a2).m, (acjn)((acns)a2).f, vxg.f(this.b.aL()), this.b.cf);
        if (this.a.p()) {
            final hwl b4 = this.b;
            if (!b4.aE) {
                b4.aE = true;
                b4.bB();
            }
        }
    }
}
