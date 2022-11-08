import com.google.android.libraries.youtube.edit.preview.UnifyTrimVideoControllerView;
import com.google.android.libraries.youtube.edit.preview.TrimVideoControllerView;
import com.google.android.libraries.youtube.creation.trim.ShortsVideoTrimView2;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class heo implements tvl
{
    public View a;
    public ShortsVideoTrimView2 b;
    boolean c;
    boolean d;
    TrimVideoControllerView e;
    UnifyTrimVideoControllerView f;
    private float g;
    
    private final void j() {
        final TrimVideoControllerView e = this.e;
        if (e != null) {
            e.g.setVisibility(0);
            ((rbi)this.e).j(false);
        }
        else {
            final UnifyTrimVideoControllerView f = this.f;
            if (f != null) {
                f.f.setVisibility(0);
                ((rbi)this.f).j(false);
            }
        }
        tmy.v((View)this.b, false);
        tmy.v(this.a, false);
    }
    
    public final float a() {
        if (this.c) {
            return 0.0f;
        }
        return this.g;
    }
    
    public final float b() {
        if (this.c) {
            return this.g;
        }
        return 0.0f;
    }
    
    public final View c() {
        return this.a;
    }
    
    public final void d() {
        if (!this.c) {
            this.j();
        }
    }
    
    public final void e() {
        if (this.c) {
            final TrimVideoControllerView e = this.e;
            if (e != null) {
                if (this.d) {
                    e.g.setVisibility(8);
                }
                ((rbi)this.e).j(true);
            }
            else {
                final UnifyTrimVideoControllerView f = this.f;
                if (f != null) {
                    if (this.d) {
                        f.f.setVisibility(8);
                    }
                    ((rbi)this.f).j(true);
                }
            }
            tmy.v((View)this.b, true);
            tmy.v(this.a, true);
        }
    }
    
    public final void f(final View view) {
        this.g(view, false);
    }
    
    public final void g(View a, final boolean b) {
        this.a = a.findViewById(2131431487);
        this.b = (ShortsVideoTrimView2)a.findViewById(2131431488);
        if (b) {
            this.f = (UnifyTrimVideoControllerView)a.findViewById(2131432224);
        }
        else {
            this.e = (TrimVideoControllerView)a.findViewById(2131432198);
        }
        a = this.a;
        if (a != null) {
            this.g = (float)a.getHeight();
        }
        this.j();
    }
    
    public final void h() {
        this.i(true);
    }
    
    public final void i(final boolean d) {
        this.d = d;
        this.c = true;
        uji.I((tvl)this);
    }
}
