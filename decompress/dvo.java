import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dvo
{
    final int a;
    boolean b;
    String c;
    
    public dvo(final Object o) {
        int a;
        if (o instanceof View) {
            final View view = (View)o;
            int clickable;
            final boolean b = (clickable = (view.isClickable() ? 1 : 0)) != 0;
            if (view.isLongClickable()) {
                clickable = ((b ? 1 : 0) | 0x2);
            }
            int n = clickable;
            if (view.isFocusable()) {
                n = (clickable | 0x4);
            }
            int n2 = n;
            if (view.isEnabled()) {
                n2 = (n | 0x8);
            }
            int n3 = n2;
            if (view.isSelected()) {
                n3 = (n2 | 0x10);
            }
            final int layerType = view.getLayerType();
            a = n3;
            if (layerType != 0) {
                if (layerType != 1) {
                    if (layerType != 2) {
                        throw new IllegalArgumentException("Unhandled layer type encountered.");
                    }
                    a = (n3 | 0x40);
                }
                else {
                    a = (n3 | 0x20);
                }
            }
        }
        else {
            a = 0;
        }
        this.a = a;
    }
    
    static dvo a(final ega ega) {
        final Object e = ega.e;
        if (e instanceof dvo) {
            return (dvo)e;
        }
        throw new RuntimeException("MountData should not be null when using Litho's MountState.");
    }
}
