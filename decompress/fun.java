import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import android.widget.TextView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.content.Context;
import com.google.android.libraries.youtube.common.ui.YouTubeButton;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import android.widget.ImageView;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fun extends acld
{
    public final View a;
    public final elx b;
    public final pvh c;
    private final acgs d;
    private final ImageView e;
    private final YouTubeTextView f;
    private final YouTubeTextView g;
    private final ImageView h;
    private final YouTubeTextView i;
    private final YouTubeTextView j;
    private final YouTubeButton k;
    private final acsx l;
    private final YouTubeButton m;
    private final acsx n;
    
    public fun(final Context context, final aujg aujg, final acgs d, final elx b, final ViewGroup viewGroup, final pvh c, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        this.d = d;
        this.b = b;
        final View inflate = LayoutInflater.from(context).inflate(2131624364, viewGroup, false);
        this.a = inflate;
        this.e = (ImageView)inflate.findViewById(2131428721);
        this.f = (YouTubeTextView)inflate.findViewById(2131428723);
        this.g = (YouTubeTextView)inflate.findViewById(2131428716);
        this.h = (ImageView)inflate.findViewById(2131428719);
        this.i = (YouTubeTextView)inflate.findViewById(2131428718);
        this.j = (YouTubeTextView)inflate.findViewById(2131428717);
        final YouTubeButton k = (YouTubeButton)inflate.findViewById(2131428720);
        this.k = k;
        this.l = aujg.H((View)k);
        final YouTubeButton m = (YouTubeButton)inflate.findViewById(2131428722);
        this.m = m;
        this.n = aujg.H((View)m);
        this.c = c;
    }
    
    public final View a() {
        return this.a;
    }
    
    public final void c(final acku acku) {
    }
    
    protected final /* bridge */ byte[] d(final Object o) {
        return ((ajfl)o).i.I();
    }
    
    public final /* bridge */ void lR(final ackm ackm, final Object o) {
        final ajfl ajfl = (ajfl)o;
        final wyw a = ((wyy)ackm).a;
        final acgs d = this.d;
        final ImageView e = this.e;
        aotp aotp;
        if ((ajfl.b & 0x1) != 0x0) {
            if ((aotp = ajfl.c) == null) {
                aotp = aotp.a;
            }
        }
        else {
            aotp = null;
        }
        d.g(e, aotp);
        final YouTubeTextView f = this.f;
        ajut ajut;
        if ((ajut = ajfl.d) == null) {
            ajut = ajut.a;
        }
        tpe.t((TextView)f, (CharSequence)acak.b(ajut));
        final YouTubeTextView g = this.g;
        ajut ajut2;
        if ((ajut2 = ajfl.e) == null) {
            ajut2 = ajut.a;
        }
        tpe.t((TextView)g, (CharSequence)acak.b(ajut2));
        final acgs d2 = this.d;
        final ImageView h = this.h;
        ajfk ajfk;
        if ((ajfk = ajfl.f) == null) {
            ajfk = ajfk.a;
        }
        aotp aotp2;
        if ((aotp2 = ajfk.c) == null) {
            aotp2 = aotp.a;
        }
        final acgn a2 = acgo.a();
        a2.b(2131232504);
        d2.j(h, aotp2, a2.a());
        final YouTubeTextView i = this.i;
        ajfk ajfk2;
        if ((ajfk2 = ajfl.f) == null) {
            ajfk2 = ajfk.a;
        }
        ajut ajut3;
        if ((ajut3 = ajfk2.d) == null) {
            ajut3 = ajut.a;
        }
        tpe.t((TextView)i, (CharSequence)acak.b(ajut3));
        final YouTubeTextView j = this.j;
        ajfk ajfk3;
        if ((ajfk3 = ajfl.f) == null) {
            ajfk3 = ajfk.a;
        }
        ajut ajut4;
        if ((ajut4 = ajfk3.e) == null) {
            ajut4 = ajut.a;
        }
        tpe.t((TextView)j, (CharSequence)acak.b(ajut4));
        if ((ajfl.b & 0x10) != 0x0) {
            anuv anuv;
            if ((anuv = ajfl.g) == null) {
                anuv = anuv.a;
            }
            final aicz aicz = (aicz)((ahbc)anuv).rx((ahaq)ButtonRendererOuterClass.buttonRenderer);
            this.l.b(aicz, a);
            this.l.c = (acsw)new ezm(this, 4);
            final YouTubeButton k = this.k;
            ajut ajut5;
            if ((ajut5 = aicz.i) == null) {
                ajut5 = ajut.a;
            }
            tpe.t((TextView)k, (CharSequence)acak.b(ajut5));
            final YouTubeButton l = this.k;
            tpe.r((View)l, l.getBackground());
        }
        else {
            this.k.setVisibility(8);
        }
        if ((ajfl.b & 0x20) != 0x0) {
            anuv anuv2;
            if ((anuv2 = ajfl.h) == null) {
                anuv2 = anuv.a;
            }
            final aicz aicz2 = (aicz)((ahbc)anuv2).rx((ahaq)ButtonRendererOuterClass.buttonRenderer);
            this.n.b(aicz2, a);
            final YouTubeButton m = this.m;
            ajut ajut6;
            if ((ajut6 = aicz2.i) == null) {
                ajut6 = ajut.a;
            }
            tpe.t((TextView)m, (CharSequence)acak.b(ajut6));
            final YouTubeButton m2 = this.m;
            tpe.r((View)m2, m2.getBackground());
            return;
        }
        this.m.setVisibility(8);
    }
}
