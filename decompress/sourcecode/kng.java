import java.util.Map;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicLong;
import android.view.View;
import android.widget.FrameLayout;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kng implements acil
{
    private static final afcw a;
    private static final afcw b;
    private final Context c;
    private final FrameLayout d;
    private final boolean e;
    private View f;
    private final uyi g;
    private final uyi h;
    private final bx i;
    
    static {
        a = afcw.q((Object)anwn.b, (Object)2131625733, (Object)anwn.d, (Object)2131625738, (Object)anwn.c, (Object)2131625722, (Object)anwn.e, (Object)2131625705, (Object)anwn.f, (Object)2131625715);
        b = afcw.q((Object)anwn.b, (Object)2131624029, (Object)anwn.d, (Object)2131624030, (Object)anwn.c, (Object)2131624028, (Object)anwn.e, (Object)2131624026, (Object)anwn.f, (Object)2131624027);
    }
    
    public kng(final Context c, final arud arud, final uyi h, final bx i, final uyi g, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.d = new FrameLayout(c);
        this.c = c;
        alvs alvs;
        if ((alvs = arud.f().e) == null) {
            alvs = alvs.a;
        }
        this.e = alvs.aA;
        this.i = i;
        this.g = g;
        this.h = h;
    }
    
    private final long b(final ashe ashe) {
        synchronized (this) {
            final AtomicLong atomicLong = new AtomicLong();
            asjg.b((AtomicReference)ashe.aB((asix)new kca(atomicLong, 10)));
            return atomicLong.get();
        }
    }
    
    public final View a() {
        return (View)this.d;
    }
    
    public final void c(final acir acir) {
        if (this.e) {
            bx.N(this.f);
        }
    }
}
