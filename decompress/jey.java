import com.google.android.apps.youtube.app.common.ui.playlist.PrivacySpinner;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

final class jey extends akw
{
    final uak a;
    
    public jey(final uak a, final byte[] array, final byte[] array2) {
        this.a = a;
    }
    
    public final void c(final View view, final aom aom) {
        super.c(view, aom);
        aom.o(true);
        final ajkc ajkc = (ajkc)view.getTag();
        aom.p(((PrivacySpinner)this.a.b).getSelectedItem().equals(view.getTag()));
        ahik ahik;
        if ((ahik = ajkc.i) == null) {
            ahik = ahik.a;
        }
        if ((ahik.b & 0x2) != 0x0) {
            ahik ahik2;
            if ((ahik2 = ajkc.i) == null) {
                ahik2 = ahik.a;
            }
            aom.u((CharSequence)ahik2.c);
        }
    }
}
