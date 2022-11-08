import com.google.android.apps.youtube.app.common.rendering.presenter.donationshelf.PrefixedEditText;
import android.view.ViewGroup$MarginLayoutParams;
import android.widget.RadioButton;
import android.widget.RadioGroup$OnCheckedChangeListener;
import android.widget.CheckedTextView;
import android.widget.RadioGroup;
import android.text.TextWatcher;
import com.google.android.material.textfield.TextInputLayout;
import android.view.View$OnClickListener;
import android.widget.ImageView;
import android.view.LayoutInflater;
import com.google.protos.youtube.api.innertube.ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint;
import com.google.protos.youtube.api.innertube.YpcGetCartEndpoint$YPCGetCartEndpoint;
import java.util.Map;
import java.util.HashMap;
import android.view.View;
import android.text.style.ImageSpan;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuff$Mode;
import android.graphics.Paint;
import android.graphics.Bitmap;
import android.graphics.Bitmap$Config;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.widget.TextView;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import android.content.Context;
import android.widget.Button;
import android.view.ViewGroup;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kvb extends usm implements fyr
{
    private hyc A;
    public final Activity a;
    public final zki b;
    public final zkw c;
    public fug d;
    public ViewGroup e;
    public Button f;
    public long g;
    public int h;
    private final Context i;
    private final aceo j;
    private final vax k;
    private final wwv l;
    private final utz m;
    private final fyt n;
    private final gko o;
    private ajdi s;
    private acqt t;
    private ViewGroup u;
    private YouTubeTextView v;
    private hmb w;
    private final zhb x;
    private alm y;
    private lfy z;
    
    public kvb(final Context i, final atjj atjj, final Activity a, final aceo j, final vax k, final wwv wwv, final zki b, final zkw c, final fyt n, final zhb x, final gko o, final byte[] array) {
        super(wwv);
        this.i = i;
        final utz m = (utz)atjj.a();
        this.m = m;
        this.a = a;
        this.j = j;
        this.k = k;
        this.l = wwv;
        this.b = b;
        this.c = c;
        this.n = n;
        this.x = x;
        m.m = wwv;
        this.h = 1;
        this.o = o;
    }
    
    private final void p(final ViewGroup viewGroup, final String s) {
        this.e = (ViewGroup)viewGroup.findViewById(2131431274);
        (this.w = new hmb((ViewGroup)this.e.findViewById(2131427991), false, this.j, this.o)).d(this.s);
        final hyc a = new hyc(this.i, this.k, (ViewGroup)this.e.findViewById(2131430076));
        this.A = a;
        final ajdi s2 = this.s;
        final Object d = a.d;
        ajsq ajsq;
        if ((ajsq = s2.o) == null) {
            ajsq = ajsq.a;
        }
        tmy.t((TextView)d, (CharSequence)abyh.b(ajsq));
        ((YouTubeTextView)a.b).d();
        ajsq ajsq2;
        if ((ajsq2 = s2.p) == null) {
            ajsq2 = ajsq.a;
        }
        final int size = ajsq2.c.size();
        final Object b = a.b;
        ajsq ajsq3;
        if ((ajsq3 = s2.p) == null) {
            ajsq3 = ajsq.a;
        }
        Object o;
        if (ajsq3 == null) {
            o = null;
        }
        else {
            final SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder)(o = new SpannableStringBuilder((CharSequence)vbd.a(ajsq3, (vax)a.a, (boolean)(0 != 0))));
            if (spannableStringBuilder.length() != 0) {
                if (size <= 1) {
                    o = spannableStringBuilder;
                }
                else {
                    spannableStringBuilder.replace(spannableStringBuilder.length() - 1, spannableStringBuilder.length(), (CharSequence)String.valueOf(String.valueOf(spannableStringBuilder.subSequence(spannableStringBuilder.length() - 1, spannableStringBuilder.length()))).concat("  "));
                    final Context context = (Context)a.c;
                    final Bitmap decodeResource = BitmapFactory.decodeResource(context.getResources(), 2131232850);
                    final Bitmap bitmap = Bitmap.createBitmap(decodeResource.getWidth(), Math.max(((YouTubeTextView)a.b).getLineHeight(), decodeResource.getHeight()), Bitmap$Config.ARGB_8888);
                    final Paint paint = new Paint();
                    paint.setColorFilter((ColorFilter)new PorterDuffColorFilter(tmy.ct((Context)a.c, 2130970852).orElse(0), PorterDuff$Mode.SRC_IN));
                    new Canvas(bitmap).drawBitmap(decodeResource, 0.0f, 0.0f, paint);
                    spannableStringBuilder.setSpan((Object)new ImageSpan(context, bitmap), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
                    o = spannableStringBuilder;
                }
            }
        }
        tmy.t((TextView)b, (CharSequence)o);
        final Button f = (Button)viewGroup.findViewById(2131428715);
        tmy.r((View)(this.f = f), f.getBackground());
        this.t = (acqt)this.x.g((TextView)this.f);
        aibc aibc;
        if ((aibc = this.s.h) == null) {
            aibc = aibc.a;
        }
        if ((aibc.b & 0x1) != 0x0) {
            aibc aibc2;
            if ((aibc2 = this.s.h) == null) {
                aibc2 = aibc.a;
            }
            aibb aibb;
            if ((aibb = aibc2.c) == null) {
                aibb = aibb.a;
            }
            Map map;
            if (s != null) {
                final HashMap hashMap = new HashMap();
                hashMap.put("engagement_panel_id_key", s);
                map = hashMap;
            }
            else {
                map = null;
            }
            final Button f2 = this.f;
            ajsq ajsq4;
            if ((aibb.b & 0x200) != 0x0) {
                if ((ajsq4 = aibb.i) == null) {
                    ajsq4 = ajsq.a;
                }
            }
            else {
                ajsq4 = null;
            }
            tmy.t((TextView)f2, (CharSequence)abyh.b(ajsq4));
            this.t.a(aibb, super.p, map);
        }
        this.l.t((wxz)new wws(this.s.B), (alff)null);
    }
    
    public final View a() {
        return (View)this.u;
    }
    
    public final usx b() {
        return (usx)this.m;
    }
    
    public final void c() {
        aibc aibc;
        if ((aibc = this.s.h) == null) {
            aibc = aibc.a;
        }
        if ((aibc.b & 0x1) == 0x0) {
            return;
        }
        aibc aibc2;
        if ((aibc2 = this.s.h) == null) {
            aibc2 = aibc.a;
        }
        aibb aibb;
        if ((aibb = aibc2.c) == null) {
            aibb = aibb.a;
        }
        aioe aioe;
        if ((aioe = aibb.p) == null) {
            aioe = aioe.a;
        }
        if (!((agzd)aioe).rs((agyr)YpcGetCartEndpoint$YPCGetCartEndpoint.ypcGetCartEndpoint)) {
            return;
        }
        final agza builder = ((YpcGetCartEndpoint$YPCGetCartEndpoint)((agzd)aioe).rr((agyr)YpcGetCartEndpoint$YPCGetCartEndpoint.ypcGetCartEndpoint)).toBuilder();
        final long g = this.g;
        builder.copyOnWrite();
        final YpcGetCartEndpoint$YPCGetCartEndpoint ypcGetCartEndpoint$YPCGetCartEndpoint = (YpcGetCartEndpoint$YPCGetCartEndpoint)builder.instance;
        ypcGetCartEndpoint$YPCGetCartEndpoint.b |= 0x400;
        ypcGetCartEndpoint$YPCGetCartEndpoint.l = g;
        final int h = this.h;
        final int n = h - 1;
        if (h != 0) {
            if (n == 1 || n == 2) {
                final agza builder2 = ((agzi)aotv.a).createBuilder();
                final agza builder3 = ((agzi)aotu.a).createBuilder();
                final boolean c = this.h == 2;
                builder3.copyOnWrite();
                final aotu aotu = (aotu)builder3.instance;
                aotu.b |= 0x2;
                aotu.c = c;
                builder2.copyOnWrite();
                final aotv aotv = (aotv)builder2.instance;
                final aotu d = (aotu)builder3.build();
                d.getClass();
                aotv.d = d;
                aotv.b |= 0x2;
                builder.copyOnWrite();
                final YpcGetCartEndpoint$YPCGetCartEndpoint ypcGetCartEndpoint$YPCGetCartEndpoint2 = (YpcGetCartEndpoint$YPCGetCartEndpoint)builder.instance;
                final aotv m = (aotv)builder2.build();
                m.getClass();
                ypcGetCartEndpoint$YPCGetCartEndpoint2.m = m;
                ypcGetCartEndpoint$YPCGetCartEndpoint2.b |= 0x800;
            }
            final vax k = this.k;
            final agzc agzc = (agzc)((agzi)aioe).toBuilder();
            agzc.e((agyr)YpcGetCartEndpoint$YPCGetCartEndpoint.ypcGetCartEndpoint, builder.build());
            final aioe aioe2 = (aioe)agzc.build();
            aibc aibc3;
            if ((aibc3 = this.s.h) == null) {
                aibc3 = aibc.a;
            }
            aibb aibb2;
            if ((aibb2 = aibc3.c) == null) {
                aibb2 = aibb.a;
            }
            k.c(aioe2, www.i((Object)aibb2, true));
            return;
        }
        throw null;
    }
    
    public final void d() {
        this.e.post((Runnable)new klc(this, 19));
    }
    
    public final void e(final acik acik) {
    }
    
    public final void f(final String s, final ajdi ajdi) {
        final ajdi s2 = this.s;
        if (s2 != null && s2.A.equals(s)) {
            this.z.n(ajdi);
        }
    }
    
    public final void g(final ajnl ajnl, final alff alff) {
        if (ajnl != null) {
            ajnj ajnj;
            if ((ajnj = ajnl.g) == null) {
                ajnj = ajnj.a;
            }
            anws a;
            if (ajnj.b == 49399797) {
                a = (anws)ajnj.c;
            }
            else {
                a = anws.a;
            }
            if (a.d.size() != 0) {
                ajnj ajnj2;
                if ((ajnj2 = ajnl.g) == null) {
                    ajnj2 = ajnj.a;
                }
                anws a2;
                if (ajnj2.b == 49399797) {
                    a2 = (anws)ajnj2.c;
                }
                else {
                    a2 = anws.a;
                }
                if ((((anwv)a2.d.get(0)).e & 0x400) != 0x0) {
                    super.g(ajnl, alff);
                    ajnj ajnj3;
                    if ((ajnj3 = ajnl.g) == null) {
                        ajnj3 = ajnj.a;
                    }
                    anws a3;
                    if (ajnj3.b == 49399797) {
                        a3 = (anws)ajnj3.c;
                    }
                    else {
                        a3 = anws.a;
                    }
                    ajdi s;
                    if ((s = a3.d.get(0).bh) == null) {
                        s = ajdi.a;
                    }
                    this.s = s;
                    ajnk ajnk;
                    if ((ajnk = ajnl.f) == null) {
                        ajnk = ajnk.a;
                    }
                    if (ajnk.b == 138681548) {
                        final utz m = this.m;
                        ajnk ajnk2;
                        if ((ajnk2 = ajnl.f) == null) {
                            ajnk2 = ajnk.a;
                        }
                        ajnn a4;
                        if (ajnk2.b == 138681548) {
                            a4 = (ajnn)ajnk2.c;
                        }
                        else {
                            a4 = ajnn.a;
                        }
                        ajsq ajsq;
                        if ((a4.b & 0x2) != 0x0) {
                            ajnk ajnk3;
                            if ((ajnk3 = ajnl.f) == null) {
                                ajnk3 = ajnk.a;
                            }
                            ajnn a5;
                            if (ajnk3.b == 138681548) {
                                a5 = (ajnn)ajnk3.c;
                            }
                            else {
                                a5 = ajnn.a;
                            }
                            if ((ajsq = a5.c) == null) {
                                ajsq = ajsq.a;
                            }
                        }
                        else {
                            ajsq = null;
                        }
                        m.y((CharSequence)abyh.b(ajsq));
                    }
                    else {
                        this.m.y((CharSequence)null);
                    }
                    this.m.x((CharSequence)null);
                    this.m.i((aogu)null);
                    return;
                }
            }
        }
        super.g((ajnl)null, alff);
    }
    
    public final void j() {
    }
    
    public final void k(final aioe aioe) {
        ((agzd)aioe).rr((agyr)ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.showEngagementPanelEndpoint).getClass();
        final ajnl q = super.q;
        if (q == null) {
            return;
        }
        final String w = vem.w(q);
        if ("donation_shelf".equals(w)) {
            final ajdi s = this.s;
            final LayoutInflater from = LayoutInflater.from(this.i);
            this.p(this.u = (ViewGroup)from.inflate(2131624363, (ViewGroup)null, false), "donation_shelf");
            (this.z = new lfy(this.i, (ViewGroup)this.u.findViewById(2131430656), this.k, this.o)).n(s);
            final alm y = new alm((ViewGroup)this.u.findViewById(2131428529), from, this.j);
            this.y = y;
            for (int i = 0; i < s.r.size(); ++i) {
                ViewGroup viewGroup;
                if ((viewGroup = (ViewGroup)((ViewGroup)y.b).getChildAt(i)) == null) {
                    viewGroup = (ViewGroup)((LayoutInflater)y.c).inflate(2131624362, (ViewGroup)y.b, false);
                    ((ViewGroup)y.b).addView((View)viewGroup);
                }
                hyc tag;
                if ((tag = (hyc)((ViewGroup)y.b).getTag()) == null) {
                    tag = new hyc((aceo)y.a, viewGroup);
                    viewGroup.setTag((Object)tag);
                }
                final ajdg ajdg = s.r.get(i);
                if ((ajdg.b & 0x1) != 0x0) {
                    ((ImageView)tag.c).setVisibility(0);
                    final Object a = tag.a;
                    final Object c = tag.c;
                    aorm aorm;
                    if ((aorm = ajdg.c) == null) {
                        aorm = aorm.a;
                    }
                    ((aceo)a).g((ImageView)c, aorm);
                }
                else {
                    ((ImageView)tag.c).setVisibility(8);
                }
                final Object d = tag.d;
                ajsq ajsq;
                if ((ajdg.b & 0x2) != 0x0) {
                    if ((ajsq = ajdg.d) == null) {
                        ajsq = ajsq.a;
                    }
                }
                else {
                    ajsq = null;
                }
                tmy.t((TextView)d, (CharSequence)abyh.b(ajsq));
                final Object b = tag.b;
                ajsq ajsq2;
                if ((ajdg.b & 0x4) != 0x0) {
                    if ((ajsq2 = ajdg.e) == null) {
                        ajsq2 = ajsq.a;
                    }
                }
                else {
                    ajsq2 = null;
                }
                tmy.t((TextView)b, (CharSequence)abyh.b(ajsq2));
            }
            final int n = ((ViewGroup)y.b).getChildCount() - s.r.size();
            if (n > 0) {
                ((ViewGroup)y.b).removeViews(s.r.size(), n);
            }
            if (s.r.size() > 0) {
                ((ViewGroup)y.b).setVisibility(0);
            }
            else {
                ((ViewGroup)y.b).setVisibility(8);
            }
            final YouTubeTextView v = (YouTubeTextView)this.u.findViewById(2131430075);
            this.v = v;
            ajsq ajsq3;
            if ((ajsq3 = s.q) == null) {
                ajsq3 = ajsq.a;
            }
            tmy.t((TextView)v, (CharSequence)abyh.b(ajsq3));
            this.n.c(s.A, (fyr)this);
            return;
        }
        if ("donation_amount_picker".equals(w)) {
            final ajdi s2 = this.s;
            this.p(this.u = (ViewGroup)LayoutInflater.from(this.i).inflate(2131624358, (ViewGroup)null, false), null);
            if ((s2.b & 0x400) != 0x0) {
                this.f.setOnClickListener((View$OnClickListener)new kmk(this, 12));
            }
            final fug d2 = new fug((YouTubeTextView)this.u.findViewById(2131428569), (TextInputLayout)this.u.findViewById(2131428568));
            this.d = d2;
            d2.f = new qpt(this);
            d2.d = s2;
            final YouTubeTextView a2 = d2.a;
            ajsq ajsq4;
            if ((ajsq4 = s2.t) == null) {
                ajsq4 = ajsq.a;
            }
            a2.setText((CharSequence)abyh.b(ajsq4));
            final PrefixedEditText c2 = d2.c;
            ajsq ajsq5;
            if ((ajsq5 = s2.u) == null) {
                ajsq5 = ajsq.a;
            }
            final String string = abyh.b(ajsq5).toString();
            c2.a = string;
            c2.c = 20;
            c2.b = new float[string.length()];
            c2.invalidate();
            d2.c.addTextChangedListener((TextWatcher)d2.e);
            final fui fui = new fui(this.i, (RadioGroup)this.u.findViewById(2131430552), (CheckedTextView)this.u.findViewById(2131430604));
            fui.e = new qpt(this);
            fui.d = new qpt(this);
            if (s2.s.size() == 0) {
                final qpt e = fui.e;
                if (e != null) {
                    e.p(0L);
                }
            }
            else {
                fui.b.setOnCheckedChangeListener((RadioGroup$OnCheckedChangeListener)new isb(fui, 1));
                final int min = Math.min(s2.s.size() - 1, 1);
                int n2;
                for (int j = 0; j < s2.s.size(); j = n2 + 1) {
                    final ajdk ajdk = s2.s.get(j);
                    final RadioButton radioButton = (RadioButton)LayoutInflater.from(fui.a).inflate(2131624366, (ViewGroup)fui.b, false);
                    final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams = (ViewGroup$MarginLayoutParams)radioButton.getLayoutParams();
                    fui.b.addView((View)radioButton);
                    ajsq ajsq6;
                    if ((ajdk.b & 0x2) != 0x0) {
                        if ((ajsq6 = ajdk.d) == null) {
                            ajsq6 = ajsq.a;
                        }
                    }
                    else {
                        ajsq6 = null;
                    }
                    tmy.t((TextView)radioButton, (CharSequence)abyh.b(ajsq6));
                    tmy.r((View)radioButton, radioButton.getBackground());
                    if (j == 0) {
                        alk.g(viewGroup$MarginLayoutParams, 0);
                        n2 = 0;
                    }
                    else if ((n2 = j) == s2.s.size() - 1) {
                        alk.g(viewGroup$MarginLayoutParams, 0);
                        n2 = j;
                    }
                    radioButton.setTag((Object)s2.s.get(n2));
                    if (n2 == min) {
                        radioButton.setChecked(true);
                    }
                }
                final CheckedTextView c3 = fui.c;
                ajsq ajsq7;
                if ((ajsq7 = s2.y) == null) {
                    ajsq7 = ajsq.a;
                }
                tmy.t((TextView)c3, (CharSequence)abyh.b(ajsq7));
                if ((s2.b & 0x20000000) != 0x0) {
                    fui.c.setOnClickListener((View$OnClickListener)new fuh(fui, 0));
                    fui.a(s2.z);
                }
            }
            this.d();
        }
    }
    
    public final void l() {
    }
    
    public final void m() {
    }
    
    public final void n(final aioe aioe) {
    }
    
    public final void q(final usz usz) {
    }
}
