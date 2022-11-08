import android.widget.FrameLayout;
import android.text.Spanned;
import com.google.android.libraries.youtube.common.ui.FixedAspectRatioRelativeLayout;
import android.view.ViewGroup$MarginLayoutParams;
import android.graphics.Color;
import java.util.List;
import java.util.Collection;
import java.util.ArrayList;
import android.text.TextUtils;
import android.view.View;
import android.content.Context;
import com.google.android.apps.youtube.app.playlist.ui.PlaylistThumbnailView;
import android.widget.ImageView;

// 
// Decompiled by Procyon v0.6.0
// 

final class kgf extends jes
{
    public final ImageView p;
    final /* synthetic */ kgg q;
    private final acih r;
    private final int s;
    private final PlaylistThumbnailView t;
    private final PlaylistThumbnailView u;
    private final PlaylistThumbnailView v;
    
    public kgf(final kgg q, final Context context, final aceo aceo, final int s, final giz giz, final vax vax, final acnj acnj, final acng acng) {
        this.q = q;
        super(context, aceo, acnj, s, acng);
        this.r = new acih(vax, (acio)giz);
        this.s = s;
        this.t = (PlaylistThumbnailView)super.c.findViewById(2131430488);
        this.u = (PlaylistThumbnailView)super.c.findViewById(2131430489);
        this.v = (PlaylistThumbnailView)super.c.findViewById(2131430487);
        this.p = (ImageView)super.c.findViewById(2131428086);
    }
    
    public static final aioe o(final aiib aiib) {
        aiic aiic;
        if ((aiic = aiib.c) == null) {
            aiic = aiic.a;
        }
        if ((aiic.b & 0x2) != 0x0) {
            aiic aiic2;
            if ((aiic2 = aiib.c) == null) {
                aiic2 = aiic.a;
            }
            aioe aioe;
            if ((aioe = aiic2.d) == null) {
                aioe = aioe.a;
            }
            return aioe;
        }
        return null;
    }
    
    public final View a() {
        return super.c;
    }
    
    public final void c(final acir acir) {
        super.c(acir);
        this.r.c();
    }
    
    public final void n(final acij acij, final anpf anpf) {
        final acih r = this.r;
        final wwv a = ((wwx)acij).a;
        final int b = anpf.b;
        final ajsq ajsq = null;
        aioe aioe;
        if ((b & 0x10) != 0x0) {
            if ((aioe = anpf.g) == null) {
                aioe = aioe.a;
            }
        }
        else {
            aioe = null;
        }
        r.a(a, aioe, acij.e());
        ajsq ajsq2;
        if ((ajsq2 = anpf.c) == null) {
            ajsq2 = ajsq.a;
        }
        this.k((CharSequence)abyh.b(ajsq2));
        final int ck = aqql.ck(anpf.m);
        Label_0396: {
            if (ck != 0) {
                if (ck == 5) {
                    final int b2 = anpf.b;
                    if ((b2 & 0x80) != 0x0) {
                        CharSequence concat;
                        if ((b2 & 0x40) != 0x0) {
                            ajsq ajsq3;
                            if ((ajsq3 = anpf.i) == null) {
                                ajsq3 = ajsq.a;
                            }
                            final Spanned b3 = abyh.b(ajsq3);
                            ajsq ajsq4;
                            if ((ajsq4 = anpf.j) == null) {
                                ajsq4 = ajsq.a;
                            }
                            concat = TextUtils.concat(new CharSequence[] { (CharSequence)b3, " · ", (CharSequence)abyh.b(ajsq4) });
                        }
                        else {
                            concat = null;
                        }
                        CharSequence concat2;
                        if ((anpf.b & 0x20) != 0x0) {
                            ajsq ajsq5;
                            if ((ajsq5 = anpf.h) == null) {
                                ajsq5 = ajsq.a;
                            }
                            final Spanned b4 = abyh.b(ajsq5);
                            ajsq ajsq6;
                            if ((ajsq6 = anpf.j) == null) {
                                ajsq6 = ajsq.a;
                            }
                            concat2 = TextUtils.concat(new CharSequence[] { (CharSequence)b4, " · ", (CharSequence)abyh.b(ajsq6) });
                        }
                        else {
                            concat2 = null;
                        }
                        this.d(concat, concat2);
                        break Label_0396;
                    }
                }
            }
            Object b5;
            if ((anpf.b & 0x40) != 0x0) {
                ajsq ajsq7;
                if ((ajsq7 = anpf.i) == null) {
                    ajsq7 = ajsq.a;
                }
                b5 = abyh.b(ajsq7);
            }
            else {
                b5 = null;
            }
            Object b6;
            if ((anpf.b & 0x20) != 0x0) {
                ajsq ajsq8;
                if ((ajsq8 = anpf.h) == null) {
                    ajsq8 = ajsq.a;
                }
                b6 = abyh.b(ajsq8);
            }
            else {
                b6 = null;
            }
            this.d((CharSequence)b5, (CharSequence)b6);
        }
        final int s = this.s;
        if (s != 2131624465 && s != 2131624610) {
            if ((anpf.b & 0x4) != 0x0) {
                final PlaylistThumbnailView g = super.g;
                int ck2;
                if ((ck2 = aqql.ck(anpf.m)) == 0) {
                    ck2 = 1;
                }
                g.f(ck2);
                aorm aorm;
                if ((aorm = anpf.d) == null) {
                    aorm = aorm.a;
                }
                this.g(aorm);
            }
        }
        else {
            this.t.f(4);
            this.u.f(4);
            this.v.f(4);
            this.t.e(false);
            this.u.e(false);
            this.v.e(true);
            final ArrayList list = new ArrayList();
            aorm aorm2;
            if ((aorm2 = anpf.d) == null) {
                aorm2 = aorm.a;
            }
            list.add(aorm2);
            list.addAll((Collection)anpf.e);
            final int size = list.size();
            aorm aorm3;
            aorm aorm4;
            aorm aorm5;
            if (size != 2) {
                if (size != 3) {
                    aorm3 = (aorm)list.get(0);
                    aorm4 = (aorm)list.get(0);
                    aorm5 = (aorm)list.get(0);
                }
                else {
                    aorm3 = (aorm)list.get(0);
                    aorm4 = (aorm)list.get(1);
                    aorm5 = (aorm)list.get(2);
                }
            }
            else {
                aorm3 = (aorm)list.get(0);
                aorm4 = (aorm)list.get(1);
                aorm5 = (aorm)list.get(0);
            }
            this.t.d(actc.N(aorm3));
            this.q.c.g(this.t.b, aorm3);
            this.u.d(actc.N(aorm4));
            this.q.c.g(this.u.b, aorm4);
            this.v.d(actc.N(aorm5));
            this.q.c.g(this.v.b, aorm5);
        }
        if (anpf.f.size() > 0) {
            this.i((List)anpf.f);
        }
        else {
            ajsq ajsq9;
            if ((anpf.b & 0x200) != 0x0) {
                if ((ajsq9 = anpf.l) == null) {
                    ajsq9 = ajsq.a;
                }
            }
            else {
                ajsq9 = null;
            }
            final Spanned b7 = abyh.b(ajsq9);
            ajsq ajsq10 = ajsq;
            if ((anpf.b & 0x200) != 0x0 && (ajsq10 = anpf.l) == null) {
                ajsq10 = ajsq.a;
            }
            this.j((CharSequence)b7, (CharSequence)abyh.b(ajsq10));
        }
        if (this.q.f() == 1 && this.s == 2131624464) {
            super.g.a(true);
        }
        else if (this.q.f() == 2 && !tmy.bq(this.q.a)) {
            super.g.a(false);
        }
        aorm aorm6;
        if ((aorm6 = anpf.d) == null) {
            aorm6 = aorm.a;
        }
        Label_1343: {
            Label_1228: {
                if ((aorm6.b & 0x200) != 0x0) {
                    final int m = anpf.m;
                    final int ck3 = aqql.ck(m);
                    Label_1066: {
                        if (ck3 != 0) {
                            if (ck3 == 3) {
                                break Label_1066;
                            }
                        }
                        final int ck4 = aqql.ck(m);
                        if (ck4 == 0) {
                            break Label_1228;
                        }
                        if (ck4 != 6) {
                            break Label_1228;
                        }
                    }
                    final PlaylistThumbnailView g2 = super.g;
                    aorm aorm7;
                    if ((aorm7 = anpf.d) == null) {
                        aorm7 = aorm.a;
                    }
                    aork aork;
                    if ((aork = aorm7.g) == null) {
                        aork = aork.a;
                    }
                    g2.a = Color.argb(Color.alpha(g2.a), aork.b, aork.c, aork.d);
                    if (this.s == 2131624504) {
                        final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams = (ViewGroup$MarginLayoutParams)((View)super.h).getLayoutParams();
                        viewGroup$MarginLayoutParams.topMargin = this.q.a.getResources().getDimensionPixelSize(2131169829);
                        viewGroup$MarginLayoutParams.setMarginEnd(this.q.a.getResources().getDimensionPixelSize(2131169828));
                        this.d.setTextAppearance(this.q.a, 2132084080);
                        this.e.setTextAppearance(this.q.a, 2132084077);
                    }
                    break Label_1343;
                }
            }
            final aorm d = anpf.d;
            aorm a2;
            if (d == null) {
                a2 = aorm.a;
            }
            else {
                a2 = d;
            }
            if ((a2.b & 0x200) != 0x0) {
                final int ck5 = aqql.ck(anpf.m);
                if (ck5 != 0) {
                    if (ck5 == 5) {
                        aorm a3;
                        if ((a3 = d) == null) {
                            a3 = aorm.a;
                        }
                        aork aork2;
                        if ((aork2 = a3.g) == null) {
                            aork2 = aork.a;
                        }
                        final FrameLayout i = super.m;
                        if (i != null) {
                            i.setBackgroundColor(Color.argb(i.getBackground().getAlpha(), aork2.b, aork2.c, aork2.d));
                        }
                    }
                }
            }
        }
        if (this.q.e.aR() && (tmy.bq(this.q.a) || this.q.f() == 2)) {
            final FixedAspectRatioRelativeLayout fixedAspectRatioRelativeLayout = (FixedAspectRatioRelativeLayout)super.c.findViewById(2131430490);
            if (fixedAspectRatioRelativeLayout == null) {
                final View viewById = super.c.findViewById(2131430487);
                if (viewById != null) {
                    viewById.setClipToOutline(true);
                    viewById.setBackgroundResource(2131231033);
                }
            }
            else {
                fixedAspectRatioRelativeLayout.setClipToOutline(true);
                fixedAspectRatioRelativeLayout.setBackgroundResource(2131231033);
            }
        }
    }
}
