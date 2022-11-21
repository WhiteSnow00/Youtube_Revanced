import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqkb extends ahcu implements ahcv
{
    public static final aqkb a;
    private static volatile ahev b;
    private byte c;
    
    static {
        ahcz.registerDefaultInstance(aqkb.class, (ahcz)(a = new aqkb()));
    }
    
    private aqkb() {
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
                if ((b = aqkb.b) == null) {
                    synchronized (aqkb.class) {
                        if (aqkb.b == null) {
                            aqkb.b = (ahev)new ahcs((ahcz)aqkb.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aqkb.a;
            }
            case 4: {
                return new ahct((ahcu)aqkb.a);
            }
            case 3: {
                return new aqkb();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqkb.a, "\u0001\u0000", (Object[])null);
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
