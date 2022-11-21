import java.util.concurrent.Executor;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adjl implements thh
{
    public final atnb a;
    public final atnb b;
    private final atnb c;
    private final atnb d;
    private final atnb e;
    private final Context f;
    
    public adjl(final atnb a, final atnb c, final atnb d, final atnb b, final atnb e, final Context f) {
        this.a = a;
        this.c = c;
        this.d = d;
        this.b = b;
        this.e = e;
        this.f = f;
    }
    
    public final boolean b() {
        aosy aosy;
        if ((aosy = ((vbo)this.c.a()).b().s) == null) {
            aosy = aosy.a;
        }
        return aosy.n;
    }
    
    public final /* bridge */ void lT(final Object o) {
        final vlc vlc = (vlc)o;
        if (!this.b()) {
            return;
        }
        String concat;
        if (((vbs)this.e.a()).f(45380763L)) {
            concat = "__internal.youtube_phenotype.".concat(String.valueOf(this.f.getPackageName()));
        }
        else {
            concat = "__internal.youtube_phenotype";
        }
        ((Executor)this.d.a()).execute((Runnable)new acdb(this, vlc, concat, 8));
    }
}
