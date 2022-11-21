import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqjq extends ahcu implements ahcv
{
    public static final aqjq a;
    private static volatile ahev b;
    private byte c;
    
    static {
        ahcz.registerDefaultInstance(aqjq.class, (ahcz)(a = new aqjq()));
    }
    
    private aqjq() {
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
                if ((b = aqjq.b) == null) {
                    synchronized (aqjq.class) {
                        if (aqjq.b == null) {
                            aqjq.b = (ahev)new ahcs((ahcz)aqjq.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aqjq.a;
            }
            case 4: {
                return new ahct((ahcu)aqjq.a);
            }
            case 3: {
                return new aqjq();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqjq.a, "\u0001\u0000", (Object[])null);
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
