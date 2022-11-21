import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqcs extends ahcu implements ahcv
{
    public static final aqcs a;
    private static volatile ahev b;
    private byte c;
    
    static {
        ahcz.registerDefaultInstance(aqcs.class, (ahcz)(a = new aqcs()));
    }
    
    private aqcs() {
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
                if ((b = aqcs.b) == null) {
                    synchronized (aqcs.class) {
                        if (aqcs.b == null) {
                            aqcs.b = (ahev)new ahcs((ahcz)aqcs.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aqcs.a;
            }
            case 4: {
                return new ahct((ahcu)aqcs.a);
            }
            case 3: {
                return new aqcs();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqcs.a, "\u0001\u0000", (Object[])null);
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
