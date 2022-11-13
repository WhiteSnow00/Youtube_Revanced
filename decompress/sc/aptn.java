import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aptn extends ahbh implements ahcw
{
    public static final aptn a;
    private static volatile ahdd b;
    
    static {
        ahbh.registerDefaultInstance((Class)aptn.class, (ahbh)(a = new aptn()));
    }
    
    private aptn() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = aptn.b) == null) {
                    synchronized (aptn.class) {
                        if (aptn.b == null) {
                            aptn.b = (ahdd)new ahba((ahbh)aptn.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aptn.a;
            }
            case 4: {
                return new ahaz((ahbh)aptn.a);
            }
            case 3: {
                return new aptn();
            }
            case 2: {
                return newMessageInfo((MessageLite)aptn.a, "\u0001\u0000", (Object[])null);
            }
            case 1: {
                return null;
            }
            case 0: {
                return 1;
            }
        }
    }
}
