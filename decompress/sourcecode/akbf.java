import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akbf extends agzd implements agze
{
    public static final akbf a;
    private static volatile ahbe d;
    public int b;
    public int c;
    private byte e;
    
    static {
        agzi.registerDefaultInstance((Class)akbf.class, (agzi)(a = new akbf()));
    }
    
    private akbf() {
        this.e = 2;
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
                if ((d = akbf.d) == null) {
                    synchronized (akbf.class) {
                        if (akbf.d == null) {
                            akbf.d = (ahbe)new agzb((agzi)akbf.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return akbf.a;
            }
            case 4: {
                return new agzc(akbf.a);
            }
            case 3: {
                return new akbf();
            }
            case 2: {
                return newMessageInfo((MessageLite)akbf.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100c\u0000", new Object[] { "b", "c", akbe.a() });
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
