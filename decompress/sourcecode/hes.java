import android.net.Uri;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.view.View$OnClickListener;
import android.graphics.Bitmap;
import java.util.concurrent.Executor;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hes extends nq
{
    public final tzw a;
    public final afcr e;
    public int f;
    public final gxa g;
    public final qpt h;
    private final Context i;
    private final Executor j;
    private final avt k;
    
    public hes(final Context i, final tzw a, final Executor j, final avt k, final afcr e, final qpt h, final gxa g, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6, final byte[] array7) {
        this.f = 0;
        this.i = i;
        this.a = a;
        this.j = j;
        this.k = k;
        this.e = e;
        this.h = h;
        this.g = g;
    }
    
    public static final void b(final acrj acrj, final Bitmap imageBitmap, final boolean b, final View$OnClickListener onClickListener) {
        final int v = acrj.v;
        ((ImageView)acrj.t).setImageBitmap(imageBitmap);
        acrj.a.setOnClickListener(onClickListener);
        if (b) {
            ((ImageView)acrj.u).setVisibility(0);
            return;
        }
        ((ImageView)acrj.u).setVisibility(8);
    }
    
    public final int a() {
        return this.e.size();
    }
}
