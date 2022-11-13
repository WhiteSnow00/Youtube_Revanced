import android.view.View;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import android.os.Build$VERSION;
import java.io.File;
import java.io.IOException;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.Bitmap;
import android.content.Context;
import java.util.concurrent.Executor;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.google.android.libraries.youtube.creation.common.ui.CreationButtonView;
import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gvw implements View$OnClickListener
{
    public final CreationButtonView a;
    public final ImageView b;
    final Drawable c;
    final Drawable d;
    public boolean e;
    public boolean f;
    public uby g;
    private final Executor h;
    private final Executor i;
    private final aeea j;
    
    public gvw(final Context context, final CreationButtonView a, final ImageView b, final Executor h, final Executor i, final aeea j, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6) {
        this.a = a;
        this.j = j;
        this.b = b;
        this.c = fc.b(context, 2131231457);
        this.d = fc.b(context, 2131231456);
        this.h = h;
        this.i = i;
    }
    
    private final void f(final Bitmap imageBitmap) {
        final BitmapDrawable bitmapDrawable = (BitmapDrawable)this.b.getDrawable();
        if (bitmapDrawable != null) {
            final Bitmap bitmap = bitmapDrawable.getBitmap();
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
        if (imageBitmap == null) {
            this.b.setImageDrawable((Drawable)null);
            return;
        }
        this.b.setImageBitmap(imageBitmap);
    }
    
    public final void a(final boolean e) {
        this.e = e;
        this.d();
    }
    
    public final void b(final Throwable t) {
        this.c(null);
        zlm.c(zll.a, zlk.f, "[ShortsCreation][Android][Camera]Failed to generate align overlay", t);
    }
    
    public final void c(final Bitmap f) {
        final uby g = this.g;
        if (g == null) {
            return;
        }
        g.f = f;
        synchronized (g.c) {
            if (g.V() && !g.d.isEmpty()) {
                final String h = ((arbk)agpc.V(g.d)).h;
                if (h.isEmpty()) {
                    monitorexit(g.c);
                }
                else {
                    final File v = g.v(h);
                    String canonicalPath;
                    try {
                        canonicalPath = v.getCanonicalPath();
                        try {
                            vdh.aB(g.f, v);
                            g.b.remove(canonicalPath);
                        }
                        catch (final IOException ex) {}
                    }
                    catch (final IOException ex) {
                        canonicalPath = null;
                    }
                    if (canonicalPath != null && g.b.add(canonicalPath)) {
                        final IOException ex;
                        ttr.f("ShortsProject", "IOException when saving align overlay image", (Throwable)ex);
                        zlm.c(zll.b, zlk.f, "[ShortsCreation][Android][ProjectState]IOException when saving align overlay image", (Throwable)ex);
                    }
                    monitorexit(g.c);
                }
            }
            else {
                monitorexit(g.c);
            }
            this.e(false);
        }
    }
    
    public final void d() {
        final ImageView b = this.b;
        final boolean e = this.e;
        int visibility = 8;
        if (e) {
            visibility = visibility;
            if (!this.f) {
                visibility = 0;
            }
        }
        b.setVisibility(visibility);
        if (this.e) {
            final Drawable c = this.c;
            if (c != null) {
                this.a.d(c);
            }
        }
        else {
            final Drawable d = this.d;
            if (d != null) {
                this.a.d(d);
            }
        }
    }
    
    public final void e(final boolean b) {
        tbi.f();
        final uby g = this.g;
        if (g == null) {
            return;
        }
        g.Z(b ^ true);
        final Bitmap f = g.f;
        final File u = this.g.u();
        if (f != null) {
            this.a.setVisibility(0);
            this.f(f);
            return;
        }
        if (b && u != null) {
            final String absolutePath = u.getAbsolutePath();
            final Executor h = this.h;
            ListenableFuture listenableFuture;
            if (Build$VERSION.SDK_INT >= 28) {
                listenableFuture = afwm.q((Callable)new gqw(absolutePath, 5), h);
            }
            else {
                listenableFuture = afwm.q((Callable)new gqw(absolutePath, 6), h);
            }
            teu.k(listenableFuture, this.i, (tes)new fcf(this, 13), (tet)new exe(this, absolutePath, 14));
            return;
        }
        this.a.setVisibility(8);
        this.f(null);
    }
    
    public final void onClick(final View view) {
        if (view == this.a) {
            this.j.cG(xaa.c(96649)).d();
            this.a(this.e ^ true);
        }
    }
}
