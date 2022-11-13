import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class annw extends ahbc implements ahbd
{
    public static final annw a;
    private static volatile ahdd d;
    public int b;
    public String c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)annw.class, (ahbh)(a = new annw()));
    }
    
    private annw() {
        this.e = 2;
        this.c = "";
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
                if ((d = annw.d) == null) {
                    synchronized (annw.class) {
                        if (annw.d == null) {
                            annw.d = (ahdd)new ahba((ahbh)annw.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return annw.a;
            }
            case 4: {
                return new ahbb((ahbc)annw.a);
            }
            case 3: {
                return new annw();
            }
            case 2: {
                return newMessageInfo((MessageLite)annw.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "b", "c" });
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
