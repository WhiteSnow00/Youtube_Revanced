import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amhr extends ahcz implements aheo
{
    public static final amhr a;
    private static volatile ahev b;
    private byte c;
    
    static {
        ahcz.registerDefaultInstance(amhr.class, a = new amhr());
    }
    
    private amhr() {
        this.c = 2;
        emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev b;
                if ((b = amhr.b) == null) {
                    synchronized (amhr.class) {
                        if (amhr.b == null) {
                            amhr.b = (ahev)new ahcs((ahcz)amhr.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return amhr.a;
            }
            case 4: {
                return new ahcr((ahcz)amhr.a);
            }
            case 3: {
                return new amhr();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)amhr.a, "\u0001\u0000", null);
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
