import java.util.Queue;
import com.google.android.libraries.elements.interfaces.IntersectionEngine;
import java.util.ArrayDeque;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.support.v7.widget.RecyclerView;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kwn implements uvg
{
    private final Context a;
    private final atjj b;
    private final osx c;
    private frb d;
    private acor e;
    private RecyclerView f;
    private final ioe g;
    private final bhu h;
    
    public kwn(final Context a, final atjj b, final ioe g, final bhu h, final osx c, final byte[] array, final byte[] array2) {
        this.a = a;
        this.b = b;
        this.g = g;
        this.h = h;
        this.c = c;
    }
    
    public final RecyclerView a() {
        final RecyclerView f = this.f;
        if (f != null) {
            return f;
        }
        return this.f = (RecyclerView)LayoutInflater.from(this.a).inflate(2131625332, (ViewGroup)null, false);
    }
    
    public final acor c(final RecyclerView recyclerView, final SwipeRefreshLayout swipeRefreshLayout, final vke vke, final utx utx, final wwv wwv, final acpf acpf) {
        final acor e = this.e;
        if (e != null) {
            return e;
        }
        final frb v = this.h.v(swipeRefreshLayout);
        final ioe g = this.g;
        final Object a = ((acno)this.b.a()).a();
        final acbx f = acbx.f;
        final osx c = this.c;
        final Context a2 = this.a;
        final ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.offer(new wws(wya.c(96494)));
        arrayDeque.offer(new wws(wya.c(31880)));
        final aeby aeby = (aeby)g.n.a();
        aeby.getClass();
        final acoc acoc = (acoc)g.o.a();
        acoc.getClass();
        final acoc acoc2 = (acoc)g.o.a();
        acoc2.getClass();
        final tdz tdz = (tdz)g.l.a();
        tdz.getClass();
        final tny tny = (tny)g.b.a();
        tny.getClass();
        g.h.a().getClass();
        final arud arud = (arud)g.p.a();
        arud.getClass();
        final olq olq = (olq)g.f.a();
        olq.getClass();
        g.g.a().getClass();
        final acbo acbo = (acbo)g.a.a();
        acbo.getClass();
        final uyi uyi = (uyi)g.k.a();
        uyi.getClass();
        final atjj d = g.d;
        final asgt asgt = (asgt)g.e.a();
        asgt.getClass();
        final etr etr = (etr)g.m.a();
        etr.getClass();
        final gjd gjd = (gjd)g.c.a();
        gjd.getClass();
        final IntersectionEngine intersectionEngine = (IntersectionEngine)g.q.a();
        intersectionEngine.getClass();
        final cxz cxz = (cxz)g.j.a();
        cxz.getClass();
        final uyi uyi2 = (uyi)g.i.a();
        uyi2.getClass();
        recyclerView.getClass();
        a.getClass();
        f.getClass();
        c.getClass();
        a2.getClass();
        final gjq e2 = new gjq(aeby, acoc, acoc2, tdz, tny, arud, olq, acbo, uyi, d, asgt, etr, gjd, intersectionEngine, cxz, uyi2, (acpi)null, (aeby)null, recyclerView, vke, (acnq)utx, wwv, (acir)a, acpf, (acot)v, 3, f, c, acce.a, a2, (fre)null, (Queue)arrayDeque, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        v.d((acor)e2);
        this.d = v;
        return this.e = (acor)e2;
    }
    
    public final void d() {
        final frb d = this.d;
        if (d != null) {
            d.b();
            this.d = null;
            this.e = null;
            this.f = null;
        }
    }
    
    public final boolean e() {
        final frb d = this.d;
        return d != null && d.b != 3;
    }
}
