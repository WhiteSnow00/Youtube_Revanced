import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akmp extends agzi implements ahax
{
    public static final akmp a;
    private static volatile ahbe d;
    public akjf b;
    public agzy c;
    private int e;
    private byte f;
    
    static {
        agzi.registerDefaultInstance(akmp.class, a = new akmp());
    }
    
    private akmp() {
        this.f = 2;
        this.c = agzi.emptyProtobufList();
        emptyProtobufList();
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
                if ((d = akmp.d) == null) {
                    synchronized (akmp.class) {
                        if (akmp.d == null) {
                            akmp.d = (ahbe)new agzb((agzi)akmp.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return akmp.a;
            }
            case 4: {
                return new agza((agzi)akmp.a);
            }
            case 3: {
                return new akmp();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)akmp.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001\u1409\u0000\u0002\u001b", new Object[] { "e", "b", "c", ahut.class });
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
