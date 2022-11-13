import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aohc extends ahbh implements ahcw
{
    public static final aohc a;
    private static volatile ahdd g;
    public int b;
    public aiqj c;
    public String d;
    public aima e;
    public apjd f;
    private aiqj h;
    private byte i;
    
    static {
        ahbh.registerDefaultInstance((Class)aohc.class, (ahbh)(a = new aohc()));
    }
    
    private aohc() {
        this.i = 2;
        this.d = "";
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
                final ahdd g;
                if ((g = aohc.g) == null) {
                    synchronized (aohc.class) {
                        if (aohc.g == null) {
                            aohc.g = (ahdd)new ahba((ahbh)aohc.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return aohc.a;
            }
            case 4: {
                return new ahaz((ahbh)aohc.a);
            }
            case 3: {
                return new aohc();
            }
            case 2: {
                return newMessageInfo((MessageLite)aohc.a, "\u0001\u0005\u0000\u0001\u0002\u000b\u0005\u0000\u0000\u0003\u0002\u1409\u0001\u0006\u1008\u0005\u0007\u1009\u0007\t\u1409\b\u000b\u1409\u0006", new Object[] { "b", "c", "d", "e", "f", "h" });
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
