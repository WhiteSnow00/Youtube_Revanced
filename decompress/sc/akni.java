import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akni extends ahbh implements ahcw
{
    public static final akni a;
    private static volatile ahdd e;
    public int b;
    public akli c;
    public aiqj d;
    private ajvo f;
    private byte g;
    
    static {
        ahbh.registerDefaultInstance((Class)akni.class, (ahbh)(a = new akni()));
    }
    
    private akni() {
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
                if ((e = akni.e) == null) {
                    synchronized (akni.class) {
                        if (akni.e == null) {
                            akni.e = (ahdd)new ahba((ahbh)akni.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return akni.a;
            }
            case 4: {
                return new ahaz((ahbh)akni.a);
            }
            case 3: {
                return new akni();
            }
            case 2: {
                return newMessageInfo((MessageLite)akni.a, "\u0001\u0003\u0000\u0001\u0001\u0309\u0003\u0000\u0000\u0003\u0001\u1409\u0000\u0002\u1409\u0001\u0309\u1409\u0002", new Object[] { "b", "c", "d", "f" });
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
