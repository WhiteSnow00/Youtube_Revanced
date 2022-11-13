import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class angy extends ahbh implements ahcw
{
    public static final angy a;
    private static volatile ahdd h;
    public int b;
    public ajut c;
    public akdi d;
    public akdi e;
    public aiqj f;
    public ahab g;
    private ahhu i;
    private byte j;
    
    static {
        ahbh.registerDefaultInstance((Class)angy.class, (ahbh)(a = new angy()));
    }
    
    private angy() {
        this.j = 2;
        this.g = ahab.b;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte j = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd h;
                if ((h = angy.h) == null) {
                    synchronized (angy.class) {
                        if (angy.h == null) {
                            angy.h = (ahdd)new ahba((ahbh)angy.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return angy.a;
            }
            case 4: {
                return new ahaz((ahbh)angy.a);
            }
            case 3: {
                return new angy();
            }
            case 2: {
                return newMessageInfo((MessageLite)angy.a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0005\u0001\u1409\u0000\u0002\u100a\u0004\u0003\u1409\u0005\u0004\u1409\u0003\u0005\u1409\u0001\u0006\u1409\u0002", new Object[] { "b", "c", "g", "i", "f", "d", "e" });
            }
            case 1: {
                if (o == null) {
                    j = 0;
                }
                this.j = j;
                return null;
            }
            case 0: {
                return this.j;
            }
        }
    }
}
