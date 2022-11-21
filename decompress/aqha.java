import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqha extends ahcu implements ahcv
{
    public static final aqha a;
    private static volatile ahev b;
    private byte c;
    
    static {
        ahcz.registerDefaultInstance(aqha.class, (ahcz)(a = new aqha()));
    }
    
    private aqha() {
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
                if ((b = aqha.b) == null) {
                    synchronized (aqha.class) {
                        if (aqha.b == null) {
                            aqha.b = (ahev)new ahcs((ahcz)aqha.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aqha.a;
            }
            case 4: {
                return new ahct((ahcu)aqha.a);
            }
            case 3: {
                return new aqha();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqha.a, "\u0001\u0000", (Object[])null);
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
