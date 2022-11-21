import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akqw extends ahcz implements aheo
{
    public static final akqw a;
    private static volatile ahev f;
    public int b;
    public aknh c;
    public ahdp d;
    public ahdp e;
    private byte g;
    
    static {
        ahcz.registerDefaultInstance(akqw.class, a = new akqw());
    }
    
    private akqw() {
        this.g = 2;
        this.d = ahcz.emptyProtobufList();
        this.e = ahcz.emptyProtobufList();
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
                if ((f = akqw.f) == null) {
                    synchronized (akqw.class) {
                        if (akqw.f == null) {
                            akqw.f = (ahev)new ahcs((ahcz)akqw.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return akqw.a;
            }
            case 4: {
                return new ahcr((byte[][])null, (byte[][])null);
            }
            case 3: {
                return new akqw();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akqw.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0001\u0001\u1409\u0000\u0002\u001a\u0003\u001a", new Object[] { "b", "c", "d", "e" });
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
