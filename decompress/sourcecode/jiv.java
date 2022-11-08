import android.view.ViewGroup$LayoutParams;
import com.google.protos.youtube.api.innertube.VideoCardRendererOuterClass;
import android.view.ViewGroup$MarginLayoutParams;
import com.google.protos.youtube.api.innertube.RefinementChipRendererOuterClass;
import com.google.protos.youtube.api.innertube.RichListHeaderRendererOuterClass;
import android.view.View;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.app.Activity;
import java.util.ArrayList;
import android.widget.LinearLayout;
import androidx.cardview.widget.CardView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jiv extends acja
{
    private final CardView a;
    private final LinearLayout b;
    private final LinearLayout c;
    private final atjj d;
    private final jjn e;
    private final int f;
    private final int g;
    private acil h;
    private final ArrayList i;
    private final jiy j;
    
    public jiv(final Activity activity, final jiy j, final atjj d, final jjn e, final ViewGroup viewGroup) {
        this.i = new ArrayList();
        final LayoutInflater from = LayoutInflater.from((Context)activity);
        from.getClass();
        this.j = j;
        this.d = d;
        this.e = e;
        this.f = activity.getResources().getDimensionPixelSize(2131168622);
        this.g = activity.getResources().getDimensionPixelSize(2131168621);
        final CardView a = (CardView)from.inflate(2131625094, viewGroup, false);
        this.a = a;
        this.b = (LinearLayout)a.findViewById(2131428016);
        this.c = (LinearLayout)a.findViewById(2131430587);
    }
    
    private final void f(final View view) {
        view.setId(2131429196);
        final View viewById = this.b.findViewById(2131429196);
        if (viewById != null) {
            this.b.removeView(viewById);
        }
        this.b.addView(view, 0);
    }
    
    public final View a() {
        return (View)this.a;
    }
    
    public final void c(final acir acir) {
        final acil h = this.h;
        if (h != null) {
            h.c(acir);
        }
        final ArrayList i = this.i;
        for (int size = i.size(), j = 0; j < size; ++j) {
            ((acil)i.get(j)).c(acir);
        }
    }
}
