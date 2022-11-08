import android.support.v7.widget.LinearLayoutManager;
import android.content.Context;
import com.google.android.apps.youtube.app.ui.inline.SnappyLinearLayoutManager;

// 
// Decompiled by Procyon v0.6.0
// 

final class kdf extends SnappyLinearLayoutManager
{
    final /* synthetic */ kdk a;
    
    public kdf(final kdk a, final Context context) {
        this.a = a;
        super(context);
    }
    
    @Override
    protected final oj c() {
        Object o;
        if (tmy.bq(this.a.a)) {
            o = new kdj(this.a.a, (LinearLayoutManager)this);
        }
        else {
            o = new kdi(this.a.a, (LinearLayoutManager)this);
        }
        return (oj)o;
    }
}
