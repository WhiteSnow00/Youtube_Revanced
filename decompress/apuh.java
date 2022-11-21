import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apuh extends ahcz implements aheo
{
    public static final apuh a;
    private static volatile ahev b;
    private int c;
    private ahjl d;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(apuh.class, a = new apuh());
    }
    
    private apuh() {
        this.e = 2;
        emptyProtobufList();
        emptyProtobufList();
        final ahbt b = ahbt.b;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte e = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev b;
                if ((b = apuh.b) == null) {
                    synchronized (apuh.class) {
                        if (apuh.b == null) {
                            apuh.b = (ahev)new ahcs((ahcz)apuh.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apuh.a;
            }
            case 4: {
                return new ahcr((ahcz)apuh.a);
            }
            case 3: {
                return new apuh();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apuh.a, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0001\u0003\u1409\u0000", new Object[] { "c", "d" });
            }
            case 1: {
                if (o == null) {
                    e = 0;
                }
                this.e = e;
                return null;
            }
            case 0: {
                return this.e;
            }
        }
    }
}
