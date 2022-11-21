import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amou extends ahcz implements aheo
{
    public static final amou a;
    private static volatile ahev b;
    private int c;
    private anxb d;
    private ajws e;
    private byte f;
    
    static {
        ahcz.registerDefaultInstance(amou.class, a = new amou());
    }
    
    private amou() {
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
                if ((b = amou.b) == null) {
                    synchronized (amou.class) {
                        if (amou.b == null) {
                            amou.b = (ahev)new ahcs((ahcz)amou.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return amou.a;
            }
            case 4: {
                return new ahcr((ahcz)amou.a);
            }
            case 3: {
                return new amou();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)amou.a, "\u0001\u0002\u0000\u0001\u0002\u0004\u0002\u0000\u0000\u0002\u0002\u1409\u0001\u0004\u1409\u0003", new Object[] { "c", "d", "e" });
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
