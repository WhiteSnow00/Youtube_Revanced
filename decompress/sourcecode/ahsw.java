import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahsw extends agzi implements ahax
{
    public static final ahsw a;
    private static volatile ahbe d;
    public aibc b;
    public int c;
    private int e;
    private byte f;
    
    static {
        agzi.registerDefaultInstance(ahsw.class, a = new ahsw());
    }
    
    private ahsw() {
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
                final ahbe d;
                if ((d = ahsw.d) == null) {
                    synchronized (ahsw.class) {
                        if (ahsw.d == null) {
                            ahsw.d = (ahbe)new agzb((agzi)ahsw.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ahsw.a;
            }
            case 4: {
                return new agza((agzi)ahsw.a);
            }
            case 3: {
                return new ahsw();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahsw.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001\u1409\u0000\u0002\u100c\u0001", new Object[] { "e", "b", "c", ahho.g });
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
