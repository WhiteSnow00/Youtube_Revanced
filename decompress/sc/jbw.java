import java.util.Iterator;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import j$.util.Optional;
import java.util.List;
import android.view.View$OnTouchListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jbw implements View$OnTouchListener
{
    public final List a;
    public Optional b;
    private Optional c;
    
    public jbw() {
        this.a = new ArrayList();
        this.b = Optional.empty();
        this.c = Optional.empty();
    }
    
    public final boolean onTouch(final View view, final MotionEvent motionEvent) {
        final boolean present = this.c.isPresent();
        tsc tsc = null;
        int n;
        if (present) {
            final boolean b = (n = ((((tsc)this.c.get()).h() && ((tsc)this.c.get()).d(view, motionEvent)) ? 1 : 0)) != 0;
            if (!b) {
                tsc = (tsc)this.c.get();
                this.c = Optional.empty();
                n = (b ? 1 : 0);
            }
        }
        else {
            n = 0;
        }
        final Iterator iterator = this.a.iterator();
        boolean b2 = false;
    Label_0240:
        while (true) {
            b2 = (n != 0);
            if (n != 0) {
                break;
            }
            b2 = (n != 0);
            if (!iterator.hasNext()) {
                break;
            }
            final tsc tsc2 = (tsc)iterator.next();
            if (tsc2 == tsc) {
                continue;
            }
            final boolean b3 = (n = ((tsc2.h() && tsc2.d(view, motionEvent)) ? 1 : 0)) != 0;
            if (!b3) {
                continue;
            }
            this.c = Optional.of((Object)tsc2);
            final Iterator iterator2 = this.a.iterator();
            while (true) {
                b2 = b3;
                if (!iterator2.hasNext()) {
                    break Label_0240;
                }
                final tsc tsc3 = (tsc)iterator2.next();
                if (tsc3 == tsc2) {
                    continue;
                }
                tsc3.c();
            }
        }
        return b2;
    }
}
