import java.util.List;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import java.util.Iterator;
import com.google.android.apps.youtube.app.playlist.ui.PlaylistThumbnailView;
import android.widget.ImageView;
import android.view.View$OnClickListener;
import android.widget.TextView;
import android.view.ViewGroup;
import android.content.Context;
import android.widget.LinearLayout;
import android.view.View;
import android.view.LayoutInflater;
import android.content.res.Resources;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jlc extends acld
{
    public final vcy a;
    private final acgs b;
    private final ackr c;
    private final Resources d;
    private final LayoutInflater e;
    private final View f;
    private LinearLayout g;
    private aprj h;
    private boolean i;
    private int j;
    
    public jlc(final Context context, final acgs b, final gjh c, final vcy a) {
        b.getClass();
        this.b = b;
        c.getClass();
        this.c = (ackr)c;
        a.getClass();
        this.a = a;
        this.d = context.getResources();
        final LayoutInflater from = LayoutInflater.from(context);
        this.e = from;
        c.c(this.f = from.inflate(2131625786, (ViewGroup)null));
    }
    
    public final View a() {
        return ((gjh)this.c).a;
    }
    
    public final void c(final acku acku) {
    }
    
    protected final /* bridge */ byte[] d(final Object o) {
        final aprj aprj = (aprj)o;
        if ((aprj.b & 0x80) != 0x0) {
            return aprj.g.I();
        }
        return null;
    }
    
    protected final /* bridge */ void lR(final ackm ackm, final Object o) {
        final aprj h = (aprj)o;
        if (!h.equals((Object)this.h)) {
            this.i = false;
        }
        if (this.i && this.d.getConfiguration().orientation == this.j) {
            this.c.e(ackm);
            return;
        }
        this.h = h;
        if (!this.i) {
            this.g = (LinearLayout)this.f.findViewById(2131432429);
            final TextView textView = (TextView)this.f.findViewById(2131428026);
            ajut ajut;
            if ((h.b & 0x1) != 0x0) {
                if ((ajut = h.c) == null) {
                    ajut = ajut.a;
                }
            }
            else {
                ajut = null;
            }
            textView.setText((CharSequence)acak.b(ajut));
            aiqj aiqj;
            if ((h.b & 0x2) != 0x0) {
                if ((aiqj = h.d) == null) {
                    aiqj = aiqj.a;
                }
            }
            else {
                aiqj = null;
            }
            textView.setOnClickListener((View$OnClickListener)new jlb(this, aiqj, 0));
            final TextView textView2 = (TextView)this.f.findViewById(2131431132);
            final LinearLayout linearLayout = (LinearLayout)this.f.findViewById(2131431131);
            final ViewGroup viewGroup = (ViewGroup)linearLayout.getParent();
            aprn aprn;
            if ((aprn = h.f) == null) {
                aprn = aprn.a;
            }
            final ahbx d = aprn.d;
            if (((List)d).isEmpty()) {
                viewGroup.setVisibility(8);
                textView2.setVisibility(8);
            }
            else {
                final aprn f = h.f;
                aprn a;
                if (f == null) {
                    a = aprn.a;
                }
                else {
                    a = f;
                }
                ajut ajut2;
                if ((a.b & 0x1) != 0x0) {
                    aprn a2;
                    if ((a2 = f) == null) {
                        a2 = aprn.a;
                    }
                    if ((ajut2 = a2.c) == null) {
                        ajut2 = ajut.a;
                    }
                }
                else {
                    ajut2 = null;
                }
                textView2.setText((CharSequence)acak.b(ajut2));
                viewGroup.setVisibility(0);
                linearLayout.removeAllViews();
                int n;
                for (int i = 0; i < ((List)d).size(); i = n + 1) {
                    final apro apro = (apro)((List)d).get(i);
                    final View inflate = this.e.inflate(2131625793, (ViewGroup)linearLayout, false);
                    final TextView textView3 = (TextView)inflate.findViewById(2131432095);
                    ajut ajut3;
                    if ((apro.b & 0x1) != 0x0) {
                        if ((ajut3 = apro.c) == null) {
                            ajut3 = ajut.a;
                        }
                    }
                    else {
                        ajut3 = null;
                    }
                    textView3.setText((CharSequence)acak.b(ajut3));
                    final acgs b = this.b;
                    final ImageView imageView = (ImageView)inflate.findViewById(2131432009);
                    aotp aotp;
                    if ((aotp = apro.d) == null) {
                        aotp = aotp.a;
                    }
                    b.g(imageView, aotp);
                    aiqj aiqj2;
                    if ((aiqj2 = apro.e) == null) {
                        aiqj2 = aiqj.a;
                    }
                    inflate.setOnClickListener((View$OnClickListener)new ivc(this, aiqj2, 20));
                    if ((n = i) == 0) {
                        inflate.setPadding(inflate.getPaddingRight(), inflate.getPaddingTop(), inflate.getPaddingRight(), inflate.getPaddingBottom());
                        n = 0;
                    }
                    linearLayout.addView(inflate);
                }
            }
        }
        this.g.removeAllViews();
        for (final apri apri : h.e) {
            final int b2 = apri.b;
            if (b2 == 63271829) {
                final LinearLayout g = this.g;
                final aprm aprm = (aprm)apri.c;
                final View inflate2 = this.e.inflate(2131625791, (ViewGroup)g, false);
                aiqj aiqj3;
                if ((aprm.b & 0x20) != 0x0) {
                    if ((aiqj3 = aprm.g) == null) {
                        aiqj3 = aiqj.a;
                    }
                }
                else {
                    aiqj3 = null;
                }
                inflate2.setOnClickListener((View$OnClickListener)new jlb(this, aiqj3, 1));
                final View viewById = inflate2.findViewById(2131430771);
                final PlaylistThumbnailView playlistThumbnailView = (PlaylistThumbnailView)viewById.findViewById(2131430488);
                aotp aotp2;
                if ((aotp2 = aprm.c) == null) {
                    aotp2 = aotp.a;
                }
                playlistThumbnailView.d(aald.T(aotp2));
                this.b.g(playlistThumbnailView.b, aotp2);
                final TextView textView4 = (TextView)viewById.findViewById(2131432095);
                ajut ajut4;
                if ((aprm.b & 0x4) != 0x0) {
                    if ((ajut4 = aprm.d) == null) {
                        ajut4 = ajut.a;
                    }
                }
                else {
                    ajut4 = null;
                }
                textView4.setText((CharSequence)acak.b(ajut4));
                final TextView textView5 = (TextView)viewById.findViewById(2131430230);
                ajut ajut5;
                if ((aprm.b & 0x10) != 0x0) {
                    if ((ajut5 = aprm.f) == null) {
                        ajut5 = ajut.a;
                    }
                }
                else {
                    ajut5 = null;
                }
                textView5.setText((CharSequence)acak.b(ajut5));
                final YouTubeTextView c = playlistThumbnailView.c;
                ajut ajut6;
                if ((aprm.b & 0x8) != 0x0) {
                    if ((ajut6 = aprm.e) == null) {
                        ajut6 = ajut.a;
                    }
                }
                else {
                    ajut6 = null;
                }
                c.setText((CharSequence)acak.b(ajut6));
                g.addView(inflate2);
            }
            else {
                if (b2 != 63336837) {
                    continue;
                }
                final LinearLayout g2 = this.g;
                final aprl aprl = (aprl)apri.c;
                final View inflate3 = this.e.inflate(2131625790, (ViewGroup)null);
                aiqj aiqj4;
                if ((aprl.b & 0x20) != 0x0) {
                    if ((aiqj4 = aprl.g) == null) {
                        aiqj4 = aiqj.a;
                    }
                }
                else {
                    aiqj4 = null;
                }
                inflate3.setOnClickListener((View$OnClickListener)new jlb(this, aiqj4, 2));
                final View viewById2 = inflate3.findViewById(2131430481);
                final TextView textView6 = (TextView)viewById2.findViewById(2131432095);
                ajut ajut7;
                if ((aprl.b & 0x4) != 0x0) {
                    if ((ajut7 = aprl.d) == null) {
                        ajut7 = ajut.a;
                    }
                }
                else {
                    ajut7 = null;
                }
                textView6.setText((CharSequence)acak.b(ajut7));
                final TextView textView7 = (TextView)viewById2.findViewById(2131430230);
                ajut ajut8;
                if ((aprl.b & 0x10) != 0x0) {
                    if ((ajut8 = aprl.f) == null) {
                        ajut8 = ajut.a;
                    }
                }
                else {
                    ajut8 = null;
                }
                tpe.t(textView7, (CharSequence)acak.b(ajut8));
                final PlaylistThumbnailView playlistThumbnailView2 = (PlaylistThumbnailView)viewById2.findViewById(2131430488);
                final YouTubeTextView c2 = playlistThumbnailView2.c;
                ajut ajut9;
                if ((aprl.b & 0x8) != 0x0) {
                    if ((ajut9 = aprl.e) == null) {
                        ajut9 = ajut.a;
                    }
                }
                else {
                    ajut9 = null;
                }
                tpe.t((TextView)c2, (CharSequence)acak.b(ajut9));
                final acgs b3 = this.b;
                final ImageView b4 = playlistThumbnailView2.b;
                aotp aotp3;
                if ((aotp3 = aprl.c) == null) {
                    aotp3 = aotp.a;
                }
                b3.g(b4, aotp3);
                g2.addView(inflate3);
            }
        }
        this.i = true;
        this.j = this.d.getConfiguration().orientation;
        this.c.e(ackm);
    }
    
    protected final boolean pX() {
        return true;
    }
}
