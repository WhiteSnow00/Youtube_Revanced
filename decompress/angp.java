import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class angp extends ahbh implements ahcw
{
    public static final angp a;
    private static volatile ahdd e;
    public int b;
    public ajut c;
    public ajut d;
    private byte f;
    
    static {
        ahbh.registerDefaultInstance((Class)angp.class, (ahbh)(a = new angp()));
    }
    
    private angp() {
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
                if ((e = angp.e) == null) {
                    synchronized (angp.class) {
                        if (angp.e == null) {
                            angp.e = (ahdd)new ahba((ahbh)angp.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return angp.a;
            }
            case 4: {
                return new ahaz((ahbh)angp.a);
            }
            case 3: {
                return new angp();
            }
            case 2: {
                return newMessageInfo((MessageLite)angp.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001\u1409\u0000\u0002\u1409\u0001", new Object[] { "b", "c", "d" });
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
