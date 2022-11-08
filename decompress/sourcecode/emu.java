import java.lang.reflect.InvocationTargetException;
import android.provider.Settings$SettingNotFoundException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class emu extends enu
{
    public emu(final emj emj, final agza agza, final int n) {
        super(emj, "9iQ5YMaDdmXd2AE0qa10oJyqmGZHX7XNUzgm4wdKztIQI9jbAXaOTiv6toK0AOKU", "rCh66yJZbGwhYsjh3a4o4nMI5ui67q2Fs4U69kJBF3k=", agza, n, 49);
    }
    
    protected final void a() {
        final agza g = this.g;
        g.copyOnWrite();
        final ehs ehs = (ehs)g.instance;
        final ehs a = ehs.a;
        int n = 2;
        ehs.K = 2;
        ehs.c |= 0x800;
        try {
            final boolean booleanValue = (boolean)this.d.invoke(null, this.a.a);
            final agza g2 = this.g;
            if (!booleanValue) {
                n = 1;
            }
            g2.copyOnWrite();
            final ehs ehs2 = (ehs)g2.instance;
            ehs2.K = n - 1;
            ehs2.c |= 0x800;
        }
        catch (final InvocationTargetException ex) {
            if (ex.getTargetException() instanceof Settings$SettingNotFoundException) {
                return;
            }
            throw ex;
        }
    }
}
