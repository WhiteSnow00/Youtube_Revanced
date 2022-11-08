import java.util.Iterator;
import android.graphics.Rect;
import java.util.Map;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kwv implements uvz
{
    public final Context a;
    public final Map b;
    public int c;
    public Rect d;
    private final asgt e;
    private final asgt f;
    
    public kwv(final Context a, final kwe kwe, final Map b) {
        this.a = a;
        this.b = b;
        this.e = kwe.a.Y((asjc)new kpm(this, 11)).j((asgx)kwc.e);
        this.f = kwe.a.Y((asjc)new kpm(this, 12)).j((asgx)kwc.e);
        this.d = new Rect();
    }
    
    public final int a() {
        return this.c;
    }
    
    public final Rect b() {
        return this.d;
    }
    
    public final asgt c() {
        return this.f;
    }
    
    public final asgt d() {
        return this.f.L((asjc)new kpm(this, 13));
    }
    
    public final asgt e() {
        return this.e;
    }
    
    public final void f() {
        final Iterator<Object> iterator = ((afcw)this.b).e().iterator();
        while (iterator.hasNext()) {
            iterator.next().f();
        }
        this.e.al((asix)new kwb(this, 17));
        this.f.al((asix)new kwb(this, 18));
    }
}
