import android.os.Handler;
import android.database.ContentObserver;

// 
// Decompiled by Procyon v0.6.0
// 

final class aedc extends ContentObserver
{
    public aedc() {
        super((Handler)null);
    }
    
    public final void onChange(final boolean b) {
        super.onChange(b);
        aedd.i();
    }
}
