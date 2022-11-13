import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aolk extends ahbh implements ahcw
{
    public static final aolk a;
    public static final ahbf b;
    private static volatile ahdd f;
    public int c;
    public int d;
    public String e;
    
    static {
        final aolk a2 = new aolk();
        ahbh.registerDefaultInstance((Class)aolk.class, (ahbh)(a = a2));
        b = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 355549603, ahek.k, (Class)aolk.class);
    }
    
    private aolk() {
        this.e = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd f;
                if ((f = aolk.f) == null) {
                    synchronized (aolk.class) {
                        if (aolk.f == null) {
                            aolk.f = (ahdd)new ahba((ahbh)aolk.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aolk.a;
            }
            case 4: {
                return new ahaz((ahbh)aolk.a);
            }
            case 3: {
                return new aolk();
            }
            case 2: {
                return newMessageInfo((MessageLite)aolk.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u1008\u0001", new Object[] { "c", "d", aola.d, "e" });
            }
            case 1: {
                return null;
            }
            case 0: {
                return 1;
            }
        }
    }
}
