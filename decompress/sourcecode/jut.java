import com.google.android.apps.youtube.app.common.ui.ScrollToTopLinearLayoutManager;
import android.support.v7.widget.RecyclerView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jut
{
    public static final String a;
    public RecyclerView b;
    public acik c;
    public String d;
    public juv e;
    private oa f;
    private ny g;
    
    static {
        a = String.valueOf(jut.class.getName()).concat(".PRESENT_CONTEXT_KEY");
    }
    
    public static jut c(final acij acij) {
        Object c;
        if (acij != null) {
            c = acij.c(jut.a);
        }
        else {
            c = null;
        }
        if (c instanceof jut) {
            return (jut)c;
        }
        return null;
    }
    
    public final ny a() {
        if (this.g == null) {
            this.g = (ny)new jus(this);
        }
        return this.g;
    }
    
    public final oa b() {
        if (this.f == null) {
            this.f = (oa)new jur(this);
        }
        return this.f;
    }
    
    public final void d() {
        ((ScrollToTopLinearLayoutManager)this.b.n).b = true;
    }
}
