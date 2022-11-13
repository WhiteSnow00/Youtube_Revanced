import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import java.util.Iterator;
import android.view.ViewOutlineProvider;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.effects.GreenScreenMediaThumbnailContainer;
import android.view.LayoutInflater;
import com.google.common.util.concurrent.ListenableFuture;
import android.view.View$OnClickListener;
import android.widget.TextView;
import java.util.concurrent.Callable;
import com.google.android.libraries.youtube.edit.common.DeviceLocalFile;
import android.view.WindowManager;
import android.util.DisplayMetrics;
import java.util.concurrent.Executor;
import java.util.ArrayList;
import android.view.View;
import java.util.List;
import java.util.HashMap;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class har
{
    public final Context a;
    public final HorizontalScrollView b;
    final ViewGroup c;
    public final int d;
    final HashMap e;
    final HashMap f;
    public List g;
    public View h;
    final ArrayList i;
    eg j;
    public final pvh k;
    public final aeea l;
    private final Executor m;
    private final Executor n;
    
    public har(final Context a, final HorizontalScrollView b, final ViewGroup c, final Executor m, final Executor n, final aeea l, final pvh k, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6, final byte[] array7) {
        this.e = new HashMap();
        this.f = new HashMap();
        this.i = new ArrayList();
        this.a = a;
        this.b = b;
        this.c = c;
        this.m = m;
        this.n = n;
        final DisplayMetrics displayMetrics = new DisplayMetrics();
        final WindowManager windowManager = (WindowManager)a.getSystemService("window");
        if (windowManager != null) {
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        }
        this.d = displayMetrics.widthPixels;
        this.l = l;
        this.k = k;
    }
    
    public static void f(final Throwable t) {
        zlm.c(zll.a, zlk.f, "[ShortsCreation][Android][Camera]Failed to load green screen media thumbnail", t);
    }
    
    static final eg h(final View view) {
        return new eg(view);
    }
    
    final View a(final DeviceLocalFile deviceLocalFile) {
        final View b = this.b(2131624496);
        View view;
        if (b == null) {
            view = null;
        }
        else {
            final ListenableFuture o = afnd.o((Callable)new nke(deviceLocalFile, this.a.getResources().getDimensionPixelSize(2131166817), this.a.getContentResolver(), 1), this.m);
            if (deviceLocalFile.a() == 0) {
                final TextView textView = (TextView)b.findViewById(2131432306);
                final long b2 = deviceLocalFile.b();
                String a;
                if (b2 > usd.a) {
                    a = usd.a(deviceLocalFile.b());
                }
                else {
                    a = "0:00";
                }
                textView.setText((CharSequence)a);
                int visibility;
                if (b2 > 0L) {
                    visibility = 0;
                }
                else {
                    visibility = 8;
                }
                textView.setVisibility(visibility);
            }
            teu.k(o, this.n, (tes)gnn.f, (tet)new esc(b, 16));
            view = b;
        }
        if (view == null) {
            return null;
        }
        this.e.put(deviceLocalFile, h(view));
        view.setContentDescription((CharSequence)deviceLocalFile.h());
        if (deviceLocalFile.a() == 0 || deviceLocalFile.a() == 1 || deviceLocalFile.a() == 2) {
            view.setOnClickListener((View$OnClickListener)new gcd(this, deviceLocalFile, 11));
        }
        return view;
    }
    
    public final View b(final int n) {
        final LayoutInflater layoutInflater = (LayoutInflater)this.a.getSystemService("layout_inflater");
        if (layoutInflater == null) {
            return null;
        }
        final View inflate = layoutInflater.inflate(n, this.c, false);
        final GreenScreenMediaThumbnailContainer greenScreenMediaThumbnailContainer = (GreenScreenMediaThumbnailContainer)inflate.findViewById(2131429156);
        greenScreenMediaThumbnailContainer.setOutlineProvider((ViewOutlineProvider)new has(greenScreenMediaThumbnailContainer));
        greenScreenMediaThumbnailContainer.setClipToOutline(true);
        return inflate;
    }
    
    public final void c() {
        final eg j = this.j;
        if (j != null) {
            j.K();
        }
        final Iterator iterator = this.e.values().iterator();
        while (iterator.hasNext()) {
            ((eg)iterator.next()).K();
        }
    }
    
    public final void d() {
        final Iterator iterator = this.e.values().iterator();
        while (iterator.hasNext()) {
            final Object b = ((eg)iterator.next()).b;
            if (b != null) {
                ((gya)b).a();
            }
        }
    }
    
    public final void e(final DeviceLocalFile deviceLocalFile) {
        this.c();
        this.d();
        eg j;
        if (deviceLocalFile == null) {
            j = this.j;
        }
        else {
            j = this.e.get(deviceLocalFile);
        }
        eg eg = j;
        if (j == null) {
            eg = j;
            if (deviceLocalFile != null) {
                final View a = this.a(deviceLocalFile);
                if (a != null) {
                    final ViewGroup c = this.c;
                    c.addView(a, c.getChildCount() - this.i.size());
                }
                eg = this.e.get(deviceLocalFile);
            }
        }
        if (eg != null) {
            final Object c2 = eg.c;
            if (c2 != null) {
                ((View)c2).setVisibility(0);
            }
            if (eg != this.j) {
                this.g((View)eg.d);
            }
        }
    }
    
    public final void g(final View view) {
        if (view != null) {
            view.getViewTreeObserver().addOnGlobalLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)new haq(this, view, 0));
        }
    }
}
