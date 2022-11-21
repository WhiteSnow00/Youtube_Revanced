import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqgz extends ahcu implements ahcv
{
    public static final aqgz a;
    private static volatile ahev b;
    private byte c;
    
    static {
        ahcz.registerDefaultInstance(aqgz.class, (ahcz)(a = new aqgz()));
    }
    
    private aqgz() {
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
                if ((b = aqgz.b) == null) {
                    synchronized (aqgz.class) {
                        if (aqgz.b == null) {
                            aqgz.b = (ahev)new ahcs((ahcz)aqgz.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aqgz.a;
            }
            case 4: {
                return new ahct((ahcu)aqgz.a);
            }
            case 3: {
                return new aqgz();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqgz.a, "\u0001\u0000", (Object[])null);
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
