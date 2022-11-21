import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqka extends ahcu implements ahcv
{
    public static final aqka a;
    private static volatile ahev b;
    private byte c;
    
    static {
        ahcz.registerDefaultInstance(aqka.class, (ahcz)(a = new aqka()));
    }
    
    private aqka() {
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
                if ((b = aqka.b) == null) {
                    synchronized (aqka.class) {
                        if (aqka.b == null) {
                            aqka.b = (ahev)new ahcs((ahcz)aqka.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aqka.a;
            }
            case 4: {
                return new ahct((ahcu)aqka.a);
            }
            case 3: {
                return new aqka();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqka.a, "\u0001\u0000", (Object[])null);
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
