import java.util.Iterator;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import com.google.protos.youtube.api.innertube.SubscribeButtonRendererOuterClass;
import com.google.protos.youtube.api.innertube.MetadataBadgeRendererOuterClass;
import android.graphics.drawable.Drawable;
import android.view.ViewStub;
import android.content.Context;
import android.view.LayoutInflater;
import android.app.Activity;
import android.widget.TextView;
import android.widget.ImageView;
import android.view.ViewGroup;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kna extends acja
{
    private final aceo a;
    private final fvf b;
    private final View c;
    private final ViewGroup d;
    private final ImageView e;
    private final ImageView f;
    private final TextView g;
    private final TextView h;
    private final TextView i;
    private final TextView j;
    private final TextView k;
    private final TextView l;
    private final fzy m;
    private fve n;
    private acqt o;
    private final auip p;
    
    public kna(final Activity activity, final aceo a, final cxz cxz, final fvf b, final auip p9, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.a = a;
        this.b = b;
        this.p = p9;
        final View inflate = LayoutInflater.from((Context)activity).inflate(2131624600, (ViewGroup)null);
        this.c = inflate;
        this.d = (ViewGroup)inflate.findViewById(2131428096);
        this.e = (ImageView)inflate.findViewById(2131427781);
        this.f = (ImageView)inflate.findViewById(2131427894);
        this.g = (TextView)inflate.findViewById(2131428153);
        this.h = (TextView)inflate.findViewById(2131427706);
        this.i = (TextView)inflate.findViewById(2131428624);
        this.j = (TextView)inflate.findViewById(2131429861);
        this.k = (TextView)inflate.findViewById(2131431807);
        this.l = (TextView)inflate.findViewById(2131431810);
        this.m = cxz.D((Context)activity, (ViewStub)inflate.findViewById(2131429862));
    }
    
    private final void f() {
        this.f.setBackground((Drawable)null);
        this.e.setBackground((Drawable)null);
        this.g.setText((CharSequence)null);
        this.h.setText((CharSequence)null);
        final TextView i = this.i;
        if (i != null) {
            i.setText((CharSequence)null);
        }
        final TextView j = this.j;
        if (j != null) {
            j.setText((CharSequence)null);
        }
    }
    
    public final View a() {
        return this.c;
    }
    
    public final void c(final acir acir) {
        this.f();
        final fve n = this.n;
        if (n != null) {
            n.f();
            this.n = null;
        }
        this.o = null;
    }
}
