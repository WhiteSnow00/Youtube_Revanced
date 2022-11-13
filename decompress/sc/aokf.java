import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aokf extends ahbh implements ahcw
{
    public static final aokf a;
    private static volatile ahdd b;
    private int c;
    private ajut d;
    private aiqj e;
    private byte f;
    
    static {
        ahbh.registerDefaultInstance((Class)aokf.class, (ahbh)(a = new aokf()));
    }
    
    private aokf() {
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
                final ahdd b;
                if ((b = aokf.b) == null) {
                    synchronized (aokf.class) {
                        if (aokf.b == null) {
                            aokf.b = (ahdd)new ahba((ahbh)aokf.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aokf.a;
            }
            case 4: {
                return new ahaz((ahbh)aokf.a);
            }
            case 3: {
                return new aokf();
            }
            case 2: {
                return newMessageInfo((MessageLite)aokf.a, "\u0001\u0002\u0000\u0001\u0001\u0004\u0002\u0000\u0000\u0002\u0001\u1409\u0000\u0004\u1409\u0003", new Object[] { "c", "d", "e" });
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
