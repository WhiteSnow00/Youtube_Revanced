import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aquj extends ahbh implements ahcw
{
    public static final aquj a;
    private static volatile ahdd b;
    private byte c;
    
    static {
        ahbh.registerDefaultInstance((Class)aquj.class, (ahbh)(a = new aquj()));
    }
    
    private aquj() {
        this.c = 2;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = aquj.b) == null) {
                    synchronized (aquj.class) {
                        if (aquj.b == null) {
                            aquj.b = (ahdd)new ahba((ahbh)aquj.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aquj.a;
            }
            case 4: {
                return new ahaz((ahbh)aquj.a);
            }
            case 3: {
                return new aquj();
            }
            case 2: {
                return newMessageInfo((MessageLite)aquj.a, "\u0001\u0000", (Object[])null);
            }
            case 1: {
                byte c;
                if (o == null) {
                    c = 0;
                }
                else {
                    c = 1;
                }
                this.c = c;
                return null;
            }
            case 0: {
                return this.c;
            }
        }
    }
}
