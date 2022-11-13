import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akoh extends ahbh implements ahcw
{
    public static final akoh a;
    private static volatile ahdd h;
    public int b;
    public aklg c;
    public ahbx d;
    public boolean e;
    public akoe f;
    public boolean g;
    private byte i;
    
    static {
        ahbh.registerDefaultInstance((Class)akoh.class, (ahbh)(a = new akoh()));
    }
    
    private akoh() {
        this.i = 2;
        this.d = ahbh.emptyProtobufList();
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
                if ((h = akoh.h) == null) {
                    synchronized (akoh.class) {
                        if (akoh.h == null) {
                            akoh.h = (ahdd)new ahba((ahbh)akoh.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return akoh.a;
            }
            case 4: {
                return new ahaz((float[])null, (short[][][])null);
            }
            case 3: {
                return new akoh();
            }
            case 2: {
                return newMessageInfo((MessageLite)akoh.a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0001\u0001\u1409\u0000\u0002\u001a\u0003\u1007\u0001\u0004\u1009\u0002\u0005\u1007\u0003", new Object[] { "b", "c", "d", "e", "f", "g" });
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
