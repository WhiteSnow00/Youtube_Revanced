import android.os.Bundle;
import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aenu extends arin
{
    private aenu(final br br) {
        super(br);
    }
    
    public static aenu a(final br br) {
        return new aenu(br);
    }
    
    public static final void b(final br br, final MessageLite messageLite) {
        arin.g(br);
        final Bundle m = br.m;
        messageLite.getClass();
        aeda.av(m, "TIKTOK_FRAGMENT_ARGUMENT", messageLite);
    }
    
    protected final void c(final br br) {
        final bu od = br.od();
        br.getClass().getSimpleName();
        od.getClass();
        agot.J(br.od() instanceof aenm, "TikTok Fragment, %s cannot be attached to a non-TikTok Activity, %s", (Object)br.getClass().getSimpleName(), (Object)br.od().getClass().getSimpleName());
    }
}
