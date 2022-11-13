import android.view.View$OnClickListener;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class htm
{
    YouTubeTextView c;
    acsy d;
    public final hto e;
    
    public htm(final hto e) {
        this.e = e;
    }
    
    protected abstract void a(final boolean p0);
    
    protected final void b(final boolean enabled) {
        final acsy d = this.d;
        if (d != null) {
            final ahbb ahbb = (ahbb)((ahbh)aicz.a).createBuilder();
            ((ahaz)ahbb).copyOnWrite();
            final aicz aicz = (aicz)ahbb.instance;
            aicz.d = 2;
            aicz.c = 1;
            ((ahaz)ahbb).copyOnWrite();
            final aicz aicz2 = (aicz)ahbb.instance;
            aicz2.b |= 0x40;
            aicz2.h = (enabled ^ true);
            ((acsx)d).b((aicz)((ahaz)ahbb).build(), (wyw)null);
            this.c.setFilterTouchesWhenObscured(true);
            this.c.setOnClickListener((View$OnClickListener)new hrb(this, 7));
            this.c.setEnabled(enabled);
        }
    }
}
