import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akha extends ahbh implements ahcw
{
    public static final akha a;
    private static volatile ahdd e;
    public int b;
    public akgz c;
    public ahab d;
    private akli f;
    private ahhu g;
    private byte h;
    
    static {
        ahbh.registerDefaultInstance((Class)akha.class, (ahbh)(a = new akha()));
    }
    
    private akha() {
        this.h = 2;
        this.d = ahab.b;
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
                final ahdd e;
                if ((e = akha.e) == null) {
                    synchronized (akha.class) {
                        if (akha.e == null) {
                            akha.e = (ahdd)new ahba((ahbh)akha.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return akha.a;
            }
            case 4: {
                return new ahaz((ahbh)akha.a);
            }
            case 3: {
                return new akha();
            }
            case 2: {
                return newMessageInfo((MessageLite)akha.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0003\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u100a\u0003", new Object[] { "b", "f", "c", "g", "d" });
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
