import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akzu extends agzi implements ahax
{
    public static final akzu a;
    private static volatile ahbe d;
    public int b;
    public akjd c;
    private akzt e;
    private byte f;
    
    static {
        agzi.registerDefaultInstance((Class)akzu.class, (agzi)(a = new akzu()));
    }
    
    private akzu() {
        this.f = 2;
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
                final ahbe d;
                if ((d = akzu.d) == null) {
                    synchronized (akzu.class) {
                        if (akzu.d == null) {
                            akzu.d = (ahbe)new agzb((agzi)akzu.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return akzu.a;
            }
            case 4: {
                return new agza((agzi)akzu.a);
            }
            case 3: {
                return new akzu();
            }
            case 2: {
                return newMessageInfo((MessageLite)akzu.a, "\u0001\u0002\u0000\u0001\u0001\u000f\u0002\u0000\u0000\u0002\u0001\u1409\u0000\u000f\u1409\r", new Object[] { "b", "c", "e" });
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
