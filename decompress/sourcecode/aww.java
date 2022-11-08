import android.os.Bundle;
import android.service.media.MediaBrowserService$Result;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

final class aww extends awu
{
    final /* synthetic */ awx b;
    
    public aww(final awx b, final Context context) {
        this.b = b;
        super((aws)b, context);
    }
    
    public final void onLoadChildren(final String s, final MediaBrowserService$Result mediaBrowserService$Result, final Bundle bundle) {
        eg.c(bundle);
        this.b.e.d((awy)new awv((Object)s, new bhu(mediaBrowserService$Result), bundle, (byte[])null, (byte[])null));
    }
}
