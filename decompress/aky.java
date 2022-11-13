import android.net.Uri;
import android.os.Bundle;
import android.content.ClipData;
import android.view.ContentInfo$Builder;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aky implements akz
{
    private final ContentInfo$Builder a;
    
    public aky(final ClipData clipData, final int n) {
        this.a = new ContentInfo$Builder(clipData, n);
    }
    
    public final ale a() {
        return new ale((alc)new alb(this.a.build()));
    }
    
    public final void b(final Bundle extras) {
        this.a.setExtras(extras);
    }
    
    public final void c(final int flags) {
        this.a.setFlags(flags);
    }
    
    public final void d(final Uri linkUri) {
        this.a.setLinkUri(linkUri);
    }
}
