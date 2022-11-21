import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqiv extends ahcu implements ahcv
{
    public static final aqiv a;
    private static volatile ahev b;
    private byte c;
    
    static {
        ahcz.registerDefaultInstance(aqiv.class, (ahcz)(a = new aqiv()));
    }
    
    private aqiv() {
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
                if ((b = aqiv.b) == null) {
                    synchronized (aqiv.class) {
                        if (aqiv.b == null) {
                            aqiv.b = (ahev)new ahcs((ahcz)aqiv.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aqiv.a;
            }
            case 4: {
                return new ahct((ahcu)aqiv.a);
            }
            case 3: {
                return new aqiv();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqiv.a, "\u0001\u0000", (Object[])null);
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
