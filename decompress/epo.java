import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class epo extends ahbh implements ahcw
{
    public static final epo a;
    private static volatile ahdd b;
    private byte c;
    
    static {
        ahbh.registerDefaultInstance((Class)epo.class, (ahbh)(a = new epo()));
    }
    
    private epo() {
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
                if ((b = epo.b) == null) {
                    synchronized (epo.class) {
                        if (epo.b == null) {
                            epo.b = (ahdd)new ahba((ahbh)epo.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return epo.a;
            }
            case 4: {
                return new ahaz((ahbh)epo.a);
            }
            case 3: {
                return new epo();
            }
            case 2: {
                return newMessageInfo((MessageLite)epo.a, "\u0000\u0000", (Object[])null);
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
