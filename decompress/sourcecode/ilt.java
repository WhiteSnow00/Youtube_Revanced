// 
// Decompiled by Procyon v0.6.0
// 

public final class ilt implements abxy
{
    public final veu a;
    private final ver b;
    private final ansr c;
    
    public ilt(final anws anws, final alib alib) {
        final ansr ansr = null;
        veu a;
        if (anws == null) {
            a = null;
        }
        else {
            a = new veu(anws);
        }
        this.a = a;
        ver b;
        if (alib == null) {
            b = null;
        }
        else {
            b = new ver(alib);
        }
        this.b = b;
        ansr c;
        if (alib == null) {
            c = ansr;
        }
        else {
            final agzc agzc = (agzc)((agzi)ansr.a).createBuilder();
            agzc.e((agyr)alib.b, (Object)alib);
            c = (ansr)((agza)agzc).build();
        }
        this.c = c;
    }
    
    public final ansr a() {
        return this.c;
    }
    
    public final Object b() {
        return this.b;
    }
    
    public final void c(final Object o) {
    }
    
    public final byte[] d() {
        return uyp.b;
    }
}
