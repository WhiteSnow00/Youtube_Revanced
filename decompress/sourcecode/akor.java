import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akor extends agzi implements ahax
{
    public static final akor a;
    private static volatile ahbe g;
    public int b;
    public akjd c;
    public aobt d;
    public aocd e;
    public amez f;
    private byte h;
    
    static {
        agzi.registerDefaultInstance(akor.class, a = new akor());
    }
    
    private akor() {
        this.h = 2;
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
                final ahbe g;
                if ((g = akor.g) == null) {
                    synchronized (akor.class) {
                        if (akor.g == null) {
                            akor.g = (ahbe)new agzb((agzi)akor.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return akor.a;
            }
            case 4: {
                return new agza((agzi)akor.a);
            }
            case 3: {
                return new akor();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)akor.a, "\u0001\u0004\u0000\u0001\u0001\n\u0004\u0000\u0000\u0001\u0001\u1409\u0000\u0004\u1009\u0003\b\u1009\u0006\n\u1009\u0007", new Object[] { "b", "c", "d", "e", "f" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.h = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.h;
            }
        }
    }
}