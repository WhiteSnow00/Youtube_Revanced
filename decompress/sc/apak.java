import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apak extends ahbh implements ahcw
{
    public static final apak a;
    private static volatile ahdd d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)apak.class, (ahbh)(a = new apak()));
    }
    
    private apak() {
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
                if ((d = apak.d) == null) {
                    synchronized (apak.class) {
                        if (apak.d == null) {
                            apak.d = (ahdd)new ahba((ahbh)apak.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return apak.a;
            }
            case 4: {
                return new ahaz((ahbh)apak.a);
            }
            case 3: {
                return new apak();
            }
            case 2: {
                return newMessageInfo((MessageLite)apak.a, "\u0001\u0001\u0001\u0000\ueb11\u1f11\ueb11\u1f11\u0001\u0000\u0000\u0001\ueb11\u1f11\u143c\u0000", new Object[] { "c", "b", aicz.class });
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