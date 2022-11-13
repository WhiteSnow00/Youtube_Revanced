import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akdd extends ahbh implements ahcw
{
    public static final akdd a;
    private static volatile ahdd b;
    private byte c;
    
    static {
        ahbh.registerDefaultInstance((Class)akdd.class, (ahbh)(a = new akdd()));
    }
    
    private akdd() {
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
                if ((b = akdd.b) == null) {
                    synchronized (akdd.class) {
                        if (akdd.b == null) {
                            akdd.b = (ahdd)new ahba((ahbh)akdd.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return akdd.a;
            }
            case 4: {
                return new ahaz((ahbh)akdd.a);
            }
            case 3: {
                return new akdd();
            }
            case 2: {
                return newMessageInfo((MessageLite)akdd.a, "\u0001\u0000", (Object[])null);
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
