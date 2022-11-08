import java.util.HashMap;
import java.util.Map;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import android.net.Uri;
import android.support.v7.widget.LinearLayoutManager;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.view.View$OnLongClickListener;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.libraries.youtube.common.ui.swipelayout.SwipeLayout;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ezk extends acja implements acie, acgz
{
    public final SwipeLayout a;
    public final acqs b;
    public aifv c;
    public final alm d;
    private final TextView e;
    private final TextView f;
    private final ImageView g;
    private final View h;
    private final ImageView i;
    private final acjb j;
    private final RecyclerView k;
    private final Context l;
    private final aceo m;
    private final acih n;
    private final acha o;
    private final View$OnLongClickListener p;
    private final acqs q;
    private acij r;
    
    public ezk(final Context l, final aceo m, final atjj atjj, final vax vax, final acha o, final alm d, final esz esz, final ftx ftx, final aeby aeby, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6) {
        l.getClass();
        this.l = l;
        m.getClass();
        this.m = m;
        this.d = d;
        o.getClass();
        this.o = o;
        final SwipeLayout a = (SwipeLayout)LayoutInflater.from(l).inflate(2131624155, (ViewGroup)null);
        this.a = a;
        this.e = (TextView)a.findViewById(2131428131);
        this.f = (TextView)a.findViewById(2131427493);
        this.g = (ImageView)a.findViewById(2131428086);
        this.h = a.findViewById(2131428141);
        this.i = (ImageView)a.findViewById(2131428142);
        final RecyclerView k = (RecyclerView)a.findViewById(2131427935);
        (this.k = k).af((nw)new LinearLayoutManager(0));
        final aciy aciy = new aciy();
        final aciw t = aeby.T((acir)aciy);
        k.ac((nq)t);
        t.h((achk)(this.j = new acjb()));
        aciy.f((Class)aibk.class, (acip)new acit(atjj, 0));
        aciy.f((Class)aibb.class, (acip)new ssb(this, 1));
        aciy.f((Class)aokx.class, (acip)esz);
        aciy.f((Class)aokt.class, (acip)ftx);
        this.n = new acih(vax, (View)a, (acie)this);
        this.p = (View$OnLongClickListener)new jil(this, 1);
        this.q = new ezi(this, 0);
        this.b = new ezi(this, 2);
    }
    
    private final int l(final aifv aifv) {
        final hsm i = this.i(aifv);
        if (i == null) {
            return 1;
        }
        return i.c;
    }
    
    public final View a() {
        return (View)this.a;
    }
    
    public final void b(final Uri uri, final Uri uri2) {
        final hsm hsm = (hsm)this.o.b(uri);
        this.c = (aifv)hsm.a;
        this.a.setAlpha(1.0f);
        final aifv c = this.c;
        if ((c.b & 0x8) != 0x0) {
            final acih n = this.n;
            final wwv a = ((wwx)this.r).a;
            aioe aioe;
            if ((aioe = c.h) == null) {
                aioe = aioe.a;
            }
            n.a(a, aioe, this.r.e());
        }
        else {
            this.n.c();
        }
        aift aift;
        if ((aift = this.c.k) == null) {
            aift = aift.a;
        }
        final int aw = aesy.aw(aift.b);
        final boolean b = aw != 0 && aw == 2;
        final aifv c2 = this.c;
        ajsq ajsq;
        if ((c2.b & 0x2) != 0x0) {
            if ((ajsq = c2.f) == null) {
                ajsq = ajsq.a;
            }
        }
        else {
            ajsq = null;
        }
        this.e.setText((CharSequence)abyh.b(ajsq));
        final aifv c3 = this.c;
        aorm aorm;
        if ((c3.b & 0x4) != 0x0) {
            if ((aorm = c3.g) == null) {
                aorm = aorm.a;
            }
        }
        else {
            aorm = null;
        }
        if (actc.M(aorm)) {
            this.m.g(this.g, aorm);
        }
        if (!b) {
            final aifv c4 = this.c;
            final int c5 = c4.c;
            if (c5 == 4) {
                this.f.setVisibility(0);
                final TextView f = this.f;
                ajsq a2;
                if (c4.c == 4) {
                    a2 = (ajsq)c4.d;
                }
                else {
                    a2 = ajsq.a;
                }
                f.setText((CharSequence)abyh.b(a2));
                this.f.setTextColor(this.l.getResources().getColor(2131102356));
            }
            else if (c5 == 5) {
                this.f.setVisibility(0);
                final TextView f2 = this.f;
                ajsq a3;
                if (c4.c == 5) {
                    a3 = (ajsq)c4.d;
                }
                else {
                    a3 = ajsq.a;
                }
                f2.setText((CharSequence)abyh.b(a3));
                this.f.setTextColor(this.l.getResources().getColor(2131102371));
            }
            else {
                this.f.setVisibility(8);
            }
        }
        final aifv c6 = this.c;
        ((tdv)this.j).clear();
        for (final aifs aifs : c6.m) {
            final int b2 = aifs.b;
            if ((b2 & 0x1) != 0x0) {
                final acjb j = this.j;
                aibk aibk;
                if ((aibk = aifs.c) == null) {
                    aibk = aibk.a;
                }
                j.add((Object)aibk);
            }
            else if ((b2 & 0x2) != 0x0) {
                final acjb i = this.j;
                aibb aibb;
                if ((aibb = aifs.d) == null) {
                    aibb = aibb.a;
                }
                i.add((Object)aibb);
            }
            else if ((b2 & 0x4) != 0x0) {
                final acjb k = this.j;
                aokx aokx;
                if ((aokx = aifs.e) == null) {
                    aokx = aokx.a;
                }
                k.add((Object)aokx);
            }
            else {
                if ((b2 & 0x8) == 0x0) {
                    continue;
                }
                final acjb l = this.j;
                aokt aokt;
                if ((aokt = aifs.f) == null) {
                    aokt = aokt.a;
                }
                l.add((Object)aokt);
            }
        }
        this.j.l();
        final RecyclerView m = this.k;
        int visibility;
        if (!((tdv)this.j).isEmpty()) {
            visibility = 0;
        }
        else {
            visibility = 8;
        }
        m.setVisibility(visibility);
        final aifv c7 = this.c;
        final ArrayList list = new ArrayList();
        this.a.h();
        if (c7.n.size() == 0) {
            tmy.Y(this.a, (List)list);
            this.a.setOnLongClickListener((View$OnLongClickListener)null);
        }
        else {
            for (final aify aify : c7.n) {
                if ((aify.b & 0x1) != 0x0) {
                    final ftp o = this.d.o(this.q, this.f(c7));
                    final acij r = this.r;
                    aibb aibb2;
                    if ((aibb2 = aify.c) == null) {
                        aibb2 = aibb.a;
                    }
                    o.mN(r, (Object)aibb2);
                    final TextView b3 = o.b;
                    if (b3 instanceof TextView) {
                        b3.setGravity(16);
                    }
                    list.add(b3);
                }
            }
            tmy.Y(this.a, (List)list);
            this.a.setOnLongClickListener(this.p);
        }
        final int c8 = hsm.c;
        final int c9 = this.c.c;
        this.h.setVisibility(8);
        final ImageView i2 = this.i;
        int visibility2;
        if (!b) {
            visibility2 = 8;
        }
        else {
            visibility2 = 4;
        }
        i2.setVisibility(visibility2);
        this.g.setAlpha(1.0f);
        this.e.setAlpha(1.0f);
        if (c8 == 3) {
            this.g.setAlpha(0.5f);
            this.e.setAlpha(0.5f);
            return;
        }
        if (c8 == 4) {
            this.a.setAlpha(0.5f);
            this.k.setVisibility(8);
            this.a.k((View)null);
            final SwipeLayout a4 = this.a;
            a4.f = false;
            a4.h = false;
            a4.setOnLongClickListener((View$OnLongClickListener)null);
            return;
        }
        if (b) {
            if (c9 == 5) {
                this.i.setVisibility(0);
                this.i.setImageDrawable(this.l.getResources().getDrawable(2131231153));
                return;
            }
            if (c8 == 2) {
                this.i.setVisibility(0);
                this.i.setImageDrawable(this.l.getResources().getDrawable(2131231154));
            }
        }
        else if (c8 == 2) {
            this.h.setVisibility(0);
        }
    }
    
    public final void c(final acir acir) {
        this.n.c();
        this.o.f((acgz)this);
        this.c = null;
        tmy.Y(this.a, (List)Collections.emptyList());
    }
    
    public final Map f(final aifv aifv) {
        final HashMap hashMap = new HashMap();
        final wwv a = ((wwx)this.r).a;
        if (a != null) {
            hashMap.put("com.google.android.libraries.youtube.logging.interaction_logger", a);
        }
        hashMap.putAll(www.g((Object)new fwn(false, new ezj(this, aifv, this.l(aifv)))));
        return hashMap;
    }
    
    public final void g() {
        this.j(this.c, 4);
    }
    
    public final boolean h(final View view) {
        final aifv c = this.c;
        if ((c.b & 0x8) != 0x0) {
            if (this.l(c) == 2) {
                this.j(this.c, 1);
            }
            return false;
        }
        return true;
    }
    
    public final hsm i(final aifv aifv) {
        if (aifv == null) {
            return null;
        }
        return (hsm)this.o.b(hsm.a(aifv));
    }
    
    public final void j(final aifv aifv, final int n) {
        final hsm i = this.i(aifv);
        if (i == null) {
            return;
        }
        final acha o = this.o;
        final Uri b = i.b;
        final agza builder = ((agzi)i.a).toBuilder();
        hsm.c(builder);
        o.d(b, (acgy)new hsm((aifv)builder.build(), n));
    }
}
