import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import android.view.View;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kfr implements acil
{
    public final aexq a;
    private final TextView b;
    private final TextView c;
    private final ImageView d;
    private final gkv e;
    private final gkv f;
    private final acio g;
    private final acng h;
    
    public kfr(final Context context, final acjc g, final acng h, final hmb hmb, final aexq a, final ViewGroup viewGroup, final byte[] array, final byte[] array2) {
        final View inflate = LayoutInflater.from(context).inflate(2131624671, viewGroup, false);
        this.b = (TextView)inflate.findViewById(2131429540);
        this.c = (TextView)inflate.findViewById(2131429542);
        this.d = (ImageView)inflate.findViewById(2131429541);
        this.e = hmb.b((TextView)inflate.findViewById(2131429512));
        this.f = hmb.b((TextView)inflate.findViewById(2131429135));
        this.g = (acio)g;
        this.h = h;
        this.a = a;
        g.c(inflate);
    }
    
    public final View a() {
        return ((acjc)this.g).a;
    }
    
    public final void c(final acir acir) {
    }
}
