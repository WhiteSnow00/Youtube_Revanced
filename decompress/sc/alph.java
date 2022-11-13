import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alph extends ahbh implements ahcw
{
    public static final alph a;
    private static volatile ahdd e;
    public int b;
    public int c;
    public anuv d;
    private byte f;
    
    static {
        ahbh.registerDefaultInstance((Class)alph.class, (ahbh)(a = new alph()));
    }
    
    private alph() {
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
                if ((e = alph.e) == null) {
                    synchronized (alph.class) {
                        if (alph.e == null) {
                            alph.e = (ahdd)new ahba((ahbh)alph.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return alph.a;
            }
            case 4: {
                return new ahaz((ahbh)alph.a);
            }
            case 3: {
                return new alph();
            }
            case 2: {
                return newMessageInfo((MessageLite)alph.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001\u100c\u0000\u0002\u1409\u0001", new Object[] { "b", "c", alnf.h, "d" });
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
