import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aief extends ahbh implements ahcw
{
    public static final aief a;
    public static final ahbf b;
    private static volatile ahdd d;
    public String c;
    private int e;
    private byte f;
    
    static {
        final aief a2 = new aief();
        ahbh.registerDefaultInstance((Class)aief.class, (ahbh)(a = a2));
        b = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 471068491, ahek.k, (Class)aief.class);
    }
    
    private aief() {
        this.f = 2;
        this.c = "";
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
                final ahdd d;
                if ((d = aief.d) == null) {
                    synchronized (aief.class) {
                        if (aief.d == null) {
                            aief.d = (ahdd)new ahba((ahbh)aief.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aief.a;
            }
            case 4: {
                return new ahaz((ahbh)aief.a);
            }
            case 3: {
                return new aief();
            }
            case 2: {
                return newMessageInfo((MessageLite)aief.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "e", "c" });
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
