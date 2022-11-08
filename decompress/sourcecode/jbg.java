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

public final class jbg implements fqb
{
    public final wwv a;
    public final atje b;
    public final ashe c;
    public aja d;
    public final qpt e;
    private final Context f;
    private final ashe g;
    
    public jbg(final Context f, final wwv a, final qpt e, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        this.f = f;
        this.a = a;
        this.e = e;
        final atje ax = ((atje)atir.e()).aX();
        this.b = ax;
        final ashe af = ((ashe)ax).ak((asjc)iqc.r).z().af();
        this.g = af;
        this.c = ashe.U((Object)false).u((ashh)af.W((asjc)iqc.s)).z().af();
    }
    
    public final ViewGroup$LayoutParams a() {
        return (ViewGroup$LayoutParams)new FrameLayout$LayoutParams(-1, -1);
    }
    
    public final jbh e(final Spanned spanned, final Spanned spanned2, final agyc agyc) {
        final jbh jbh = new jbh(spanned, spanned2, (jbc)jbb.a, (wxz)new wws(agyc));
        this.b.tr((Object)jbh);
        return jbh;
    }
    
    @Override
    public final void j(final fkk fkk) {
    }
    
    public final View md() {
        if (this.d == null) {
            final View inflate = LayoutInflater.from(this.f).inflate(2131625028, (ViewGroup)null);
            this.d = new aja(inflate, (YouTubeTextView)inflate.findViewById(2131430453), (YouTubeTextView)inflate.findViewById(2131430452));
            ((ashe)this.b).aB((asix)new jbf(this, 0));
            this.g.aB((asix)new jbf(this, 2));
        }
        return ((tmt)this.d.b).a;
    }
    
    public final String mr() {
        return "player_overlay_markers_message";
    }
    
    @Override
    public final boolean ow(final fkk fkk) {
        return fkk.k();
    }
}
