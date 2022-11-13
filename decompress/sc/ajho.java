import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajho extends ahbh implements ahcw
{
    public static final ajho a;
    public static final ahbf b;
    private static volatile ahdd f;
    public int c;
    public String d;
    public int e;
    private byte g;
    
    static {
        final ajho a2 = new ajho();
        ahbh.registerDefaultInstance((Class)ajho.class, (ahbh)(a = a2));
        b = ahbh.newSingularGeneratedExtension((MessageLite)aqfg.a, (Object)a2, (MessageLite)a2, (ahbm)null, 384293593, ahek.k, (Class)ajho.class);
    }
    
    private ajho() {
        this.g = 2;
        this.d = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte g = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd f;
                if ((f = ajho.f) == null) {
                    synchronized (ajho.class) {
                        if (ajho.f == null) {
                            ajho.f = (ahdd)new ahba((ahbh)ajho.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return ajho.a;
            }
            case 4: {
                return new ahaz((ahbh)ajho.a);
            }
            case 3: {
                return new ajho();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajho.a, "\u0001\u0002\u0000\u0001\u0003\u0004\u0002\u0000\u0000\u0000\u0003\u1008\u0002\u0004\u100c\u0003", new Object[] { "c", "d", "e", ajek.m });
            }
            case 1: {
                if (o == null) {
                    g = 0;
                }
                this.g = g;
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
