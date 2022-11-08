import java.lang.reflect.Method;

// 
// Decompiled by Procyon v0.6.0
// 

public final class enf extends enu
{
    public enf(final emj emj, final agza agza, final int n) {
        super(emj, "DZ4YQMGjiiG80De3h2RdExLJLCk1HXfUitSGB3xdLKjSzFe5jaVRnSWLaDfXmTZ6", "rN4de9ttzTEp3+iQIPyTFLSG8iLr2YuUXdQWnliGMSg=", agza, n, 76);
    }
    
    protected final void a() {
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
        ehs.aa = n - 1;
        ehs.d |= 0x10;
    }
}
