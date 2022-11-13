import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aogd extends ahbh implements ahcw
{
    public static final aogd a;
    public static final ahbf b;
    private static volatile ahdd h;
    public int c;
    public aiqj d;
    public aiqj e;
    public String f;
    public aogc g;
    private byte i;
    
    static {
        final aogd a2 = new aogd();
        ahbh.registerDefaultInstance((Class)aogd.class, (ahbh)(a = a2));
        b = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 410400906, ahek.k, (Class)aogd.class);
    }
    
    private aogd() {
        this.i = 2;
        this.f = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte i = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd h;
                if ((h = aogd.h) == null) {
                    synchronized (aogd.class) {
                        if (aogd.h == null) {
                            aogd.h = (ahdd)new ahba((ahbh)aogd.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return aogd.a;
            }
            case 4: {
                return new ahaz((ahbh)aogd.a);
            }
            case 3: {
                return new aogd();
            }
            case 2: {
                return newMessageInfo((MessageLite)aogd.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0003\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1008\u0002\u0004\u1409\u0003", new Object[] { "c", "d", "e", "f", "g" });
            }
            case 1: {
                if (o == null) {
                    i = 0;
                }
                this.i = i;
                return null;
            }
            case 0: {
                return this.i;
            }
        }
    }
}
