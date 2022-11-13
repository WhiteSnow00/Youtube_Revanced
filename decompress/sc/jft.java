import android.text.Spanned;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import java.util.Iterator;
import android.text.TextUtils;
import java.util.List;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.view.ViewStub;
import android.widget.ImageView;
import com.google.android.apps.youtube.app.playlist.ui.PlaylistThumbnailView;
import android.widget.TextView;
import android.view.View;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class jft implements acko
{
    static final akdh a;
    public final Context b;
    public final View c;
    public final TextView d;
    protected final TextView e;
    protected final TextView f;
    public final PlaylistThumbnailView g;
    public final ImageView h;
    public final ViewStub i;
    public final ViewStub j;
    public gag k;
    public ilc l;
    protected final FrameLayout m;
    public final qcy n;
    public final cya o;
    private final acgs p;
    private final acpn q;
    private final TextView r;
    private final acpk s;
    private final ImageView t;
    
    static {
        a = akdh.a;
    }
    
    public jft(final Context context, final acgs acgs, final acpn acpn, final int n, final acpk acpk) {
        this(context, acgs, acpn, n, acpk, null, null, null, null, null, null, null);
    }
    
    public jft(final Context b, final acgs p12, final acpn q, final int n, final acpk s, final ViewGroup viewGroup, final qcy n2, final cya o, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        b.getClass();
        this.b = b;
        p12.getClass();
        this.p = p12;
        q.getClass();
        this.q = q;
        this.s = s;
        this.n = n2;
        this.o = o;
        final View inflate = LayoutInflater.from(b).inflate(n, viewGroup, false);
        this.c = inflate;
        this.d = (TextView)inflate.findViewById(2131432095);
        this.e = (TextView)inflate.findViewById(2131430230);
        this.f = (TextView)inflate.findViewById(2131432302);
        this.r = (TextView)inflate.findViewById(2131427855);
        this.g = (PlaylistThumbnailView)inflate.findViewById(2131430488);
        this.h = (ImageView)inflate.findViewById(2131428448);
        this.i = (ViewStub)inflate.findViewById(2131430123);
        final ViewStub j = (ViewStub)inflate.findViewById(2131429862);
        this.j = j;
        this.t = (ImageView)inflate.findViewById(2131427854);
        this.m = (FrameLayout)inflate.findViewById(2131427852);
        if (j != null && o != null) {
            this.k = o.D(b, j);
        }
    }
    
    public static final boolean m(final List list) {
        return list != null && !list.isEmpty();
    }
    
    public final void b(final CharSequence charSequence) {
        tpe.t(this.e, charSequence);
    }
    
    public void c(final acku acku) {
        final ilc l = this.l;
        if (l != null) {
            l.a();
        }
    }
    
    public final void d(final CharSequence charSequence, final CharSequence charSequence2) {
        if (!TextUtils.isEmpty(charSequence)) {
            this.e.setSingleLine(false);
            this.e.setMaxLines(2);
            tpe.t(this.e, charSequence);
            return;
        }
        if (!TextUtils.isEmpty(charSequence2)) {
            this.e.setSingleLine(true);
            tpe.t(this.e, charSequence2);
            return;
        }
        this.e.setVisibility(8);
    }
    
    public final void f(final View view, final amgv amgv, final Object o, final wyw wyw) {
        final acpn q = this.q;
        final ImageView h = this.h;
        amgs amgs;
        if (amgv != null && (amgv.b & 0x1) != 0x0) {
            if ((amgs = amgv.c) == null) {
                amgs = amgs.a;
            }
        }
        else {
            amgs = null;
        }
        q.f(view, (View)h, amgs, o, wyw);
    }
    
    public final void g(final aotp aotp) {
        this.g.d(aald.T(aotp));
        this.p.g(this.g.b, aotp);
    }
    
    public final void h(final ankk ankk, aotp aotp) {
        if (ankk == null) {
            this.g.d(false);
            this.p.g(this.g.b, aotp);
            return;
        }
        if ((ankk.b & 0x2) != 0x0) {
            this.g.d(true);
            final acgs p2 = this.p;
            final ImageView b = this.g.b;
            ankj ankj;
            if ((ankj = ankk.d) == null) {
                ankj = ankj.a;
            }
            aotp = ankj.b;
            aotp a;
            if ((a = aotp) == null) {
                a = aotp.a;
            }
            p2.g(b, a);
            return;
        }
        this.g.d(false);
        final acgs p3 = this.p;
        final ImageView b2 = this.g.b;
        aotp a2;
        if ((0x1 & ankk.b) != 0x0) {
            ankl ankl;
            if ((ankl = ankk.c) == null) {
                ankl = ankl.a;
            }
            aotp = ankl.c;
            if ((a2 = aotp) == null) {
                a2 = aotp.a;
            }
        }
        else {
            a2 = null;
        }
        p3.g(b2, a2);
    }
    
    public final void i(final List list) {
        for (final aotd aotd : list) {
            final int b = aotd.b;
            if ((b & 0x100) != 0x0) {
                aotc aotc;
                if ((aotc = aotd.g) == null) {
                    aotc = aotc.a;
                }
                final YouTubeTextView c = this.g.c;
                ajut ajut;
                if ((ajut = aotc.c) == null) {
                    ajut = ajut.a;
                }
                final Spanned b2 = acak.b(ajut);
                tpe.t((TextView)c, (CharSequence)b2);
                int b3;
                if ((aotc.b & 0x1) != 0x0) {
                    b3 = tvb.b(b2.toString(), 0);
                }
                else {
                    b3 = 0;
                }
                c.setContentDescription((CharSequence)this.b.getResources().getQuantityString(2131886174, b3, new Object[] { b3 }));
                akdh akdh;
                if ((aotc.b & 0x2) != 0x0) {
                    akdi akdi;
                    if ((akdi = aotc.d) == null) {
                        akdi = akdi.a;
                    }
                    if ((akdh = akdh.b(akdi.c)) == null) {
                        akdh = akdh.a;
                    }
                }
                else {
                    akdh = jft.a;
                }
                this.g.b(this.s.a(akdh));
                this.g.e(true);
                final TextView r = this.r;
                if (r == null) {
                    continue;
                }
                r.setVisibility(8);
            }
            else {
                if ((b & 0x2) == 0x0) {
                    continue;
                }
                aoss aoss;
                if ((aoss = aotd.d) == null) {
                    aoss = aoss.a;
                }
                this.g.e(false);
                ajut ajut2;
                if ((ajut2 = aoss.c) == null) {
                    ajut2 = ajut.a;
                }
                final Spanned b4 = acak.b(ajut2);
                if (this.r != null && !TextUtils.isEmpty((CharSequence)b4)) {
                    this.r.setVisibility(0);
                    this.r.setText((CharSequence)b4);
                    this.r.setContentDescription((CharSequence)b4);
                }
                final int b5 = aoss.b;
                if ((b5 & 0x1) == 0x0) {
                    continue;
                }
                final int n = b5 & 0x2;
                if (n == 0) {
                    continue;
                }
                akdh akdh2;
                if (n != 0) {
                    akdi akdi2;
                    if ((akdi2 = aoss.d) == null) {
                        akdi2 = akdi.a;
                    }
                    if ((akdh2 = akdh.b(akdi2.c)) == null) {
                        akdh2 = akdh.a;
                    }
                }
                else {
                    akdh2 = jft.a;
                }
                final int a = this.s.a(akdh2);
                if (a == 0) {
                    continue;
                }
                this.t.setImageDrawable(this.b.getResources().getDrawable(a));
            }
        }
    }
    
    public final void j(final CharSequence charSequence, final CharSequence contentDescription) {
        final YouTubeTextView c = this.g.c;
        tpe.t((TextView)c, charSequence);
        c.setContentDescription(contentDescription);
    }
    
    public final void k(final CharSequence text) {
        this.d.setText(text);
    }
    
    public final void l(final CharSequence text) {
        this.f.setText(text);
    }
}
