import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afpz extends ahbh implements ahcw
{
    public static final afpz a;
    private static volatile ahdd b;
    private byte c;
    
    static {
        ahbh.registerDefaultInstance((Class)afpz.class, (ahbh)(a = new afpz()));
    }
    
    private afpz() {
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
                if ((b = afpz.b) == null) {
                    synchronized (afpz.class) {
                        if (afpz.b == null) {
                            afpz.b = (ahdd)new ahba((ahbh)afpz.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return afpz.a;
            }
            case 4: {
                return new ahaz((ahbh)afpz.a);
            }
            case 3: {
                return new afpz();
            }
            case 2: {
                return newMessageInfo((MessageLite)afpz.a, "\u0001\u0000", (Object[])null);
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
