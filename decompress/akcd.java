import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akcd extends ahcz implements aheo
{
    public static final akcd a;
    private static volatile ahev b;
    private int c;
    private ajws d;
    private ahjl e;
    private byte f;
    
    static {
        ahcz.registerDefaultInstance(akcd.class, a = new akcd());
    }
    
    private akcd() {
        this.f = 2;
        emptyProtobufList();
        emptyIntList();
        final ahbt b = ahbt.b;
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
                if ((b = akcd.b) == null) {
                    synchronized (akcd.class) {
                        if (akcd.b == null) {
                            akcd.b = (ahev)new ahcs((ahcz)akcd.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return akcd.a;
            }
            case 4: {
                return new ahcr((ahcz)akcd.a);
            }
            case 3: {
                return new akcd();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akcd.a, "\u0001\u0002\u0000\u0001\u0006\b\u0002\u0000\u0000\u0002\u0006\u1409\u0003\b\u1409\u0001", new Object[] { "c", "e", "d" });
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
