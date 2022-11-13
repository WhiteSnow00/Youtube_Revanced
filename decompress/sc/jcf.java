import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.view.View;
import android.text.Spanned;
import android.widget.FrameLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jcf implements fqk
{
    public final wyw a;
    public final atjz b;
    public final asht c;
    public ajb d;
    public final pvh e;
    private final Context f;
    private final asht g;
    
    public jcf(final Context f, final wyw a, final pvh e, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        this.f = f;
        this.a = a;
        this.e = e;
        final atjz bc = ((atjz)atjm.e()).bc();
        this.b = bc;
        final asht al = ((asht)bc).aq((asjr)iqm.t).A().al();
        this.g = al;
        this.c = asht.X((Object)false).v((ashw)al.Z((asjr)iqm.u)).A().al();
    }
    
    public final ViewGroup$LayoutParams a() {
        return (ViewGroup$LayoutParams)new FrameLayout$LayoutParams(-1, -1);
    }
    
    public final jcg e(final Spanned spanned, final Spanned spanned2, final ahab ahab) {
        final jcg jcg = new jcg(spanned, spanned2, jca.a, (wzz)new wyt(ahab));
        this.b.tu((Object)jcg);
        return jcg;
    }
    
    public final void k(final fkr fkr) {
    }
    
    public final View md() {
        if (this.d == null) {
            final View inflate = LayoutInflater.from(this.f).inflate(2131625029, (ViewGroup)null);
            this.d = new ajb(inflate, (YouTubeTextView)inflate.findViewById(2131430454), (YouTubeTextView)inflate.findViewById(2131430453));
            ((asht)this.b).aH((asjm)new jce(this, 1));
            this.g.aH((asjm)new jce(this, 0));
        }
        return ((toz)this.d.b).a;
    }
    
    public final String mr() {
        return "player_overlay_markers_message";
    }
    
    public final boolean ow(final fkr fkr) {
        return fkr.k();
    }
}
