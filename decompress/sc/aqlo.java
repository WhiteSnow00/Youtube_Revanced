import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqlo extends ahbh implements ahcw
{
    public static final aqlo a;
    private static volatile ahdd e;
    public int b;
    public ahbx c;
    public aqli d;
    private byte f;
    
    static {
        ahbh.registerDefaultInstance((Class)aqlo.class, (ahbh)(a = new aqlo()));
    }
    
    private aqlo() {
        this.f = 2;
        this.c = emptyProtobufList();
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
                if ((e = aqlo.e) == null) {
                    synchronized (aqlo.class) {
                        if (aqlo.e == null) {
                            aqlo.e = (ahdd)new ahba((ahbh)aqlo.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aqlo.a;
            }
            case 4: {
                return new ahaz((short[][])null, (short[][])null);
            }
            case 3: {
                return new aqlo();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqlo.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001\u041b\u0002\u1009\u0000", new Object[] { "b", "c", aqln.class, "d" });
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
