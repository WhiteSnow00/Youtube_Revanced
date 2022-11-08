import java.util.Map;
import java.util.List;
import android.text.Spanned;
import android.content.res.Resources;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import android.view.View$OnClickListener;
import android.widget.ImageView;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.content.Context;
import android.view.ViewStub;
import android.widget.LinearLayout;
import android.view.View;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.libraries.youtube.common.ui.FixedAspectRatioRelativeLayout;
import com.google.android.libraries.youtube.common.ui.FixedAspectRatioFrameLayout;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jjx extends kcs
{
    private final FixedAspectRatioFrameLayout C;
    private final FixedAspectRatioRelativeLayout D;
    private final YouTubeTextView E;
    private final View F;
    private final LinearLayout G;
    private final ViewStub H;
    private final View I;
    public aioe a;
    public final vax b;
    public final fvj c;
    public final bx d;
    private final acih e;
    private final acng f;
    
    public jjx(final Context context, final aceo aceo, final vax b, final acng f, final hyc hyc, final bx d, final adcr adcr, final uyi uyi, final ViewGroup viewGroup, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        super(context, aceo, (acio)new acjc(), LayoutInflater.from(context).inflate(2131625780, viewGroup, false), b, f, null, null, null, uyi, null, null, null, null, null);
        final FixedAspectRatioFrameLayout c = (FixedAspectRatioFrameLayout)super.i;
        this.C = c;
        final FixedAspectRatioRelativeLayout d2 = (FixedAspectRatioRelativeLayout)c.findViewById(2131429235);
        this.D = d2;
        this.e = new acih(b, (View)d2);
        this.b = b;
        this.f = f;
        this.E = (YouTubeTextView)c.findViewById(2131430407);
        this.G = (LinearLayout)c.findViewById(2131429375);
        this.F = c.findViewById(2131429144);
        this.H = (ViewStub)c.findViewById(2131432424);
        final View viewById = c.findViewById(2131431138);
        this.I = viewById;
        this.c = hyc.o(viewById);
        this.d = d;
        if (adcr.d()) {
            adcr.c((View)d2, adcr.a((View)d2, (Drawable)null));
            return;
        }
        tmy.e((View)d2, tmy.j(context, 0));
    }
    
    private final void b(final View view, int visibility, final aorm aorm) {
        final ImageView imageView = (ImageView)view.findViewById(visibility);
        this.h.g(imageView, aorm);
        if (!actc.M(aorm)) {
            visibility = 8;
        }
        else {
            visibility = 0;
        }
        imageView.setVisibility(visibility);
    }
    
    public final View a() {
        return super.i;
    }
    
    @Override
    public final void c(final acir acir) {
        this.e.c();
        super.c(acir);
    }
}
