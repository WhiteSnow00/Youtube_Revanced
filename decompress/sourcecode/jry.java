import android.view.accessibility.CaptioningManager$CaptioningChangeListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class jry extends CaptioningManager$CaptioningChangeListener
{
    final /* synthetic */ jrz a;
    
    public jry(final jrz a) {
        this.a = a;
    }
    
    public final void onEnabledChanged(final boolean b) {
        super.onEnabledChanged(b);
        this.a.d();
    }
}
