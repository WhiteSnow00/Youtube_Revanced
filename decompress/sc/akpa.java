import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akpa extends ahbh implements ahcw
{
    public static final akpa a;
    private static volatile ahdd e;
    public int b;
    public aklg c;
    public int d;
    private byte f;
    
    static {
        ahbh.registerDefaultInstance((Class)akpa.class, (ahbh)(a = new akpa()));
    }
    
    private akpa() {
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
                if ((e = akpa.e) == null) {
                    synchronized (akpa.class) {
                        if (akpa.e == null) {
                            akpa.e = (ahdd)new ahba((ahbh)akpa.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return akpa.a;
            }
            case 4: {
                return new ahaz((ahbh)akpa.a);
            }
            case 3: {
                return new akpa();
            }
            case 2: {
                return newMessageInfo((MessageLite)akpa.a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0001\u0001\u1409\u0000\u0003\u100c\u0001", new Object[] { "b", "c", "d", aibi.h });
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
