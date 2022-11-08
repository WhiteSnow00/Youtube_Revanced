import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsOverlayStyle;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kyk extends fpb implements abnq
{
    public final abns j;
    public final asib k;
    
    public kyk(final Context context, final abns j, final asgt asgt, final jai jai, final fpg fpg) {
        super(context, fpg, (fps)new fpj(), asgt, jai, adbp.p(context));
        this.j = j;
        this.k = new asib();
        ((fon)this).i(ControlsOverlayStyle.a);
        fpg.u(0);
        fpg.s(true);
    }
    
    public final void i(final ControlsOverlayStyle controlsOverlayStyle) {
        super.i(controlsOverlayStyle);
        final abby b = this.b;
        b.p = false;
        b.n = false;
        b.o = false;
        b.r = false;
        b.u = false;
        b.f = 17170445;
        this.a.mg((abcb)b);
    }
    
    public final asic[] lX(final abns abns) {
        return new asic[] { ((asgt)abns.q().f).am((asix)new kxr(this, 14), (asix)kul.n) };
    }
}
