import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atyd extends ahbh implements ahcw
{
    public static final atyd a;
    private static volatile ahdd g;
    public int b;
    public long c;
    public int d;
    public ahbx e;
    public atyi f;
    private byte h;
    
    static {
        ahbh.registerDefaultInstance((Class)atyd.class, (ahbh)(a = new atyd()));
    }
    
    private atyd() {
        this.h = 2;
        this.e = emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte h = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd g;
                if ((g = atyd.g) == null) {
                    synchronized (atyd.class) {
                        if (atyd.g == null) {
                            atyd.g = (ahdd)new ahba((ahbh)atyd.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return atyd.a;
            }
            case 4: {
                return new ahaz((char[][][])null, (short[][][])null);
            }
            case 3: {
                return new atyd();
            }
            case 2: {
                return newMessageInfo((MessageLite)atyd.a, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0001\u0001\u0001\u1005\u0000\u0002\u041b\u0003\u100c\u0001\u0006\u1009\u0004", new Object[] { "b", "c", "e", atye.class, "d", areg.o, "f" });
            }
            case 1: {
                if (o == null) {
                    h = 0;
                }
                this.h = h;
                return null;
            }
            case 0: {
                return this.h;
            }
        }
    }
}
