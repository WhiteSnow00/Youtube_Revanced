import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akxo extends ahcz implements aheo
{
    public static final akxo a;
    private static volatile ahev h;
    public int b;
    public aknh c;
    public ahdp d;
    public ahdp e;
    public ahdp f;
    public boolean g;
    private byte i;
    
    static {
        ahcz.registerDefaultInstance(akxo.class, a = new akxo());
    }
    
    private akxo() {
        this.i = 2;
        this.d = ahcz.emptyProtobufList();
        this.e = ahcz.emptyProtobufList();
        this.f = ahcz.emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte i = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev h;
                if ((h = akxo.h) == null) {
                    synchronized (akxo.class) {
                        if (akxo.h == null) {
                            akxo.h = (ahev)new ahcs((ahcz)akxo.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return akxo.a;
            }
            case 4: {
                return new ahcr((boolean[][])null, (int[])null);
            }
            case 3: {
                return new akxo();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akxo.a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0003\u0001\u0001\u1409\u0000\u0002\u001a\u0003\u001a\u0004\u1007\u0001\u0005\u001b", new Object[] { "b", "c", "d", "f", "g", "e", akxq.class });
            }
            case 1: {
                if (o == null) {
                    i = 0;
                }
                this.i = i;
                return null;
            }
            case 0: {
                return this.i;
            }
        }
    }
}
