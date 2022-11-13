import java.lang.reflect.InvocationTargetException;
import android.provider.Settings$SettingNotFoundException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class emv extends env
{
    public emv(final emk emk, final ahaz ahaz, final int n) {
        super(emk, "9iQ5YMaDdmXd2AE0qa10oJyqmGZHX7XNUzgm4wdKztIQI9jbAXaOTiv6toK0AOKU", "rCh66yJZbGwhYsjh3a4o4nMI5ui67q2Fs4U69kJBF3k=", ahaz, n, 49);
    }
    
    protected final void a() {
        final ahaz g = this.g;
        g.copyOnWrite();
        final eht eht = (eht)g.instance;
        final eht a = eht.a;
        int n = 2;
        eht.K = 2;
        eht.c |= 0x800;
        try {
            final boolean booleanValue = (boolean)this.d.invoke(null, this.a.a);
            final ahaz g2 = this.g;
            if (!booleanValue) {
                n = 1;
            }
            g2.copyOnWrite();
            final eht eht2 = (eht)g2.instance;
            eht2.K = n - 1;
            eht2.c |= 0x800;
        }
        catch (final InvocationTargetException ex) {
            if (ex.getTargetException() instanceof Settings$SettingNotFoundException) {
                return;
            }
            throw ex;
        }
    }
}
