import java.util.Iterator;
import com.google.android.libraries.youtube.player.features.overlay.timebar.TimelineMarker;
import android.view.View;
import android.view.ViewGroup$MarginLayoutParams;
import android.widget.TextView;
import android.widget.ImageView;
import android.view.View$OnTouchListener;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import java.util.ArrayList;
import android.content.Context;
import android.content.res.Resources;
import android.support.v7.widget.RecyclerView;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jaa extends nq
{
    public final jai a;
    public final List e;
    public final jak f;
    public final izw g;
    public final int h;
    public final int i;
    public abgr j;
    public int k;
    public RecyclerView l;
    public int m;
    public boolean n;
    private final bu o;
    private final Resources p;
    private final jjg q;
    
    public jaa(final bu o, final jjg q, final aja aja, final jai a, final byte[] array, final byte[] array2, final byte[] array3) {
        this.q = q;
        this.o = o;
        this.a = a;
        this.p = o.getResources();
        this.f = aja.m(2);
        this.g = new izw((Context)o);
        this.h = o.getResources().getDimensionPixelSize(2131166485);
        this.i = o.getResources().getDimensionPixelSize(2131166483);
        this.e = new ArrayList();
        this.k = 0;
        this.m = -1;
    }
    
    public final int a() {
        return this.e.size();
    }
    
    final long b(final izz izz) {
        final int a = izz.a;
        final int b = izz.b;
        if (this.e.isEmpty()) {
            return 0L;
        }
        final long b2 = ((izx)adwd.aK((Iterable)this.e)).b;
        if (a >= this.e.size()) {
            return b2;
        }
        final izx izx = this.e.get(a);
        int n;
        if (izx.e == 2) {
            n = this.i;
        }
        else {
            n = this.h;
        }
        final long a2 = izx.a;
        final double n2 = (double)a2;
        final double n3 = b;
        final double n4 = n;
        Double.isNaN(n3);
        Double.isNaN(n4);
        final double n5 = n3 / n4;
        final double n6 = (double)(izx.b - a2);
        Double.isNaN(n6);
        Double.isNaN(n2);
        return aeh.v((long)(n2 + n5 * n6), b2);
    }
    
    public final void p(final RecyclerView l) {
        this.l = l;
    }
    
    public final void x() {
        if (this.j != null) {
            if (this.e.isEmpty()) {
                final abgr j = this.j;
                this.e.clear();
                if (j != null) {
                    final long e = j.e();
                    final long f = j.f;
                    int i = 0;
                    while (i < j.c()) {
                        final long n = i;
                        final long n2 = n * e;
                        if (n2 >= f) {
                            break;
                        }
                        ++i;
                        this.e.add(new izx(n2, Math.min(i * e, f), this.h * n));
                    }
                }
                if (!this.e.isEmpty()) {
                    this.m(0, this.e.size());
                }
                this.n = true;
            }
        }
    }
    
    public final void y(final TimelineMarker[] array) {
        if (!this.e.isEmpty() && array != null && array.length > 0) {
            int n = 0;
            int n2 = 0;
            while (n < this.e.size() && n2 < array.length) {
                final TimelineMarker timelineMarker = array[n2];
                final long a = timelineMarker.a;
                final izx izx = this.e.get(n);
                final long a2 = izx.a;
                if (a >= a2 && a < izx.b) {
                    izx.e = 2;
                    izx.d = String.valueOf(timelineMarker.d);
                    ++n2;
                    this.tc(n);
                }
                else if (a < a2) {
                    ++n2;
                }
                else {
                    ++n;
                }
            }
            final Iterator iterator = this.e.iterator();
            long c = 0L;
            while (iterator.hasNext()) {
                final izx izx2 = (izx)iterator.next();
                izx2.c = c;
                int n3;
                if (izx2.e == 2) {
                    n3 = this.i;
                }
                else {
                    n3 = this.h;
                }
                c += n3;
            }
        }
    }
}
