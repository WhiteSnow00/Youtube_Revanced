import com.google.protos.youtube.api.innertube.SortFilterSubMenuRendererOuterClass;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.TextView;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kgq extends acja
{
    private final View a;
    private final TextView b;
    private final ViewGroup c;
    private final fuw d;
    private fuv e;
    
    public kgq(final Context context, final fuw d) {
        this.d = d;
        final View inflate = View.inflate(context, 2131625460, (ViewGroup)null);
        this.a = inflate;
        this.b = (TextView)inflate.findViewById(2131432092);
        this.c = (ViewGroup)inflate.findViewById(2131431605);
    }
    
    public final View a() {
        return this.a;
    }
    
    public final void c(final acir acir) {
        this.c.removeAllViews();
        final fuv e = this.e;
        if (e != null) {
            e.c(acir);
        }
    }
}
