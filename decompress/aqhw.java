import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqhw extends ahcu implements ahcv
{
    public static final aqhw a;
    private static volatile ahev b;
    private byte c;
    
    static {
        ahcz.registerDefaultInstance(aqhw.class, (ahcz)(a = new aqhw()));
    }
    
    private aqhw() {
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
                if ((b = aqhw.b) == null) {
                    synchronized (aqhw.class) {
                        if (aqhw.b == null) {
                            aqhw.b = (ahev)new ahcs((ahcz)aqhw.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aqhw.a;
            }
            case 4: {
                return new ahct((ahcu)aqhw.a);
            }
            case 3: {
                return new aqhw();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqhw.a, "\u0001\u0000", (Object[])null);
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
