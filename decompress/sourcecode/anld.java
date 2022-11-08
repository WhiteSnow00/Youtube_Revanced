import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anld extends agzi implements ahax
{
    public static final anld a;
    private static volatile ahbe h;
    public int b;
    public ajsq c;
    public ajsq d;
    public anss e;
    public aioe f;
    public aioe g;
    private byte i;
    
    static {
        agzi.registerDefaultInstance(anld.class, a = new anld());
    }
    
    private anld() {
        this.i = 2;
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
                final ahbe h;
                if ((h = anld.h) == null) {
                    synchronized (anld.class) {
                        if (anld.h == null) {
                            anld.h = (ahbe)new agzb((agzi)anld.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return anld.a;
            }
            case 4: {
                return new agza((agzi)anld.a);
            }
            case 3: {
                return new anld();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)anld.a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0005\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0004", new Object[] { "b", "c", "d", "e", "f", "g" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.i = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.i;
            }
        }
    }
}
