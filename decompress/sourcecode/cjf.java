import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

class cjf extends ciu
{
    private static boolean a = true;
    
    public cjf() {
    }
    
    public float c(final View view) {
        if (cjf.a) {
            try {
                return cje.a(view);
            }
            catch (final NoSuchMethodError noSuchMethodError) {
                cjf.a = false;
            }
        }
        return view.getAlpha();
    }
    
    public void e(final View view, final float alpha) {
        if (cjf.a) {
            try {
                cje.b(view, alpha);
                return;
            }
            catch (final NoSuchMethodError noSuchMethodError) {
                cjf.a = false;
            }
        }
        view.setAlpha(alpha);
    }
}
