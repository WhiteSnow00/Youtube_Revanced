import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apod extends ahbh implements ahcw
{
    public static final apod a;
    private static volatile ahdd d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)apod.class, (ahbh)(a = new apod()));
    }
    
    private apod() {
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
                if ((d = apod.d) == null) {
                    synchronized (apod.class) {
                        if (apod.d == null) {
                            apod.d = (ahdd)new ahba((ahbh)apod.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return apod.a;
            }
            case 4: {
                return new ahaz((ahbh)apod.a);
            }
            case 3: {
                return new apod();
            }
            case 2: {
                return newMessageInfo((MessageLite)apod.a, "\u0001\u0002\u0001\u0000\ueb11\u1f11\ue5d8\u2622\u0002\u0000\u0000\u0002\ueb11\u1f11\u143c\u0000\ue5d8\u2622\u143c\u0000", new Object[] { "c", "b", aicz.class, aidi.class });
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
