import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apqo extends ahbh implements ahcw
{
    public static final apqo a;
    private static volatile ahdd b;
    private byte c;
    
    static {
        ahbh.registerDefaultInstance((Class)apqo.class, (ahbh)(a = new apqo()));
    }
    
    private apqo() {
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
                if ((b = apqo.b) == null) {
                    synchronized (apqo.class) {
                        if (apqo.b == null) {
                            apqo.b = (ahdd)new ahba((ahbh)apqo.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apqo.a;
            }
            case 4: {
                return new ahaz((ahbh)apqo.a);
            }
            case 3: {
                return new apqo();
            }
            case 2: {
                return newMessageInfo((MessageLite)apqo.a, "\u0001\u0000", (Object[])null);
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
