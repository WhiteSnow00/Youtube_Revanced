import androidx.preference.Preference;
import com.google.android.libraries.youtube.player.features.prefetch.WillAutonavInformer;
import com.google.android.apps.youtube.app.settings.AutoplayPrefsFragment;

// 
// Decompiled by Procyon v0.6.0
// 

final class jmv implements cel
{
    final /* synthetic */ AutoplayPrefsFragment a;
    private final anxs b;
    private final WillAutonavInformer c;
    
    public jmv(final AutoplayPrefsFragment a, final anxs b, final WillAutonavInformer c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final boolean a(final Preference preference, final Object o) {
        final boolean booleanValue = (boolean)o;
        this.c.j(booleanValue);
        if (booleanValue) {
            final vax ah = this.a.ah;
            aioe aioe;
            if ((aioe = this.b.i) == null) {
                aioe = aioe.a;
            }
            ah.a(aioe);
        }
        else {
            final vax ah2 = this.a.ah;
            aioe aioe2;
            if ((aioe2 = this.b.j) == null) {
                aioe2 = aioe.a;
            }
            ah2.a(aioe2);
        }
        return true;
    }
}
