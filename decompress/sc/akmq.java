import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akmq extends ahbh implements ahcw
{
    public static final akmq a;
    private static volatile ahdd h;
    public int b;
    public aklg c;
    public String d;
    public ahbx e;
    public akmt f;
    public akmp g;
    private byte i;
    
    static {
        ahbh.registerDefaultInstance((Class)akmq.class, (ahbh)(a = new akmq()));
    }
    
    private akmq() {
        this.i = 2;
        this.d = "";
        this.e = ahbh.emptyProtobufList();
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
                if ((h = akmq.h) == null) {
                    synchronized (akmq.class) {
                        if (akmq.h == null) {
                            akmq.h = (ahdd)new ahba((ahbh)akmq.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return akmq.a;
            }
            case 4: {
                return new ahaz((int[][][])null, (int[][])null);
            }
            case 3: {
                return new akmq();
            }
            case 2: {
                return newMessageInfo((MessageLite)akmq.a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0001\u0001\u1409\u0000\u0002\u1008\u0001\u0003\u001a\u0004\u1009\u0002\u0005\u1009\u0003", new Object[] { "b", "c", "d", "e", "f", "g" });
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
