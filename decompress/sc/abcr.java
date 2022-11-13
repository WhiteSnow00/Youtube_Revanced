import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import android.view.ViewGroup$LayoutParams;
import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.View;
import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abcr extends abua implements View$OnClickListener, abcn
{
    public static final float[] a;
    public static final int[] b;
    public static final float[] c;
    public static final int[] d;
    public View A;
    public TextView B;
    public abcm C;
    public View D;
    public TextView E;
    public uhb F;
    public uhb G;
    public View e;
    public View f;
    public View g;
    public TextView h;
    public TextView i;
    public TextView j;
    public TextView k;
    public TextView l;
    public TextView m;
    public TextView n;
    public View o;
    public TextView p;
    public TextView q;
    public TextView r;
    public TextView s;
    public ImageView t;
    public TextView u;
    public ImageView v;
    public TextView w;
    public TextView x;
    public TextView y;
    public TextView z;
    
    static {
        a = new float[] { 0.0f, 1.31072E8f };
        b = new int[] { -1, -1 };
        c = new float[] { 0.0f, 15.0f, 30.0f, 60.0f, 90.0f, 120.0f };
        d = new int[] { -16777216, -151967, -1641064, -10042715, -13465411, -1 };
    }
    
    public abcr(final Context context) {
        super(context);
    }
    
    public static String e(String string) {
        if (aezr.f(string)) {
            string = "";
        }
        else {
            final StringBuilder sb = new StringBuilder(" [");
            sb.append(string);
            sb.append("]");
            string = sb.toString();
        }
        return string;
    }
    
    public final ViewGroup$LayoutParams a() {
        return new ViewGroup$LayoutParams(-1, -1);
    }
    
    public final void b(final FormatStreamModel formatStreamModel) {
        final TextView q = this.q;
        if (q != null) {
            q.setText((CharSequence)aakt.k(formatStreamModel));
        }
    }
    
    public final void c(final FormatStreamModel formatStreamModel) {
        final TextView n = this.n;
        if (n != null) {
            n.setText((CharSequence)aakt.k(formatStreamModel));
        }
    }
    
    public final void d(final zdj zdj) {
        this.w.setText((CharSequence)zdj.toString());
    }
    
    public final void onClick(final View view) {
        if (view == this.f) {
            this.C.e();
            this.F.f();
            this.G.f();
            return;
        }
        if (view == this.g) {
            this.C.td();
        }
    }
}
