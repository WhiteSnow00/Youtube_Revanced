import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amjc extends ahcz implements aheo
{
    public static final amjc a;
    private static volatile ahev b;
    private byte c;
    
    static {
        ahcz.registerDefaultInstance(amjc.class, a = new amjc());
    }
    
    private amjc() {
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
                if ((b = amjc.b) == null) {
                    synchronized (amjc.class) {
                        if (amjc.b == null) {
                            amjc.b = (ahev)new ahcs((ahcz)amjc.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return amjc.a;
            }
            case 4: {
                return new ahcr((ahcz)amjc.a);
            }
            case 3: {
                return new amjc();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)amjc.a, "\u0001\u0000", null);
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
