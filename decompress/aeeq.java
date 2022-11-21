import java.util.Iterator;
import android.os.IBinder$DeathRecipient;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aeeq implements IBinder$DeathRecipient
{
    public final aeex a;
    
    public aeeq(final aeex a) {
        this.a = a;
    }
    
    public final void binderDied() {
        final aeex a = this.a;
        final aeet aeet = (aeet)a.h.get();
        if (aeet != null) {
            aeet.a();
        }
        else {
            final Iterator iterator = a.b.iterator();
            while (iterator.hasNext()) {
                ((aeeo)iterator.next()).b((Exception)a.a());
            }
            a.b.clear();
        }
        a.b();
    }
}
