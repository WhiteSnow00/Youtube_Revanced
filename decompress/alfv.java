import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alfv extends ahcz implements aheo
{
    public static final alfv a;
    private static volatile ahev c;
    public ahdp b;
    private byte d;
    
    static {
        ahcz.registerDefaultInstance(alfv.class, a = new alfv());
    }
    
    private alfv() {
        this.d = 2;
        this.b = ahcz.emptyProtobufList();
        ahcz.emptyProtobufList();
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
                if ((c = alfv.c) == null) {
                    synchronized (alfv.class) {
                        if (alfv.c == null) {
                            alfv.c = (ahev)new ahcs((ahcz)alfv.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return alfv.a;
            }
            case 4: {
                return new ahcr((ahcz)alfv.a);
            }
            case 3: {
                return new alfv();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alfv.a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u041b", new Object[] { "b", ajdo.class });
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
