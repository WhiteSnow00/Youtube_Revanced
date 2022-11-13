import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aokx extends ahbh implements ahcw
{
    public static final aokx a;
    private static volatile ahdd e;
    public int b;
    public aotp c;
    public ahbx d;
    private ahhu f;
    private byte g;
    
    static {
        ahbh.registerDefaultInstance((Class)aokx.class, (ahbh)(a = new aokx()));
    }
    
    private aokx() {
        this.g = 2;
        final ahab b = ahab.b;
        this.d = emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte g = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = aokx.e) == null) {
                    synchronized (aokx.class) {
                        if (aokx.e == null) {
                            aokx.e = (ahdd)new ahba((ahbh)aokx.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aokx.a;
            }
            case 4: {
                return new ahaz((ahbh)aokx.a);
            }
            case 3: {
                return new aokx();
            }
            case 2: {
                return newMessageInfo((MessageLite)aokx.a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0003\u0001\u1409\u0000\u0003\u1409\u0002\u0004\u041b", new Object[] { "b", "c", "f", "d", aotp.class });
            }
            case 1: {
                if (o == null) {
                    g = 0;
                }
                this.g = g;
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
