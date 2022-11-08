import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akpl extends agzi implements ahax
{
    public static final akpl a;
    private static volatile ahbe d;
    public int b;
    public akjd c;
    private byte e;
    
    static {
        agzi.registerDefaultInstance(akpl.class, a = new akpl());
    }
    
    private akpl() {
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
                if ((d = akpl.d) == null) {
                    synchronized (akpl.class) {
                        if (akpl.d == null) {
                            akpl.d = (ahbe)new agzb((agzi)akpl.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return akpl.a;
            }
            case 4: {
                return new agza((agzi)akpl.a);
            }
            case 3: {
                return new akpl();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)akpl.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "b", "c" });
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
