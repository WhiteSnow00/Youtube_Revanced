import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqjh extends ahcu implements ahcv
{
    public static final aqjh a;
    private static volatile ahev b;
    private byte c;
    
    static {
        ahcz.registerDefaultInstance(aqjh.class, (ahcz)(a = new aqjh()));
    }
    
    private aqjh() {
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
                if ((b = aqjh.b) == null) {
                    synchronized (aqjh.class) {
                        if (aqjh.b == null) {
                            aqjh.b = (ahev)new ahcs((ahcz)aqjh.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aqjh.a;
            }
            case 4: {
                return new ahct((ahcu)aqjh.a);
            }
            case 3: {
                return new aqjh();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqjh.a, "\u0001\u0000", (Object[])null);
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
