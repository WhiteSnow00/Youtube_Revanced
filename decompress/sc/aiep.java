import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aiep extends ahbh implements ahcw
{
    public static final aiep a;
    private static volatile ahdd c;
    public aned b;
    private int d;
    private andz e;
    private byte f;
    
    static {
        ahbh.registerDefaultInstance((Class)aiep.class, (ahbh)(a = new aiep()));
    }
    
    private aiep() {
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
                final ahdd c;
                if ((c = aiep.c) == null) {
                    synchronized (aiep.class) {
                        if (aiep.c == null) {
                            aiep.c = (ahdd)new ahba((ahbh)aiep.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aiep.a;
            }
            case 4: {
                return new ahaz((ahbh)aiep.a);
            }
            case 3: {
                return new aiep();
            }
            case 2: {
                return newMessageInfo((MessageLite)aiep.a, "\u0001\u0002\u0000\u0001\ufdd2\u178f\uee01\u189d\u0002\u0000\u0000\u0002\ufdd2\u178f\u1409\u0000\uee01\u189d\u1409\u0001", new Object[] { "d", "e", "b" });
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
