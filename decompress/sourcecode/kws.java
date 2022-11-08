import android.graphics.Rect;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kws implements uvz
{
    public kwr a;
    public final Context b;
    public final atie c;
    public Rect d;
    public boolean e;
    
    public kws(final Context b) {
        this.b = b;
        (this.c = ((atie)atid.aD()).aK()).tr((Object)new Rect(0, 0, 0, 0));
        this.d = new Rect();
    }
    
    public final int a() {
        if (this.e) {
            return this.d.bottom;
        }
        return 0;
    }
    
    public final Rect b() {
        return this.d;
    }
    
    public final asgt c() {
        return (asgt)this.c;
    }
    
    public final asgt d() {
        return ((asgt)this.c).L((asjc)new kpm(this, 8));
    }
    
    public final asgt e() {
        return this.a.b().Y((asjc)new kpm(this, 9));
    }
    
    public final void f() {
        ((asgt)this.c).al((asix)new kwb(this, 11));
        this.a.b().al((asix)new kwb(this, 12));
    }
}
