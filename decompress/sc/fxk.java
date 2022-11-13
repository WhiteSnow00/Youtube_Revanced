import java.util.List;
import java.util.Iterator;
import android.widget.TextView;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import android.content.Context;
import android.widget.LinearLayout;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fxk extends acld
{
    final LinearLayout a;
    private final Context b;
    private final ackr c;
    private final tgd d;
    private final View e;
    private final hmw f;
    
    public fxk(final Context b, final gjh c, final hmw f, final tgd d, final byte[] array, final byte[] array2) {
        this.b = b;
        this.c = (ackr)c;
        this.f = f;
        this.d = d;
        final View inflate = View.inflate(b, 2131624245, (ViewGroup)null);
        this.e = inflate;
        this.a = (LinearLayout)inflate.findViewById(2131430118);
        c.c(inflate);
    }
    
    public final View a() {
        return ((gjh)this.c).a;
    }
    
    public final void c(final acku acku) {
    }
    
    protected final /* bridge */ byte[] d(final Object o) {
        return ((aivq)o).c.I();
    }
    
    public final /* bridge */ void lR(final ackm ackm, final Object o) {
        final ahbx b = ((aivq)o).b;
        this.a.removeAllViews();
        final Iterator iterator = ((List)b).iterator();
        int visibility;
        while (true) {
            final boolean hasNext = iterator.hasNext();
            visibility = 0;
            if (!hasNext) {
                break;
            }
            final aivp aivp = (aivp)iterator.next();
            if (aivp.b.size() <= 0) {
                continue;
            }
            final LinearLayout linearLayout = (LinearLayout)LayoutInflater.from(this.b).inflate(2131624244, (ViewGroup)this.a, false);
            for (final aivo aivo : aivp.b) {
                aida aida;
                if ((aida = aivo.b) == null) {
                    aida = aida.a;
                }
                aicz aicz;
                if ((aida.b & 0x1) != 0x0) {
                    aida aida2;
                    if ((aida2 = aivo.b) == null) {
                        aida2 = aida.a;
                    }
                    if ((aicz = aida2.c) == null) {
                        aicz = aicz.a;
                    }
                }
                else {
                    aicz = null;
                }
                final wyw a = ((wyy)ackm).a;
                final YouTubeTextView youTubeTextView = (YouTubeTextView)LayoutInflater.from(this.b).inflate(2131624243, (ViewGroup)linearLayout, false);
                final gld b2 = this.f.b(youTubeTextView);
                ((acsx)b2).c = (acsw)new fxj(this.d, a);
                ((acsx)b2).b(aicz, a);
                linearLayout.addView((View)youTubeTextView);
            }
            this.a.addView((View)linearLayout);
        }
        final LinearLayout a2 = this.a;
        if (a2.getChildCount() <= 0) {
            visibility = 8;
        }
        a2.setVisibility(visibility);
        this.c.e(ackm);
    }
}
