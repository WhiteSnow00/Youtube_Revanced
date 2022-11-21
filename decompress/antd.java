import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class antd extends ahcz implements aheo
{
    public static final antd a;
    private static volatile ahev b;
    
    static {
        ahcz.registerDefaultInstance(antd.class, a = new antd());
    }
    
    private antd() {
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev b;
                if ((b = antd.b) == null) {
                    synchronized (antd.class) {
                        if (antd.b == null) {
                            antd.b = (ahev)new ahcs((ahcz)antd.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return antd.a;
            }
            case 4: {
                return new ahcr((ahcz)antd.a);
            }
            case 3: {
                return new antd();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)antd.a, "\u0001\u0000", null);
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
