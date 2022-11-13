import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aozo extends ahbh implements ahcw
{
    public static final aozo a;
    private static volatile ahdd d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)aozo.class, (ahbh)(a = new aozo()));
    }
    
    private aozo() {
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
                if ((d = aozo.d) == null) {
                    synchronized (aozo.class) {
                        if (aozo.d == null) {
                            aozo.d = (ahdd)new ahba((ahbh)aozo.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aozo.a;
            }
            case 4: {
                return new ahaz((ahbh)aozo.a);
            }
            case 3: {
                return new aozo();
            }
            case 2: {
                return newMessageInfo((MessageLite)aozo.a, "\u0001\u0002\u0001\u0000\uee6f\u29bd\uef6f\u3fd1\u0002\u0000\u0000\u0002\uee6f\u29bd\u143c\u0000\uef6f\u3fd1\u143c\u0000", new Object[] { "c", "b", aozm.class, aozn.class });
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
