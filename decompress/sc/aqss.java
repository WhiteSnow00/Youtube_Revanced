import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqss extends ahbh implements ahcw
{
    public static final aqss a;
    private static volatile ahdd e;
    public int b;
    public aqsw c;
    public aqso d;
    private byte f;
    
    static {
        ahbh.registerDefaultInstance((Class)aqss.class, (ahbh)(a = new aqss()));
    }
    
    private aqss() {
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
                if ((e = aqss.e) == null) {
                    synchronized (aqss.class) {
                        if (aqss.e == null) {
                            aqss.e = (ahdd)new ahba((ahbh)aqss.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aqss.a;
            }
            case 4: {
                return new ahaz((ahbh)aqss.a);
            }
            case 3: {
                return new aqss();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqss.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001\u1409\u0000\u0002\u1409\u0001", new Object[] { "b", "c", "d" });
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
