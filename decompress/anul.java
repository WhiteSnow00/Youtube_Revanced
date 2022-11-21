import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anul extends ahcz implements aheo
{
    public static final anul a;
    private static volatile ahev d;
    public ahdp b;
    public ahbt c;
    private int e;
    private ahjl f;
    private byte g;
    
    static {
        ahcz.registerDefaultInstance(anul.class, a = new anul());
    }
    
    private anul() {
        this.g = 2;
        this.b = ahcz.emptyProtobufList();
        this.c = ahbt.b;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte g = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev d;
                if ((d = anul.d) == null) {
                    synchronized (anul.class) {
                        if (anul.d == null) {
                            anul.d = (ahev)new ahcs((ahcz)anul.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return anul.a;
            }
            case 4: {
                return new ahcr((ahcz)anul.a);
            }
            case 3: {
                return new anul();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)anul.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0002\u0001\u041b\u0002\u100a\u0000\u0003\u1409\u0001", new Object[] { "e", "b", anxb.class, "c", "f" });
            }
            case 1: {
                if (o == null) {
                    g = 0;
                }
                this.g = g;
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
