import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akpi extends agzi implements ahax
{
    public static final akpi a;
    private static volatile ahbe f;
    public int b;
    public akjf c;
    public aioe d;
    public ajyj e;
    private byte g;
    
    static {
        agzi.registerDefaultInstance(akpi.class, a = new akpi());
    }
    
    private akpi() {
        this.g = 2;
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
                final ahbe f;
                if ((f = akpi.f) == null) {
                    synchronized (akpi.class) {
                        if (akpi.f == null) {
                            akpi.f = (ahbe)new agzb((agzi)akpi.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return akpi.a;
            }
            case 4: {
                return new agza((agzi)akpi.a);
            }
            case 3: {
                return new akpi();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)akpi.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002", new Object[] { "b", "c", "d", "e" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.g = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
