import android.graphics.drawable.AnimationDrawable;
import android.util.AttributeSet;
import android.graphics.drawable.ClipDrawable;
import android.graphics.Shader;
import android.graphics.BitmapShader;
import android.graphics.Shader$TileMode;
import android.graphics.drawable.shapes.Shape;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.RectF;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ProgressBar;
import android.graphics.Bitmap;

// 
// Decompiled by Procyon v0.6.0
// 

public class kj
{
    private static final int[] b;
    public Bitmap a;
    private final ProgressBar c;
    
    static {
        b = new int[] { 16843067, 16843068 };
    }
    
    public kj(final ProgressBar c) {
        this.c = c;
    }
    
    final Drawable a(final Drawable drawable, final boolean b) {
        if (drawable instanceof aiy) {
            final aiy aiy = (aiy)drawable;
            final Drawable a = aiy.a();
            if (a != null) {
                this.a(a, b);
                aiy.b();
            }
        }
        else {
            if (drawable instanceof LayerDrawable) {
                final LayerDrawable layerDrawable = (LayerDrawable)drawable;
                final int numberOfLayers = layerDrawable.getNumberOfLayers();
                final Drawable[] array = new Drawable[numberOfLayers];
                final int n = 0;
                for (int i = 0; i < numberOfLayers; ++i) {
                    final int id = layerDrawable.getId(i);
                    array[i] = this.a(layerDrawable.getDrawable(i), id == 16908301 || id == 16908303);
                }
                final LayerDrawable layerDrawable2 = new LayerDrawable(array);
                for (int j = n; j < numberOfLayers; ++j) {
                    layerDrawable2.setId(j, layerDrawable.getId(j));
                    layerDrawable2.setLayerGravity(j, layerDrawable.getLayerGravity(j));
                    layerDrawable2.setLayerWidth(j, layerDrawable.getLayerWidth(j));
                    layerDrawable2.setLayerHeight(j, layerDrawable.getLayerHeight(j));
                    layerDrawable2.setLayerInsetLeft(j, layerDrawable.getLayerInsetLeft(j));
                    layerDrawable2.setLayerInsetRight(j, layerDrawable.getLayerInsetRight(j));
                    layerDrawable2.setLayerInsetTop(j, layerDrawable.getLayerInsetTop(j));
                    layerDrawable2.setLayerInsetBottom(j, layerDrawable.getLayerInsetBottom(j));
                    layerDrawable2.setLayerInsetStart(j, layerDrawable.getLayerInsetStart(j));
                    layerDrawable2.setLayerInsetEnd(j, layerDrawable.getLayerInsetEnd(j));
                }
                return (Drawable)layerDrawable2;
            }
            if (drawable instanceof BitmapDrawable) {
                final BitmapDrawable bitmapDrawable = (BitmapDrawable)drawable;
                final Bitmap bitmap = bitmapDrawable.getBitmap();
                if (this.a == null) {
                    this.a = bitmap;
                }
                final ShapeDrawable shapeDrawable = new ShapeDrawable((Shape)new RoundRectShape(new float[] { 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f }, (RectF)null, (float[])null));
                shapeDrawable.getPaint().setShader((Shader)new BitmapShader(bitmap, Shader$TileMode.REPEAT, Shader$TileMode.CLAMP));
                shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
                if (b) {
                    return (Drawable)new ClipDrawable((Drawable)shapeDrawable, 3, 1);
                }
                return (Drawable)shapeDrawable;
            }
        }
        return drawable;
    }
    
    public void b(final AttributeSet set, int i) {
        final cdo w = cdo.w(this.c.getContext(), set, kj.b, i, 0);
        final Drawable l = w.l(0);
        if (l != null) {
            final ProgressBar c = this.c;
            Object indeterminateDrawable = l;
            if (l instanceof AnimationDrawable) {
                final AnimationDrawable animationDrawable = (AnimationDrawable)l;
                final int numberOfFrames = animationDrawable.getNumberOfFrames();
                indeterminateDrawable = new AnimationDrawable();
                ((AnimationDrawable)indeterminateDrawable).setOneShot(animationDrawable.isOneShot());
                Drawable a;
                for (i = 0; i < numberOfFrames; ++i) {
                    a = this.a(animationDrawable.getFrame(i), true);
                    a.setLevel(10000);
                    ((AnimationDrawable)indeterminateDrawable).addFrame(a, animationDrawable.getDuration(i));
                }
                ((AnimationDrawable)indeterminateDrawable).setLevel(10000);
            }
            c.setIndeterminateDrawable((Drawable)indeterminateDrawable);
        }
        final Drawable j = w.l(1);
        if (j != null) {
            this.c.setProgressDrawable(this.a(j, false));
        }
        w.o();
    }
}
