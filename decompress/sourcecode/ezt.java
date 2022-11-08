import java.util.List;
import android.util.DisplayMetrics;
import android.content.res.Resources;
import java.util.Iterator;
import android.view.View$OnClickListener;
import android.widget.LinearLayout$LayoutParams;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout$LayoutParams;
import java.util.HashMap;
import java.util.Map;
import android.graphics.Rect;
import android.widget.TextView;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ezt extends acja implements acol
{
    public final vax a;
    public final View b;
    public final RecyclerView c;
    public final atix d;
    public aexq e;
    public aige f;
    private final fwu g;
    private final acqu h;
    private final View i;
    private final View j;
    private final View k;
    private final View l;
    private final acjb m;
    private final achw n;
    private final LinearLayoutManager o;
    private final Context p;
    private int q;
    private int r;
    private acpd s;
    private fyl t;
    private int u;
    private final sxd v;
    private final iw x;
    
    public ezt(final Context p10, final vax a, final fwu g, final acno acno, final hmb hmb, final aeby aeby, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        p10.getClass();
        this.p = p10;
        g.getClass();
        this.g = g;
        this.a = a;
        this.d = atix.e();
        final View inflate = LayoutInflater.from(p10).inflate(2131624157, (ViewGroup)null);
        this.b = inflate;
        this.k = inflate.findViewById(2131429145);
        this.i = inflate.findViewById(2131431531);
        final RecyclerView c = (RecyclerView)inflate.findViewById(2131428160);
        this.c = c;
        final LinearLayoutManager o = new LinearLayoutManager();
        (this.o = o).ac(0);
        c.af((nw)o);
        final acjb m = new acjb();
        this.m = m;
        final aciw t = aeby.T((acir)acno.a());
        t.h((achk)m);
        t.f((acik)(this.n = new achw()));
        t.f((acik)(this.v = new sxd(1, (byte[])null)));
        this.e = aewp.a;
        t.f((acik)new fas(this, 1));
        c.ac((nq)t);
        this.x = new ezq(this);
        final View viewById = inflate.findViewById(2131428159);
        this.j = viewById;
        final gkv b = hmb.b((TextView)viewById);
        (this.h = b).e(2131170082);
        b.g();
        this.l = inflate.findViewById(2131428161);
        this.r = -1;
        this.q = -1;
    }
    
    public static ezn f(final int n, final aexq aexq) {
        if (!aexq.h()) {
            return ezn.a;
        }
        ezn ezn;
        if ((int)aexq.c() == n) {
            ezn = ezn.b;
        }
        else {
            ezn = ezn.c;
        }
        return ezn;
    }
    
    private static void l(final View view, final int n) {
        view.setPaddingRelative(view.getPaddingStart(), view.getPaddingTop(), view.getPaddingEnd(), n);
    }
    
    public final View a() {
        return this.b;
    }
    
    public final void c(final acir acir) {
    }
    
    public final void g(final aexq e) {
        this.e = e;
        this.d.tr((Object)ezr.b(e));
        if (e.h()) {
            final int intValue = (int)e.c();
            final int computeHorizontalScrollOffset = this.c.computeHorizontalScrollOffset();
            final on h = this.c.h(intValue);
            if (h != null) {
                final int measuredWidth = h.a.getMeasuredWidth();
                this.c.getGlobalVisibleRect(new Rect());
                int n;
                if (ana.f(this.b) == 1) {
                    n = this.c.computeHorizontalScrollRange() - (intValue - 2) * measuredWidth - this.c.computeHorizontalScrollExtent();
                }
                else {
                    n = (intValue - 2) * measuredWidth;
                }
                this.c.ah(n - computeHorizontalScrollOffset, 0);
            }
        }
    }
    
    public final void h() {
        tmy.v(this.k, this.o.L() < ((tdv)this.m).size() - 1);
    }
    
    public final boolean i() {
        final aige f = this.f;
        if (f != null && (f.b & 0x40) != 0x0 && this.e.h() && this.s != null) {
            this.g(aewp.a);
            final HashMap q = ajox.Q(1);
            q.put("sectionListController", this.s);
            final vax a = this.a;
            aioe aioe;
            if ((aioe = this.f.i) == null) {
                aioe = aioe.a;
            }
            a.c(aioe, (Map)q);
            return true;
        }
        return false;
    }
    
    public final boolean j() {
        final aige f = this.f;
        if (f != null && (f.b & 0x20) != 0x0) {
            final int aj = aety.aJ(f.h);
            if (aj != 0) {
                if (aj == 2) {
                    return true;
                }
            }
        }
        return false;
    }
    
    protected final boolean pS() {
        return true;
    }
    
    public final acpi qv() {
        throw null;
    }
}
