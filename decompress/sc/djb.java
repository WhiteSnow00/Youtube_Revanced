import android.os.Build$VERSION;
import android.net.Uri;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class djb implements dij
{
    private final Context a;
    private final dij b;
    private final dij c;
    private final Class d;
    
    public djb(final Context context, final dij b, final dij c, final Class d) {
        this.a = context.getApplicationContext();
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public final /* bridge */ boolean a(final Object o) {
        final Uri uri = (Uri)o;
        return Build$VERSION.SDK_INT >= 29 && ckm.b(uri);
    }
    
    @Override
    public final /* bridge */ aln b(final Object o, final int n, final int n2, final ddp ddp) {
        final Uri uri = (Uri)o;
        return new aln((ddk)new dos((Object)uri), (ddy)new dja(this.a, this.b, this.c, uri, n, n2, ddp, this.d));
    }
}
