import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqum extends ahbh implements ahcw
{
    public static final aqum a;
    private static volatile ahdd b;
    
    static {
        ahbh.registerDefaultInstance((Class)aqum.class, (ahbh)(a = new aqum()));
    }
    
    private aqum() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = aqum.b) == null) {
                    synchronized (aqum.class) {
                        if (aqum.b == null) {
                            aqum.b = (ahdd)new ahba((ahbh)aqum.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aqum.a;
            }
            case 4: {
                return new ahaz((ahbh)aqum.a);
            }
            case 3: {
                return new aqum();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqum.a, "\u0001\u0000", (Object[])null);
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
