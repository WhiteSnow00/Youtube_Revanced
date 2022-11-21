import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

class cjj extends ciz
{
    private static boolean a = true;
    
    public cjj() {
    }
    
    @Override
    public float b(final View view) {
        if (cjj.a) {
            try {
                return cji.a(view);
            }
            catch (final NoSuchMethodError noSuchMethodError) {
                cjj.a = false;
            }
        }
        return view.getAlpha();
    }
    
    @Override
    public void d(final View view, final float alpha) {
        if (cjj.a) {
            try {
                cji.b(view, alpha);
                return;
            }
            catch (final NoSuchMethodError noSuchMethodError) {
                cjj.a = false;
            }
        }
        view.setAlpha(alpha);
    }
}
