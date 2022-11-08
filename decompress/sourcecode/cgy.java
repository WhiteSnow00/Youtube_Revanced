import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cgy implements cgp
{
    public final Context a;
    public final String b;
    public final cgm c;
    public final boolean d;
    public final boolean e;
    public final atjm f;
    public boolean g;
    private final atjm h;
    
    public cgy(final Context a, final String b, final cgm c, final boolean d, final boolean e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        final atjm f = atqc.f((atma)new cfw(this, 2));
        this.f = f;
        this.h = f;
    }
    
    public final cgl a() {
        return this.b().b();
    }
    
    public final cgx b() {
        return (cgx)this.h.a();
    }
    
    public final void close() {
        if (this.f.b()) {
            this.b().close();
        }
    }
}
