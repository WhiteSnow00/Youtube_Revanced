import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akxw extends ahcz implements aheo
{
    public static final akxw a;
    private static volatile ahev f;
    public int b;
    public aknj c;
    public ahdp d;
    public ajws e;
    private byte g;
    
    static {
        ahcz.registerDefaultInstance(akxw.class, a = new akxw());
    }
    
    private akxw() {
        this.g = 2;
        this.d = ahcz.emptyProtobufList();
        emptyProtobufList();
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
                if ((f = akxw.f) == null) {
                    synchronized (akxw.class) {
                        if (akxw.f == null) {
                            akxw.f = (ahev)new ahcs((ahcz)akxw.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return akxw.a;
            }
            case 4: {
                return new ahcr((ahcz)akxw.a);
            }
            case 3: {
                return new akxw();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akxw.a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0003\u0001\u1409\u0000\u0003\u041b\u0004\u1409\u0001", new Object[] { "b", "c", "d", anxb.class, "e" });
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
