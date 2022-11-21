import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqvh extends ahcu implements ahcv
{
    public static final aqvh a;
    private static volatile ahev b;
    private byte c;
    
    static {
        ahcz.registerDefaultInstance(aqvh.class, (ahcz)(a = new aqvh()));
    }
    
    private aqvh() {
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
                if ((b = aqvh.b) == null) {
                    synchronized (aqvh.class) {
                        if (aqvh.b == null) {
                            aqvh.b = (ahev)new ahcs((ahcz)aqvh.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aqvh.a;
            }
            case 4: {
                return new ahct((ahcu)aqvh.a);
            }
            case 3: {
                return new aqvh();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqvh.a, "\u0001\u0000", (Object[])null);
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
