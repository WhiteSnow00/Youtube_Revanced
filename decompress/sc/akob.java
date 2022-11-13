import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akob extends ahbh implements ahcw
{
    public static final akob a;
    private static volatile ahdd d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)akob.class, (ahbh)(a = new akob()));
    }
    
    private akob() {
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
                if ((d = akob.d) == null) {
                    synchronized (akob.class) {
                        if (akob.d == null) {
                            akob.d = (ahdd)new ahba((ahbh)akob.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return akob.a;
            }
            case 4: {
                return new ahaz((ahbh)akob.a);
            }
            case 3: {
                return new akob();
            }
            case 2: {
                return newMessageInfo((MessageLite)akob.a, "\u0001\u0002\u0001\u0000\ufe18\u3299\uf53f\u32b6\u0002\u0000\u0000\u0002\ufe18\u3299\u143c\u0000\uf53f\u32b6\u143c\u0000", new Object[] { "c", "b", akod.class, akoc.class });
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
