import android.graphics.PorterDuff$Mode;
import android.widget.ImageView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kfn
{
    final /* synthetic */ kfo a;
    private final ImageView b;
    private final int c;
    private final int d;
    
    public kfn(final kfo a, final ImageView b, final int c, final int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final void a() {
        this.b.getDrawable().mutate().setColorFilter(this.a.f, PorterDuff$Mode.SRC_IN);
    }
    
    public final void b() {
        this.b.setImageResource(this.c);
        this.b.setTag((Object)"default");
        this.a();
    }
    
    public final void c() {
        this.b.setImageResource(this.d);
        this.b.setTag((Object)"on");
        this.a();
    }
}
