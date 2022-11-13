import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akvo extends ahbh implements ahcw
{
    public static final akvo a;
    private static volatile ahdd h;
    public int b;
    public aklg c;
    public ahbx d;
    public ahbx e;
    public ahbx f;
    public boolean g;
    private byte i;
    
    static {
        ahbh.registerDefaultInstance((Class)akvo.class, (ahbh)(a = new akvo()));
    }
    
    private akvo() {
        this.i = 2;
        this.d = ahbh.emptyProtobufList();
        this.e = emptyProtobufList();
        this.f = ahbh.emptyProtobufList();
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
                if ((h = akvo.h) == null) {
                    synchronized (akvo.class) {
                        if (akvo.h == null) {
                            akvo.h = (ahdd)new ahba((ahbh)akvo.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return akvo.a;
            }
            case 4: {
                return new ahaz((float[])null, (byte[][])null);
            }
            case 3: {
                return new akvo();
            }
            case 2: {
                return newMessageInfo((MessageLite)akvo.a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0003\u0001\u0001\u1409\u0000\u0002\u001a\u0003\u001a\u0004\u1007\u0001\u0005\u001b", new Object[] { "b", "c", "d", "f", "g", "e", akvq.class });
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
