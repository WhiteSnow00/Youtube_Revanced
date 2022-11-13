import android.view.ViewGroup;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ixo extends abbk implements tgg
{
    public boolean a;
    private final arwh b;
    
    public ixo(final Context context, final arwh b, final byte[] array, final byte[] array2) {
        super(context);
        this.a = false;
        this.b = b;
    }
    
    public final ViewGroup$LayoutParams a() {
        return new ViewGroup$LayoutParams(-1, -1);
    }
    
    public final View c(final Context context) {
        if (fbu.G(this.b.f())) {
            return View.inflate(context, 2131625017, (ViewGroup)null);
        }
        return View.inflate(context, 2131625015, (ViewGroup)null);
    }
    
    public final void e(final Context context, final View view) {
    }
    
    @Override
    protected final abbn mj(final Context context) {
        final abbn mj = super.mj(context);
        mj.b();
        mj.a = 0;
        mj.a();
        mj.b = 0;
        return mj;
    }
    
    @Override
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
            final boolean h = ((aans)o).c().h();
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
            array = new Class[] { aans.class };
        }
        return array;
    }
    
    public final boolean oV() {
        return this.a;
    }
}
