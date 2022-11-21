import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqia extends ahcu implements ahcv
{
    public static final aqia a;
    private static volatile ahev b;
    private byte c;
    
    static {
        ahcz.registerDefaultInstance(aqia.class, (ahcz)(a = new aqia()));
    }
    
    private aqia() {
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
                if ((b = aqia.b) == null) {
                    synchronized (aqia.class) {
                        if (aqia.b == null) {
                            aqia.b = (ahev)new ahcs((ahcz)aqia.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aqia.a;
            }
            case 4: {
                return new ahct((ahcu)aqia.a);
            }
            case 3: {
                return new aqia();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqia.a, "\u0001\u0000", (Object[])null);
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
