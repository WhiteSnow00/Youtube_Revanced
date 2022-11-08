import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akoh extends agzi implements ahax
{
    public static final akoh a;
    private static volatile ahbe e;
    public int b;
    public akjd c;
    public apjb d;
    private byte f;
    
    static {
        agzi.registerDefaultInstance(akoh.class, a = new akoh());
    }
    
    private akoh() {
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
                final ahbe e;
                if ((e = akoh.e) == null) {
                    synchronized (akoh.class) {
                        if (akoh.e == null) {
                            akoh.e = (ahbe)new agzb((agzi)akoh.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return akoh.a;
            }
            case 4: {
                return new agza((agzi)akoh.a);
            }
            case 3: {
                return new akoh();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)akoh.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001\u1409\u0000\u0002\u1009\u0001", new Object[] { "b", "c", "d" });
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
