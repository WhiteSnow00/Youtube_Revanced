import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoqh extends ahcu implements ahcv
{
    public static final aoqh a;
    private static volatile ahev b;
    private byte c;
    
    static {
        ahcz.registerDefaultInstance(aoqh.class, (ahcz)(a = new aoqh()));
    }
    
    private aoqh() {
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
                if ((b = aoqh.b) == null) {
                    synchronized (aoqh.class) {
                        if (aoqh.b == null) {
                            aoqh.b = (ahev)new ahcs((ahcz)aoqh.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aoqh.a;
            }
            case 4: {
                return new ahct((ahcu)aoqh.a);
            }
            case 3: {
                return new aoqh();
            }
            case 2: {
                return newMessageInfo((MessageLite)aoqh.a, "\u0001\u0000", (Object[])null);
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
