import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class enl extends env
{
    public enl(final emk emk, final ahaz ahaz, final int n) {
        super(emk, "q25n2/TPNEnWjiB7Eq/br1pf7I1+Pbd8JO4E5S/WFXDtJZ2FMIzDcDIeNK1YwkMp", "JTvnHx65Egq/4novhqSS3bMw+oihCNz02Yz4pG4S+kE=", ahaz, n, 73);
    }
    
    protected final void a() {
        try {
            final Method d = this.d;
            int n = 1;
            final boolean booleanValue = (boolean)d.invoke(null, this.a.a);
            final ahaz g = this.g;
            if (booleanValue) {
                n = 2;
            }
            g.copyOnWrite();
            final eht eht = (eht)g.instance;
            final eht a = eht.a;
            eht.Z = n - 1;
            eht.d |= 0x8;
        }
        catch (final InvocationTargetException ex) {
            final ahaz g2 = this.g;
            g2.copyOnWrite();
            final eht eht2 = (eht)g2.instance;
            final eht a2 = eht.a;
            eht2.Z = 2;
            eht2.d |= 0x8;
        }
    }
}
