import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqjr extends ahbh implements ahcw
{
    public static final aqjr a;
    private static volatile ahdd e;
    public int b;
    public aqjs c;
    public aqjq d;
    private byte f;
    
    static {
        ahbh.registerDefaultInstance((Class)aqjr.class, (ahbh)(a = new aqjr()));
    }
    
    private aqjr() {
        this.f = 2;
        emptyProtobufList();
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
                if ((e = aqjr.e) == null) {
                    synchronized (aqjr.class) {
                        if (aqjr.e == null) {
                            aqjr.e = (ahdd)new ahba((ahbh)aqjr.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aqjr.a;
            }
            case 4: {
                return new ahaz((ahbh)aqjr.a);
            }
            case 3: {
                return new aqjr();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqjr.a, "\u0001\u0002\u0000\u0001\u0003\u0007\u0002\u0000\u0000\u0001\u0003\u1409\u0002\u0007\u1009\u0005", new Object[] { "b", "c", "d" });
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
