import java.util.concurrent.Executor;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adhv implements tge
{
    public final atke a;
    public final atke b;
    private final atke c;
    private final atke d;
    private final atke e;
    private final Context f;
    
    public adhv(final atke a, final atke c, final atke d, final atke b, final atke e, final Context f) {
        this.a = a;
        this.c = c;
        this.d = d;
        this.b = b;
        this.e = e;
        this.f = f;
    }
    
    public final boolean b() {
        aoqn aoqn;
        if ((aoqn = ((vaf)this.c.a()).b().s) == null) {
            aoqn = aoqn.a;
        }
        return aoqn.n;
    }
    
    public final /* bridge */ void lT(final Object o) {
        final vju vju = (vju)o;
        if (!this.b()) {
            return;
        }
        String concat;
        if (((vai)this.e.a()).f(45380763L)) {
            concat = "__internal.youtube_phenotype.".concat(String.valueOf(this.f.getPackageName()));
        }
        else {
            concat = "__internal.youtube_phenotype";
        }
        ((Executor)this.d.a()).execute((Runnable)new acbp(this, vju, concat, 8));
    }
}
