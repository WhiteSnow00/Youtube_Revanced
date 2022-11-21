import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoqi extends ahcz implements aheo
{
    public static final aoqi a;
    private static volatile ahev c;
    public ahdp b;
    private byte d;
    
    static {
        ahcz.registerDefaultInstance(aoqi.class, a = new aoqi());
    }
    
    private aoqi() {
        this.d = 2;
        this.b = ahcz.emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte d = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev c;
                if ((c = aoqi.c) == null) {
                    synchronized (aoqi.class) {
                        if (aoqi.c == null) {
                            aoqi.c = (ahev)new ahcs((ahcz)aoqi.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aoqi.a;
            }
            case 4: {
                return new ahcr((ahcz)aoqi.a);
            }
            case 3: {
                return new aoqi();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aoqi.a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u041b", new Object[] { "b", anxb.class });
            }
            case 1: {
                if (o == null) {
                    d = 0;
                }
                this.d = d;
                return null;
            }
            case 0: {
                return this.d;
            }
        }
    }
}
