import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akci extends ahcz implements aheo
{
    public static final akci a;
    private static volatile ahev b;
    private int c;
    private aisc d;
    private ajws e;
    private byte f;
    
    static {
        ahcz.registerDefaultInstance(akci.class, a = new akci());
    }
    
    private akci() {
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
                final ahev b;
                if ((b = akci.b) == null) {
                    synchronized (akci.class) {
                        if (akci.b == null) {
                            akci.b = (ahev)new ahcs((ahcz)akci.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return akci.a;
            }
            case 4: {
                return new ahcr((ahcz)akci.a);
            }
            case 3: {
                return new akci();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akci.a, "\u0001\u0002\u0000\u0001\u0002\u0004\u0002\u0000\u0000\u0002\u0002\u1409\u0001\u0004\u1409\u0003", new Object[] { "c", "d", "e" });
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
