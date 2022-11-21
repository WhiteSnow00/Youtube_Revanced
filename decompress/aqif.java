import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqif extends ahcu implements ahcv
{
    public static final aqif a;
    private static volatile ahev b;
    private byte c;
    
    static {
        ahcz.registerDefaultInstance(aqif.class, (ahcz)(a = new aqif()));
    }
    
    private aqif() {
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
                if ((b = aqif.b) == null) {
                    synchronized (aqif.class) {
                        if (aqif.b == null) {
                            aqif.b = (ahev)new ahcs((ahcz)aqif.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aqif.a;
            }
            case 4: {
                return new ahct((ahcu)aqif.a);
            }
            case 3: {
                return new aqif();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqif.a, "\u0001\u0000", (Object[])null);
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
