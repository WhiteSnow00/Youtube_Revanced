import android.support.v7.widget.RecyclerView;
import android.widget.TextView;
import android.view.View;
import android.graphics.Bitmap;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hiy implements his, tvl
{
    public final Context a;
    public final hix b;
    public Bitmap c;
    public hiv d;
    public hir e;
    public View f;
    public TextView g;
    public RecyclerView h;
    public boolean i;
    public float j;
    
    public hiy(final Context a, final hix b) {
        this.a = a;
        this.b = b;
    }
    
    public final float a() {
        if (this.i) {
            return this.j;
        }
        return 0.0f;
    }
    
    public final float b() {
        if (this.i) {
            return 0.0f;
        }
        return this.j;
    }
    
    public final View c() {
        return this.f;
    }
    
    public final void d() {
    }
    
    public final void e() {
    }
    
    public final void f() {
        uji.I((tvl)this);
        this.i ^= true;
    }
}
