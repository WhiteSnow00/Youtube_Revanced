import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abfr implements isn
{
    public final achk a;
    public final aciw b;
    public final Context c;
    public final wwv d;
    public final abfv e;
    public final acoo f;
    public RecyclerView g;
    public acon h;
    public int i;
    public int j;
    public int k;
    public final iso l;
    private final isp m;
    private final acae n;
    
    public abfr(final Context c, final aeby aeby, final ftx ftx, final ftx ftx2, final ftx ftx3, final acae n, final olq olq, final acbo acbo, final uyi uyi, final osx osx, final atjj atjj, final wwv d, final abfv e, final iso l, final tdz tdz, final acoc acoc, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        final acib a = new acib();
        final achs achs = new achs();
        ((acir)achs).f(ajmo.class, (acip)ftx);
        ((acir)achs).f(ajmn.class, (acip)ftx2);
        ((acir)achs).f(acoa.class, (acip)ftx3);
        final aciw t = aeby.T((acir)achs);
        final acrz f = new acrz(olq, d, acbo, uyi, acbo.a().E(acbx.e), osx, atjj);
        this.c = c;
        this.a = (achk)a;
        this.b = t;
        this.d = d;
        this.f = (acoo)f;
        this.e = e;
        this.l = l;
        this.n = n;
        final isp m = new isp(this, tdz, acoc);
        this.m = m;
        m.a.m((Object)m);
        m.a.i((Object)m, m.d.l.x);
        t.tb((acim)m);
    }
    
    public final void a(final Rect rect) {
        final RecyclerView g = this.g;
        if (g == null) {
            return;
        }
        g.setPadding(rect.left + this.i, this.g.getPaddingTop(), rect.right + this.j, rect.bottom + this.k);
        this.g.aa(0);
    }
    
    public final void b(final anen anen) {
        final acjb acjb = new acjb();
        for (final anep anep : anen.d) {
            final int b = anep.b;
            if ((b & 0x2) != 0x0) {
                ajmn ajmn;
                if ((ajmn = anep.d) == null) {
                    ajmn = ajmn.a;
                }
                acjb.add((Object)ajmn);
            }
            else if ((b & 0x1) != 0x0) {
                ajmo ajmo;
                if ((ajmo = anep.c) == null) {
                    ajmo = ajmo.a;
                }
                acjb.add((Object)ajmo);
            }
            else {
                if ((b & 0x8) == 0x0) {
                    continue;
                }
                final acae n = this.n;
                ajkj ajkj;
                if ((ajkj = anep.e) == null) {
                    ajkj = ajkj.a;
                }
                acjb.add((Object)n.d(ajkj));
            }
        }
        final achk a = this.a;
        final acoc b2 = this.m.b;
        int i;
        if (b2 != null) {
            i = ((acib)a).i((achk)b2);
        }
        else {
            i = -1;
        }
        int n2 = i;
        if (i == -1) {
            n2 = ((acib)this.a).h() - 1;
        }
        ((acib)a).n(n2, (achk)acjb);
        final iso l = this.l;
        final ArrayList<abxx> list = new ArrayList<abxx>();
        final Iterator<Object> iterator2 = anen.e.iterator();
        boolean b3;
        while (true) {
            final boolean hasNext = iterator2.hasNext();
            b3 = true;
            if (!hasNext) {
                break;
            }
            final aneo aneo = iterator2.next();
            if ((0x1 & aneo.b) == 0x0) {
                continue;
            }
            amoy amoy;
            if ((amoy = aneo.c) == null) {
                amoy = amoy.a;
            }
            final abxx y = aaiy.y((Object)amoy);
            if (y == null) {
                continue;
            }
            list.add(y);
        }
        l.lM((List)list);
        final isp m = this.m;
        if (m.b != null) {
            final boolean b4 = m.c != null || m.d.l.al(abxw.b);
            if (((acib)m.d.a).i((achk)m.b) == -1) {
                b3 = false;
            }
            if (b4 != b3) {
                if (b4) {
                    final acib acib = (acib)m.d.a;
                    acib.n(acib.h(), (achk)m.b);
                    if (m.d.l.al(abxw.b)) {
                        if (m.c == null) {
                            m.c = m.a((acmq)acmp.a());
                        }
                        m.b(m.c.a);
                    }
                }
                else {
                    ((acib)m.d.a).q((achk)m.b);
                }
            }
        }
    }
}
