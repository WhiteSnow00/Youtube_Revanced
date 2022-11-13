import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akww extends ahbh implements ahcw
{
    public static final akww a;
    private static volatile ahdd d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)akww.class, (ahbh)(a = new akww()));
    }
    
    private akww() {
        this.b = 0;
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
                if ((d = akww.d) == null) {
                    synchronized (akww.class) {
                        if (akww.d == null) {
                            akww.d = (ahdd)new ahba((ahbh)akww.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return akww.a;
            }
            case 4: {
                return new ahaz((ahbh)akww.a);
            }
            case 3: {
                return new akww();
            }
            case 2: {
                return newMessageInfo((MessageLite)akww.a, "\u0001\u0001\u0001\u0000\ue56e\u484e\ue56e\u484e\u0001\u0000\u0000\u0001\ue56e\u484e\u143c\u0000", new Object[] { "c", "b", anbi.class });
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
