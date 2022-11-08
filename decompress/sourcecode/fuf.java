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

public final class fuf extends acja
{
    public final View a;
    public final elw b;
    public final qpt c;
    private final aceo d;
    private final ImageView e;
    private final YouTubeTextView f;
    private final YouTubeTextView g;
    private final ImageView h;
    private final YouTubeTextView i;
    private final YouTubeTextView j;
    private final YouTubeButton k;
    private final acqt l;
    private final YouTubeButton m;
    private final acqt n;
    
    public fuf(final Context context, final auip auip, final aceo d, final elw b, final ViewGroup viewGroup, final qpt c, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6) {
        this.d = d;
        this.b = b;
        final View inflate = LayoutInflater.from(context).inflate(2131624365, viewGroup, false);
        this.a = inflate;
        this.e = (ImageView)inflate.findViewById(2131428721);
        this.f = (YouTubeTextView)inflate.findViewById(2131428723);
        this.g = (YouTubeTextView)inflate.findViewById(2131428716);
        this.h = (ImageView)inflate.findViewById(2131428719);
        this.i = (YouTubeTextView)inflate.findViewById(2131428718);
        this.j = (YouTubeTextView)inflate.findViewById(2131428717);
        final YouTubeButton k = (YouTubeButton)inflate.findViewById(2131428720);
        this.k = k;
        this.l = auip.H((View)k);
        final YouTubeButton m = (YouTubeButton)inflate.findViewById(2131428722);
        this.m = m;
        this.n = auip.H((View)m);
        this.c = c;
    }
    
    public final View a() {
        return this.a;
    }
    
    public final void c(final acir acir) {
    }
}
