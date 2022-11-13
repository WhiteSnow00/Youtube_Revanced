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

public final class jay extends nq
{
    public final jbh a;
    public final List e;
    public final jbj f;
    public final jau g;
    public final int h;
    public final int i;
    public abil j;
    public int k;
    public RecyclerView l;
    public int m;
    public boolean n;
    public final vai o;
    private final bu p;
    private final Resources q;
    private final jki r;
    
    public jay(final bu p9, final jki r, final ajb ajb, final jbh a, final vai o, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.r = r;
        this.p = p9;
        this.a = a;
        this.o = o;
        this.q = p9.getResources();
        this.f = ajb.m(2);
        this.g = new jau((Context)p9);
        this.h = p9.getResources().getDimensionPixelSize(2131166484);
        this.i = p9.getResources().getDimensionPixelSize(2131166482);
        this.e = new ArrayList();
        this.k = 0;
        this.m = -1;
    }
    
    public final int a() {
        return this.e.size();
    }
    
    final long b(final jax jax) {
        final int a = jax.a;
        final int b = jax.b;
        if (this.e.isEmpty()) {
            return 0L;
        }
        final long b2 = ((jav)agpc.V(this.e)).b;
        if (a >= this.e.size()) {
            return b2;
        }
        final jav jav = this.e.get(a);
        int n;
        if (jav.e == 2) {
            n = this.i;
        }
        else {
            n = this.h;
        }
        final double n2 = b;
        final long a2 = jav.a;
        final double n3 = (double)a2;
        final long b3 = jav.b;
        final double n4 = n;
        Double.isNaN(n2);
        Double.isNaN(n4);
        final double n5 = n2 / n4;
        final double n6 = (double)(b3 - a2);
        Double.isNaN(n6);
        Double.isNaN(n3);
        return aei.v((long)(n3 + n5 * n6), b2);
    }
    
    public final /* bridge */ on g(final ViewGroup viewGroup, final int n) {
        return (on)new acto(LayoutInflater.from(viewGroup.getContext()).inflate(2131624439, viewGroup, false), (byte[])null, (byte[])null);
    }
    
    public final void p(final RecyclerView l) {
        this.l = l;
    }
    
    public final /* bridge */ void q(final on on, int n) {
        final acto acto = (acto)on;
        teu.n((aun)this.p, this.r.b(this.j, this.k, n, (Bitmap)null), (ttg)ify.h, (ttg)new hui(acto, 19, null, null));
        if (n < this.e.size()) {
            acto.a.setOnTouchListener((View$OnTouchListener)new jaw(this, n));
            final jav jav = this.e.get(n);
            final View t = acto.t;
            final Object u = acto.u;
            final Resources q = this.q;
            long n2;
            if (jav == null) {
                n2 = 0L;
            }
            else {
                final long a = jav.a;
                final double n3 = (double)a;
                final double n4 = (double)(jav.b - a);
                Double.isNaN(n4);
                Double.isNaN(n3);
                n2 = (long)(n3 + n4 * 0.5);
            }
            ((ImageView)u).setContentDescription((CharSequence)q.getString(2132017410, new Object[] { tpe.ad(q, (CharSequence)jbd.a(n2)) }));
            if (jav.e == 2 && !aezr.f(jav.d)) {
                final String d = jav.d;
                final TextView textView = (TextView)t;
                textView.setText((CharSequence)d);
                textView.setVisibility(0);
                n = acto.a.getWidth();
                final int i = this.i;
                if (n != i) {
                    tpe.aF(acto.a, tpe.aD(i), (Class)ViewGroup$MarginLayoutParams.class);
                }
            }
            else {
                ((TextView)t).setVisibility(8);
                n = acto.a.getWidth();
                final int h = this.h;
                if (n != h) {
                    tpe.aF(acto.a, tpe.aD(h), (Class)ViewGroup$MarginLayoutParams.class);
                }
            }
        }
    }
    
    public final void x() {
        if (this.j != null) {
            if (this.e.isEmpty()) {
                final abil j = this.j;
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
                        this.e.add(new jav(n2, Math.min(i * e, f), this.h * n));
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
                final jav jav = this.e.get(n);
                final long a2 = jav.a;
                if (a >= a2 && a < jav.b) {
                    jav.e = 2;
                    jav.d = String.valueOf(timelineMarker.d);
                    this.mT(n);
                }
                else if (a >= a2) {
                    ++n;
                    continue;
                }
                ++n2;
            }
            final Iterator iterator = this.e.iterator();
            long c = 0L;
            while (iterator.hasNext()) {
                final jav jav2 = (jav)iterator.next();
                jav2.c = c;
                int n3;
                if (jav2.e == 2) {
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
