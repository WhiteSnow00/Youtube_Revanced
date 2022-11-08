import android.view.View;
import com.google.android.libraries.youtube.player.subtitles.model.SubtitlesStyle;
import java.util.List;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jbq extends abry implements abbh, abfu
{
    public final abbi a;
    public final Context b;
    public final ashe c;
    public final abft d;
    public final atjj e;
    public FrameLayout f;
    public final mrm g;
    
    public jbq(final Context b, final jcu jcu, final arud arud, final abft d, final atjj e, final mrm g, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        super(b);
        this.b = b;
        this.a = new abbi(b);
        this.d = d;
        this.e = e;
        this.g = g;
        this.c = ashe.m((ashh)arud.h(), (ashh)jcu.b().ai(), (asit)iun.h);
    }
    
    public final ViewGroup$LayoutParams a() {
        return new ViewGroup$LayoutParams(-1, -1);
    }
    
    public final void b(int visibility, final int n, final int n2) {
        if (n == 2) {
            visibility = 8;
        }
        else {
            visibility = 0;
        }
        this.setVisibility(visibility);
    }
    
    public final void c(final List list) {
        this.a.c(list);
    }
    
    public final void d(final float n, final boolean b) {
    }
    
    public final void e() {
        this.a.e();
    }
    
    public final void f() {
        this.a.f();
    }
    
    public final void g(final float n) {
        this.a.g(n);
    }
    
    public final void h(final int n, final int n2) {
        this.a.h(n, 0);
    }
    
    public final void i(final SubtitlesStyle subtitlesStyle) {
        this.a.i(subtitlesStyle);
    }
    
    public final View md() {
        return (View)this;
    }
    
    public final String mr() {
        return "player_overlay_caption";
    }
}
