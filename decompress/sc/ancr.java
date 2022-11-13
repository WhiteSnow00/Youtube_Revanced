import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ancr extends ahbh implements ahcw
{
    public static final ancr a;
    private static volatile ahdd h;
    public int b;
    public anco c;
    public ahlz d;
    public ancs e;
    public anct f;
    public ancq g;
    private byte i;
    
    static {
        ahbh.registerDefaultInstance((Class)ancr.class, (ahbh)(a = new ancr()));
    }
    
    private ancr() {
        this.i = 2;
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
                if ((h = ancr.h) == null) {
                    synchronized (ancr.class) {
                        if (ancr.h == null) {
                            ancr.h = (ahdd)new ahba((ahbh)ancr.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return ancr.a;
            }
            case 4: {
                return new ahaz((ahbh)ancr.a);
            }
            case 3: {
                return new ancr();
            }
            case 2: {
                return newMessageInfo((MessageLite)ancr.a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0001\u0001\u1409\u0000\u0002\u1009\u0001\u0003\u1009\u0002\u0004\u1009\u0003\u0005\u1009\u0004", new Object[] { "b", "c", "d", "e", "f", "g" });
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
