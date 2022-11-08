import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aomw extends agzi implements ahax
{
    public static final aomw a;
    private static volatile ahbe g;
    public int b;
    public ajsq c;
    public aioe d;
    public agyc e;
    public boolean f;
    private ahfw h;
    private byte i;
    
    static {
        agzi.registerDefaultInstance((Class)aomw.class, (agzi)(a = new aomw()));
    }
    
    private aomw() {
        this.i = 2;
        this.e = agyc.b;
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        final int ordinal = agzh.ordinal();
        boolean b = true;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe g;
                if ((g = aomw.g) == null) {
                    synchronized (aomw.class) {
                        if (aomw.g == null) {
                            aomw.g = (ahbe)new agzb((agzi)aomw.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return aomw.a;
            }
            case 4: {
                return new agza((agzi)aomw.a);
            }
            case 3: {
                return new aomw();
            }
            case 2: {
                return newMessageInfo((MessageLite)aomw.a, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0003\u0001\u1409\u0000\u0002\u1409\u0001\u0004\u1409\u0003\u0005\u100a\u0004\u0006\u1007\u0005", new Object[] { "b", "c", "d", "h", "e", "f" });
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
