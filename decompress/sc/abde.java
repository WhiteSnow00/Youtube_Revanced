import android.view.View$MeasureSpec;
import com.google.android.libraries.youtube.player.subtitles.model.SubtitleWindowSettings;
import android.content.res.Configuration;
import android.view.View;
import android.text.TextUtils;
import com.google.android.libraries.youtube.player.subtitles.model.SubtitleWindowSnapshot;
import java.util.HashSet;
import java.util.List;
import android.view.ViewGroup$LayoutParams;
import android.util.DisplayMetrics;
import android.graphics.Typeface;
import java.util.Iterator;
import com.google.android.libraries.youtube.player.subtitles.ui.SubtitleWindowView;
import android.content.Context;
import com.google.android.libraries.youtube.player.subtitles.model.SubtitlesStyle;
import android.util.SparseArray;

// 
// Decompiled by Procyon v0.6.0
// 

public class abde extends abub implements abdb
{
    private final SparseArray a;
    private final SparseArray b;
    private float c;
    private float d;
    private int e;
    private int f;
    private SubtitlesStyle g;
    
    public abde(final Context context) {
        super(context);
        this.e = 0;
        this.f = 0;
        this.a = new SparseArray();
        this.b = new SparseArray();
        this.c = 1.0f;
        this.d = (float)context.getResources().getDimensionPixelSize(2131167901);
        final int n = aakt.V()[2];
        if (n == 0) {
            throw null;
        }
        final int n2 = aakt.V()[0];
        if (n2 == 0) {
            throw null;
        }
        final int n3 = aakt.V()[2];
        if (n3 == 0) {
            throw null;
        }
        final int n4 = (new int[] { 1, 2, 3, 4, 5 })[0];
        if (n4 == 0) {
            throw null;
        }
        final int n5 = aakt.V()[1];
        if (n5 != 0) {
            this.g = new SubtitlesStyle(n - 16777217, n2 - 16777217, n3 - 16777217, n4 - 1, n5 - 16777217, abtu.values()[3].i);
            this.f();
            return;
        }
        throw null;
    }
    
    private final void j(final SubtitleWindowView subtitleWindowView) {
        final float d = this.d;
        if (Math.abs(subtitleWindowView.d - d) >= 0.01f) {
            subtitleWindowView.d = d;
            subtitleWindowView.b.f(d);
            final Iterator iterator = subtitleWindowView.a.iterator();
            while (iterator.hasNext()) {
                ((abtq)iterator.next()).f(d);
            }
        }
        final int a = this.g.a;
        if (subtitleWindowView.h != a) {
            subtitleWindowView.h = a;
            final Iterator iterator2 = subtitleWindowView.a.iterator();
            while (iterator2.hasNext()) {
                ((abtq)iterator2.next()).setBackgroundColor(a);
            }
            subtitleWindowView.invalidate();
        }
        subtitleWindowView.setBackgroundColor(this.g.b);
        final int e = this.g.e;
        if (subtitleWindowView.c != e) {
            subtitleWindowView.c = e;
            final Iterator iterator3 = subtitleWindowView.a.iterator();
            while (iterator3.hasNext()) {
                ((abtq)iterator3.next()).e(e);
            }
            subtitleWindowView.invalidate();
        }
        final Typeface a2 = abtu.a(this.getContext(), this.g);
        if (!adkp.ae((Object)subtitleWindowView.e, (Object)a2)) {
            subtitleWindowView.e = a2;
            subtitleWindowView.b.g(a2);
            final Iterator iterator4 = subtitleWindowView.a.iterator();
            while (iterator4.hasNext()) {
                ((abtq)iterator4.next()).g(a2);
            }
            subtitleWindowView.invalidate();
            subtitleWindowView.requestLayout();
        }
        final int c = this.g.c;
        if (subtitleWindowView.f != c) {
            subtitleWindowView.f = c;
            final Iterator iterator5 = subtitleWindowView.a.iterator();
            while (iterator5.hasNext()) {
                ((abtq)iterator5.next()).b(c);
            }
            subtitleWindowView.invalidate();
        }
        final int dimensionPixelSize = this.getResources().getDimensionPixelSize(2131169865);
        subtitleWindowView.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        final int d2 = this.g.d;
        if (subtitleWindowView.g == d2) {
            return;
        }
        subtitleWindowView.g = d2;
        subtitleWindowView.b.c(d2);
        final Iterator iterator6 = subtitleWindowView.a.iterator();
        while (iterator6.hasNext()) {
            ((abtq)iterator6.next()).c(d2);
        }
        subtitleWindowView.invalidate();
        subtitleWindowView.requestLayout();
    }
    
    private final void k(int i, final int n) {
        final Context context = this.getContext();
        final float c = this.c;
        final DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        final int min = Math.min(i, n);
        float n2;
        float n3;
        if (i < n) {
            n2 = min / displayMetrics.scaledDensity;
            n3 = 0.055555556f;
        }
        else {
            n2 = min / displayMetrics.scaledDensity;
            n3 = 0.0625f;
        }
        float n4;
        if ((n4 = n2 * n3) < 13.0f) {
            n4 = 13.0f;
        }
        this.d = n4 * c;
        for (i = 0; i < this.b.size(); ++i) {
            this.j((SubtitleWindowView)this.b.valueAt(i));
        }
    }
    
    public ViewGroup$LayoutParams a() {
        return new ViewGroup$LayoutParams(-1, -1);
    }
    
    public void c(final List list) {
        final HashSet set = new HashSet();
        for (int i = 0; i < this.a.size(); ++i) {
            set.add(this.a.keyAt(i));
        }
        for (int j = 0; j < list.size(); ++j) {
            final SubtitleWindowSnapshot subtitleWindowSnapshot = list.get(j);
            set.remove(subtitleWindowSnapshot.a);
            final SubtitleWindowView subtitleWindowView = (SubtitleWindowView)this.b.get(subtitleWindowSnapshot.a);
            if (!TextUtils.isEmpty(subtitleWindowSnapshot.d) && subtitleWindowSnapshot.c.e) {
                this.a.put(subtitleWindowSnapshot.a, (Object)subtitleWindowSnapshot);
                if (subtitleWindowView == null) {
                    final CharSequence d = subtitleWindowSnapshot.d;
                    final SubtitleWindowView subtitleWindowView2 = new SubtitleWindowView(this.getContext());
                    this.j(subtitleWindowView2);
                    subtitleWindowView2.setTag((Object)d);
                    subtitleWindowView2.a(subtitleWindowSnapshot);
                    this.addView((View)subtitleWindowView2);
                    this.b.put(subtitleWindowSnapshot.a, (Object)subtitleWindowView2);
                }
                else {
                    if (!subtitleWindowSnapshot.d.equals(subtitleWindowView.getTag())) {
                        subtitleWindowView.setTag((Object)subtitleWindowSnapshot.d);
                        subtitleWindowView.a(subtitleWindowSnapshot);
                    }
                    subtitleWindowView.setVisibility(0);
                }
            }
            else if (subtitleWindowView != null) {
                subtitleWindowView.setVisibility(8);
            }
        }
        for (final int intValue : set) {
            this.removeView((View)this.b.get(intValue));
            this.a.remove(intValue);
            this.b.remove(intValue);
        }
        this.setVisibility(0);
    }
    
    public final void e() {
        this.removeAllViews();
        this.a.clear();
        this.b.clear();
    }
    
    public final void f() {
        this.setVisibility(4);
    }
    
    public final void g(final float c) {
        this.c = c;
        this.k(this.getWidth(), this.getHeight());
    }
    
    public final void h(final int e, final int f) {
        this.e = e;
        this.f = f;
    }
    
    public final void i(final SubtitlesStyle g) {
        this.g = g;
        this.k(this.getWidth(), this.getHeight());
    }
    
    protected final void onConfigurationChanged(final Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.requestLayout();
    }
    
    protected final void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        for (int i = 0; i < this.a.size(); ++i) {
            final SubtitleWindowView subtitleWindowView = (SubtitleWindowView)this.b.get(this.a.keyAt(i));
            if (subtitleWindowView.getVisibility() == 0) {
                final int n5 = n4 - n2;
                final int n6 = n3 - n;
                final SubtitleWindowSnapshot subtitleWindowSnapshot = (SubtitleWindowSnapshot)this.a.valueAt(i);
                final int measuredWidth = subtitleWindowView.getMeasuredWidth();
                final int measuredHeight = subtitleWindowView.getMeasuredHeight();
                final SubtitleWindowSettings c = subtitleWindowSnapshot.c;
                final int b2 = c.b;
                final int n7 = n6 * 85 / 100;
                final int c2 = c.c;
                final int n8 = n5 * 85 / 100;
                final int d = c.d;
                int n10 = 0;
                Label_0200: {
                    if (!c.f) {
                        final int n9 = n10 = n7 * c2 / 100;
                        if ((b2 & 0x1) != 0x0) {
                            break Label_0200;
                        }
                        if ((b2 & 0x2) != 0x0) {
                            n10 = n9 - measuredWidth / 2;
                            break Label_0200;
                        }
                        if ((b2 & 0x4) != 0x0) {
                            n10 = n9 - measuredWidth;
                            break Label_0200;
                        }
                    }
                    n10 = 0;
                }
                int n11 = n8 * d / 100;
                if ((b2 & 0x8) == 0x0) {
                    if ((b2 & 0x10) != 0x0) {
                        n11 -= measuredHeight / 2;
                    }
                    else if ((b2 & 0x20) != 0x0) {
                        n11 -= measuredHeight;
                    }
                    else {
                        n11 = 0;
                    }
                }
                final int n12 = n5 * 15 / 100;
                final int n13 = n10 + n6 * 15 / 100 / 2;
                final int n14 = n11 + n12 / 2;
                subtitleWindowView.layout(n13, n14, measuredWidth + n13, measuredHeight + n14);
            }
        }
    }
    
    protected final void onMeasure(int n, int n2) {
        final int size = View$MeasureSpec.getSize(n);
        final int size2 = View$MeasureSpec.getSize(n2);
        this.setMeasuredDimension(size, size2);
        this.k(size, size2);
        for (int i = 0; i < this.a.size(); ++i) {
            final SubtitleWindowView subtitleWindowView = (SubtitleWindowView)this.b.get(this.a.keyAt(i));
            if (subtitleWindowView.getVisibility() == 0) {
                final SubtitleWindowSettings c = ((SubtitleWindowSnapshot)this.a.valueAt(i)).c;
                final int b = c.b;
                n = c.c;
                final int d = c.d;
                n = n * size / 100;
                Label_0187: {
                    if ((b & 0x1) != 0x0) {
                        n = size - n;
                        n2 = this.f;
                    }
                    else if ((b & 0x2) != 0x0) {
                        n = Math.min(n, size - n);
                        n = n + n - this.e;
                        n2 = this.f;
                    }
                    else {
                        if ((b & 0x4) == 0x0) {
                            n2 = 0;
                            break Label_0187;
                        }
                        n2 = this.e;
                    }
                    n2 = n - n2;
                }
                n = d * size2 / 100;
                if ((b & 0x8) != 0x0) {
                    n = size2 - n;
                }
                else if ((b & 0x10) != 0x0) {
                    n = Math.min(n, size2 - n);
                    n += n;
                }
                else if ((b & 0x20) == 0x0) {
                    n = 0;
                }
                subtitleWindowView.measure(View$MeasureSpec.makeMeasureSpec(n2, 0), View$MeasureSpec.makeMeasureSpec(n, 0));
            }
        }
    }
}
