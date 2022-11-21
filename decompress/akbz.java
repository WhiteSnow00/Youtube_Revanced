import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akbz extends ahcz implements aheo
{
    public static final akbz a;
    private static volatile ahev b;
    private int c;
    private ajws d;
    private ajws e;
    private ajws f;
    private ahjl g;
    private byte h;
    
    static {
        ahcz.registerDefaultInstance(akbz.class, a = new akbz());
    }
    
    private akbz() {
        this.h = 2;
        emptyProtobufList();
        final ahbt b = ahbt.b;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte h = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev b;
                if ((b = akbz.b) == null) {
                    synchronized (akbz.class) {
                        if (akbz.b == null) {
                            akbz.b = (ahev)new ahcs((ahcz)akbz.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return akbz.a;
            }
            case 4: {
                return new ahcr((ahcz)akbz.a);
            }
            case 3: {
                return new akbz();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akbz.a, "\u0001\u0004\u0000\u0001\u0002\t\u0004\u0000\u0000\u0004\u0002\u1409\u0002\u0006\u1409\u0004\b\u1409\u0001\t\u1409\u0003", new Object[] { "c", "e", "g", "d", "f" });
            }
            case 1: {
                if (o == null) {
                    h = 0;
                }
                this.h = h;
                return null;
            }
            case 0: {
                return this.h;
            }
        }
    }
}
