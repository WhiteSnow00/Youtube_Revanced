import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anuu extends ahbc implements ahbd
{
    public static final anuu a;
    private static volatile ahdd b;
    private byte c;
    
    static {
        ahbh.registerDefaultInstance((Class)anuu.class, (ahbh)(a = new anuu()));
    }
    
    private anuu() {
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
                if ((b = anuu.b) == null) {
                    synchronized (anuu.class) {
                        if (anuu.b == null) {
                            anuu.b = (ahdd)new ahba((ahbh)anuu.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return anuu.a;
            }
            case 4: {
                return new ahbb((ahbc)anuu.a);
            }
            case 3: {
                return new anuu();
            }
            case 2: {
                return newMessageInfo((MessageLite)anuu.a, "\u0001\u0000", (Object[])null);
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