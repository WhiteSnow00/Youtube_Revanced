import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajma extends ahcz implements aheo
{
    public static final ajma a;
    private static volatile ahev b;
    private int c;
    private ajws d;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(ajma.class, a = new ajma());
    }
    
    private ajma() {
        this.e = 2;
        emptyProtobufList();
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
                if ((b = ajma.b) == null) {
                    synchronized (ajma.class) {
                        if (ajma.b == null) {
                            ajma.b = (ahev)new ahcs((ahcz)ajma.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ajma.a;
            }
            case 4: {
                return new ahcr((ahcz)ajma.a);
            }
            case 3: {
                return new ajma();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ajma.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "c", "d" });
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
