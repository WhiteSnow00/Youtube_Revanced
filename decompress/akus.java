import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akus extends ahbh implements ahcw
{
    public static final akus a;
    private static volatile ahdd e;
    public int b;
    public aklg c;
    public amsg d;
    private byte f;
    
    static {
        ahbh.registerDefaultInstance((Class)akus.class, (ahbh)(a = new akus()));
    }
    
    private akus() {
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
                if ((e = akus.e) == null) {
                    synchronized (akus.class) {
                        if (akus.e == null) {
                            akus.e = (ahdd)new ahba((ahbh)akus.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return akus.a;
            }
            case 4: {
                return new ahaz((ahbh)akus.a);
            }
            case 3: {
                return new akus();
            }
            case 2: {
                return newMessageInfo((MessageLite)akus.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001\u1409\u0000\u0002\u1009\u0001", new Object[] { "b", "c", "d" });
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
