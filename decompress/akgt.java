import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akgt extends ahbh implements ahcw
{
    public static final akgt a;
    private static volatile ahdd d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)akgt.class, (ahbh)(a = new akgt()));
    }
    
    private akgt() {
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
                if ((d = akgt.d) == null) {
                    synchronized (akgt.class) {
                        if (akgt.d == null) {
                            akgt.d = (ahdd)new ahba((ahbh)akgt.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return akgt.a;
            }
            case 4: {
                return new ahaz((ahbh)akgt.a);
            }
            case 3: {
                return new akgt();
            }
            case 2: {
                return newMessageInfo((MessageLite)akgt.a, "\u0001\u0002\u0001\u0000\ue7f5\u178e\uf41e\u24c4\u0002\u0000\u0000\u0002\ue7f5\u178e\u143c\u0000\uf41e\u24c4\u143c\u0000", new Object[] { "c", "b", anyv.class, ahjx.class });
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
