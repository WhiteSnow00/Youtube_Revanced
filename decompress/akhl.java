import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akhl extends ahbh implements ahcw
{
    public static final akhl a;
    private static volatile ahdd e;
    public int b;
    public akhq c;
    public akhs d;
    private akhm f;
    private byte g;
    
    static {
        ahbh.registerDefaultInstance((Class)akhl.class, (ahbh)(a = new akhl()));
    }
    
    private akhl() {
        this.g = 2;
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
                if ((e = akhl.e) == null) {
                    synchronized (akhl.class) {
                        if (akhl.e == null) {
                            akhl.e = (ahdd)new ahba((ahbh)akhl.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return akhl.a;
            }
            case 4: {
                return new ahaz((ahbh)akhl.a);
            }
            case 3: {
                return new akhl();
            }
            case 2: {
                return newMessageInfo((MessageLite)akhl.a, "\u0001\u0003\u0000\u0001\ue7cb\u364c\uebd3\u5769\u0003\u0000\u0000\u0003\ue7cb\u364c\u1409\u0000\ue3dc\u55a0\u1409\u0001\uebd3\u5769\u1409\u0002", new Object[] { "b", "c", "f", "d" });
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