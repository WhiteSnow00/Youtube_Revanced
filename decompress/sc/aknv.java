import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aknv extends ahbh implements ahcw
{
    public static final aknv a;
    private static volatile ahdd h;
    public int b;
    public aklg c;
    public long d;
    public aknz e;
    public ahbx f;
    public int g;
    private byte i;
    
    static {
        ahbh.registerDefaultInstance((Class)aknv.class, (ahbh)(a = new aknv()));
    }
    
    private aknv() {
        this.i = 2;
        this.f = emptyProtobufList();
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
                if ((h = aknv.h) == null) {
                    synchronized (aknv.class) {
                        if (aknv.h == null) {
                            aknv.h = (ahdd)new ahba((ahbh)aknv.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return aknv.a;
            }
            case 4: {
                return new ahaz((int[][])null, (byte[][][])null);
            }
            case 3: {
                return new aknv();
            }
            case 2: {
                return newMessageInfo((MessageLite)aknv.a, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0001\u0002\u0001\u1409\u0000\u0002\u1002\u0001\u0003\u041b\u0005\u1009\u0002\u0007\u100c\u0005", new Object[] { "b", "c", "d", "f", aknt.class, "e", "g", ajdp.a() });
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
