import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akqs extends ahcz implements aheo
{
    public static final akqs a;
    private static volatile ahev f;
    public int b;
    public aknh c;
    public ahdp d;
    public int e;
    private byte g;
    
    static {
        ahcz.registerDefaultInstance(akqs.class, a = new akqs());
    }
    
    private akqs() {
        this.g = 2;
        this.d = ahcz.emptyProtobufList();
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
                final ahev f;
                if ((f = akqs.f) == null) {
                    synchronized (akqs.class) {
                        if (akqs.f == null) {
                            akqs.f = (ahev)new ahcs((ahcz)akqs.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return akqs.a;
            }
            case 4: {
                return new ahcr((byte[])null, (int[][])null);
            }
            case 3: {
                return new akqs();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akqs.a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0001\u0001\u1409\u0000\u0002\u001b\u0004\u100c\u0001", new Object[] { "b", "c", "d", ahyj.class, "e", ajvx.u });
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
