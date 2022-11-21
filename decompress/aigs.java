import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aigs extends ahcz implements aheo
{
    public static final aigs a;
    private static volatile ahev c;
    public ahdp b;
    private byte d;
    
    static {
        ahcz.registerDefaultInstance(aigs.class, a = new aigs());
    }
    
    private aigs() {
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
                if ((c = aigs.c) == null) {
                    synchronized (aigs.class) {
                        if (aigs.c == null) {
                            aigs.c = (ahev)new ahcs((ahcz)aigs.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aigs.a;
            }
            case 4: {
                return new ahcr((ahcz)aigs.a);
            }
            case 3: {
                return new aigs();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aigs.a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u041b", new Object[] { "b", aigt.class });
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
