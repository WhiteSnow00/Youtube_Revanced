import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akpw extends agzi implements ahax
{
    public static final akpw a;
    private static volatile ahbe c;
    public akjf b;
    private int d;
    private byte e;
    
    static {
        agzi.registerDefaultInstance(akpw.class, a = new akpw());
    }
    
    private akpw() {
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
                final ahbe c;
                if ((c = akpw.c) == null) {
                    synchronized (akpw.class) {
                        if (akpw.c == null) {
                            akpw.c = (ahbe)new agzb((agzi)akpw.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return akpw.a;
            }
            case 4: {
                return new agza((agzi)akpw.a);
            }
            case 3: {
                return new akpw();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)akpw.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "d", "b" });
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
