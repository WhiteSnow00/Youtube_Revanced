import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akpk extends ahbh implements ahcw
{
    public static final akpk a;
    private static volatile ahdd c;
    public akpj b;
    private int d;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)akpk.class, (ahbh)(a = new akpk()));
    }
    
    private akpk() {
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
                final ahdd c;
                if ((c = akpk.c) == null) {
                    synchronized (akpk.class) {
                        if (akpk.c == null) {
                            akpk.c = (ahdd)new ahba((ahbh)akpk.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return akpk.a;
            }
            case 4: {
                return new ahaz((ahbh)akpk.a);
            }
            case 3: {
                return new akpk();
            }
            case 2: {
                return newMessageInfo((MessageLite)akpk.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "d", "b" });
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
