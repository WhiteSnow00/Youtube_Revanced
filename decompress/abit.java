import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abit implements itv
{
    public final acla a;
    public final acmm b;
    public final Context c;
    public final xab d;
    public final abix e;
    public final acsd f;
    public RecyclerView g;
    public acsc h;
    public int i;
    public int j;
    public int k;
    public final itw l;
    private final itx m;
    private final acdr n;
    
    public abit(final Context c, final aefs aefs, final ful ful, final ful ful2, final ful ful3, final acdr n, final onm onm, final acfc acfc, final vbs vbs, final ouy ouy, final atnb atnb, final xab d, final abix e, final itw l, final thg thg, final acrr acrr, final byte[] array, final byte[] array2, final byte[] array3) {
        final aclr a = new aclr();
        final acli acli = new acli();
        ((acmh)acli).f(ajqs.class, (acmf)ful);
        ((acmh)acli).f(ajqr.class, (acmf)ful2);
        ((acmh)acli).f(acrp.class, (acmf)ful3);
        final acmm j = aefs.J((acmh)acli);
        final acvo f = new acvo(onm, d, acfc, vbs, acfc.a().E(acfl.e), ouy, atnb);
        this.c = c;
        this.a = (acla)a;
        this.b = j;
        this.d = d;
        this.f = (acsd)f;
        this.e = e;
        this.l = l;
        this.n = n;
        final itx m = new itx(this, thg, acrr);
        this.m = m;
        m.a.m((Object)m);
        m.a.i((Object)m, ((acqh)m.d.l).x);
        j.tg((acmc)m);
    }
    
    public final void a(final Rect rect) {
        final RecyclerView g = this.g;
        if (g == null) {
            return;
        }
        g.setPadding(rect.left + this.i, this.g.getPaddingTop(), rect.right + this.j, rect.bottom + this.k);
        this.g.aa(0);
    }
    
    public final void b(final aniy aniy) {
        final acmr acmr = new acmr();
        for (final anja anja : aniy.d) {
            final int b = anja.b;
            if ((b & 0x2) != 0x0) {
                ajqr ajqr;
                if ((ajqr = anja.d) == null) {
                    ajqr = ajqr.a;
                }
                acmr.add((Object)ajqr);
            }
            else if ((b & 0x1) != 0x0) {
                ajqs ajqs;
                if ((ajqs = anja.c) == null) {
                    ajqs = ajqs.a;
                }
                acmr.add((Object)ajqs);
            }
            else {
                if ((b & 0x8) == 0x0) {
                    continue;
                }
                final acdr n = this.n;
                ajon ajon;
                if ((ajon = anja.e) == null) {
                    ajon = ajon.a;
                }
                acmr.add((Object)n.d(ajon));
            }
        }
        final acla a = this.a;
        final acrr b2 = this.m.b;
        int i;
        if (b2 != null) {
            i = ((aclr)a).i(b2);
        }
        else {
            i = -1;
        }
        int n2 = i;
        if (i == -1) {
            n2 = ((aclr)this.a).h() - 1;
        }
        ((aclr)a).n(n2, acmr);
        final itw l = this.l;
        final ArrayList<acbk> list = new ArrayList<acbk>();
        final Iterator<Object> iterator2 = ((List<Object>)aniy.e).iterator();
        boolean b3;
        while (true) {
            final boolean hasNext = iterator2.hasNext();
            b3 = true;
            if (!hasNext) {
                break;
            }
            final aniz aniz = iterator2.next();
            if ((0x1 & aniz.b) == 0x0) {
                continue;
            }
            amth amth;
            if ((amth = aniz.c) == null) {
                amth = amth.a;
            }
            final acbk x = aamp.x(amth);
            if (x == null) {
                continue;
            }
            list.add(x);
        }
        ((acqh)l).lM(list);
        final itx m = this.m;
        if (m.b != null) {
            final boolean b4 = m.c != null || ((acqh)m.d.l).al(acbj.b);
            if (((aclr)m.d.a).i(m.b) == -1) {
                b3 = false;
            }
            if (b4 != b3) {
                if (b4) {
                    final aclr aclr = (aclr)m.d.a;
                    aclr.n(aclr.h(), m.b);
                    if (((acqh)m.d.l).al(acbj.b)) {
                        if (m.c == null) {
                            m.c = m.a((acqf)acqe.a());
                        }
                        m.b(m.c.a);
                    }
                }
                else {
                    ((aclr)m.d.a).q(m.b);
                }
            }
        }
    }
}
