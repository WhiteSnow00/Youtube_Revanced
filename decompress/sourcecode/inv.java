import android.util.TypedValue;
import android.text.TextUtils;
import j$.util.Optional;
import android.view.View$OnClickListener;
import java.util.HashMap;
import com.google.protos.youtube.api.innertube.OfflineabilityRendererOuterClass;
import com.google.protos.youtube.api.innertube.OfflineVideoEndpointOuterClass$OfflineVideoEndpoint;
import java.util.List;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.TextView;
import android.view.View;
import com.google.android.apps.youtube.app.offline.ui.OfflineArrowView;
import android.widget.ImageView;
import android.view.View$AccessibilityDelegate;

// 
// Decompiled by Procyon v0.6.0
// 

public final class inv implements tec
{
    static final View$AccessibilityDelegate a;
    private final atjj A;
    private final iki B;
    private final wwu C;
    private final oas D;
    private final ImageView E;
    private final OfflineArrowView F;
    private final View G;
    private final View H;
    private final uyi I;
    private final aja J;
    private final eg K;
    public final fml b;
    public final tdz c;
    public final acih d;
    public final atjj e;
    public final fmd f;
    public final fly g;
    public final TextView h;
    public final TextView i;
    public final TextView j;
    public final ViewGroup k;
    public final OfflineArrowView l;
    public final View m;
    public fmc n;
    public flx o;
    public acij p;
    public acio q;
    public aiuh r;
    public String s;
    public acih t;
    public ika u;
    public final inr v;
    public final aja w;
    public final aeby x;
    private final Context y;
    private final atjj z;
    
    static {
        a = new inu();
    }
    
    public inv(final Context y, final fml b, final atjj z, final atjj a, final iki b2, final tdz c, final aeby x, final eg k, final atjj e, final wwu c2, final fmd f, final fly g, final aja w, final oas d, final aja j, final uyi i, final View view, final acih d2, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6) {
        this.y = y;
        this.b = b;
        this.z = z;
        this.A = a;
        this.B = b2;
        this.c = c;
        this.x = x;
        this.d = d2;
        this.K = k;
        this.e = e;
        this.C = c2;
        this.f = f;
        this.g = g;
        this.w = w;
        this.D = d;
        this.J = j;
        this.I = i;
        this.v = new inr(this, 2);
        this.h = (TextView)view.findViewById(2131432092);
        this.i = (TextView)view.findViewById(2131427696);
        this.j = (TextView)view.findViewById(2131428648);
        this.E = (ImageView)view.findViewById(2131432006);
        this.F = (OfflineArrowView)view.findViewById(2131430122);
        this.m = view.findViewById(2131428448);
        this.k = (ViewGroup)view.findViewById(2131430127);
        this.l = (OfflineArrowView)view.findViewById(2131430126);
        this.G = view.findViewById(2131428769);
        this.H = view.findViewById(2131431186);
    }
    
    private final void d(final boolean b) {
        if (this.H != null) {
            final aiuh r = this.r;
            if (r != null) {
                final aoqy b2 = jfi.b((List)r.w);
                boolean b4;
                final boolean b3 = b4 = false;
                if (b) {
                    b4 = b3;
                    if (b2 != null) {
                        b4 = b3;
                        if (b2.c > 0) {
                            b4 = true;
                        }
                    }
                }
                tmy.v(this.H, b4);
            }
        }
    }
    
    private final void f(final zzl zzl, final amtq amtq) {
        final String a = zzl.a();
        final zzg a2 = zzl.a;
        amtn amtn;
        if ((amtn = a2.d.p) == null) {
            amtn = amtn.a;
        }
        amva amva;
        if ((amtn.b & 0x1) != 0x0) {
            amtn amtn2;
            if ((amtn2 = a2.d.p) == null) {
                amtn2 = amtn.a;
            }
            if ((amva = amtn2.c) == null) {
                amva = amva.a;
            }
        }
        else {
            amva = null;
        }
        final agza builder = ((agzi)OfflineVideoEndpointOuterClass$OfflineVideoEndpoint.a).createBuilder();
        builder.copyOnWrite();
        final OfflineVideoEndpointOuterClass$OfflineVideoEndpoint offlineVideoEndpointOuterClass$OfflineVideoEndpoint = (OfflineVideoEndpointOuterClass$OfflineVideoEndpoint)builder.instance;
        a.getClass();
        offlineVideoEndpointOuterClass$OfflineVideoEndpoint.c = 1;
        offlineVideoEndpointOuterClass$OfflineVideoEndpoint.d = a;
        builder.copyOnWrite();
        final OfflineVideoEndpointOuterClass$OfflineVideoEndpoint offlineVideoEndpointOuterClass$OfflineVideoEndpoint2 = (OfflineVideoEndpointOuterClass$OfflineVideoEndpoint)builder.instance;
        offlineVideoEndpointOuterClass$OfflineVideoEndpoint2.f = amtq.m;
        offlineVideoEndpointOuterClass$OfflineVideoEndpoint2.b |= 0x8;
        if (amtq == amtq.b) {
            if (amva != null) {
                final agza builder2 = amva.toBuilder();
                builder2.copyOnWrite();
                final amva amva2 = (amva)builder2.instance;
                amva2.b &= 0xFFFFFF7F;
                amva2.i = amva.a.i;
                final amva amva3 = (amva)builder2.build();
                final agzc agzc = (agzc)((agzi)anss.a).createBuilder();
                agzc.e((agyr)OfflineabilityRendererOuterClass.offlineabilityRenderer, (Object)amva3);
                builder.copyOnWrite();
                final OfflineVideoEndpointOuterClass$OfflineVideoEndpoint offlineVideoEndpointOuterClass$OfflineVideoEndpoint3 = (OfflineVideoEndpointOuterClass$OfflineVideoEndpoint)builder.instance;
                final anss g = (anss)((agza)agzc).build();
                g.getClass();
                offlineVideoEndpointOuterClass$OfflineVideoEndpoint3.g = g;
                offlineVideoEndpointOuterClass$OfflineVideoEndpoint3.b |= 0x20;
            }
            final agzc agzc2 = (agzc)((agzi)aioe.a).createBuilder();
            agzc2.e((agyr)OfflineVideoEndpointOuterClass$OfflineVideoEndpoint.offlineVideoEndpoint, (Object)builder.build());
            final HashMap<String, wwv> hashMap = new HashMap<String, wwv>();
            hashMap.put("com.google.android.libraries.youtube.logging.interaction_logger", this.C.n());
            this.l.setOnClickListener((View$OnClickListener)new gbp(this, agzc2, (HashMap)hashMap, 12));
            this.l.setContentDescription((CharSequence)this.y.getString(2132017316));
            return;
        }
        this.l.setOnClickListener((View$OnClickListener)new ina(this, 6));
    }
    
    private final boolean g(final Optional optional, final zzk zzk) {
        if (this.I.av()) {
            return jfi.E((amtx)optional.get());
        }
        return jfi.D(zzk);
    }
    
    private final boolean h() {
        final acij p = this.p;
        return p != null && TextUtils.equals((CharSequence)"downloads_page_recommendations_item_section_identifier", (CharSequence)p.k("downloads_page_section_key"));
    }
    
    public final int a(final int n) {
        final TypedValue typedValue = new TypedValue();
        if (this.y.getTheme().resolveAttribute(n, typedValue, true)) {
            return this.y.getResources().getColor(typedValue.resourceId);
        }
        return -1;
    }
    
    public final void b() {
        final String s = this.s;
        if (!aexs.f(s)) {
            final zzl e = ((zzu)this.z.a()).a().l().e(s);
            Optional optional2;
            final Optional optional = optional2 = Optional.empty();
            if (e != null) {
                optional2 = optional;
                if (this.I.av()) {
                    optional2 = Optional.ofNullable((Object)this.J.d(gkt.bo(e.a())).j((Class)amtx.class).af());
                }
            }
            if (e != null && (e.i() == zzh.c || (e.i() == zzh.b && !this.g(optional2, e.j)))) {
                this.h.setTextColor(tmy.ct(this.y, 2130970924).orElse(0));
                tmy.v((View)this.j, false);
            }
            else {
                Label_0289: {
                    Label_0268: {
                        if (!this.h()) {
                            if (e != null) {
                                if (e.t()) {
                                    break Label_0268;
                                }
                                if (this.g(optional2, e.j)) {
                                    final zzk j = e.j;
                                    final oas d = this.D;
                                    long n;
                                    if (this.I.av()) {
                                        n = jfi.u((amtx)optional2.get(), d);
                                    }
                                    else {
                                        n = jfi.t(j, d);
                                    }
                                    if (n != 0L) {
                                        break Label_0268;
                                    }
                                }
                            }
                            this.h.setTextColor(tmy.ct(this.y, 2130970922).orElse(0));
                            break Label_0289;
                        }
                    }
                    this.h.setTextColor(tmy.ct(this.y, 2130970924).orElse(0));
                }
                final ijj d2 = this.B.d((int)((this.h() ^ true) ? 1 : 0), e);
                final StringBuilder sb = new StringBuilder();
                int n2 = 0;
                while (true) {
                    final String[] array = (String[])d2.c;
                    if (n2 >= array.length) {
                        break;
                    }
                    sb.append(array[n2]);
                    int n3;
                    if ((n3 = n2) < ((String[])d2.c).length - 1) {
                        sb.append('\n');
                        n3 = 0;
                    }
                    n2 = n3 + 1;
                }
                tmy.t(this.j, (CharSequence)sb.toString());
                final int length = ((String[])d2.c).length;
                this.j.setSingleLine(length <= 1);
                this.j.setMaxLines(length);
                this.j.setTextColor(tmy.ct(this.y, d2.a).orElse(0));
                final TextView i = this.j;
                i.setTypeface(i.getTypeface(), 0);
            }
            if (e != null && e.t() && !this.h()) {
                tmy.v((View)this.i, false);
            }
            else {
                tmy.v((View)this.i, true);
                final aiuh r = this.r;
                r.getClass();
                final TextView k = this.i;
                ajsq ajsq;
                if ((r.b & 0x10) != 0x0) {
                    if ((ajsq = r.f) == null) {
                        ajsq = ajsq.a;
                    }
                }
                else {
                    ajsq = null;
                }
                k.setText((CharSequence)abyh.b(ajsq));
            }
            zzh zzh;
            if (e == null) {
                zzh = zzh.a;
            }
            else {
                zzh = e.i();
            }
            if (zzh != zzh.b && !this.h()) {
                if (!zzh.x && zzh != zzh.f) {
                    e.getClass();
                    this.E.setAlpha(0.2f);
                    tmy.v((View)this.F, true);
                    tmy.v(this.G, false);
                    final View h = this.H;
                    if (h != null) {
                        tmy.v(h, false);
                    }
                    final OfflineArrowView f = this.F;
                    f.d = 2;
                    ((ing)f).j(e.d());
                    if (e.t()) {
                        this.E.setAlpha(1.0f);
                        this.F.g();
                        tmy.v(this.G, true);
                        this.d(e.o((xun)this.A.a()));
                    }
                    else {
                        final int ordinal = e.i().ordinal();
                        if (ordinal != 3) {
                            if (ordinal != 4 && ordinal != 6 && ordinal != 8) {
                                if (ordinal != 10) {
                                    this.F.f();
                                }
                                else {
                                    this.F.c(2131231841);
                                    ((ing)this.F).l();
                                }
                            }
                            else {
                                this.F.i();
                            }
                        }
                        else {
                            this.F.h();
                        }
                    }
                }
                else {
                    final boolean b = e == null || e.w();
                    this.E.setAlpha(0.2f);
                    tmy.v((View)this.F, true);
                    tmy.v(this.G, false);
                    final View h2 = this.H;
                    if (h2 != null) {
                        tmy.v(h2, false);
                    }
                    ((ing)this.F).l();
                    final int ordinal2 = zzh.ordinal();
                    if (ordinal2 != 0) {
                        if (ordinal2 != 5) {
                            if (b) {
                                this.F.c(2131231850);
                            }
                            else {
                                this.F.c(2131231834);
                            }
                        }
                        else {
                            this.F.d(2131231853);
                        }
                    }
                    else {
                        this.F.c(2131231850);
                    }
                }
            }
            else {
                this.c();
            }
            if (e != null && this.h()) {
                tmy.v(this.m, false);
                tmy.v((View)this.k, true);
                this.k.setImportantForAccessibility(2);
                this.l.setAccessibilityDelegate((View$AccessibilityDelegate)null);
                if (this.u == null) {
                    final eg l = this.K;
                    final String a = e.a();
                    final OfflineArrowView m = this.l;
                    final fml fml = (fml)((atjj)l.c).a();
                    fml.getClass();
                    final Object b2 = l.b;
                    final feq feq = (feq)((atjj)l.d).a();
                    m.getClass();
                    this.u = (ika)new ijy(fml, (atjj)b2, 0, a, m, (View$OnClickListener)null);
                }
                this.u.b(ijk.b(e));
                final zzh i2 = e.i();
                final int ordinal3 = i2.ordinal();
                if (ordinal3 != 2) {
                    if (ordinal3 != 3) {
                        if (ordinal3 != 10) {
                            if (i2.x && e.w()) {
                                this.f(e, amtq.f);
                            }
                            else {
                                this.l.setAccessibilityDelegate(inv.a);
                            }
                        }
                        else {
                            this.f(e, amtq.g);
                        }
                    }
                    else {
                        this.f(e, amtq.e);
                    }
                }
                else {
                    this.f(e, amtq.b);
                }
                this.k.setOnClickListener((View$OnClickListener)new ina(this, 7));
                return;
            }
            tmy.v(this.m, true);
            tmy.v((View)this.l, false);
        }
    }
    
    public final void c() {
        this.E.setAlpha(1.0f);
        tmy.v((View)this.F, false);
        tmy.v(this.G, true);
        this.d(true);
    }
    
    public final Class[] ms(final Class clazz, final Object o, final int n) {
        Class[] array2;
        if (n != -1) {
            final Class[] array = null;
            if (n != 0) {
                if (n != 1) {
                    if (n != 2) {
                        final StringBuilder sb = new StringBuilder("unsupported op code: ");
                        sb.append(n);
                        throw new IllegalStateException(sb.toString());
                    }
                    final zwm zwm = (zwm)o;
                    array2 = array;
                    if (!aexs.f(this.s)) {
                        if (this.s.equals(zwm.a.a())) {
                            this.b();
                            return null;
                        }
                        array2 = array;
                    }
                }
                else {
                    final zvv zvv = (zvv)o;
                    this.b();
                    array2 = array;
                }
            }
            else {
                final tge tge = (tge)o;
                this.b();
                array2 = array;
            }
        }
        else {
            array2 = new Class[] { tge.class, zvv.class, zwm.class };
        }
        return array2;
    }
}
