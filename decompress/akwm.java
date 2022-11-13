import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akwm extends ahbh implements ahcw
{
    public static final akwm a;
    private static volatile ahdd d;
    public amvl b;
    public ahbx c;
    private int e;
    private byte f;
    
    static {
        ahbh.registerDefaultInstance((Class)akwm.class, (ahbh)(a = new akwm()));
    }
    
    private akwm() {
        this.f = 2;
        this.c = emptyProtobufList();
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
                final ahdd d;
                if ((d = akwm.d) == null) {
                    synchronized (akwm.class) {
                        if (akwm.d == null) {
                            akwm.d = (ahdd)new ahba((ahbh)akwm.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return akwm.a;
            }
            case 4: {
                return new ahaz((ahbh)akwm.a);
            }
            case 3: {
                return new akwm();
            }
            case 2: {
                return newMessageInfo((MessageLite)akwm.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001\u1409\u0000\u0002\u001b", new Object[] { "e", "b", "c", akwn.class });
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
