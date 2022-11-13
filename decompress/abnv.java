import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import java.util.Map;
import android.net.Uri;
import android.content.Context;
import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;

// 
// Decompiled by Procyon v0.6.0
// 

final class abnv extends yng
{
    private final abny b;
    private final FormatStreamModel c;
    
    public abnv(final ynm ynm, final abny b, final FormatStreamModel c) {
        super(ynm);
        this.b = b;
        this.c = c;
    }
    
    public final void j(final Context context, final Uri uri, final Map map, final PlayerConfigModel playerConfigModel) {
        Uri g = uri;
        if (!tpe.cP(uri)) {
            final abny b = this.b;
            final FormatStreamModel c = this.c;
            final String b2 = c.b;
            final int e = c.e();
            final String w = this.c.w();
            final long j = this.c.j();
            final long k = this.c.k();
            final int a = abnw.a;
            final ateg a2 = b.a("/exocache", b2, e, w, j, k);
            a2.h("s", uri.toString());
            g = a2.g();
        }
        super.a.j(context, g, map, playerConfigModel);
    }
}
