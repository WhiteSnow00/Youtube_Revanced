import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anup extends ahcz implements aheo
{
    public static final anup a;
    private static volatile ahev d;
    public ahdp b;
    public ahbt c;
    private int e;
    private ahjl f;
    private byte g;
    
    static {
        ahcz.registerDefaultInstance(anup.class, a = new anup());
    }
    
    private anup() {
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
                if ((d = anup.d) == null) {
                    synchronized (anup.class) {
                        if (anup.d == null) {
                            anup.d = (ahev)new ahcs((ahcz)anup.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return anup.a;
            }
            case 4: {
                return new ahcr((ahcz)anup.a);
            }
            case 3: {
                return new anup();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)anup.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0002\u0001\u041b\u0002\u1409\u0000\u0003\u100a\u0001", new Object[] { "e", "b", anxb.class, "f", "c" });
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
