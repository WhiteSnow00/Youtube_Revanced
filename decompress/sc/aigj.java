import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aigj extends ahbh implements ahcw
{
    public static final aigj a;
    private static volatile ahdd f;
    public int b;
    public ajut c;
    public aigi d;
    public ahbx e;
    private byte g;
    
    static {
        ahbh.registerDefaultInstance((Class)aigj.class, (ahbh)(a = new aigj()));
    }
    
    private aigj() {
        this.g = 2;
        this.e = emptyProtobufList();
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
                if ((f = aigj.f) == null) {
                    synchronized (aigj.class) {
                        if (aigj.f == null) {
                            aigj.f = (ahdd)new ahba((ahbh)aigj.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aigj.a;
            }
            case 4: {
                return new ahaz((ahbh)aigj.a);
            }
            case 3: {
                return new aigj();
            }
            case 2: {
                return newMessageInfo((MessageLite)aigj.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0003\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u041b", new Object[] { "b", "c", "d", "e", aida.class });
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
