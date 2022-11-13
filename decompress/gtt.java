import android.graphics.Bitmap;
import android.support.v7.widget.AppCompatImageView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.FrameLayout;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup;
import java.util.concurrent.atomic.AtomicReference;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gtt extends nq implements gts
{
    public long a;
    public long e;
    public int f;
    private final int g;
    private final gtn h;
    private final atke i;
    private int j;
    private long k;
    private asir l;
    private final asid m;
    
    public gtt(final Context context, final gtn h, final atke i, final atke atke) {
        this.h = h;
        this.g = gth.a(context);
        this.i = i;
        this.m = (asid)atke.a();
    }
    
    private final void y() {
        final asir l = this.l;
        if (l != null && !l.tA()) {
            asjv.b((AtomicReference)this.l);
        }
    }
    
    public final int a() {
        return this.f + 2;
    }
    
    public final int b() {
        return this.j * this.f;
    }
    
    public final int c() {
        final int j = this.j;
        final int a = this.a();
        final int g = this.g;
        return j * (a - 2) + (g + g);
    }
    
    public final int d(final int n) {
        if (n != 0 && n != this.a() - 1) {
            return 0;
        }
        return 1;
    }
    
    public final int e() {
        return this.j;
    }
    
    public final int f() {
        return this.g;
    }
    
    public final /* bridge */ on g(final ViewGroup viewGroup, final int n) {
        final int j = viewGroup.getWidth() / (int)Math.ceil(6.0);
        this.j = j;
        ViewGroup$LayoutParams layoutParams;
        if (n == 0) {
            layoutParams = new ViewGroup$LayoutParams(j, tpe.aZ(viewGroup.getResources().getDisplayMetrics(), 66));
        }
        else {
            layoutParams = new ViewGroup$LayoutParams(this.g, tpe.aZ(viewGroup.getResources().getDisplayMetrics(), 66));
        }
        final FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(layoutParams);
        return (on)new acto((View)frameLayout, this.i);
    }
    
    public final void i(final long a, final long e, final long k) {
        this.a = a;
        this.e = e;
        this.k = k;
        this.f = this.x();
    }
    
    public final void p(final RecyclerView recyclerView) {
        this.y();
        final gtn h = this.h;
        final jet jet = (jet)h.a.a();
        h.e();
        h.g = ((ashi)jet.p().e).P(h.e).an((asjm)new gsa(h, 7), (asjm)gpg.j);
        final asir l = this.l;
        if (l != null && !l.tA()) {
            return;
        }
        this.l = ((asht)this.h.b).af(this.m).aI((asjm)new gsa(this, 8), (asjm)gpg.k);
    }
    
    public final /* bridge */ void q(final on on, int f) {
        final acto acto = (acto)on;
        if (f == 0 || f == this.a() - 1) {
            ((AppCompatImageView)acto.t).setImageBitmap((Bitmap)null);
            ((AppCompatImageView)acto.t).setVisibility(4);
            ((gto)acto.u).setVisibility(4);
            return;
        }
        final int max = Math.max(f - 1, 0);
        final gtn h = this.h;
        f = this.f;
        long n;
        if (f == 0) {
            n = 0L;
        }
        else {
            n = this.a * max / f;
        }
        final long k = this.k;
        final Bitmap bitmap = (Bitmap)h.d.get((Object)max);
        Object o;
        if (bitmap != null && !bitmap.isRecycled()) {
            o = aezp.k((Object)bitmap);
        }
        else {
            h.a(max, n + k);
            o = aeyo.a;
        }
        if (((aezp)o).h() && !((Bitmap)((aezp)o).c()).isRecycled()) {
            ((AppCompatImageView)acto.t).setImageBitmap((Bitmap)((aezp)o).c());
            ((AppCompatImageView)acto.t).setVisibility(0);
            ((gto)acto.u).setVisibility(4);
            return;
        }
        ((AppCompatImageView)acto.t).setImageBitmap((Bitmap)null);
        ((AppCompatImageView)acto.t).setVisibility(4);
        ((gto)acto.u).setVisibility(0);
    }
    
    public final void u() {
        this.y();
        final gtn h = this.h;
        h.e();
        ((afdm)h.c).clear();
        h.d.evictAll();
        h.h.cancel(true);
    }
    
    public final int x() {
        return (int)(this.a / (float)this.e * 6.0f);
    }
}
