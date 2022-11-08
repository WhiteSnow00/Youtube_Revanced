import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class enk extends enu
{
    public enk(final emj emj, final agza agza, final int n) {
        super(emj, "q25n2/TPNEnWjiB7Eq/br1pf7I1+Pbd8JO4E5S/WFXDtJZ2FMIzDcDIeNK1YwkMp", "JTvnHx65Egq/4novhqSS3bMw+oihCNz02Yz4pG4S+kE=", agza, n, 73);
    }
    
    protected final void a() {
        try {
            final Method d = this.d;
            int n = 1;
            final boolean booleanValue = (boolean)d.invoke(null, this.a.a);
            final agza g = this.g;
            if (booleanValue) {
                n = 2;
            }
            g.copyOnWrite();
            final ehs ehs = (ehs)g.instance;
            final ehs a = ehs.a;
            ehs.Z = n - 1;
            ehs.d |= 0x8;
        }
        catch (final InvocationTargetException ex) {
            final agza g2 = this.g;
            g2.copyOnWrite();
            final ehs ehs2 = (ehs)g2.instance;
            final ehs a2 = ehs.a;
            ehs2.Z = 2;
            ehs2.d |= 0x8;
        }
    }
}
