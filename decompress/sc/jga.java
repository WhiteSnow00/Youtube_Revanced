import android.support.v7.widget.AppCompatImageView;
import com.google.android.apps.youtube.app.common.ui.cinematics.CinematicImageView;
import android.graphics.drawable.ShapeDrawable$ShaderFactory;
import android.graphics.drawable.PaintDrawable;
import java.util.List;
import android.graphics.drawable.Drawable;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.widget.ImageView;
import com.google.protos.youtube.api.innertube.CinematicContainerRendererOuterClass$CinematicContainerRenderer;

// 
// Decompiled by Procyon v0.6.0
// 

final class jga extends acfy
{
    final CinematicContainerRendererOuterClass$CinematicContainerRenderer a;
    final boolean b;
    final jgb c;
    
    public jga(final jgb c, final CinematicContainerRendererOuterClass$CinematicContainerRenderer a, final boolean b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public final void a(final ImageView imageView) {
        this.c.d();
    }
    
    public final void b(final ImageView imageView) {
        final CinematicImageView i = this.c.I;
        final Drawable drawable = i.getDrawable();
        aiky aiky;
        if ((aiky = this.a.f) == null) {
            aiky = aiky.a;
        }
        final boolean j = aiky.i;
        aiky aiky2;
        if ((aiky2 = this.a.f) == null) {
            aiky2 = aiky.a;
        }
        final float f = aiky2.f;
        Bitmap bitmap2;
        final Bitmap bitmap = bitmap2 = ((BitmapDrawable)drawable).getBitmap();
        if (bitmap.getByteCount() >= 10485760) {
            final double n = bitmap.getByteCount();
            Double.isNaN(n);
            final double sqrt = Math.sqrt(1.048576E7 / n);
            final double n2 = bitmap.getWidth();
            Double.isNaN(n2);
            final double n3 = bitmap.getHeight();
            Double.isNaN(n3);
            bitmap2 = Bitmap.createScaledBitmap(bitmap, (int)(n2 * sqrt), (int)(n3 * sqrt), false);
        }
        Bitmap bitmap3;
        if (j) {
            final Bitmap b = tpe.B(i.getContext(), Bitmap.createScaledBitmap(bitmap2, bitmap2.getWidth() / 5, bitmap2.getHeight() / 5, false), (Bitmap)null);
            bitmap3 = Bitmap.createScaledBitmap(b, (int)(b.getWidth() * 5 * f), (int)(b.getHeight() * 5 * f), false);
        }
        else {
            bitmap3 = Bitmap.createScaledBitmap(bitmap2, (int)(bitmap2.getWidth() * f), (int)(bitmap2.getHeight() * f), false);
        }
        ((AppCompatImageView)i).setImageDrawable((Drawable)new BitmapDrawable(i.getContext().getResources(), bitmap3));
        final CinematicImageView k = this.c.J;
        final List l = gcu.k((List)this.a.d, this.b);
        final eg eg = new eg((char[])null);
        final int size = l.size();
        final int[] array = new int[size];
        final float[] array2 = new float[size];
        for (int n4 = 0; n4 < size; ++n4) {
            final gcs gcs = l.get(n4);
            array[n4] = gcs.b;
            array2[n4] = gcs.a;
        }
        ((PaintDrawable)eg.c).setShaderFactory((ShapeDrawable$ShaderFactory)new gct(array, array2));
        ((AppCompatImageView)k).setBackgroundDrawable((Drawable)eg.c);
        final CinematicImageView m = this.c.I;
        final CinematicContainerRendererOuterClass$CinematicContainerRenderer a = this.a;
        int backgroundColor;
        if (this.b) {
            aiky aiky3;
            if ((aiky3 = a.f) == null) {
                aiky3 = aiky.a;
            }
            backgroundColor = aiky3.c;
        }
        else {
            aiky aiky4;
            if ((aiky4 = a.f) == null) {
                aiky4 = aiky.a;
            }
            backgroundColor = aiky4.d;
        }
        m.setBackgroundColor(backgroundColor);
        final jgb c = this.c;
        c.H.setVisibility(0);
        c.Q = true;
        c.g();
    }
}
