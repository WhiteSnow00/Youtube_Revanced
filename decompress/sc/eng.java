import java.lang.reflect.Method;

// 
// Decompiled by Procyon v0.6.0
// 

public final class eng extends env
{
    public eng(final emk emk, final ahaz ahaz, final int n) {
        super(emk, "DZ4YQMGjiiG80De3h2RdExLJLCk1HXfUitSGB3xdLKjSzFe5jaVRnSWLaDfXmTZ6", "rN4de9ttzTEp3+iQIPyTFLSG8iLr2YuUXdQWnliGMSg=", ahaz, n, 76);
    }
    
    protected final void a() {
        final Method d = this.d;
        int n = 1;
        final boolean booleanValue = (boolean)d.invoke(null, this.a.a);
        final ahaz g = this.g;
        g.copyOnWrite();
        final eht eht = (eht)g.instance;
        final eht a = eht.a;
        if (booleanValue) {
            n = 2;
        }
        eht.aa = n - 1;
        eht.d |= 0x10;
    }
}
