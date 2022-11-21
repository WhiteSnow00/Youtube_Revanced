import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anuv extends ahcu implements ahcv
{
    public static final anuv a;
    private static volatile ahev b;
    private byte c;
    
    static {
        ahcz.registerDefaultInstance(anuv.class, (ahcz)(a = new anuv()));
    }
    
    private anuv() {
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
                if ((b = anuv.b) == null) {
                    synchronized (anuv.class) {
                        if (anuv.b == null) {
                            anuv.b = (ahev)new ahcs((ahcz)anuv.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return anuv.a;
            }
            case 4: {
                return new ahct((ahcu)anuv.a);
            }
            case 3: {
                return new anuv();
            }
            case 2: {
                return newMessageInfo((MessageLite)anuv.a, "\u0001\u0000", (Object[])null);
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
