import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqsw extends ahbh implements ahcw
{
    public static final aqsw a;
    private static volatile ahdd e;
    public int b;
    public aqsu c;
    public int d;
    private byte f;
    
    static {
        ahbh.registerDefaultInstance((Class)aqsw.class, (ahbh)(a = new aqsw()));
    }
    
    private aqsw() {
        this.f = 2;
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
                if ((e = aqsw.e) == null) {
                    synchronized (aqsw.class) {
                        if (aqsw.e == null) {
                            aqsw.e = (ahdd)new ahba((ahbh)aqsw.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aqsw.a;
            }
            case 4: {
                return new ahaz((ahbh)aqsw.a);
            }
            case 3: {
                return new aqsw();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqsw.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001\u1409\u0000\u0002\u100b\u0001", new Object[] { "b", "c", "d" });
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
