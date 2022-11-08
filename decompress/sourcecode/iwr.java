import android.view.ViewGroup;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iwr extends aazp implements tec
{
    public boolean a;
    private final arud b;
    
    public iwr(final Context context, final arud b, final byte[] array, final byte[] array2) {
        super(context);
        this.a = false;
        this.b = b;
    }
    
    public final ViewGroup$LayoutParams a() {
        return new ViewGroup$LayoutParams(-1, -1);
    }
    
    public final View c(final Context context) {
        if (gkt.f(this.b.f())) {
            return View.inflate(context, 2131625016, (ViewGroup)null);
        }
        return View.inflate(context, 2131625014, (ViewGroup)null);
    }
    
    public final void e(final Context context, final View view) {
    }
    
    protected final aazs mj(final Context context) {
        final aazs mj = super.mj(context);
        mj.b();
        mj.a = 0;
        mj.a();
        mj.b = 0;
        return mj;
    }
    
    public final String mr() {
        return "player_overlay_pip_ad";
    }
    
    public final Class[] ms(final Class clazz, final Object o, final int n) {
        Class[] array;
        if (n != -1) {
            if (n != 0) {
                final StringBuilder sb = new StringBuilder("unsupported op code: ");
                sb.append(n);
                throw new IllegalStateException(sb.toString());
            }
            final boolean h = ((aaly)o).c().h();
            this.a = h;
            array = null;
            if (h) {
                this.mm();
            }
            else {
                this.mk();
            }
        }
        else {
            array = new Class[] { aaly.class };
        }
        return array;
    }
    
    public final boolean oU() {
        return this.a;
    }
}
