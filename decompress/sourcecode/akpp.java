import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akpp extends agzi implements ahax
{
    public static final akpp a;
    private static volatile ahbe d;
    public int b;
    public akjd c;
    private byte e;
    
    static {
        agzi.registerDefaultInstance(akpp.class, a = new akpp());
    }
    
    private akpp() {
        this.e = 2;
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
                if ((d = akpp.d) == null) {
                    synchronized (akpp.class) {
                        if (akpp.d == null) {
                            akpp.d = (ahbe)new agzb((agzi)akpp.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return akpp.a;
            }
            case 4: {
                return new agza((agzi)akpp.a);
            }
            case 3: {
                return new akpp();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)akpp.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "b", "c" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.e = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.e;
            }
        }
    }
}
