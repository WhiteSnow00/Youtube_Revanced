import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akfw extends ahcz implements aheo
{
    public static final akfw a;
    private static volatile ahev h;
    public int b;
    public aisc c;
    public aisc d;
    public anxb e;
    public anxb f;
    public anxb g;
    private byte i;
    
    static {
        ahcz.registerDefaultInstance(akfw.class, a = new akfw());
    }
    
    private akfw() {
        this.i = 2;
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
                if ((h = akfw.h) == null) {
                    synchronized (akfw.class) {
                        if (akfw.h == null) {
                            akfw.h = (ahev)new ahcs((ahcz)akfw.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return akfw.a;
            }
            case 4: {
                return new ahcr((ahcz)akfw.a);
            }
            case 3: {
                return new akfw();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akfw.a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0005\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0004", new Object[] { "b", "c", "d", "e", "f", "g" });
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
