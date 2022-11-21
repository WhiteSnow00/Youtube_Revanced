import java.util.Set;
import java.util.List;
import android.content.ContextWrapper;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ColorDrawable;
import android.widget.ListAdapter;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import java.util.Iterator;
import java.util.HashMap;
import java.util.Map;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import java.util.Collection;
import java.util.function.Supplier;
import android.view.View;
import android.widget.ListPopupWindow;
import j$.util.Optional;
import android.content.Context;
import android.view.View$OnLongClickListener;
import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public class acrc implements View$OnClickListener, View$OnLongClickListener, acqy
{
    private final Context a;
    public final aclp b;
    public final acmr c;
    public Object d;
    public xab e;
    private final acmm f;
    private final vhw g;
    private final veh h;
    private final Optional i;
    private final Optional j;
    private final boolean k;
    private final Object l;
    private volatile ListPopupWindow m;
    private acud n;
    private final adgg o;
    private final bx p;
    
    public acrc(final Context a, final veh h, final acrd acrd, final aefs aefs, final aefs aefs2, final bx p18, final vhw g, final adgg o, final Optional i, final Optional j, final boolean k, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6, final byte[] array7) {
        h.getClass();
        a.getClass();
        acrd.getClass();
        this.a = a;
        acrd.b(amis.class);
        final aclp n = aefs.N((acmh)acrd.a());
        this.b = n;
        final acmr c = new acmr();
        n.h((acla)(this.c = c));
        (this.f = aefs2.J((acmh)acrd.a())).h((acla)c);
        this.p = p18;
        this.g = g;
        this.h = h;
        this.o = o;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = new Object();
        if (aefs.b == null) {
            aefs.b = new aefs((boolean[])null);
        }
        ((Map<acrc, Object>)aefs.b.a).put(this, null);
    }
    
    private final boolean b(final amiv amiv, final Object o) {
        boolean b2;
        final boolean b = b2 = false;
        if (amiv != null) {
            if (!aamz.af(amiv, o, this.p, this.g)) {
                b2 = b;
                if (amiv.l) {
                    if ((amiv.b & 0x20000) != 0x0) {
                        return true;
                    }
                    b2 = b;
                }
            }
            else {
                b2 = true;
            }
        }
        return b2;
    }
    
    public void a(final amiv amiv, final View anchorView, final Object d, final xab e) {
        this.c.clear();
        if (this.k) {
            final afgh ae = aamz.ae(amiv, d, this.p, this.g);
            for (int c = ((afjx)ae).c, i = 0; i < c; ++i) {
                final amis amis = ae.get(i);
                final int size = this.c.size();
                this.c.add((Object)amis);
                aamz.s(amis, d, (aup)this.j(this.a).orElseThrow((Supplier)achh.d), this.g, this.c, size, (afax)accj.d);
            }
        }
        else {
            this.c.addAll((Collection)aamz.ae(amiv, d, this.p, this.g));
        }
        this.d = d;
        this.e = e;
        if (acud.g(this.a, this.i)) {
            final RecyclerView recyclerView = new RecyclerView(this.a);
            recyclerView.af((nx)new LinearLayoutManager());
            recyclerView.ac((nr)this.f);
            this.n = new acud(this.a, anchorView, Optional.of((Object)recyclerView), Optional.empty(), Optional.empty());
            if (this.i.isPresent()) {
                this.n.g = ((vbs)this.i.get()).aP();
            }
            if (this.j.isPresent()) {
                this.n.b((acuf)((aheu)this.j.get()).O(acua.a().d()));
            }
            this.n.e();
            return;
        }
        final ListPopupWindow j = this.i();
        j.setDropDownGravity(8388661);
        j.setAnchorView(anchorView);
        j.show();
    }
    
    public final Map c() {
        final HashMap hashMap = new HashMap();
        hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", this.d);
        hashMap.put("com.google.android.libraries.youtube.logging.interaction_logger", this.e);
        if (this.i.isPresent() && ((vbs)this.i.get()).aO()) {
            final acud n = this.n;
            if (n != null) {
                hashMap.put("anchor_view", n.b);
            }
        }
        return hashMap;
    }
    
    public final void d(final View view, final amiv amiv, final Object o, final xab xab) {
        final boolean b = this.b(amiv, o);
        int visibility;
        if (!b) {
            visibility = 8;
        }
        else {
            visibility = 0;
        }
        view.setVisibility(visibility);
        view.setOnClickListener((View$OnClickListener)this);
        view.setTag(2131429414, (Object)amiv);
        view.setTag(2131429416, o);
        view.setTag(2131429413, (Object)xab);
        view.setTag(2131429415, (Object)this);
        if (b) {
            final adgg o2 = this.o;
            if (o2 != null) {
                if (!((Set)o2.a).isEmpty()) {
                    final Iterator<Object> iterator = ((Set<Object>)o2.a).iterator();
                    while (iterator.hasNext()) {
                        iterator.next().b((Object)amiv, view);
                    }
                }
            }
        }
    }
    
    public final void f(final View view, final View view2, final amiv amiv, final Object o, final xab xab) {
        view.getClass();
        this.d(view2, amiv, o, xab);
        if (view2.getTag(2131429417) == null) {
            view2.setTag(2131429417, (Object)new acrb(view, view2));
        }
        if (this.b(amiv, o)) {
            if (amiv.f) {
                view.getViewTreeObserver().addOnGlobalLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)new acqz(this, view, amiv, view2, o, xab));
            }
        }
    }
    
    public final void g(final View view) {
        view.setOnClickListener((View$OnClickListener)null);
        view.setTag(2131429414, (Object)null);
        view.setTag(2131429416, (Object)null);
        view.setTag(2131429413, (Object)null);
        view.setTag(2131429415, (Object)null);
    }
    
    public final void h() {
        final acud n = this.n;
        if (n != null && n.f()) {
            this.n.c();
            return;
        }
        synchronized (this.l) {
            if (this.m != null) {
                final ListPopupWindow i = this.i();
                if (i != null) {
                    i.dismiss();
                }
            }
        }
    }
    
    protected final ListPopupWindow i() {
        if (this.m == null) {
            synchronized (this.l) {
                if (this.m == null) {
                    (this.m = new ListPopupWindow(this.a)).setWidth(this.a.getResources().getDimensionPixelSize(2131166975));
                    this.m.setPromptPosition(1);
                    this.m.setInputMethodMode(2);
                    this.m.setModal(true);
                    this.m.setAdapter((ListAdapter)this.b);
                    if (this.i.isPresent() && ((vbs)this.i.get()).aX()) {
                        this.m.setBackgroundDrawable((Drawable)new ColorDrawable(tqf.cr(this.a, 2130970866)));
                    }
                }
            }
        }
        return this.m;
    }
    
    protected final Optional j(final Context context) {
        if (context instanceof aup) {
            return Optional.of((Object)context);
        }
        if (context instanceof ContextWrapper) {
            return this.j(((ContextWrapper)context).getBaseContext());
        }
        return Optional.empty();
    }
    
    protected final List k(final amiv amiv, final Object o) {
        return aamz.ae(amiv, o, this.p, this.g);
    }
    
    public final void onClick(final View view) {
        final amiv amiv = (amiv)view.getTag(2131429414);
        final Object tag = view.getTag(2131429416);
        final Object tag2 = view.getTag(2131429413);
        xab xab;
        if (tag2 instanceof xab) {
            xab = (xab)tag2;
        }
        else {
            xab = null;
        }
        if (amiv.l && (amiv.b & 0x20000) != 0x0) {
            final veh h = this.h;
            aisc aisc;
            if ((aisc = amiv.m) == null) {
                aisc = aisc.a;
            }
            h.a(aisc);
            return;
        }
        if (this.b(amiv, tag)) {
            this.a(amiv, view, tag, xab);
        }
    }
    
    public final boolean onLongClick(final View view) {
        final amiv amiv = (amiv)view.getTag(2131429414);
        final Object tag = view.getTag(2131429416);
        final Object tag2 = view.getTag(2131429413);
        xab xab;
        if (tag2 instanceof xab) {
            xab = (xab)tag2;
        }
        else {
            xab = null;
        }
        if (amiv.l && (amiv.b & 0x20000) != 0x0) {
            final veh h = this.h;
            aisc aisc;
            if ((aisc = amiv.m) == null) {
                aisc = aisc.a;
            }
            h.a(aisc);
        }
        else if (this.b(amiv, tag)) {
            this.a(amiv, view, tag, xab);
            return true;
        }
        return false;
    }
}
