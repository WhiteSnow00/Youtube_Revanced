import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqkd extends ahcu implements ahcv
{
    public static final aqkd a;
    private static volatile ahev b;
    private byte c;
    
    static {
        ahcz.registerDefaultInstance(aqkd.class, (ahcz)(a = new aqkd()));
    }
    
    private aqkd() {
        this.c = 2;
    }
    
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev b;
                if ((b = aqkd.b) == null) {
                    synchronized (aqkd.class) {
                        if (aqkd.b == null) {
                            aqkd.b = (ahev)new ahcs((ahcz)aqkd.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aqkd.a;
            }
            case 4: {
                return new ahct((ahcu)aqkd.a);
            }
            case 3: {
                return new aqkd();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqkd.a, "\u0001\u0000", (Object[])null);
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
