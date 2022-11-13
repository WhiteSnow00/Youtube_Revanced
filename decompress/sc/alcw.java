import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alcw extends ahbh implements ahcw
{
    public static final alcw a;
    private static volatile ahdd f;
    public int b;
    public aklg c;
    public ahbx d;
    public ahbx e;
    private byte g;
    
    static {
        ahbh.registerDefaultInstance((Class)alcw.class, (ahbh)(a = new alcw()));
    }
    
    private alcw() {
        this.g = 2;
        this.d = emptyProtobufList();
        this.e = ahbh.emptyProtobufList();
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
                final ahdd f;
                if ((f = alcw.f) == null) {
                    synchronized (alcw.class) {
                        if (alcw.f == null) {
                            alcw.f = (ahdd)new ahba((ahbh)alcw.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return alcw.a;
            }
            case 4: {
                return new ahaz((short[][])null, (char[][][])null);
            }
            case 3: {
                return new alcw();
            }
            case 2: {
                return newMessageInfo((MessageLite)alcw.a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0002\u0001\u0001\u1409\u0000\u0002\u001b\u0004\u001a", new Object[] { "b", "c", "d", aphx.class, "e" });
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
