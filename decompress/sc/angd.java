import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class angd extends ahbh implements ahcw
{
    public static final angd a;
    private static volatile ahdd d;
    public int b;
    public aicz c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)angd.class, (ahbh)(a = new angd()));
    }
    
    private angd() {
        this.e = 2;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte e = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = angd.d) == null) {
                    synchronized (angd.class) {
                        if (angd.d == null) {
                            angd.d = (ahdd)new ahba((ahbh)angd.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return angd.a;
            }
            case 4: {
                return new ahaz((ahbh)angd.a);
            }
            case 3: {
                return new angd();
            }
            case 2: {
                return newMessageInfo((MessageLite)angd.a, "\u0001\u0001\u0000\u0001\ueb11\u1f11\ueb11\u1f11\u0001\u0000\u0000\u0001\ueb11\u1f11\u1409\u0000", new Object[] { "b", "c" });
            }
            case 1: {
                if (o == null) {
                    e = 0;
                }
                this.e = e;
                return null;
            }
            case 0: {
                return this.e;
            }
        }
    }
}
