import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akqu extends ahcz implements aheo
{
    public static final akqu a;
    private static volatile ahev h;
    public int b;
    public ahdp c;
    public int d;
    public anxb e;
    public aisc f;
    public anxb g;
    private byte i;
    
    static {
        ahcz.registerDefaultInstance(akqu.class, a = new akqu());
    }
    
    private akqu() {
        this.i = 2;
        this.c = ahcz.emptyProtobufList();
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
                if ((h = akqu.h) == null) {
                    synchronized (akqu.class) {
                        if (akqu.h == null) {
                            akqu.h = (ahev)new ahcs((ahcz)akqu.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return akqu.a;
            }
            case 4: {
                return new ahcr((ahcz)akqu.a);
            }
            case 3: {
                return new akqu();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akqu.a, "\u0001\u0005\u0000\u0001\u0003\b\u0005\u0000\u0001\u0003\u0003\u001b\u0005\u1004\u0003\u0006\u1409\u0004\u0007\u1409\u0005\b\u1409\u0006", new Object[] { "b", "c", akqv.class, "d", "e", "f", "g" });
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
