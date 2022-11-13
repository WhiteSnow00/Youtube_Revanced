import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atxm extends ahbc implements ahbd
{
    public static final atxm a;
    private static volatile ahdd b;
    private byte c;
    
    static {
        ahbh.registerDefaultInstance((Class)atxm.class, (ahbh)(a = new atxm()));
    }
    
    private atxm() {
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
                if ((b = atxm.b) == null) {
                    synchronized (atxm.class) {
                        if (atxm.b == null) {
                            atxm.b = (ahdd)new ahba((ahbh)atxm.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return atxm.a;
            }
            case 4: {
                return new ahbb((ahbc)atxm.a);
            }
            case 3: {
                return new atxm();
            }
            case 2: {
                return newMessageInfo((MessageLite)atxm.a, "\u0001\u0000", (Object[])null);
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
