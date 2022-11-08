import java.util.Iterator;
import java.util.List;
import com.google.protobuf.MessageLite;
import com.google.protos.youtube.api.innertube.ReelItemRendererOuterClass$ReelItemRenderer;
import android.graphics.drawable.Drawable;
import com.google.protos.youtube.api.innertube.SortFilterSubMenuRendererOuterClass;
import android.view.ViewGroup$MarginLayoutParams;
import java.util.Map;
import android.view.ViewGroup$LayoutParams;
import android.widget.RelativeLayout$LayoutParams;
import app.revanced.integrations.patches.BreakingNewsPanelsRemoverPatch;
import android.view.LayoutInflater;
import android.support.v7.widget.LinearLayoutManager;
import android.content.res.Resources;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.RelativeLayout;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jio extends acja implements acie, tec
{
    private final fye A;
    private akac B;
    private final jiz C;
    private fuv D;
    private final achw E;
    private boolean F;
    private final aeby G;
    private final adcr H;
    private final ViewGroup a;
    private final RecyclerView b;
    private final int c;
    private final RelativeLayout d;
    private final acjb e;
    private final acts f;
    private final tdz g;
    private final TextView h;
    private final acnj i;
    private final ImageView j;
    private final View k;
    private final View l;
    private final int m;
    private final Context n;
    private final Resources o;
    private final ViewGroup p;
    private final TextView q;
    private final fve r;
    private final gkv s;
    private final vax t;
    private final aciw u;
    private final LinearLayoutManager v;
    private final jin x;
    private final fuw y;
    private final fye z;
    
    public jio(final Context n, final acno acno, final acts f, final tdz g, final atjj atjj, final fvf fvf, final hmb hmb, final fuw y, final acnj i, final vax t, final aeby g2, final aeby aeby, final adcr h, final ViewGroup viewGroup, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        this.n = n;
        this.f = f;
        this.g = g;
        this.i = i;
        this.t = t;
        this.y = y;
        this.G = g2;
        this.H = h;
        final LayoutInflater from = LayoutInflater.from(n);
        from.getClass();
        final View inflate = from.inflate(2131624522, (ViewGroup)null);
        BreakingNewsPanelsRemoverPatch.HideBreakingNewsPanels(inflate);
        final ViewGroup a = (ViewGroup)inflate;
        this.a = a;
        final RelativeLayout d = (RelativeLayout)a.findViewById(2131429206);
        this.d = d;
        this.l = a.findViewById(2131431380);
        final jiz c = (jiz)atjj.a();
        this.C = c;
        final RelativeLayout$LayoutParams relativeLayout$LayoutParams = new RelativeLayout$LayoutParams(-2, -2);
        relativeLayout$LayoutParams.addRule(16, 2131428017);
        d.addView(c.a, 0, (ViewGroup$LayoutParams)relativeLayout$LayoutParams);
        final int dimensionPixelSize = n.getResources().getDimensionPixelSize(2131166854);
        final View a2 = c.a;
        a2.setPadding(a2.getPaddingLeft(), a2.getPaddingTop() + dimensionPixelSize, a2.getPaddingRight(), a2.getPaddingBottom() + dimensionPixelSize);
        this.m = n.getResources().getDimensionPixelOffset(2131166850);
        final RecyclerView b = (RecyclerView)a.findViewById(2131428018);
        this.b = b;
        if (viewGroup instanceof RecyclerView) {
            b.aJ(((RecyclerView)viewGroup).aI());
        }
        this.c = b.getPaddingTop();
        final LinearLayoutManager v = new LinearLayoutManager();
        (this.v = v).ac(0);
        b.af((nw)v);
        b.u((oa)new oic(b));
        final acjb e = new acjb();
        this.e = e;
        final aciw t2 = aeby.T((acir)acno.a());
        (this.u = t2).h((achk)e);
        t2.f((acik)(this.E = new achw()));
        t2.f((acik)(this.x = new jin()));
        this.z = new fye(n.getResources().getDimensionPixelSize(2131166855));
        this.A = new fye(n.getResources().getDimensionPixelSize(2131166856));
        this.o = n.getResources();
        final TextView h2 = (TextView)a.findViewById(2131428017);
        this.h = h2;
        this.s = hmb.b(h2);
        final TextView q = (TextView)a.findViewById(2131428021);
        this.q = q;
        this.r = fvf.a(q, null);
        this.j = (ImageView)a.findViewById(2131428019);
        this.k = a.findViewById(2131428020);
        this.p = (ViewGroup)a.findViewById(2131431605);
    }
    
    public final View a() {
        return (View)this.a;
    }
    
    public final void c(final acir acir) {
        ((tdv)this.e).clear();
        this.g.m((Object)this);
        this.C.c(acir);
        this.r.f();
    }
    
    public final boolean h(final View view) {
        final akac b = this.B;
        if (b != null) {
            final vax t = this.t;
            ajzz ajzz;
            if ((ajzz = b.g) == null) {
                ajzz = ajzz.a;
            }
            aibb a;
            if (ajzz.b == 65153809) {
                a = (aibb)ajzz.c;
            }
            else {
                a = aibb.a;
            }
            aioe aioe;
            if ((aioe = a.n) == null) {
                aioe = aioe.a;
            }
            t.c(aioe, (Map)null);
        }
        return false;
    }
    
    public final Class[] ms(final Class clazz, final Object o, int index) {
        Class[] array2;
        if (index != -1) {
            if (index != 0) {
                final StringBuilder sb = new StringBuilder("unsupported op code: ");
                sb.append(index);
                throw new IllegalStateException(sb.toString());
            }
            index = this.e.indexOf(((uxq)o).b());
            final Class[] array = array2 = null;
            if (index >= 0) {
                ((tdv)this.e).remove(index);
                final aeby g = this.G;
                final akac b = this.B;
                final akac q = g.Q(b);
                if (index >= q.d.size()) {
                    trn.b("Index greater than total number of cards");
                    array2 = array;
                }
                else {
                    final agzc agzc = (agzc)((agzi)q).toBuilder();
                    ((agza)agzc).copyOnWrite();
                    final akac akac = (akac)agzc.instance;
                    final agzy d = akac.d;
                    if (!d.c()) {
                        akac.d = agzi.mutableCopy(d);
                    }
                    akac.d.remove(index);
                    final akac akac2 = (akac)((agza)agzc).build();
                    if (!aeda.v(akac2, ((Map<K, Object>)g.a).get((Object)b))) {
                        ((Map<akac, akac>)g.a).put(b, akac2);
                        return null;
                    }
                    array2 = array;
                }
            }
        }
        else {
            array2 = new Class[] { uxq.class };
        }
        return array2;
    }
    
    protected final boolean pS() {
        return true;
    }
}
