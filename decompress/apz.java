import android.database.Cursor;
import android.os.Handler;
import android.database.ContentObserver;

// 
// Decompiled by Procyon v0.6.0
// 

final class apz extends ContentObserver
{
    final aqb a;
    
    public apz(final aqb a) {
        this.a = a;
        super(new Handler());
    }
    
    public final boolean deliverSelfNotifications() {
        return true;
    }
    
    public final void onChange(final boolean b) {
        final aqb a = this.a;
        if (a.c) {
            final Cursor d = a.d;
            if (d != null && !d.isClosed()) {
                a.b = a.d.requery();
            }
        }
    }
}
