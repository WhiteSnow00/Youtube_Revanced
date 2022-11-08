import java.util.Iterator;
import android.text.TextUtils;
import java.util.List;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dxi implements dxy
{
    final /* synthetic */ dxj a;
    private final ArrayList b;
    
    public dxi(final dxj a) {
        this.a = a;
        this.b = new ArrayList();
    }
    
    public final void a(final dxx dxx) {
        final List list = this.a.a.remove(dxx);
        if (list == null) {
            return;
        }
        for (int size = list.size(), i = 0; i < size; ++i) {
            final dyd dyd = (dyd)list.get(i);
            final dxg a = dyd.a;
            final dxh dxh = (dxh)this.a.j.D(a);
            final dxv b = dyd.b;
            int empty = 0;
            Label_0383: {
                if (dxh.c == 2) {
                    final glg glg = dxh.a.get(b);
                    if (glg == null) {
                        throw new RuntimeException("Some animation bookkeeping is wrong: tried to remove an animation from the list of active animations, but it wasn't there.");
                    }
                    --glg.a;
                    if (dxh.c == 2) {
                        final Iterator iterator = dxh.a.values().iterator();
                        while (true) {
                            while (iterator.hasNext()) {
                                if (((glg)iterator.next()).a > 0) {
                                    final int n = 0;
                                    empty = n;
                                    if (n == 0) {
                                        break Label_0383;
                                    }
                                    empty = n;
                                    if (dxh.b == null) {
                                        break Label_0383;
                                    }
                                    final Iterator iterator2 = dxh.a.keySet().iterator();
                                    while (true) {
                                        empty = n;
                                        if (!iterator2.hasNext()) {
                                            break Label_0383;
                                        }
                                        dxj.e((dxv)iterator2.next(), dxh.b);
                                    }
                                }
                            }
                            final int n = 1;
                            continue;
                        }
                    }
                    throw new RuntimeException("This should only be checked for disappearing animations");
                }
                else {
                    final glg glg2 = dxh.a.get(b);
                    if (glg2 == null) {
                        throw new RuntimeException("Some animation bookkeeping is wrong: tried to remove an animation from the list of active animations, but it wasn't there.");
                    }
                    if (--glg2.a > 0) {
                        continue;
                    }
                    dxh.a.remove(b);
                    empty = (dxh.a.isEmpty() ? 1 : 0);
                    if (dxh.b != null) {
                        dxj.g(b, b.e((dvc)dxh.e.d()), dxh.b);
                    }
                }
            }
            if (empty != 0) {
                final dwi b2 = dxh.b;
                if (b2 != null) {
                    this.a.d(b2, true);
                }
                final eaa j = this.a.i;
                if (j != null) {
                    final dwi dwi = ((dxl)j.a).a.remove(a);
                    if (dwi != null) {
                        dxm.f((aja)j.b, dwi);
                    }
                    else {
                        if (!((dxl)j.a).f.remove(a)) {
                            final dxl dxl = (dxl)((aja)j.b).a;
                        }
                        final egn k = ((dxl)j.a).i;
                        dwi dwi2;
                        if (k != null) {
                            dwi2 = ((dve)k).x.get(a);
                        }
                        else {
                            dwi2 = null;
                        }
                        if (dwi2 != null) {
                            for (short b3 = dwi2.b, n2 = 0; n2 < b3; ++n2) {
                                dxm.g((aja)j.b, ((dxl)j.a).i, ((dxl)j.a).i.b(((dvc)dwi2.c((int)n2)).k), false);
                            }
                        }
                    }
                }
                this.a.j.G(a);
                dxj.b(dxh);
            }
        }
        if (!TextUtils.isEmpty((CharSequence)this.a.b.d(dxx.hashCode()))) {
            dxx.hashCode();
            final epc a2 = egc.a;
            this.a.b.i(dxx.hashCode());
        }
    }
    
    @Override
    public final void b(final dxx dxx) {
        this.a(dxx);
    }
    
    @Override
    public final void c(final dxx dxx) {
        final List list = this.a.a.get(dxx);
        if (list != null && this.a.i != null) {
            for (dyd dyd : list) {}
        }
        this.a(dxx);
    }
    
    @Override
    public final void d(final dxx c) {
        c.b(this.b);
        for (int size = this.b.size(), i = 0; i < size; ++i) {
            final dyc dyc = this.b.get(i);
            final dxh dxh = (dxh)this.a.j.D(dyc.a());
            if (dxh != null) {
                final glg glg = dxh.a.get(dyc.b());
                glg.e = dyc.b;
                glg.c = c;
            }
        }
        this.b.clear();
        if (!TextUtils.isEmpty((CharSequence)this.a.b.d(c.hashCode()))) {
            c.hashCode();
            final epc a = egc.a;
        }
    }
    
    @Override
    public final boolean e(final dxx dxx) {
        dxx.b(this.b);
        final int size = this.b.size();
        int n = 1;
        int n2;
        for (int i = 0; i < size; ++i, n = n2) {
            final dyc dyc = this.b.get(i);
            final dxh dxh = (dxh)this.a.j.D(dyc.a());
            glg glg;
            if (dxh != null) {
                glg = dxh.a.get(dyc.b());
            }
            else {
                glg = null;
            }
            if (glg == null) {
                n = 0;
            }
            n2 = n;
            if (n != 0) {
                final Object b = glg.b;
                n2 = n;
                if (b != null) {
                    n2 = n;
                    if ((float)b != dyc.b) {
                        n2 = 0;
                    }
                }
            }
        }
        this.b.clear();
        return n != 0;
    }
}
