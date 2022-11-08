import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class andw extends agzi implements ahax
{
    public static final andw a;
    private static volatile ahbe b;
    private int c;
    private ajsq d;
    private aioe e;
    private byte f;
    
    static {
        agzi.registerDefaultInstance(andw.class, a = new andw());
    }
    
    private andw() {
        this.f = 2;
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        final int ordinal = agzh.ordinal();
        boolean b = true;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b2;
                if ((b2 = andw.b) == null) {
                    synchronized (andw.class) {
                        if (andw.b == null) {
                            andw.b = (ahbe)new agzb((agzi)andw.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return andw.a;
            }
            case 4: {
                return new agza((agzi)andw.a);
            }
            case 3: {
                return new andw();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)andw.a, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0002\u0002\u1409\u0001\u0003\u1409\u0002", new Object[] { "c", "d", "e" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.f = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.f;
            }
        }
    }
}
