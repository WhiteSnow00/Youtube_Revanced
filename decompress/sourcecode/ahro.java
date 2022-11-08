import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahro extends agzi implements ahax
{
    public static final ahro a;
    private static volatile ahbe h;
    public int b;
    public aioe c;
    public aioe d;
    public aioe e;
    public aioe f;
    public alts g;
    private byte i;
    
    static {
        agzi.registerDefaultInstance(ahro.class, a = new ahro());
    }
    
    private ahro() {
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
                if ((h = ahro.h) == null) {
                    synchronized (ahro.class) {
                        if (ahro.h == null) {
                            ahro.h = (ahbe)new agzb((agzi)ahro.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return ahro.a;
            }
            case 4: {
                return new agza((agzi)ahro.a);
            }
            case 3: {
                return new ahro();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahro.a, "\u0001\u0005\u0000\u0001\u0001\u03e7\u0005\u0000\u0000\u0005\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u03e7\u1409\u0004", new Object[] { "b", "c", "d", "e", "f", "g" });
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
