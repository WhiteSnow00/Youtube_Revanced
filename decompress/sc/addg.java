import java.util.Map;
import com.google.protos.youtube.api.innertube.SendShareEndpoint$SendShareExternallyEndpoint;
import java.util.HashMap;
import java.util.concurrent.Callable;
import android.content.pm.ResolveInfo;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.ViewGroup;
import android.content.Context;
import android.widget.TextView;
import android.widget.ImageView;
import android.view.View;
import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class addg implements View$OnClickListener, acko
{
    private final addf a;
    private final View b;
    private final ImageView c;
    private final TextView d;
    private final achb e;
    private final float f;
    private final float g;
    private aocm h;
    
    public addg(final Context context, final addf a, final acgs acgs) {
        this.a = a;
        final View inflate = View.inflate(context, 2131625377, (ViewGroup)null);
        this.b = inflate;
        final ImageView c = (ImageView)inflate.findViewById(2131429270);
        this.c = c;
        this.d = (TextView)inflate.findViewById(2131432095);
        this.e = new achb((tpo)acgs, c);
        this.f = inflate.getAlpha();
        final TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(16842803, typedValue, true);
        this.g = typedValue.getFloat();
        inflate.setOnClickListener((View$OnClickListener)this);
    }
    
    public final View a() {
        return this.b;
    }
    
    public final void b(final aocm aocm, final CharSequence text, final Drawable imageDrawable) {
        if (!adkp.ae(this.h, aocm)) {
            return;
        }
        this.d.setText(text);
        this.c.setImageDrawable(imageDrawable);
        if (((adbc)this.a).j) {
            this.b.animate().alpha(this.f).start();
            return;
        }
        this.b.setAlpha(this.g);
    }
    
    public final void c(final acku acku) {
        this.h = null;
        this.c.setImageDrawable((Drawable)null);
        this.e.a();
        this.d.setText((CharSequence)null);
    }
    
    public final void mN(final ackm ackm, final Object o) {
        final aocm aocm = (aocm)o;
        this.h = aocm;
        this.b.setTag((Object)aocm);
        this.b.setAlpha(0.0f);
        final addf a = this.a;
        final int b = aocm.b;
        Label_0365: {
            Label_0244: {
                if ((b & 0x4) != 0x0 && (b & 0x8) != 0x0) {
                    aocf aocf;
                    if ((aocf = aocm.c) == null) {
                        aocf = aocf.a;
                    }
                    if (aocf.c == 97) {
                        break Label_0244;
                    }
                    final aocf c = aocm.c;
                    aocf a2;
                    if (c == null) {
                        a2 = aocf.a;
                    }
                    else {
                        a2 = c;
                    }
                    if (a2.c == 98) {
                        break Label_0244;
                    }
                    aocf a3;
                    if ((a3 = c) == null) {
                        a3 = aocf.a;
                    }
                    if (a3.c == 99) {
                        break Label_0244;
                    }
                }
                final adbc adbc = (adbc)a;
                final akq akq = adbc.g.get(aocm);
                if (akq != null) {
                    this.b(aocm, (CharSequence)akq.a, (Drawable)akq.b);
                    break Label_0365;
                }
                final ResolveInfo resolveInfo = adbc.f.get(aocm);
                if (resolveInfo != null) {
                    teu.k(adbc.i.rz((Callable)new zuj(adbc, resolveInfo, 4)), adbc.h, (tes)adaz.a, (tet)new vcd(adbc, aocm, this, 16));
                    break Label_0365;
                }
            }
            final View b2 = this.b;
            float alpha;
            if (((adbc)this.a).j) {
                alpha = this.f;
            }
            else {
                alpha = this.g;
            }
            b2.setAlpha(alpha);
            if ((aocm.b & 0x8) != 0x0) {
                final achb e = this.e;
                aotp aotp;
                if ((aotp = aocm.f) == null) {
                    aotp = aotp.a;
                }
                e.k(aotp);
            }
            final TextView d = this.d;
            ajut ajut;
            if ((aocm.b & 0x4) != 0x0) {
                if ((ajut = aocm.e) == null) {
                    ajut = ajut.a;
                }
            }
            else {
                ajut = null;
            }
            d.setText((CharSequence)acak.b(ajut));
        }
        ((adbc)this.a).e.t((wzz)new wyt(aocm.h), adbc.k(aocm));
    }
    
    public final void onClick(final View view) {
        final addf a = this.a;
        final adbc adbc = (adbc)a;
        if (adbc.j) {
            final aocm aocm = (aocm)view.getTag();
            adbc.d.d((Object)new adbg());
            final HashMap hashMap = new HashMap();
            hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", a);
            hashMap.put("endpoint_resolver_override", adbc.b);
            hashMap.put("interaction_logger_override", adbc.e);
            hashMap.put("click_tracking_params", aocm.h.I());
            final alhi k = adbc.k(aocm);
            if (k != null) {
                hashMap.put("client_data_override", k);
            }
            final vcy b = adbc.b;
            final String i = adbc.k;
            aiqj aiqj;
            if ((aiqj = aocm.g) == null) {
                aiqj = aiqj.a;
            }
            final ahbb ahbb = (ahbb)((ahbh)aiqj).toBuilder();
            if (ahbb.ry((ahaq)SendShareEndpoint$SendShareExternallyEndpoint.sendShareExternallyEndpoint)) {
                final ahaz builder = ((SendShareEndpoint$SendShareExternallyEndpoint)ahbb.rx((ahaq)SendShareEndpoint$SendShareExternallyEndpoint.sendShareExternallyEndpoint)).toBuilder();
                final SendShareEndpoint$SendShareExternallyEndpoint sendShareEndpoint$SendShareExternallyEndpoint = (SendShareEndpoint$SendShareExternallyEndpoint)builder.instance;
                if ((sendShareEndpoint$SendShareExternallyEndpoint.b & 0x1) != 0x0) {
                    akjm akjm;
                    if ((akjm = sendShareEndpoint$SendShareExternallyEndpoint.c) == null) {
                        akjm = akjm.a;
                    }
                    final ahaz builder2 = ((ahbh)akjm).toBuilder();
                    final String j = tvb.i(i);
                    builder2.copyOnWrite();
                    final akjm akjm2 = (akjm)builder2.instance;
                    akjm2.b |= 0x4;
                    akjm2.c = j;
                    builder.copyOnWrite();
                    final SendShareEndpoint$SendShareExternallyEndpoint sendShareEndpoint$SendShareExternallyEndpoint2 = (SendShareEndpoint$SendShareExternallyEndpoint)builder.instance;
                    final akjm c = (akjm)builder2.build();
                    c.getClass();
                    sendShareEndpoint$SendShareExternallyEndpoint2.c = c;
                    sendShareEndpoint$SendShareExternallyEndpoint2.b |= 0x1;
                }
                final SendShareEndpoint$SendShareExternallyEndpoint sendShareEndpoint$SendShareExternallyEndpoint3 = (SendShareEndpoint$SendShareExternallyEndpoint)builder.instance;
                if ((sendShareEndpoint$SendShareExternallyEndpoint3.b & 0x2) != 0x0) {
                    akjk akjk;
                    if ((akjk = sendShareEndpoint$SendShareExternallyEndpoint3.d) == null) {
                        akjk = akjk.a;
                    }
                    final ahaz builder3 = ((ahbh)akjk).toBuilder();
                    builder3.copyOnWrite();
                    final akjk akjk2 = (akjk)builder3.instance;
                    akjk2.b |= 0x2;
                    akjk2.d = false;
                    builder.copyOnWrite();
                    final SendShareEndpoint$SendShareExternallyEndpoint sendShareEndpoint$SendShareExternallyEndpoint4 = (SendShareEndpoint$SendShareExternallyEndpoint)builder.instance;
                    final akjk d = (akjk)builder3.build();
                    d.getClass();
                    sendShareEndpoint$SendShareExternallyEndpoint4.d = d;
                    sendShareEndpoint$SendShareExternallyEndpoint4.b |= 0x2;
                }
                ahbb.e((ahaq)SendShareEndpoint$SendShareExternallyEndpoint.sendShareExternallyEndpoint, (Object)builder.build());
            }
            b.c((aiqj)((ahaz)ahbb).build(), (Map)hashMap);
            adbc.c.b(true);
        }
    }
}
