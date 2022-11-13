import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akup extends ahbh implements ahcw
{
    public static final akup a;
    private static volatile ahdd f;
    public int b;
    public akli c;
    public aiqj d;
    public ahwd e;
    private aiqj g;
    private byte h;
    
    static {
        ahbh.registerDefaultInstance((Class)akup.class, (ahbh)(a = new akup()));
    }
    
    private akup() {
        this.h = 2;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte h = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd f;
                if ((f = akup.f) == null) {
                    synchronized (akup.class) {
                        if (akup.f == null) {
                            akup.f = (ahdd)new ahba((ahbh)akup.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return akup.a;
            }
            case 4: {
                return new ahaz((ahbh)akup.a);
            }
            case 3: {
                return new akup();
            }
            case 2: {
                return newMessageInfo((MessageLite)akup.a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0003\u0001\u1409\u0000\u0002\u1409\u0001\u0004\u1009\u0003\u0005\u1409\u0002", new Object[] { "b", "c", "d", "e", "g" });
            }
            case 1: {
                if (o == null) {
                    h = 0;
                }
                this.h = h;
                return null;
            }
            case 0: {
                return this.h;
            }
        }
    }
}
