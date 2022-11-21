import android.os.Bundle;
import android.view.LayoutInflater;
import android.app.Activity;
import android.content.ContextWrapper;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public class arnw implements arog
{
    private volatile Object a;
    private final Object b;
    private final br c;
    
    public arnw(final br c) {
        this.b = new Object();
        this.c = c;
    }
    
    public static final Context d(Context baseContext) {
        while (baseContext instanceof ContextWrapper && !(baseContext instanceof Activity)) {
            baseContext = ((ContextWrapper)baseContext).getBaseContext();
        }
        return baseContext;
    }
    
    public static ContextWrapper e(final Context context, final br br) {
        return new arnz(context, br);
    }
    
    public static ContextWrapper f(final LayoutInflater layoutInflater, final br br) {
        return new arnz(layoutInflater, br);
    }
    
    public static final void g(final br br) {
        areq.w(br);
        if (br.m == null) {
            br.ag(new Bundle());
        }
    }
    
    @Override
    public final Object aR() {
        if (this.a == null) {
            synchronized (this.b) {
                if (this.a == null) {
                    areq.x(this.c.mH(), "Sting Fragments must be attached before creating the component.");
                    final br c = this.c;
                    areq.v(c.mH() instanceof arog, "Sting Fragments must be attached to an @Sting Activity. Found: %s", c.mH().getClass());
                    this.c(this.c);
                    final eqg bg = ((arnv)aqvs.i(this.c.mH(), (Class)arnv.class)).bg();
                    arxu.o(bg.b = this.c, br.class);
                    this.a = new esu(bg.a, bg.c, bg.d, bg.b);
                }
            }
        }
        return this.a;
    }
    
    protected void c(final br br) {
    }
}
