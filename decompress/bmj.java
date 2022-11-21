// 
// Decompiled by Procyon v0.6.0
// 

public final class bmj implements bmm
{
    public static final bmj a;
    
    static {
        a = new bmj();
    }
    
    private bmj() {
    }
    
    @Override
    public final int a(final Object o) {
        final bmc bmc = (bmc)o;
        final int a = bmn.a;
        final String a2 = bmc.a;
        if (!a2.startsWith("OMX.google") && !a2.startsWith("c2.android")) {
            final int a3 = baz.a;
            return 0;
        }
        return 1;
    }
}
