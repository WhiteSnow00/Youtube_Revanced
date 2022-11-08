import java.util.List;
import android.content.Context;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import android.text.TextUtils;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import java.util.Iterator;
import com.google.protos.youtube.api.innertube.ReelWatchEndpointOuterClass$ReelWatchEndpoint;
import com.google.protos.youtube.api.innertube.MenuEndpointOuterClass$MenuEndpoint;
import com.google.protos.youtube.api.innertube.ChannelReelAvatarRendererOuterClass$ChannelReelAvatarRenderer;
import android.view.ViewStub;
import android.widget.RatingBar;
import app.revanced.integrations.patches.HideHomeAdsPatch;
import android.view.LayoutInflater;
import android.view.View$OnClickListener;
import android.widget.ImageView;
import android.os.Handler;
import android.widget.TextView;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kqi
{
    public final View a;
    public final View b;
    public final TextView c;
    public final Object d;
    public final View e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public Object j;
    private final View k;
    private final View l;
    private final View m;
    private final TextView n;
    private final Object o;
    private final View p;
    private final View q;
    private final View r;
    private final View s;
    private final View t;
    private final Object u;
    
    public kqi(final Handler o, final aceo d, final vax i, final hyc hyc, final zhb zhb, final fvf fvf, final hyc hyc2, final fzo h, final View a, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6) {
        this.o = o;
        this.d = d;
        this.a = a;
        this.h = h;
        this.i = i;
        View viewById = a.findViewById(2131428133);
        this.k = viewById;
        this.p = a.findViewById(2131428136);
        this.b = a.findViewById(2131428139);
        this.l = a.findViewById(2131428140);
        a.findViewById(2131428154);
        this.q = a.findViewById(2131428153);
        this.r = a.findViewById(2131429212);
        this.s = a.findViewById(2131428146);
        this.e = a.findViewById(2131428148);
        final TextView c = (TextView)a.findViewById(2131431807);
        this.c = c;
        final TextView n = (TextView)a.findViewById(2131431638);
        this.n = n;
        final TextView t = (TextView)a.findViewById(2131430740);
        this.t = (View)t;
        final View viewById2 = a.findViewById(2131431815);
        this.m = viewById2;
        final fve a2 = fvf.a(c, hyc.k(viewById2));
        this.f = a2;
        if (n != null) {
            this.u = hyc2.I(n);
        }
        else {
            final fve fve = a2;
            a2.l(2);
            this.u = null;
        }
        if (t == null) {
            this.g = null;
        }
        else {
            final TextView textView = t;
            this.g = zhb.g(t);
        }
        if (viewById == null) {
            viewById = a;
        }
        viewById.setOnClickListener((View$OnClickListener)new kox(this, i, 2));
    }
    
    public kqi(final kjz kjz, final int n, final byte[] array) {
        final View inflate = LayoutInflater.from(kjz.a).inflate(n, kjz.i, false);
        this.e = inflate;
        final View viewById = inflate.findViewById(2131427536);
        this.s = viewById;
        final View viewById2 = viewById.findViewById(2131428429);
        this.l = viewById2;
        final View viewById3 = viewById.findViewById(2131428216);
        this.a = viewById3;
        final View viewById4 = viewById2.findViewById(2131428426);
        this.b = viewById4;
        final View viewById5 = viewById2.findViewById(2131432045);
        this.r = viewById5;
        final TextView u = (TextView)viewById2.findViewById(2131432092);
        this.u = u;
        HideHomeAdsPatch.HideHomeAds(viewById2);
        final View viewById6 = viewById2.findViewById(2131427495);
        this.o = viewById6;
        final TextView c = (TextView)viewById2.findViewById(2131430777);
        this.c = c;
        final RatingBar t = (RatingBar)viewById2.findViewById(2131430770);
        this.t = (View)t;
        final TextView n2 = (TextView)viewById2.findViewById(2131430590);
        this.n = n2;
        final View viewById7 = viewById2.findViewById(2131429281);
        this.p = viewById7;
        final View viewById8 = viewById2.findViewById(2131428234);
        this.k = viewById8;
        final View viewById9 = viewById2.findViewById(2131428448);
        this.m = viewById9;
        final View viewById10 = viewById2.findViewById(2131431700);
        this.q = viewById10;
        final kjs i = new kjs();
        this.i = i;
        final klm g = new klm(kjz.a, kjz.c, kjz.l, kjz.f, kjz.g, kjz.n, kjz.h, inflate, viewById2, viewById3, (View)kjz.j, viewById8, viewById9, viewById10, (View$OnClickListener)new kfw(this, 18, null), (kli)new kiw(this, 0, (byte[])null), (kll)new kix(this, 0, (byte[])null), (klj)i, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        this.g = g;
        this.h = new kje(kjz.b, kjz.d, kjz.e, inflate, viewById2, kjz.m, kjz.k, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        final kil f = new kil((kjh)g, (ViewStub)inflate.findViewById(2131430003), (kik)new kiy(this, 0, (byte[])null));
        this.f = f;
        final kil kil = f;
        final klm klm = g;
        this.d = new kjt(g, f, viewById);
        final annb d = annb.d;
        final klm klm2 = g;
        g.B(viewById5, d);
        final annb b = annb.b;
        final View view = (View)u;
        final klm klm3 = g;
        g.B(view, b);
        final annb c2 = annb.c;
        final View view2 = viewById6;
        final klm klm4 = g;
        g.B(viewById6, c2);
        final annb k = annb.k;
        final klm klm5 = g;
        g.B((View)c, k);
        final annb j = annb.k;
        final klm klm6 = g;
        g.B((View)t, j);
        final annb l = annb.l;
        final klm klm7 = g;
        g.B((View)n2, l);
        final annb p3 = annb.p;
        final klm klm8 = g;
        g.B(viewById7, p3);
        final annb g2 = annb.g;
        final klm klm9 = g;
        g.B(viewById4, g2);
    }
    
    public final void a() {
        ((fve)this.f).f();
    }
    
    public final void b() {
        final View b = this.b;
        if (b != null) {
            tmy.v(b, false);
        }
        final View l = this.l;
        if (l != null) {
            l.setOnClickListener((View$OnClickListener)null);
            this.l.setClickable(false);
            tmy.v(this.l, false);
        }
    }
    
    public final boolean c(final ChannelReelAvatarRendererOuterClass$ChannelReelAvatarRenderer channelReelAvatarRendererOuterClass$ChannelReelAvatarRenderer) {
        final int ci = aqql.ci(channelReelAvatarRendererOuterClass$ChannelReelAvatarRenderer.e);
        if (ci != 0) {
            if (ci != 1) {
                return true;
            }
        }
        if ((channelReelAvatarRendererOuterClass$ChannelReelAvatarRenderer.b & 0x2) != 0x0) {
            final Object h = this.h;
            aioe aioe;
            if ((aioe = channelReelAvatarRendererOuterClass$ChannelReelAvatarRenderer.d) == null) {
                aioe = aioe.a;
            }
            aioe aioe2 = aioe;
            if (((agzd)aioe).rs((agyr)MenuEndpointOuterClass$MenuEndpoint.menuEndpoint)) {
                amer amer;
                if ((amer = ((MenuEndpointOuterClass$MenuEndpoint)((agzd)aioe).rr((agyr)MenuEndpointOuterClass$MenuEndpoint.menuEndpoint)).c) == null) {
                    amer = amer.a;
                }
                ameo ameo;
                if ((ameo = amer.c) == null) {
                    ameo = ameo.a;
                }
                final Iterator<Object> iterator = ((List<Object>)ameo.c).iterator();
                while (true) {
                    aioe2 = aioe;
                    if (!iterator.hasNext()) {
                        break;
                    }
                    final amel amel = iterator.next();
                    amem amem;
                    if ((amem = amel.c) == null) {
                        amem = amem.a;
                    }
                    if ((amem.b & 0x4) == 0x0) {
                        continue;
                    }
                    amem amem2;
                    if ((amem2 = amel.c) == null) {
                        amem2 = amem.a;
                    }
                    if ((aioe2 = amem2.e) == null) {
                        aioe2 = aioe.a;
                    }
                    if (((agzd)aioe2).rs((agyr)ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint)) {
                        break;
                    }
                }
            }
            if (!((fzo)h).V(aioe2)) {
                return false;
            }
        }
        return true;
    }
    
    public final aogd d(final agza agza, final boolean b, final wwv wwv, final acpd acpd) {
        final aibb aibb = null;
        this.j = null;
        this.a.setVisibility(8);
        if (agza == null) {
            return null;
        }
        aioe j;
        if ((j = ((aogd)agza.instance).j) == null) {
            j = aioe.a;
        }
        this.j = j;
        this.a.setVisibility(0);
        final int b2 = ((aogd)agza.instance).b;
        boolean enabled = true;
        Label_0377: {
            if ((b2 & 0x80) == 0x0) {
                if ((b2 & 0x100) == 0x0 && (b2 & 0x200) == 0x0) {
                    final View a = this.a;
                    a.setBackground(tmy.cq(a.getContext(), 2130970699));
                    break Label_0377;
                }
            }
            final ArrayList<Drawable> list = new ArrayList<Drawable>();
            final aogd aogd = (aogd)agza.instance;
            Label_0206: {
                if ((aogd.b & 0x80) != 0x0) {
                    final int bl = aqql.bl(aogd.g);
                    if (bl == 0) {
                        break Label_0206;
                    }
                    if (bl != 3) {
                        break Label_0206;
                    }
                }
                list.add(tmy.cq(this.a.getContext(), 2130970701));
            }
            final aogd aogd2 = (aogd)agza.instance;
            final int b3 = aogd2.b;
            int n = 0;
            Label_0294: {
                if ((b3 & 0x200) != 0x0 && b) {
                    if ((n = aqql.bl(aogd2.i)) != 0) {
                        break Label_0294;
                    }
                }
                else {
                    if ((b3 & 0x100) == 0x0) {
                        n = 3;
                        break Label_0294;
                    }
                    if ((n = aqql.bl(aogd2.h)) != 0) {
                        break Label_0294;
                    }
                }
                n = 1;
            }
            if (n == 3) {
                list.add(tmy.cq(this.a.getContext(), 2130968829));
            }
            else if (n == 4) {
                list.add(tmy.cq(this.a.getContext(), 2130968827));
            }
            this.a.setBackground((Drawable)new LayerDrawable((Drawable[])list.toArray(new Drawable[0])));
        }
        final aogd aogd3 = (aogd)agza.instance;
        if ((aogd3.b & 0x4) != 0x0) {
            final View r = this.r;
            ajsq ajsq;
            if ((ajsq = aogd3.e) == null) {
                ajsq = ajsq.a;
            }
            ((TextView)r).setText((CharSequence)abyh.b(ajsq));
            ((TextView)this.r).setVisibility(0);
        }
        else {
            ((TextView)this.r).setVisibility(8);
        }
        final aogd aogd4 = (aogd)agza.build();
        final Iterator<Object> iterator = ((List<Object>)aogd4.f).iterator();
        ahyy ahyy = null;
        while (iterator.hasNext()) {
            final ahyg ahyg = iterator.next();
            if ((ahyg.b & 0x1000000) != 0x0 && (ahyy = ahyg.h) == null) {
                ahyy = ahyy.a;
            }
        }
        if (ahyy != null) {
            ((TextView)this.q).setText((CharSequence)ahyy.b);
            final toy background = new toy(tmy.cn(((TextView)this.q).getContext(), 2130970948));
            background.b(6, 2, toy.a(((TextView)this.q).getTextSize(), 2) + 6, 2);
            ((TextView)this.q).setBackground((Drawable)background);
        }
        else {
            final View q = this.q;
            final Context context = this.a.getContext();
            ajsq ajsq2;
            if ((aogd4.b & 0x2) != 0x0) {
                if ((ajsq2 = aogd4.d) == null) {
                    ajsq2 = ajsq.a;
                }
            }
            else {
                ajsq2 = null;
            }
            ((TextView)q).setText((CharSequence)abyh.a(aaiy.x(context, ajsq2, (abyc)null)));
            ((TextView)this.q).setBackground((Drawable)null);
            ((TextView)this.q).setPadding(0, 0, 0, 0);
        }
        final View k = this.k;
        if (k != null) {
            final aogd aogd5 = (aogd)agza.instance;
            ajsq ajsq3;
            if ((aogd5.b & 0x2) != 0x0) {
                if ((ajsq3 = aogd5.d) == null) {
                    ajsq3 = ajsq.a;
                }
            }
            else {
                ajsq3 = null;
            }
            k.setContentDescription((CharSequence)abyh.b(ajsq3));
        }
        this.b();
        final View b4 = this.b;
        if (b4 != null) {
            ((fzo)this.h).T(b4);
        }
        final aogd aogd6 = (aogd)agza.instance;
        if ((aogd6.b & 0x40000) != 0x0) {
            anss anss;
            if ((anss = aogd6.o) == null) {
                anss = anss.a;
            }
            final ChannelReelAvatarRendererOuterClass$ChannelReelAvatarRenderer channelReelAvatarRendererOuterClass$ChannelReelAvatarRenderer = (ChannelReelAvatarRendererOuterClass$ChannelReelAvatarRenderer)aaiy.v(anss);
            if (wwv != null) {
                wwv.t((wxz)new wws(channelReelAvatarRendererOuterClass$ChannelReelAvatarRenderer.h), (alff)null);
            }
            final Object d = this.d;
            final View p4 = this.p;
            aorm aorm;
            if ((aorm = channelReelAvatarRendererOuterClass$ChannelReelAvatarRenderer.c) == null) {
                aorm = aorm.a;
            }
            ((aceo)d).g((ImageView)p4, aorm);
            if (this.b != null && this.l != null) {
                if (!this.c(channelReelAvatarRendererOuterClass$ChannelReelAvatarRenderer)) {
                    ((fzo)this.h).R(this.b, new kpa(this, channelReelAvatarRendererOuterClass$ChannelReelAvatarRenderer, 3));
                    this.l.setOnClickListener((View$OnClickListener)new kqh(this, channelReelAvatarRendererOuterClass$ChannelReelAvatarRenderer, wwv));
                    tmy.v(this.b, true);
                    tmy.v(this.l, true);
                }
                else {
                    final int ci = aqql.ci(channelReelAvatarRendererOuterClass$ChannelReelAvatarRenderer.e);
                    if (ci != 0 && ci == 3 && (0x2 & channelReelAvatarRendererOuterClass$ChannelReelAvatarRenderer.b) != 0x0) {
                        this.l.setOnClickListener((View$OnClickListener)new kox(this, channelReelAvatarRendererOuterClass$ChannelReelAvatarRenderer, 3));
                        tmy.v(this.l, true);
                    }
                }
            }
        }
        else {
            aorm aorm2;
            if ((aorm2 = aogd6.c) == null) {
                aorm2 = aorm.a;
            }
            if (aorm2.c.size() > 0) {
                final Object d2 = this.d;
                final View p5 = this.p;
                aorm aorm3;
                if ((aorm3 = ((aogd)agza.instance).c) == null) {
                    aorm3 = aorm.a;
                }
                ((aceo)d2).g((ImageView)p5, aorm3);
            }
            else {
                ((aceo)this.d).d((ImageView)this.p);
                ((ImageView)this.p).setImageResource(2131232282);
            }
        }
        final View p6 = this.p;
        if ((((aogd)agza.instance).b & 0x800) == 0x0) {
            enabled = false;
        }
        ((ImageView)p6).setEnabled(enabled);
        ((TextView)this.s).setVisibility(8);
        ((TextView)this.e).setVisibility(8);
        aogf aogf;
        if ((aogf = ((aogd)agza.instance).k) == null) {
            aogf = aogf.a;
        }
        if (aogf.b == 55419609) {
            aogf aogf2;
            if ((aogf2 = ((aogd)agza.instance).k) == null) {
                aogf2 = aogf.a;
            }
            aokb a2;
            if (aogf2.b == 55419609) {
                a2 = (aokb)aogf2.c;
            }
            else {
                a2 = aokb.a;
            }
            if (b) {
                ajsq ajsq4;
                if ((ajsq4 = a2.j) == null) {
                    ajsq4 = ajsq.a;
                }
                if (!TextUtils.isEmpty((CharSequence)abyh.b(ajsq4))) {
                    final View s = this.s;
                    ajsq ajsq5;
                    if ((a2.b & 0x40) != 0x0) {
                        if ((ajsq5 = a2.k) == null) {
                            ajsq5 = ajsq.a;
                        }
                    }
                    else {
                        ajsq5 = null;
                    }
                    ((TextView)s).setText((CharSequence)abyh.b(ajsq5));
                    final View e = this.e;
                    ajsq ajsq6;
                    if ((ajsq6 = a2.j) == null) {
                        ajsq6 = ajsq.a;
                    }
                    ((TextView)e).setText((CharSequence)abyh.b(ajsq6));
                    ((TextView)this.e).setVisibility(0);
                }
            }
            else {
                ajsq ajsq7;
                if ((ajsq7 = a2.k) == null) {
                    ajsq7 = ajsq.a;
                }
                if (!TextUtils.isEmpty((CharSequence)abyh.b(ajsq7))) {
                    final View s2 = this.s;
                    ajsq ajsq8;
                    if ((ajsq8 = a2.k) == null) {
                        ajsq8 = ajsq.a;
                    }
                    ((TextView)s2).setText((CharSequence)abyh.b(ajsq8));
                    final View e2 = this.e;
                    ajsq ajsq9;
                    if ((a2.b & 0x20) != 0x0) {
                        if ((ajsq9 = a2.j) == null) {
                            ajsq9 = ajsq.a;
                        }
                    }
                    else {
                        ajsq9 = null;
                    }
                    ((TextView)e2).setText((CharSequence)abyh.b(ajsq9));
                    ((TextView)this.s).setVisibility(0);
                }
            }
        }
        ((Handler)this.o).post((Runnable)new joq(this, agza, wwv, acpd, 7));
        if (this.g != null) {
            final aogd aogd7 = (aogd)agza.instance;
            aibb aibb2;
            if ((aogd7.b & 0x2000) != 0x0) {
                anss anss2;
                if ((anss2 = aogd7.l) == null) {
                    anss2 = anss.a;
                }
                aibb2 = (aibb)((agzd)anss2).rr((agyr)ButtonRendererOuterClass.buttonRenderer);
            }
            else {
                aibb2 = null;
            }
            ((acqt)this.g).b(aibb2, wwv);
        }
        final Object u = this.u;
        if (u != null) {
            amdz amdz;
            if ((amdz = ((aogd)agza.instance).m) == null) {
                amdz = amdz.a;
            }
            aibb a3 = aibb;
            if (amdz.b == 65153809) {
                amdz amdz2;
                if ((amdz2 = ((aogd)agza.instance).m) == null) {
                    amdz2 = amdz.a;
                }
                if (amdz2.b == 65153809) {
                    a3 = (aibb)amdz2.c;
                }
                else {
                    a3 = aibb.a;
                }
            }
            ((hyc)u).u(a3, wwv);
        }
        return (aogd)agza.build();
    }
}
