import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqiu extends ahcu implements ahcv
{
    public static final aqiu a;
    private static volatile ahev b;
    private byte c;
    
    static {
        ahcz.registerDefaultInstance(aqiu.class, (ahcz)(a = new aqiu()));
    }
    
    private aqiu() {
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
                if ((b = aqiu.b) == null) {
                    synchronized (aqiu.class) {
                        if (aqiu.b == null) {
                            aqiu.b = (ahev)new ahcs((ahcz)aqiu.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aqiu.a;
            }
            case 4: {
                return new ahct((ahcu)aqiu.a);
            }
            case 3: {
                return new aqiu();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqiu.a, "\u0001\u0000", (Object[])null);
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
