import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akfy extends ahbh implements ahcw
{
    public static final akfy a;
    private static volatile ahdd b;
    private int c;
    private ajwp d;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)akfy.class, (ahbh)(a = new akfy()));
    }
    
    private akfy() {
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
                final ahdd b;
                if ((b = akfy.b) == null) {
                    synchronized (akfy.class) {
                        if (akfy.b == null) {
                            akfy.b = (ahdd)new ahba((ahbh)akfy.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return akfy.a;
            }
            case 4: {
                return new ahaz((ahbh)akfy.a);
            }
            case 3: {
                return new akfy();
            }
            case 2: {
                return newMessageInfo((MessageLite)akfy.a, "\u0001\u0001\u0000\u0001\uf1f7\u3a08\uf1f7\u3a08\u0001\u0000\u0000\u0001\uf1f7\u3a08\u1409\u0000", new Object[] { "c", "d" });
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
