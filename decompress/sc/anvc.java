import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anvc extends ahbh implements ahcw
{
    public static final anvc a;
    private static volatile ahdd b;
    private byte c;
    
    static {
        ahbh.registerDefaultInstance((Class)anvc.class, (ahbh)(a = new anvc()));
    }
    
    private anvc() {
        this.c = 2;
        emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = anvc.b) == null) {
                    synchronized (anvc.class) {
                        if (anvc.b == null) {
                            anvc.b = (ahdd)new ahba((ahbh)anvc.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return anvc.a;
            }
            case 4: {
                return new ahaz((ahbh)anvc.a);
            }
            case 3: {
                return new anvc();
            }
            case 2: {
                return newMessageInfo((MessageLite)anvc.a, "\u0001\u0000", (Object[])null);
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
