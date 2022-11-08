import com.google.protos.youtube.api.innertube.HintRendererOuterClass;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kfa implements acil
{
    public final View a;
    public final kez b;
    public RecyclerView c;
    private final acts d;
    
    public kfa(final Context context, final acts d) {
        this.d = d;
        this.b = new kez(this);
        (this.a = new View(context)).setMinimumHeight(1);
    }
    
    public final View a() {
        return this.a;
    }
    
    public final void c(final acir acir) {
        final RecyclerView c = this.c;
        if (c != null) {
            c.post((Runnable)new jnu(this, 13));
        }
    }
}
