import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqjd extends ahcu implements ahcv
{
    public static final aqjd a;
    private static volatile ahev b;
    private byte c;
    
    static {
        ahcz.registerDefaultInstance(aqjd.class, (ahcz)(a = new aqjd()));
    }
    
    private aqjd() {
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
                if ((b = aqjd.b) == null) {
                    synchronized (aqjd.class) {
                        if (aqjd.b == null) {
                            aqjd.b = (ahev)new ahcs((ahcz)aqjd.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aqjd.a;
            }
            case 4: {
                return new ahct((ahcu)aqjd.a);
            }
            case 3: {
                return new aqjd();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqjd.a, "\u0001\u0000", (Object[])null);
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
