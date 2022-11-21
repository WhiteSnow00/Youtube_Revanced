import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aksg extends ahcz implements aheo
{
    public static final aksg a;
    private static volatile ahev e;
    public int b;
    public aknj c;
    public aisc d;
    private byte f;
    
    static {
        ahcz.registerDefaultInstance(aksg.class, a = new aksg());
    }
    
    private aksg() {
        this.f = 2;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte f = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev e;
                if ((e = aksg.e) == null) {
                    synchronized (aksg.class) {
                        if (aksg.e == null) {
                            aksg.e = (ahev)new ahcs((ahcz)aksg.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aksg.a;
            }
            case 4: {
                return new ahcr((ahcz)aksg.a);
            }
            case 3: {
                return new aksg();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aksg.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001\u1409\u0000\u0002\u1409\u0001", new Object[] { "b", "c", "d" });
            }
            case 1: {
                if (o == null) {
                    f = 0;
                }
                this.f = f;
                return null;
            }
            case 0: {
                return this.f;
            }
        }
    }
}
