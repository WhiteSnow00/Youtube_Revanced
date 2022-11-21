import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akxg extends ahcz implements aheo
{
    public static final akxg a;
    private static volatile ahev e;
    public aknj b;
    public boolean c;
    public ahdp d;
    private int f;
    private byte g;
    
    static {
        ahcz.registerDefaultInstance(akxg.class, a = new akxg());
    }
    
    private akxg() {
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
                final ahev e;
                if ((e = akxg.e) == null) {
                    synchronized (akxg.class) {
                        if (akxg.e == null) {
                            akxg.e = (ahev)new ahcs((ahcz)akxg.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return akxg.a;
            }
            case 4: {
                return new ahcr((ahcz)akxg.a);
            }
            case 3: {
                return new akxg();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akxg.a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0002\u0001\u1409\u0000\u0002\u1007\u0001\u0004\u041b", new Object[] { "f", "b", "c", "d", aisc.class });
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
