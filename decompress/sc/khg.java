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

final class khg extends jft
{
    public final ImageView p;
    final khh q;
    private final ackk r;
    private final int s;
    private final PlaylistThumbnailView t;
    private final PlaylistThumbnailView u;
    private final PlaylistThumbnailView v;
    
    public khg(final khh q, final Context context, final acgs acgs, final int s, final gjh gjh, final vcy vcy, final acpn acpn, final acpk acpk) {
        this.q = q;
        super(context, acgs, acpn, s, acpk);
        this.r = new ackk(vcy, (ackr)gjh);
        this.s = s;
        this.t = (PlaylistThumbnailView)super.c.findViewById(2131430489);
        this.u = (PlaylistThumbnailView)super.c.findViewById(2131430490);
        this.v = (PlaylistThumbnailView)super.c.findViewById(2131430488);
        this.p = (ImageView)super.c.findViewById(2131428086);
    }
    
    public static final aiqj o(final aijz aijz) {
        aika aika;
        if ((aika = aijz.c) == null) {
            aika = aika.a;
        }
        if ((aika.b & 0x2) != 0x0) {
            aika aika2;
            if ((aika2 = aijz.c) == null) {
                aika2 = aika.a;
            }
            aiqj aiqj;
            if ((aiqj = aika2.d) == null) {
                aiqj = aiqj.a;
            }
            return aiqj;
        }
        return null;
    }
    
    public final View a() {
        return super.c;
    }
    
    public final void c(final acku acku) {
        super.c(acku);
        this.r.c();
    }
    
    public final /* bridge */ void mN(final ackm ackm, final Object o) {
        this.n(ackm, (anri)o);
    }
    
    public final void n(final ackm ackm, final anri anri) {
        final ackk r = this.r;
        final wyw a = ackm.a;
        final int b = anri.b;
        final ajut ajut = null;
        aiqj aiqj;
        if ((b & 0x10) != 0x0) {
            if ((aiqj = anri.g) == null) {
                aiqj = aiqj.a;
            }
        }
        else {
            aiqj = null;
        }
        r.a(a, aiqj, ackm.e());
        ajut ajut2;
        if ((ajut2 = anri.c) == null) {
            ajut2 = ajut.a;
        }
        this.k((CharSequence)acak.b(ajut2));
        final int cl = aqsx.cl(anri.m);
        Label_0392: {
            if (cl != 0) {
                if (cl == 5) {
                    final int b2 = anri.b;
                    if ((b2 & 0x80) != 0x0) {
                        CharSequence concat;
                        if ((b2 & 0x40) != 0x0) {
                            ajut ajut3;
                            if ((ajut3 = anri.i) == null) {
                                ajut3 = ajut.a;
                            }
                            final Spanned b3 = acak.b(ajut3);
                            ajut ajut4;
                            if ((ajut4 = anri.j) == null) {
                                ajut4 = ajut.a;
                            }
                            concat = TextUtils.concat(new CharSequence[] { (CharSequence)b3, " · ", (CharSequence)acak.b(ajut4) });
                        }
                        else {
                            concat = null;
                        }
                        CharSequence concat2;
                        if ((anri.b & 0x20) != 0x0) {
                            ajut ajut5;
                            if ((ajut5 = anri.h) == null) {
                                ajut5 = ajut.a;
                            }
                            final Spanned b4 = acak.b(ajut5);
                            ajut ajut6;
                            if ((ajut6 = anri.j) == null) {
                                ajut6 = ajut.a;
                            }
                            concat2 = TextUtils.concat(new CharSequence[] { (CharSequence)b4, " · ", (CharSequence)acak.b(ajut6) });
                        }
                        else {
                            concat2 = null;
                        }
                        this.d(concat, concat2);
                        break Label_0392;
                    }
                }
            }
            Object b5;
            if ((anri.b & 0x40) != 0x0) {
                ajut ajut7;
                if ((ajut7 = anri.i) == null) {
                    ajut7 = ajut.a;
                }
                b5 = acak.b(ajut7);
            }
            else {
                b5 = null;
            }
            Object b6;
            if ((anri.b & 0x20) != 0x0) {
                ajut ajut8;
                if ((ajut8 = anri.h) == null) {
                    ajut8 = ajut.a;
                }
                b6 = acak.b(ajut8);
            }
            else {
                b6 = null;
            }
            this.d((CharSequence)b5, (CharSequence)b6);
        }
        final int s = this.s;
        if (s != 2131624465 && s != 2131624611) {
            if ((anri.b & 0x4) != 0x0) {
                final PlaylistThumbnailView g = super.g;
                int cl2;
                if ((cl2 = aqsx.cl(anri.m)) == 0) {
                    cl2 = 1;
                }
                g.f(cl2);
                aotp aotp;
                if ((aotp = anri.d) == null) {
                    aotp = aotp.a;
                }
                this.g(aotp);
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
            aotp aotp2;
            if ((aotp2 = anri.d) == null) {
                aotp2 = aotp.a;
            }
            list.add(aotp2);
            list.addAll((Collection)anri.e);
            final int size = list.size();
            aotp aotp3;
            aotp aotp4;
            aotp aotp5;
            if (size != 2) {
                if (size != 3) {
                    aotp3 = (aotp)list.get(0);
                    aotp4 = (aotp)list.get(0);
                    aotp5 = (aotp)list.get(0);
                }
                else {
                    aotp3 = (aotp)list.get(0);
                    aotp4 = (aotp)list.get(1);
                    aotp5 = (aotp)list.get(2);
                }
            }
            else {
                aotp3 = (aotp)list.get(0);
                aotp4 = (aotp)list.get(1);
                aotp5 = (aotp)list.get(0);
            }
            this.t.d(aald.T(aotp3));
            this.q.c.g(this.t.b, aotp3);
            this.u.d(aald.T(aotp4));
            this.q.c.g(this.u.b, aotp4);
            this.v.d(aald.T(aotp5));
            this.q.c.g(this.v.b, aotp5);
        }
        if (anri.f.size() > 0) {
            this.i((List)anri.f);
        }
        else {
            ajut ajut9;
            if ((anri.b & 0x200) != 0x0) {
                if ((ajut9 = anri.l) == null) {
                    ajut9 = ajut.a;
                }
            }
            else {
                ajut9 = null;
            }
            final Spanned b7 = acak.b(ajut9);
            ajut ajut10 = ajut;
            if ((anri.b & 0x200) != 0x0 && (ajut10 = anri.l) == null) {
                ajut10 = ajut.a;
            }
            this.j((CharSequence)b7, (CharSequence)acak.b(ajut10));
        }
        if (this.q.f() == 1 && this.s == 2131624464) {
            super.g.a(true);
        }
        else if (this.q.f() == 2 && !tpe.bq(this.q.a)) {
            super.g.a(false);
        }
        aotp aotp6;
        if ((aotp6 = anri.d) == null) {
            aotp6 = aotp.a;
        }
        Label_1321: {
            Label_1209: {
                if ((aotp6.b & 0x200) != 0x0) {
                    final int m = anri.m;
                    final int cl3 = aqsx.cl(m);
                    Label_1047: {
                        if (cl3 != 0) {
                            if (cl3 == 3) {
                                break Label_1047;
                            }
                        }
                        final int cl4 = aqsx.cl(m);
                        if (cl4 == 0) {
                            break Label_1209;
                        }
                        if (cl4 != 6) {
                            break Label_1209;
                        }
                    }
                    final PlaylistThumbnailView g2 = super.g;
                    aotp aotp7;
                    if ((aotp7 = anri.d) == null) {
                        aotp7 = aotp.a;
                    }
                    aotn aotn;
                    if ((aotn = aotp7.g) == null) {
                        aotn = aotn.a;
                    }
                    g2.a = Color.argb(Color.alpha(g2.a), aotn.b, aotn.c, aotn.d);
                    if (this.s == 2131624504) {
                        final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams = (ViewGroup$MarginLayoutParams)((View)super.h).getLayoutParams();
                        viewGroup$MarginLayoutParams.topMargin = this.q.a.getResources().getDimensionPixelSize(2131169830);
                        viewGroup$MarginLayoutParams.setMarginEnd(this.q.a.getResources().getDimensionPixelSize(2131169829));
                        this.d.setTextAppearance(this.q.a, 2132084080);
                        this.e.setTextAppearance(this.q.a, 2132084077);
                    }
                    break Label_1321;
                }
            }
            final aotp d = anri.d;
            aotp a2;
            if (d == null) {
                a2 = aotp.a;
            }
            else {
                a2 = d;
            }
            if ((a2.b & 0x200) != 0x0) {
                final int cl5 = aqsx.cl(anri.m);
                if (cl5 != 0) {
                    if (cl5 == 5) {
                        aotp a3;
                        if ((a3 = d) == null) {
                            a3 = aotp.a;
                        }
                        aotn aotn2;
                        if ((aotn2 = a3.g) == null) {
                            aotn2 = aotn.a;
                        }
                        final FrameLayout i = super.m;
                        if (i != null) {
                            i.setBackgroundColor(Color.argb(i.getBackground().getAlpha(), aotn2.b, aotn2.c, aotn2.d));
                        }
                    }
                }
            }
        }
        if (this.q.e.aS() && (tpe.bq(this.q.a) || this.q.f() == 2)) {
            final FixedAspectRatioRelativeLayout fixedAspectRatioRelativeLayout = (FixedAspectRatioRelativeLayout)super.c.findViewById(2131430491);
            if (fixedAspectRatioRelativeLayout == null) {
                final View viewById = super.c.findViewById(2131430488);
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
