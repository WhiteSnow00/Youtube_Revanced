import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akpk extends agzi implements ahax
{
    public static final akpk a;
    private static volatile ahbe c;
    public akjf b;
    private int d;
    private byte e;
    
    static {
        agzi.registerDefaultInstance(akpk.class, a = new akpk());
    }
    
    private akpk() {
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
                if ((c = akpk.c) == null) {
                    synchronized (akpk.class) {
                        if (akpk.c == null) {
                            akpk.c = (ahbe)new agzb((agzi)akpk.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return akpk.a;
            }
            case 4: {
                return new agza((agzi)akpk.a);
            }
            case 3: {
                return new akpk();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)akpk.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "d", "b" });
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
