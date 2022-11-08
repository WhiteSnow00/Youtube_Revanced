import android.provider.Settings$System;
import android.database.ContentObserver;
import android.content.ContentResolver;

// 
// Decompiled by Procyon v0.6.0
// 

final class jrw implements fxn
{
    final /* synthetic */ ContentResolver a;
    final /* synthetic */ jrz b;
    
    public jrw(final jrz b, final ContentResolver a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void a() {
        this.a.unregisterContentObserver((ContentObserver)this.b);
    }
    
    @Override
    public final void c() {
        this.a.registerContentObserver(Settings$System.CONTENT_URI, true, (ContentObserver)this.b);
        this.b.d();
    }
}
