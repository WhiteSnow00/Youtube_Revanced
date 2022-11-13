import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aokw extends ahbh implements ahcw
{
    public static final aokw a;
    private static volatile ahdd e;
    public int b;
    public int c;
    public ajut d;
    private byte f;
    
    static {
        ahbh.registerDefaultInstance((Class)aokw.class, (ahbh)(a = new aokw()));
    }
    
    private aokw() {
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
                if ((e = aokw.e) == null) {
                    synchronized (aokw.class) {
                        if (aokw.e == null) {
                            aokw.e = (ahdd)new ahba((ahbh)aokw.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aokw.a;
            }
            case 4: {
                return new ahaz((ahbh)aokw.a);
            }
            case 3: {
                return new aokw();
            }
            case 2: {
                return newMessageInfo((MessageLite)aokw.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001\u100c\u0000\u0002\u1409\u0001", new Object[] { "b", "c", ajek.r, "d" });
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
