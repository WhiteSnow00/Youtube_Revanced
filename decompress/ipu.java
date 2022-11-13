import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ipu implements iqw
{
    private final atke a;
    private final atke b;
    
    public ipu(final atke a, final atke b) {
        a.getClass();
        this.a = a;
        b.getClass();
        this.b = b;
    }
    
    @Override
    public final /* bridge */ iqx a(final aezp aezp) {
        return this.b(aezp);
    }
    
    public final ipx b(final aezp aezp) {
        final Context context = (Context)this.a.a();
        context.getClass();
        final heo heo = (heo)this.b.a();
        heo.getClass();
        return new ipx(context, heo, aezp, 1, null, null);
    }
}
