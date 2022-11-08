// 
// Decompiled by Procyon v0.6.0
// 

final class ahaq
{
    private static final ahav b;
    public final ahav a;
    
    static {
        b = (ahav)new ahao(0);
    }
    
    public ahaq() {
        final ahao a = ahao.a;
        ahav b;
        try {
            b = (ahav)Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", (Class<?>[])new Class[0]).invoke(null, new Object[0]);
        }
        catch (final Exception ex) {
            b = ahaq.b;
        }
        final ahap a2 = new ahap(new ahav[] { (ahav)a, b });
        agzz.i(a2, "messageInfoFactory");
        this.a = (ahav)a2;
    }
    
    public static boolean a(final ahau ahau) {
        return ahau.b() == ahbg.a;
    }
}
