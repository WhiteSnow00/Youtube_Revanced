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

public final class jaw implements View$OnTouchListener
{
    public final List a;
    public Optional b;
    private Optional c;
    
    public jaw() {
        this.a = new ArrayList();
        this.b = Optional.empty();
        this.c = Optional.empty();
    }
    
    public final boolean onTouch(final View view, final MotionEvent motionEvent) {
        final boolean present = this.c.isPresent();
        tpx tpx = null;
        int n;
        if (present) {
            final boolean b = (n = ((((tpx)this.c.get()).h() && ((tpx)this.c.get()).d(view, motionEvent)) ? 1 : 0)) != 0;
            if (!b) {
                tpx = (tpx)this.c.get();
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
            final tpx tpx2 = (tpx)iterator.next();
            if (tpx2 == tpx) {
                continue;
            }
            final boolean b3 = (n = ((tpx2.h() && tpx2.d(view, motionEvent)) ? 1 : 0)) != 0;
            if (!b3) {
                continue;
            }
            this.c = Optional.of((Object)tpx2);
            final Iterator iterator2 = this.a.iterator();
            while (true) {
                b2 = b3;
                if (!iterator2.hasNext()) {
                    break Label_0240;
                }
                final tpx tpx3 = (tpx)iterator2.next();
                if (tpx3 == tpx2) {
                    continue;
                }
                tpx3.c();
            }
        }
        return b2;
    }
}
