import android.app.Activity;
import java.util.Map;
import android.os.Bundle;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jew implements vcv
{
    public final tqd a;
    private final bu b;
    private final zmf c;
    private final zmt d;
    
    public jew(final bu b, final zmf c, final zmt d, final tqd a) {
        this.b = b;
        this.c = c;
        this.d = d;
        this.a = a;
    }
    
    public final void b(final aiqj aiqj) {
        final Bundle bundle = new Bundle();
        bundle.putByteArray("navigation_endpoint", ((agzk)aiqj).toByteArray());
        final jfr jfr = new jfr();
        jfr.ag(bundle);
        final ct i = this.b.getSupportFragmentManager().i();
        i.s((br)jfr, "SuggestedPlaylistVideosFragment");
        i.d();
    }
    
    public final void mE(final aiqj aiqj, final Map map) {
        if (this.c.t()) {
            this.b(aiqj);
            return;
        }
        this.d.b((Activity)this.b, (byte[])null, (zmr)new gmy(this, aiqj, 4));
    }
}
