import android.widget.ListView;
import android.content.Context;
import androidx.mediarouter.app.OverlayListView;
import java.util.List;
import android.widget.ImageView;
import java.util.Map;
import android.graphics.Canvas;
import android.graphics.Bitmap;
import android.graphics.Bitmap$Config;
import java.util.HashMap;
import java.util.Collection;
import java.util.HashSet;
import android.graphics.Rect;
import android.widget.ImageView$ScaleType;
import android.graphics.drawable.BitmapDrawable;
import android.view.View$MeasureSpec;
import android.view.View;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class cbj implements ViewTreeObserver$OnGlobalLayoutListener
{
    final boolean a;
    final cbr b;
    
    public cbj(final cbr b, final boolean a) {
        this.b = b;
        this.a = a;
    }
    
    public final void onGlobalLayout() {
        this.b.h.getViewTreeObserver().removeGlobalOnLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)this);
        final cbr b = this.b;
        if (b.N) {
            b.O = true;
            return;
        }
        final boolean a = this.a;
        final int h = cbr.h((View)b.k);
        cbr.oy((View)b.k, -1);
        b.t(b.u());
        final View decorView = b.getWindow().getDecorView();
        decorView.measure(View$MeasureSpec.makeMeasureSpec(b.getWindow().getAttributes().width, 1073741824), 0);
        cbr.oy((View)b.k, h);
        int g = 0;
        Label_0214: {
            if (b.e == null && b.i.getDrawable() instanceof BitmapDrawable) {
                final Bitmap bitmap = ((BitmapDrawable)b.i.getDrawable()).getBitmap();
                if (bitmap != null) {
                    g = b.g(bitmap.getWidth(), bitmap.getHeight());
                    final ImageView i = b.i;
                    ImageView$ScaleType scaleType;
                    if (bitmap.getWidth() >= bitmap.getHeight()) {
                        scaleType = ImageView$ScaleType.FIT_XY;
                    }
                    else {
                        scaleType = ImageView$ScaleType.FIT_CENTER;
                    }
                    i.setScaleType(scaleType);
                    break Label_0214;
                }
            }
            g = 0;
        }
        final int j = b.i(b.u());
        final int size = b.p.size();
        int n;
        if (b.w()) {
            n = b.x * b.c.d().size();
        }
        else {
            n = 0;
        }
        int n2 = n;
        if (size > 0) {
            n2 = n + b.z;
        }
        int min = Math.min(n2, b.y);
        if (!b.M) {
            min = 0;
        }
        int n3 = Math.max(g, min) + j;
        final Rect rect = new Rect();
        decorView.getWindowVisibleDisplayFrame(rect);
        final int n4 = rect.height() - (b.g.getMeasuredHeight() - b.h.getMeasuredHeight());
        if (b.e == null && g > 0 && n3 <= n4) {
            b.i.setVisibility(0);
            cbr.oy((View)b.i, g);
        }
        else {
            if (cbr.h((View)b.n) + b.k.getMeasuredHeight() >= b.h.getMeasuredHeight()) {
                b.i.setVisibility(8);
            }
            n3 = min + j;
            g = 0;
        }
        if (b.u() && n3 <= n4) {
            b.l.setVisibility(0);
        }
        else {
            b.l.setVisibility(8);
        }
        b.t(b.l.getVisibility() == 0);
        final int k = b.i(b.l.getVisibility() == 0);
        int n5 = Math.max(g, min) + k;
        if (n5 > n4) {
            min -= n5 - n4;
            n5 = n4;
        }
        b.k.clearAnimation();
        b.n.clearAnimation();
        b.h.clearAnimation();
        if (a) {
            b.j((View)b.k, k);
            b.j((View)b.n, min);
            b.j((View)b.h, n5);
        }
        else {
            cbr.oy((View)b.k, k);
            cbr.oy((View)b.n, min);
            cbr.oy((View)b.h, n5);
        }
        cbr.oy((View)b.f, rect.height());
        final List d = b.c.d();
        if (d.isEmpty()) {
            b.p.clear();
            b.o.notifyDataSetChanged();
            return;
        }
        if (new HashSet(b.p).equals(new HashSet(d))) {
            b.o.notifyDataSetChanged();
            return;
        }
        Map<Object, Rect> map;
        if (a) {
            final OverlayListView n6 = b.n;
            final cbq o = b.o;
            final HashMap<Object, Rect> hashMap = new HashMap<Object, Rect>();
            final int firstVisiblePosition = ((ListView)n6).getFirstVisiblePosition();
            int n7 = 0;
            while (true) {
                map = hashMap;
                if (n7 >= ((ListView)n6).getChildCount()) {
                    break;
                }
                final Object item = o.getItem(firstVisiblePosition + n7);
                final View child = ((ListView)n6).getChildAt(n7);
                hashMap.put(item, new Rect(child.getLeft(), child.getTop(), child.getRight(), child.getBottom()));
                ++n7;
            }
        }
        else {
            map = null;
        }
        Map<Object, BitmapDrawable> map2;
        if (a) {
            final Context d2 = b.d;
            final OverlayListView n8 = b.n;
            final cbq o2 = b.o;
            final HashMap<Object, BitmapDrawable> hashMap2 = new HashMap<Object, BitmapDrawable>();
            final int firstVisiblePosition2 = ((ListView)n8).getFirstVisiblePosition();
            int n9 = 0;
            while (true) {
                map2 = hashMap2;
                if (n9 >= ((ListView)n8).getChildCount()) {
                    break;
                }
                final Object item2 = o2.getItem(firstVisiblePosition2 + n9);
                final View child2 = ((ListView)n8).getChildAt(n9);
                final Bitmap bitmap2 = Bitmap.createBitmap(child2.getWidth(), child2.getHeight(), Bitmap$Config.ARGB_8888);
                child2.draw(new Canvas(bitmap2));
                hashMap2.put(item2, new BitmapDrawable(d2.getResources(), bitmap2));
                ++n9;
            }
        }
        else {
            map2 = null;
        }
        final List p = b.p;
        final HashSet q = new HashSet(d);
        q.removeAll(p);
        b.q = q;
        final HashSet r = new HashSet(b.p);
        r.removeAll(d);
        b.r = r;
        b.p.addAll(0, b.q);
        b.p.removeAll(b.r);
        b.o.notifyDataSetChanged();
        if (a && b.M && b.q.size() + b.r.size() > 0) {
            b.n.setEnabled(false);
            b.n.requestLayout();
            b.N = true;
            b.n.getViewTreeObserver().addOnGlobalLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)new hbs(b, (Map)map, (Map)map2, 1));
            return;
        }
        b.q = null;
        b.r = null;
    }
}
