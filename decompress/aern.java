import android.os.Bundle;
import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aern extends arnw
{
    private aern(final br br) {
        super(br);
    }
    
    public static aern a(final br br) {
        return new aern(br);
    }
    
    public static final void b(final br br, final MessageLite messageLite) {
        arnw.g(br);
        final Bundle m = br.m;
        messageLite.getClass();
        adzw.aE(m, "TIKTOK_FRAGMENT_ARGUMENT", messageLite);
    }
    
    @Override
    protected final void c(final br br) {
        final Class<? extends br> class1 = br.getClass();
        final bu oa = br.oa();
        class1.getSimpleName();
        oa.getClass();
        adme.Z(br.oa() instanceof aerf, "TikTok Fragment, %s cannot be attached to a non-TikTok Activity, %s", br.getClass().getSimpleName(), br.oa().getClass().getSimpleName());
    }
}
