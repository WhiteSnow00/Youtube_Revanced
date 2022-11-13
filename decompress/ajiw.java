import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajiw extends ahbh implements ahcw
{
    public static final ajiw a;
    public static final ahbf b;
    private static volatile ahdd e;
    public int c;
    public Object d;
    private byte f;
    
    static {
        final ajiw a2 = new ajiw();
        ahbh.registerDefaultInstance((Class)ajiw.class, (ahbh)(a = a2));
        b = ahbh.newSingularGeneratedExtension((MessageLite)ajht.a, (Object)a2, (MessageLite)a2, (ahbm)null, 379568079, ahek.k, (Class)ajiw.class);
    }
    
    private ajiw() {
        this.c = 0;
        this.f = 2;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte f = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = ajiw.e) == null) {
                    synchronized (ajiw.class) {
                        if (ajiw.e == null) {
                            ajiw.e = (ahdd)new ahba((ahbh)ajiw.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ajiw.a;
            }
            case 4: {
                return new ahaz((ahbh)ajiw.a);
            }
            case 3: {
                return new ajiw();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajiw.a, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0001\u0001\u103b\u0000\u0002\u143c\u0000", new Object[] { "d", "c", aqdy.class });
            }
            case 1: {
                if (o == null) {
                    f = 0;
                }
                this.f = f;
                return null;
            }
            case 0: {
                return this.f;
            }
        }
    }
}
